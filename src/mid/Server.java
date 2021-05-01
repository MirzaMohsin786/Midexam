/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Mohsin
 */
public class Server {
    public static void main(String[] args)  {
        try {
            try (ServerSocket ss = new ServerSocket(786)) {
                System.out.println(" establish connection \n");
                Socket s = ss.accept();
                System.out.println(" connection established \n");
                
                DataInputStream dis = new DataInputStream(s.getInputStream());
                String str = (String) dis.readUTF();
                System.out.println(str + "message=Mirza Mohsin ");
            }
            
        } catch (IOException ex) {
        }
    }
    
}
