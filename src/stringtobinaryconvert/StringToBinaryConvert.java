/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtobinaryconvert;

import java.util.Arrays;
import model.AsciiProcess;
import model.BinaryProcess;

/**
 *
 * @author DCL
 */
public class StringToBinaryConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "I love java";
        int ascii[] = AsciiProcess.getInstance(input).toAscii();
        int binary[] = BinaryProcess.getInstance(ascii).toBinary();
        System.out.println("Input is: "+input);
        System.out.println("Ascii is: "+Arrays.toString(ascii));
        System.out.println("Binary is: "+Arrays.toString(binary));
        
    }
    
   
    
}
