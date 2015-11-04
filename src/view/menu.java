/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.controlador;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class menu {
    private controlador c = new controlador();
    public menu(){
        darBoasVindas();
        realizarOp();
    }
    public  static void main(String[] args){
        new menu();
    }
    
    
   public void darBoasVindas(){
       System.out.println("Boas vindas!");
   }
   
   public void realizarOp(){
       Scanner s = new Scanner(System.in);
       System.out.print("Escolha\n1-somar\n2-dividir\n3-multiplicar\n4-subritrair ");
       int x = s.nextInt();
       if (x>4){
           System.out.println("\n Valor digitado invalido!");
       }else{
       System.out.print("Digite o primeiro numero\n");
       int y= s.nextInt();
       System.out.print("Digite o segundo numero\n");
       int z= s.nextInt();
       float res =0;
       if(x == 1){
          res = c.solicitaSoma(y, z);
       }else if (x==2){
           res = c.solicitaDivisao(y, z);
       }else if(x==3){
           res = c.solicitaMultiplicacao(y, z);
       }else if (x==4){
       res = c.solicitaSubtracao(y,z);
   }
         
          
       this.apresentarResultado(res);
       }
   }
   
  private void apresentarResultado(float res){
      System.out.println("Resultado é " + res);
  }
  // modo controller.
}
