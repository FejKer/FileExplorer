package ovh.fejker.mc;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2400);
        while(true) {
            Socket socket = serverSocket.accept();

        }
    }
}
