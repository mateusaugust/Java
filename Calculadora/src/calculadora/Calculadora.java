/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;
/**
 *
 * @author Mateus Augusto
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Algumas funções poderiam ser feitas com orientação a objeto, porém, preferi
                                            //fazer de modo estruturado por ser um codigo bem pequeno;
        
        Scanner inputUser = new Scanner(System.in);
        boolean controlaLoop = false;
        int controlerWarning = 0;
            
        do{
            
            //Controla a aparição da imagem;
            if(controlerWarning == 0){
             System.out.println("-------------------------------------------------------------------------------------"
                     + "---------------------");
             System.out.println("Calculadora em execucao, para interromper esse processo digite 'EXIT' depois de digi"
                     + "tar o primeiro valor.");
             System.out.println("-------------------------------------------------------------------------------------"
                     + "---------------------");
             
             controlerWarning++;
            }
            
            
            
           
           double primeiroValor = inputUser.nextDouble();
           String operacao = inputUser.next();
           
           
           if(operacao.equals("/")){
           
               double segundoValor = inputUser.nextDouble();
               System.out.println(" --> "+primeiroValor/segundoValor);
               
           }else if(operacao.equals("*")){
               
               double segundoValor = inputUser.nextDouble();
               System.out.println(" --> "+primeiroValor*segundoValor);
                
           }else if(operacao.equals("+")){
               
               double segundoValor = inputUser.nextDouble();
               double soma = primeiroValor+segundoValor;
               
               System.out.println(" --> "+ soma);
           }else if(operacao.equals("-")){
               
               double segundoValor = inputUser.nextDouble();
               
               System.out.println(" --> "+ (primeiroValor - segundoValor));
           }
           
           
           
           
           //Controla o do/while;
           if(operacao.equals("EXIT")){
             controlaLoop = true; 
             
               System.out.println("Calculadora Finalizada.");
           }else{
               controlaLoop = false;
           }
           
            System.out.println("----------------------------------------------");
        }while(controlaLoop == false);
    }
    
}
