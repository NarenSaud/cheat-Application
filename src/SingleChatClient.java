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
class SingleChatClient {
    public static void main(String args[]) throws IOException 
	{
		Socket cs = new Socket("localhost",1254);

		Scanner ins= new Scanner(cs.getInputStream());
		PrintWriter outs= new PrintWriter(cs.getOutputStream(), true);
		Scanner ink=new Scanner(System.in);
		String cmsg, smsg;		
		do
		{		
			cmsg=ins.nextLine();			
			System.out.println("\tServer:"+cmsg);
			System.out.print("Enter Client Msg:");
			smsg = ink.nextLine();
			outs.println(smsg);						
		}while(cmsg.equals("buy")!=true);		
		
		ins.close();
		outs.close();
		cs.close();
	}
    
}
