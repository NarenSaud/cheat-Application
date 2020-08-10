/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
import java.net.*;
import java.io.*;
import java.util.*;
public class UDPServer {
    public static void main(String args[]) throws IOException 
	{
                Scanner sc=new Scanner(System.in);
		//step1: create datagram socket
		DatagramSocket ds= new DatagramSocket(4445);
	
 		//step 2: Receive Message
		byte[] buf = new byte[256];
		DatagramPacket p = new DatagramPacket(buf, buf.length);
       		ds.receive(p);
		InetAddress address = p.getAddress();
       		int port = p.getPort();
                
                //Step 3: Display Mesaage
                byte[] b = new byte[256];
                String r = new String(p.getData());
		System.out.println("Client:" + r);
                
                //Step 4: Send Response
                System.out.print("Server:");
                System.out.println("Enter the Server Msg:");
                String s = sc.next();                
       		b = s.getBytes();
		DatagramPacket dp = new DatagramPacket(b, b.length, address, port);
        	ds.send(dp);

		//step 5: Close Socket
		ds.close();
	}
    
}
