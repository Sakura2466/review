package com.socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\hjly\\Desktop\\服务器接收图片.Png"));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();

        accept.shutdownOutput();

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
