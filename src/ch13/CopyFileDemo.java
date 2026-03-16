package ch13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		// /Users/ho9/Desktop/temp/test1.txt 를 읽어서
		// /Users/ho9/Desktop/temp/test2.txt 로 저장하는 예제

		String input = "/Users/ho9/Desktop/temp/test1.txt";
		String output = "/Users/ho9/Desktop/temp/test2.txt";

		try (InputStream fis = new FileInputStream(input); OutputStream fos = new FileOutputStream(output)) {
			int c;
			while ((c = fis.read()) != -1) {
				fos.write(c);
				;
			}
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// fis.read() => fos.write()
		// fos.flush()
		// fis.close(), fos.close();

	}

}
