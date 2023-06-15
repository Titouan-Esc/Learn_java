package udp;

import java.net.*;

public class ClientUDP {
    public static void main(String []args) throws SocketException, UnknownHostException, Exception {
        try {
//            Initialisation du server
            DatagramSocket clientSocket = new DatagramSocket();

//            Envoie des données
            String message = "I'm the client";
            byte[] sendBytes = message.getBytes();

            InetAddress serverAddress = InetAddress.getByName("localhost");

            DatagramPacket sendPacket = new DatagramPacket(sendBytes, sendBytes.length, serverAddress, 4200);
            clientSocket.send(sendPacket);

//            Réception des données
            byte[] receiveBytes = new byte[256];
            DatagramPacket receivedPacket = new DatagramPacket(receiveBytes, receiveBytes.length);
            clientSocket.receive(receivedPacket);

            String messageRes = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
            System.out.println(messageRes);

//            Fin des ressources
            if (!clientSocket.isClosed())
                clientSocket.close();

        } catch (UnknownHostException e) {
            System.out.println("[ERROR ADDRESS] "+e.getMessage());

        } catch (SocketException e) {
            System.out.println("[ERREUR SOCKET] "+e.getMessage());

        } catch (Exception e) {
            System.out.println("[ERREUR] "+e.getMessage());
        }
    }
}
