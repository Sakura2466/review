package com.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author wanghao
 * @version 1.0
 */
public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        //接收消息到datagramPacket
        datagramSocket.receive(datagramPacket);
        //拆包取数据
        int length = datagramPacket.getLength();
        byte[] data = datagramPacket.getData();
        String s = new String(data, 0, length);
        System.out.println(s);
        //发送消息
        data = "hello Sender".getBytes();
        datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.2.4"),9998);
        datagramSocket.send(datagramPacket);
        //关闭UDP对象
        datagramSocket.close();

    }
}
