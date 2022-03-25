package com.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author wanghao
 * @version 1.0
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        //创建流套接字，参数IP+port，客户端向服务器请求建立连接
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //将图片数据加入缓冲字节输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\hjly\\Pictures\\华景透明logo.png"));
        //将缓冲字节输入流转成byte数组，byte数组中就是图片数据
        byte[] bytes = StreamUtils.toByteArray(bufferedInputStream);
        //获取字节输出流，准备向服务器发送数据
        OutputStream outputStream = socket.getOutputStream();
        //把字节输出流转成字节输出缓冲流，高效传输数据
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        //传输图片数据
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        //关闭输出流
        socket.shutdownOutput();

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
