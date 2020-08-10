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
public class MsgServer {
    public static void main(String args[]) throws IOException 
	{
		//Step 1: Create object of server socket 
		ServerSocket ss = new ServerSocket(1254);

		//step 2: Accept client request
		Socket cs=ss.accept(); 

		//Step 3: Get input/output streams		
		Scanner ins=new Scanner(cs.getInputStream());
		PrintWriter outs= new PrintWriter(cs.getOutputStream(), true);
		
		//Step 4: Perform I/O
		String s = ins.nextLine();
		System.out.println("From Client:"+s);		
		outs.println("Hello Client");
		
		//Step 5&6: Close streams and connection
		outs.close();
		ins.close();
		cs.close();
		ss.close();		
	}
    
}
