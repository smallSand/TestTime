import java.io.BufferedOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class TestSocket {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8888);
		while (true) {
			Socket socket = serverSocket.accept();
			Scanner scanner = new Scanner(socket.getInputStream());
			while (scanner.hasNext()) {
				String str =scanner.nextLine();
				BufferedOutputStream bos=new BufferedOutputStream(socket.getOutputStream());
				bos.write(str.getBytes());
				if (str.equals("sleep")) {
					Runtime runtime = Runtime.getRuntime();
					try {
						runtime.exec("shutdown -s -t 60");
						serverSocket.close();
						scanner.close();
						System.exit(0);
					} catch (Exception e) {
						System.out.println("Error!");
					}
				}

			}
		}

	}

}
