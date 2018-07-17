package mx.com.cev.qr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import mx.com.cev.qr.QRGenerator.QR_CONFIG;

public class QRTest {
	
	@Test
	public void generateQRFromString() throws IOException{
		//Lectura de archivos con Java7
		String text = new String(Files.readAllBytes(
				Paths.get("src/main/resources/json_alta_vacunado_bajo.txt"))); 
		
		QRGenerator qr = new QRGenerator();
		
		try {
			qr.convertStringToQR(text, QR_CONFIG.VERSION_20, 300, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void zipFiles(){

		List<String> lista = new ArrayList<>();
		lista.add("qr_0-custom.png");
		lista.add("qr_1-custom.png");
		lista.add("qr_2-custom.png");
		lista.add("qr_3-custom.png");
		lista.add("qr_4-custom.png");

		String zip = "/Users/Praxis/Documents/Workspace-Spring/qr-middleware/qrs.zip";
		
		FileUtils.zip(
				zip,
				"/Users/Praxis/Documents/Workspace-Spring/qr-middleware", lista);
		
		FileUtils.unZip(zip, "/Users/Praxis/Documents/Workspace-Spring/qr-middleware/qrs");
	
	}
}
