package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerUDP {
    public static void main(String []args) throws SocketException, Exception {
        try {
//            Initialisation du server
            DatagramSocket serverSocket = new DatagramSocket(4200);
            System.out.println("Server waiting...");

//            Réception
            byte[] receivedBytes = new byte[256];
            DatagramPacket receivedPacket = new DatagramPacket(receivedBytes, receivedBytes.length);
            serverSocket.receive(receivedPacket);

            String message = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
            System.out.println(message);

//            Envoie (réponse du client)
            String response = "Sending good message";
            byte[] sentBytes = response.getBytes();

            InetAddress clientAddress = receivedPacket.getAddress();
            int clientPort = receivedPacket.getPort();

            DatagramPacket sendPacket = new DatagramPacket(sentBytes, sentBytes.length, clientAddress, clientPort);
            serverSocket.send(sendPacket);

//            Fin des ressources
            if (!serverSocket.isClosed())
                serverSocket.close();

        } catch (SocketException e) {
            System.out.println("[ERREUR SOCKET] "+e.getMessage());

        } catch (Exception e) {
            System.out.println("[ERREUR] "+e.getMessage());

        }
    }
}
