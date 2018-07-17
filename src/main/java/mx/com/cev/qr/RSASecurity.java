package mx.com.cev.qr;

//Basado en: http://niels.nu/blog/2016/java-rsa.html
//keytool -genkeypair -alias vacunacion -storepass vacunacion -keypass vacunacion -keyalg RSA -keystore keystore.jks
import java.io.InputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;

import javax.crypto.Cipher;

import org.apache.commons.net.util.Base64;

/**
 * 
 * @author Praxis
 *
 */
public class RSASecurity {

	public enum RSAConfig {
		RSA_INSTANCE("RSA"), SIGNATURE_INSTANCE("SHA256withRSA"), KEYSTORE_NAME(
				"/keystore.jks"), KEYSTORE_INSTANCE("JCEKS"), KEYSTORE_ALIAS(
				"vacunacion"), KEYSTORE_PASS("vacunacion");

		private String value;

		RSAConfig(String value) {
			this.value = value;
		}

		public String value() {
			return value;
		}
	}

	private RSASecurity() {
	}

	public static KeyPair generateKeyPair() throws Exception {
		KeyPairGenerator generator = KeyPairGenerator
				.getInstance(RSAConfig.RSA_INSTANCE.value());
		generator.initialize(2048, new SecureRandom());
		return generator.generateKeyPair();
	}

	public static String encrypt(String plainText, PublicKey publicKey)
			throws Exception {
		Cipher encryptCipher = Cipher.getInstance(RSAConfig.RSA_INSTANCE
				.value());
		encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);

		byte[] cipherText = encryptCipher.doFinal(plainText.getBytes());

		return Base64.encodeBase64String(cipherText);
	}

	public static String decrypt(String cipherText, PrivateKey privateKey)
			throws Exception {

		byte[] bytes = Base64.decodeBase64(cipherText);

		Cipher decriptCipher = Cipher.getInstance(RSAConfig.RSA_INSTANCE
				.value());
		decriptCipher.init(Cipher.DECRYPT_MODE, privateKey);

		return new String(decriptCipher.doFinal(bytes));
	}

	public static String sign(String plainText, PrivateKey privateKey)
			throws Exception {
		Signature privateSignature = Signature
				.getInstance(RSAConfig.SIGNATURE_INSTANCE.value());
		privateSignature.initSign(privateKey);
		privateSignature.update(plainText.getBytes());

		byte[] signature = privateSignature.sign();

		return Base64.encodeBase64String(signature);
	}

	public static boolean verify(String plainText, String signature,
			PublicKey publicKey) throws Exception {
		Signature publicSignature = Signature
				.getInstance(RSAConfig.SIGNATURE_INSTANCE.value());
		publicSignature.initVerify(publicKey);
		publicSignature.update(plainText.getBytes());

		byte[] signatureBytes = Base64.decodeBase64(signature);

		return publicSignature.verify(signatureBytes);
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public static KeyPair getKeyPairFromKeyStore() throws Exception {
		InputStream ins = RSASecurity.class
				.getResourceAsStream(RSAConfig.KEYSTORE_NAME.value());

		KeyStore keyStore = KeyStore.getInstance(RSAConfig.KEYSTORE_INSTANCE
				.value());
		keyStore.load(ins, RSAConfig.KEYSTORE_PASS.value().toCharArray());
		KeyStore.PasswordProtection keyPassword = new KeyStore.PasswordProtection(
				RSAConfig.KEYSTORE_PASS.value().toCharArray());

		KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore
				.getEntry(RSAConfig.KEYSTORE_ALIAS.value(), keyPassword);

		java.security.cert.Certificate cert = keyStore
				.getCertificate(RSAConfig.KEYSTORE_ALIAS.value());
		PublicKey publicKey = cert.getPublicKey();
		PrivateKey privateKey = privateKeyEntry.getPrivateKey();

		return new KeyPair(publicKey, privateKey);
	}
}
