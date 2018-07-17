package mx.com.cev.qr;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Metodos de ayuda para operaciones comunes sobre archivos y carpetas.
 * @author Praxis
 * @version 0.1
 * 16-07-2018
 */
public class FileUtils {
	
	private FileUtils(){}

	/**
	 * Metodo para comprimir con zip especificando la carpeta de origen y archivos a comprimir
	 * @param outputZipFile Path completo del arhcivo .zip destino
	 * @param sourceFolder Path de la carpeta de la cual se desean comprimir los archivos definidos
	 * en filesToZip 
	 * @param filesToZip Lista de archivos a comprimir (Estos archivos deben exisitir en la 
	 * carpeta definida en sourceFolder)
	 */
	public static void zip(String outputZipFile, String sourceFolder,
			List<String> filesToZip) {

		byte[] buffer = new byte[1024];

		try {

			FileOutputStream fos = new FileOutputStream(outputZipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);

			for (String file : filesToZip) {
				ZipEntry ze = new ZipEntry(file);
				zos.putNextEntry(ze);

				FileInputStream in = new FileInputStream(sourceFolder
						+ File.separator + file);

				int len;
				while ((len = in.read(buffer)) > 0) {
					zos.write(buffer, 0, len);
				}

				in.close();
			}

			zos.closeEntry();
			zos.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Metodo encargada de descomprimir un archivo
	 * @param zipFile Path completo del archivo .zip a descomprimir 
	 * @param outputFolder Path de la carpeta donde se extraerá el contenido del zip
	 */
	public static void unZip(String zipFile, String outputFolder) {

		byte[] buffer = new byte[1024];

		try {
			File folder = new File(outputFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}

			// get the zip file content
			ZipInputStream zis = new ZipInputStream(
					new FileInputStream(zipFile));
			// get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();

			while (ze != null) {

				String fileName = ze.getName();
				File newFile = new File(outputFolder + File.separator
						+ fileName);

				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();
			zis.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * Método encargado de devolver un arreglo de bytes dado el Path de un archivo
	 * @param path Path completo del arhcivo del cual se desea obtener su representación en vytes
	 * @return Arreglo de bytes del archivo leido
	 */
	public static byte[] readFile(String path) {
		File file = new File(path);
		ByteArrayOutputStream ous = null;
		InputStream ios = null;
		try {
			byte[] buffer = new byte[4096];
			ous = new ByteArrayOutputStream();
			ios = new FileInputStream(file);
			int read = 0;
			while ((read = ios.read(buffer)) != -1) {
				ous.write(buffer, 0, read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ous != null)
					ous.close();
			} catch (IOException e) {
			}
			try {
				if (ios != null)
					ios.close();
			} catch (IOException e) {
			}
		}
		return ous.toByteArray();
	}
	
	/**
	 * Dado un arreglo de bytes se genera su cadena MD5
	 * @param data arreglo de bytes de los cuales se generarña una cadena MD5
	 * @return
	 */
	public static String MD5(byte [] data) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			byte[] array = md.digest(data);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
		}
		return null;
	}
}
