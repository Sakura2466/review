package com.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author wanghao
 * @version 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
