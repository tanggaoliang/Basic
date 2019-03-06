/*
 * @author:tang gao liang
 * @time:2019/3/6 19:21:22
 * @qq:1440535574
 */
package new_start_2019.NetworkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//          网络编程是指编写运行在多个设备（计算机）的程序，这些设备都通过网络连接起来。
//
//        java.net 包中 J2SE 的 API 包含有类和接口，它们提供低层次的通信细节。你可以直接使用这些类和接口，来专注于解决问题，而不用关注通信细节。
//
//        java.net 包中提供了两种常见的网络协议的支持：
//
//        TCP：TCP 是传输控制协议的缩写，它保障了两个应用程序之间的可靠通信。通常用于互联网协议，被称 TCP / IP。
//
//        UDP：UDP 是用户数据报协议的缩写，一个无连接的协议。提供了应用程序之间要发送的数据的数据包。
//
//        本教程主要讲解以下两个主题。
//
//        Socket 编程：这是使用最广泛的网络概念，它已被解释地非常详细。
//
//        URL 处理：这部分会在另外的篇幅里讲，点击这里更详细地了解在 Java 语言中的 URL 处理。
public class SocketClient {
    public static void main(String[] args) {
//        String serverName=args[0];
//        int port=Integer.parseInt(args[1]);
        String serverName = "localhost";
        int port = 6066;
        System.out.println("serverName : " + serverName);
        try {
            Socket client = new Socket(serverName, port);
            System.out.println("remote host address : " + client.getRemoteSocketAddress());
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("hello from " + client.getLocalSocketAddress());
            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("from sever : " + dataInputStream.readUTF());
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
