/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author DCL
 */
public class StringProcess {
    private String input;
    private static StringProcess instance;
    private  StringProcess(){
        
    }
public static StringProcess getInstance(String input){
    if(instance == null){
        instance = new StringProcess();
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
    
    public String binaryToString(){
         StringBuilder sb = new StringBuilder();
      
        String[] binary = input.split(" ", -1);
        for (String binary1 : binary) {
            int code = Integer.parseInt(binary1, 2);
            String a = String.valueOf((char)code);
            sb.append(a);
        }
        String finalString = sb.toString();
        System.out.print(finalString); 
        return finalString;

    }
    
}
