package ch18;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {

	public static void main(String[] args) {
		try (Socket client = new Socket("192.168.0.57", 5000);
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);) {

			oos.writeObject(" ");
			oos.flush();
			Thread.sleep(500);
		} catch (Exception e) {
		}

	}

}