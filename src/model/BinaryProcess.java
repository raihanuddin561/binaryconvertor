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
public class BinaryProcess {
    private int[] input;
    private static BinaryProcess instance;
    private  BinaryProcess(){
        
    }
public static BinaryProcess getInstance(int[] input){
    if(instance == null){
        instance = new BinaryProcess();
    }
    instance.setInput(input);
    return instance;
}

    public int[] getInput() {
        return input;
    }

    public void setInput(int[] input) {
        this.input = input;
    }
  public int[] toBinary(){
      int result[] = new int[input.length];
      for(int i=0;i<input.length;i++){
          result[i] = Integer.parseInt(Integer.toBinaryString(input[i]));
      }
      System.out.println((result));
      System.out.println(Arrays.toString(result));
      return result;
  }
    
}
