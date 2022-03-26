package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wanghao
 * @version 1.0
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //创建绑定到9999端口的服务器套接字
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端正在9999端口监听..");
        //侦听要连接到此套接字并接受它。 该方法将阻塞直到建立连接
        Socket accept = serverSocket.accept();
        //将获取到的字节输入流转成缓冲字节输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
        //将缓冲字节输入流转成数组把图片数据存放到数组中
        byte[] bytes = StreamUtils.toByteArray(bufferedInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\new1.png"));
        bufferedOutputStream.write(bytes);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write("我是服务器，已收到图片");
        bufferedWriter.flush();

        bufferedOutputStream.flush();

        accept.shutdownOutput();
        bufferedWriter.close();
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
