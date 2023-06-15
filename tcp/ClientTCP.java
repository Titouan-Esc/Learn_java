package tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientTCP {
    public static void main(String []args) throws IOException {

        try {

            Socket clientSocket = new Socket("localhost", 4200);

            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            writer.println("Message send by the client");
            System.out.println(reader.readLine());

            reader.close();
            writer.close();
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("[ERREUR] "+e.getMessage());
        }
    }
}
