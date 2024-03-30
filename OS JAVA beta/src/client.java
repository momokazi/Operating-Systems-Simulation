import java.io.*;
import java.net.*;
public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            System.out.println("Connected to Momo OS...");
            BufferedReader userInput = new BufferedReader(new
                    InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            System.out.print("Enter message to send to Momo OS: ");
            String message = userInput.readLine();
            out.println(message);
            String serverResponse = in.readLine();
            System.out.println("Received from server: " +
                    serverResponse);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}