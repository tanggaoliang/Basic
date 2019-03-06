/*
 * @author:tang gao liang
 * @time:2019/3/6 19:57:37
 * @qq:1440535574
 */
package new_start_2019.NetworkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemo extends Thread {
    private ServerSocket serverSocket;

    public SocketServerDemo(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(100000);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("wait remote connect , post : " + serverSocket.getLocalPort());
            try {
                Socket server = serverSocket.accept();
                System.out.println("remote host address : " + server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("Bye , thanks for connecting me :" + server.getLocalSocketAddress());
                server.close();
            } catch (Exception e) {
//                e.printStackTrace();
                System.out.println("exception happened!");
            }


        }
    }

    public static void main(String[] args) {
//        int port = Integer.parseInt(args[0]);
        int port = 6066;
        try {
            Thread thread = new SocketServerDemo(port);
            thread.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
