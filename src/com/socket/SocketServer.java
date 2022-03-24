package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wanghao
 * @version 1.0
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput();
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
