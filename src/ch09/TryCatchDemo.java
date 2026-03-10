package ch09;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchDemo {

	public static void main(String[] args) {
		try (FileInputStream fs = new FileInputStream("./file.txt")) {
			int data;
			while ((data = fs.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

//FileInputStream fs;
//try {
//	fs = new FileInputStream("./file.txt");
//
//	int data;
//
//	while ((data = fs.read()) != -1) {
//		System.out.println((char) data);
//	}
//	fs.close();
//} catch (IOException e) {
//	e.printStackTrace();
//} finally {
//
//}