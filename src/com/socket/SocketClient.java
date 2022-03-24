package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author wanghao
 * @version 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int readlen = 0;
        while((readlen=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readlen));
        }

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
