package com.socket;

import java.io.IOException;
import java.net.*;

/**
 * @author wanghao
 * @version 1.0
 */
public class UDPSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        //发送数据
        byte[] bytes = "hello receiver".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.2.4"),9999);
        datagramSocket.send(datagramPacket);
        //取数据
        bytes = new byte[1024];
        datagramPacket = new DatagramPacket(bytes, bytes.length);
        //接收消息到datagramPacket
        datagramSocket.receive(datagramPacket);
        //拆包取数据
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, length);
        System.out.println(s);
        datagramSocket.close();

    }
}
