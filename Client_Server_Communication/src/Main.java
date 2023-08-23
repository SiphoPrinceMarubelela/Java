import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	// variables:
	static Socket s;
	
	public static void main(String[] args) throws IOException {
		
		// A-R-M: create a server socket & bind to port 7777.
		try(ServerSocket ss = new ServerSocket(7777)){
			System.out.println("Server is waiting on port: 7777");
			
			// wait until the server gets a client.
			s = ss.accept();
			System.out.println("Got one!");
			
			// to allow our client to server communication:
			PrintWriter out = new PrintWriter(s.getOutputStream(), true); // don't forget to flush the stream.
			//out.flush(); if "true" wasn't included as 2nd parameter!
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			// to send a message to the client:
			out.println("Greeting to you my dear client!");
			
			// to read a response from the client:
			String response = in.readLine();
			System.out.println("Message from the client: " + response);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				s.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			  }
		   }
	}

}
