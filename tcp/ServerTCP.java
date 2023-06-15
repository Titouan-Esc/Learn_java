package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String []args) throws IOException {
        try {

            ServerSocket serverSocket = new ServerSocket(4200);
            System.out.println("Server waiting...");

            Socket socket = serverSocket.accept();
            System.out.println("Connection with client good.");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            System.out.println(reader.readLine());
            writer.println("Good send");

            reader.close();
            writer.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("[ERREUR] "+e.getMessage());
        }
    }
}
