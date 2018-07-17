package mx.com.cev.qr;

import java.io.File;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SecurityTest {

	@Test
	public void generateMD5(){
		
		List<File> files = new ArrayList<>();
		files.add( new File("/Users/Praxis/Documents/Workspace-Spring/qr-middleware/qr_0.png") );
		files.add( new File("/Users/Praxis/Documents/Workspace-Spring/qr-middleware/qr_1.png") );
		files.add( new File("/Users/Praxis/Documents/Workspace-Spring/qr-middleware/qr_2.png") );
		files.add( new File("/Users/Praxis/Documents/Workspace-Spring/qr-middleware/qr_3.png") );
		files.add( new File("/Users/Praxis/Documents/Workspace-Spring/qr-middleware/qr_4.png") );
		
		for( File file : files ){
			byte data[] = FileUtils.readFile(file.toString());
			String md5 = FileUtils.MD5(data);
			System.out.println( "File: " + file.getName() +  ", MD5: " + md5);
		}
	}
	
	@Test
	public void testRSASecurity() throws Exception {
		KeyPair pairPath = RSASecurity.getKeyPairFromKeyStore();

		String msg = "cartilla";
		String msgCifrado = RSASecurity.encrypt(msg, pairPath.getPublic());
		System.out.println("Mensaje: " + msg);
		System.out.println("Mensaje cifrado: " + msgCifrado);
	}

	@Test
	public void testAESSecurity() {
		final String secretKey = "secretword";

		String originalString = "cartilla";
		String encryptedString = AESSecurity.encrypt(originalString, secretKey);
		String decryptedString = AESSecurity
				.decrypt(encryptedString, "word");

		System.out.println(originalString);
		System.out.println(encryptedString);
		System.out.println(decryptedString);
	}
}