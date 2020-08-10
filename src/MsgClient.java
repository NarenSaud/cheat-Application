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
public class MsgClient {
    public static void main(String args[]) throws IOException 
	{	
                // Open your connection to a server, at port 1254
                Socket cs = new Socket("localhost",1254);

                // Get an input file handle from the socket and read the input
                Scanner ins= new Scanner(cs.getInputStream());
                PrintWriter outs= new PrintWriter(cs.getOutputStream(), true);

                //Perform IO		
                outs.println("Hello Server");
                String s = ins.nextLine();
                System.out.println("From Server:"+s);		

                // close streams and connection
                ins.close();
                outs.close();
                cs.close();
        }
    
}
