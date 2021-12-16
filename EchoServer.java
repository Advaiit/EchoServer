import java.net.*;
import java.io.*;
import java.lang.*;

public class EchoServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			
			System.out.println("Server is listening...");
			Socket clientSocket;
			while((clientSocket = serverSocket.accept()) != null) {
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				String echoLine;
				
				while((echoLine = in.readLine()) != null) {
					out.println("You sent: "+echoLine);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
