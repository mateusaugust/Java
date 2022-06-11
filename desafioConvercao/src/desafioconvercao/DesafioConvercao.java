/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioconvercao;

import java.util.Scanner;


/**
 *
 * @author mateu
 */
public class DesafioConvercao {

    
    public static void main(String[] args) {
        
       Scanner  input = new Scanner(System.in);
       double somaSalario = 0.00;
       
       
        System.out.println("Digite o valor do seus três ultimos salarios");
        
        for(int i = 1;i<=3;i++ ){ 
            
            System.out.print("Digit o " + i + "° salário: ");
            String userInput = input.next().replace(",",".");

            double salarioConver = Double.parseDouble(userInput);
            
            somaSalario = somaSalario+salarioConver;  
              
       }
        
        input.close();
        
        System.out.println("Média dos 3 salários informados: R$" + 
                somaSalario + " reais.");
    }
    
}
