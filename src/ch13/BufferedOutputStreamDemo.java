package ch13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamDemo {

	public static void main(String[] args) {
		long start, end, duration;
		String inputFile = "/Applications/Safari.app/Contents/MacOS/Safari";
		String outputFile = "/Users/ho9/Desktop/temp/Safari.app";

		start = System.nanoTime();
		// BufferedInputStream, BufferedOutputStream 속도
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {
			while (bis.available() > 0) {
				bos.write(bis.read());
			}
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		end = System.nanoTime();
		duration = end - start;
		System.out.println("buffered Stream을 사용하는 경우 처리 시간 : " + duration); // 736,924,768

//		start = System.nanoTime();
//		// FileInputStream, FileOutputStream 속도
//		try (FileInputStream bis = new FileInputStream(inputFile);
//				FileOutputStream bos = new FileOutputStream(outputFile)) {
//			while (bis.available() > 0) {
//				bos.write(bis.read());
//			}
//			bos.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		end = System.nanoTime();
//		duration = end - start;
//		System.out.println("File Stream을 사용하는 경우 처리 시간 : " + duration); // 2,124,320,760

	}

}
