package mx.com.cev.qr;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.net.util.Base64;

/**
 * Clase encarga de ofrecer métodos de de cifrado/descifrado del algoritmo simetrico
 * AES 
 * @author Praxis
 *
 */
public class AESSecurity {
	
	private AESSecurity(){}
	
	private static SecretKeySpec secretKey;

	/**
	 * Metodo que asigna la llave de cifrado/descifrado del algoritmo AES
	 * @param key
	 */
	private static void setKey(String keyWord) {
		MessageDigest sha = null;
		try {
			byte[] key = keyWord.getBytes("UTF-8");
			sha = MessageDigest.getInstance("SHA-1");
			key = sha.digest(key);
			key = Arrays.copyOf(key, 16);
			secretKey = new SecretKeySpec(key, "AES");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo encargada de cifrar el texto pasado como parametro
	 * @param text Texto a cifrar
	 * @param key Palabra clave para cifrar el texto
	 * @return
	 */
	public static String encrypt(String text, String key) {
		try {
			setKey(key);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);

			return Base64.encodeBase64String( cipher.doFinal(text.getBytes("UTF-8")) );
		} catch (Exception e) {
			
		}
		return null;
	}

	/**
	 * Metodo encargado de descifrar el texto recibido en base a la palabra clave proporcionada 
	 * @param strToDecrypt
	 * @param secret
	 * @return La cadena descifrada o null en caso de que el key haya sido invalido
	 */
	public static String decrypt(String text, String key) {
		try {
			setKey(key);
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			
			return new String( cipher.doFinal( Base64.decodeBase64( text ) ) );
			
		} catch (Exception e) {
			
		}
		return null;
	}
}
