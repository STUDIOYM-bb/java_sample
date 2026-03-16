package ch13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {
//		Scanner in = new Scanner(new FileReader());

		long start, end, duration;
		String inputFile = "/Users/ho9/Desktop/temp/file1.txt";
		String outputFile = "/Users/ho9/Desktop/temp/file2.txt";

		start = System.nanoTime();
		// BufferedReader, BufferedWriter 속도
		try (BufferedReader bis = new BufferedReader(new FileReader(inputFile));
				BufferedWriter bos = new BufferedWriter(new FileWriter(outputFile))) {
			int c;
			while ((c = bis.read()) != -1) {
				bos.write(bis.read());
			}
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		end = System.nanoTime();
		duration = end - start;
		System.out.println("buffered Reader을 사용하는 경우 처리 시간 : " + duration); // 4,847,103

		start = System.nanoTime();
		// FileReader, FileWriter 속도
		try (FileReader bis = new FileReader(inputFile); FileWriter bos = new FileWriter(outputFile)) {
			int c;
			while ((c = bis.read()) != -1) {
				bos.write(bis.read());
			}
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		end = System.nanoTime();
		duration = end - start;
		System.out.println("File Reader을 사용하는 경우 처리 시간 : " + duration); // 17,559,120

	}

}
