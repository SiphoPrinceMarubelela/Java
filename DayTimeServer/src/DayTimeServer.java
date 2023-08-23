import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DayTimeServer {

	// variables:
	//static ServerSocket serverSocket; for ARM,no variable needed prior try block.
	static Socket clientConnection;
	
	public static void main(String[] args) {
		// automatic resource management:
		try(ServerSocket serverSocket = new ServerSocket(65535)) {
			System.out.println("Running on port: " + 65535);
			clientConnection= serverSocket.accept();
			PrintWriter out = new PrintWriter(clientConnection.getOutputStream(), true);
			Date date= new Date();
			out.println("Current date: " + date);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(clientConnection != null) {
					clientConnection.close();
		        }
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}