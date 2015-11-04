/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class operacao {
    public float somar (float op1, float op2){
        
        float res= op1 + op2;
        return res;
    }
    
     public float multiplicar (float op1, float op2){
        
        float res= op1 * op2;
        return res;
    }
     
      public float subtrair (float op1, float op2){
        
        float res= op1 - op2;
        return res;
      }
      
        public float dividir (float op1, float op2){
        
        float res= op1 / op2;
        return res;
      }
}
