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
        int charCode = Integer.parseInt(input,2);
        String str = new Character((char) charCode).toString();
        System.out.println(str);
        return str;
    }
    
}
