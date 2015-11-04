/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.operacao;

/**
 *
 * @author User
 */
public class controlador {
   private final  operacao op = new operacao();
   
   public float solicitaSoma(float op1 , float op2){
       return op.somar(op1, op2);
       
   }
   public float solicitaMultiplicacao(float op1 , float op2){
       return op.multiplicar(op1, op2);
   }
   
   public float solicitaDivisao(float op1 , float op2){
       
       return op.dividir(op1, op2);
   }
   
   public float solicitaSubtracao(float op1 , float op2){
       return op.subtrair(op1, op2);
   }
}

