package mx.com.cev.qr;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.QRCodeWriter;

/**
 * 16-07-2018
 * Clase encarga de la generación y lectura de códigos QR. 
 * @author Praxis
 * @version 0.1
 */
public class QRGenerator {

	//Configuracion tomada de http://www.qrcode.com/en/about/version.html
	//Referencia: Alphanumeric
	//ECC Level: M
	public enum QR_CONFIG {
		VERSION_20(970), 
		VERSION_19(909),
		VERSION_18(816),
		VERSION_17(734),
		VERSION_16(656),
		VERSION_15(600),
		VERSION_14(528),
		VERSION_13(483),
		VERSION_12(419),
		VERSION_11(366);

		private final int max_size;

		private QR_CONFIG(int max_size) {
			this.max_size = max_size;
		}

		int maxSize() {
			return max_size;
		}
	}

	/**
	 * Método encargado de generar N códigos QR en base a una cadena de texto recibida 
	 * como parámetro(text), si esta cadena excede el tamaño definido por QR_CONFIG
	 * @param text: Cadena de texto que será codificada en un codigo QR (archivo.png)
	 * @param qrVersion: Parametro de tipo QR_CONFIG, que pemite definir la versión QR,
	 * cyyos valores pueden ser del 11 al 20
	 * @param h: altura de la imagen generada con el codigo qr
	 * @param w: anchura de la imagen generada con el codigo qr
	 * @return Una lista de archivos que contienen las rutas de los N archivos con los
	 * códigos qr generados
	 * @throws Exception
	 */
	public List<File> convertStringToQR(String text, QR_CONFIG qrVersion,
			int h, int w) throws Exception {

		List<File> qrFileList = new ArrayList<>();

		int lenght = text.length();

		int startPos = 0;
		int finalPos = qrVersion.max_size;

		if (lenght > qrVersion.max_size) {
			int parts = lenght / qrVersion.max_size;
			int module = lenght % qrVersion.max_size;

			for (int i = 0; i <= parts; i++) {
				String qrString = text.substring(startPos, finalPos);
				startPos = finalPos;

				File qrFile = new File("qr_" + i + ".png");
				generateQR(qrFile, qrString, h, w);
				qrFileList.add(qrFile);

				if (i == parts)
					break;

				if (i == (parts - 1)) {
					finalPos = finalPos + module;
				} else {
					finalPos = finalPos + qrVersion.max_size;
				}
			}
		}
		
		File qrFile = new File("qr.png");
		generateQR(qrFile, text, h, w);
		qrFileList.add(qrFile);

		return qrFileList;
	}

	/**
	 * Genera un archivo con un código qr de acuerdo al texto recibido como parametro
	 * @param file Archivo donde s generara el archivo qr
	 * @param text Texto a codificar en qr
	 * @param h
	 * @param w
	 * @return
	 * @throws Exception
	 */
	public File generateQR(File file, String text, int h, int w)
			throws Exception {

		QRCodeWriter writer = new QRCodeWriter();
		
//		Map<EncodeHintType, Object> hints = new HashMap<>();
//		hints.put(EncodeHintType.QR_VERSION, 22);
		BitMatrix matrix = writer.encode(text,
				com.google.zxing.BarcodeFormat.QR_CODE, w, h);
		
		BufferedImage image = new BufferedImage(matrix.getWidth(),
				matrix.getHeight(), BufferedImage.TYPE_INT_RGB);
		image.createGraphics();

		Graphics2D graphics = (Graphics2D) image.getGraphics();
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, matrix.getWidth(), matrix.getHeight());
		graphics.setColor(Color.BLACK);

		for (int i = 0; i < matrix.getWidth(); i++) {
			for (int j = 0; j < matrix.getHeight(); j++) {
				if (matrix.get(i, j)) {
					graphics.fillRect(i, j, 1, 1);
				}
			}
		}

		ImageIO.write(image, "png", file);

		return file;

	}

	/**
	 * Dado un archivo con información qr, se decodifica para leer la información contenida 
	 * @param file: archivo a procesar.
	 * @return Cadena de texto decodificada
	 * @throws Exception
	 */
	public String decoder(File file) throws Exception {

		FileInputStream inputStream = new FileInputStream(file);

		BufferedImage image = ImageIO.read(inputStream);

		LuminanceSource source = new BufferedImageLuminanceSource(image);
		BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

		// decode the barcode
		QRCodeReader reader = new QRCodeReader();
		Result result = reader.decode(bitmap);
		return result.getText();
	}
}
