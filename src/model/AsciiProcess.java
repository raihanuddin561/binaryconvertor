/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DCL
 */
public class AsciiProcess {
   private String input;
    private static AsciiProcess instance;
    private AsciiProcess(){
        
    }
     
       public static AsciiProcess getInstance(String input) {
        if(instance == null){
            instance = new AsciiProcess();
        }
        instance.setInput(input);
        return instance;
    }
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    public int[] toAscii(){
        char[] character = input.toCharArray();
         int[] ascii = new int[input.length()];
         for(int i =0;i<input.length();i++){
             ascii[i] = character[i];
         }
         return ascii;
    }
}
