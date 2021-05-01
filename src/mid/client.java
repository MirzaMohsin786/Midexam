/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Mohsin
 */
public class client {
    
    public static void main(String[] args) {
        try{
            
            try (Socket s = new Socket("localhost", 786); DataOutputStream dout = new DataOutputStream(s.getOutputStream())) {
                
                dout.writeUTF("Mirza Mohsin");
                
                dout.flush();
            }
            
            
        }
        catch(IOException ex){
        }
    }
    
}
