package com.socket;

import java.io.*;
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
