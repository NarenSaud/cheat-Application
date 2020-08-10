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
public class UDPClient {
    public static void main(String args[]) throws IOException 
	{
                Scanner sc=new Scanner(System.in);
                
		//step1: Create Socket
		 DatagramSocket ds = new DatagramSocket();

            	//step2: send request
  		byte[] buf = new byte[256];
  		InetAddress address = InetAddress.getByName("localhost");
                System.out.print("Enter Client Msg:");
                String s = sc.next();                
       		buf = s.getBytes();
		DatagramPacket p = new DatagramPacket(buf, buf.length, address, 4445);
  		ds.send(p);
    
           	//step 3: get response
                byte[] b = new byte[256];
  		DatagramPacket dp = new DatagramPacket(b, b.length);
  		ds.receive(dp);

	    	//step 4: display response
		String r = new String(dp.getData());
		System.out.println("\t\tServer:" + r);

		//step 5: close the socket    
        	ds.close();
	}
    
}
