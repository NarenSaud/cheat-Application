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
public class SingleChatServer {
    public static void main(String args[]) throws IOException 
	{		
		ServerSocket ss = new ServerSocket(1254);		
		Socket cs=ss.accept(); 
			
		Scanner ins=new Scanner(cs.getInputStream());
		PrintWriter outs= new PrintWriter(cs.getOutputStream(), true);
		Scanner ink=new Scanner(System.in);
		String cmsg, smsg;
		
		do
		{		
			System.out.print("Enter The Server Mesg:");
			smsg = ink.nextLine();
			outs.println(smsg);
			cmsg=ins.nextLine();			
			System.out.println("\tClient:"+cmsg);			
		}while(cmsg.equals("buy")!=true);
		
		outs.close();
		ins.close();
		cs.close();
		ss.close();		
	}

    
}
