/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpackage;

import Logs.CadastroVendas;
import Logs.ControlaLogs;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 *
 * @author Mateus Augusto
 */
public class Operations {
    
   Scanner inputKeyboard = new Scanner(System.in); 
    
   public void Operations(int inputUser, String namelogs, DateTimeFormatter dft){
       
           if(inputUser ==1){
               
               ControlaLogs.criaLog(namelogs, dft.format(LocalDateTime.now()) + " - O vendedor iniciou o cadastro"
                       + " de uma venda.\n");
               
               
               
               System.out.print("Hora e Data do Cadastro da Venda: " + dft.format(LocalDateTime.now()));
               String dataVenda = "\nHora e Data do Cadastro da Venda: "+ dft.format(LocalDateTime.now());
               
               System.out.print("\nNome do Vendedor: ");
               String nomeVendedor ="\nNome do Vendedor: " + inputKeyboard.nextLine();
        
               System.out.print("Valor da Venda: ");
               String valorDaVenda = "\nValor da Venda: R$ " + inputKeyboard.nextLine()+"reais";
        
               System.out.print("Debito ou Credito: ");
               String aVista = "\nDebito ou Credito: " + inputKeyboard.nextLine();
      
               CadastroVendas.CadastroVendas(dataVenda, nomeVendedor, valorDaVenda, aVista);
               
               
               
              ControlaLogs.criaLog(namelogs, dft.format(LocalDateTime.now()) + " - O vendedor finalizou o cadastro"
                       + " de uma venda.\n"); 
                                       
           }else if(inputUser == 2){
               
                System.out.print("Digite a data da lista de Registro desejada --> ");
                String inputDate = inputKeyboard.next();
                inputDate = inputDate.replaceAll("/", "-");
                
                ControlaLogs.criaLog(namelogs, dft.format(LocalDateTime.now()) + " - O vendedor pediu os cadastros"
                       + " de vendas do dia: " + inputDate + "\n");
                
                String date = inputDate;
                
                inputDate = "vendas-"+inputDate+".txt";
               
                CadastroVendas.imprimeRegistroVendas(inputDate, date);
                
                ControlaLogs.criaLog(namelogs, dft.format(LocalDateTime.now()) + " - O vendedor finalizou a consulta dos"
                        + " Registros de Vendas.\n");
                
                
           }else if(inputUser == 3){
               
               System.out.print("Digite a data da lista de Logs Desejada --> ");
               String inputDate = inputKeyboard.next();
               inputDate = inputDate.replaceAll("/", "-");
               
                ControlaLogs.criaLog(namelogs, dft.format(LocalDateTime.now()) + " - O vendedor pediu os Logs"
                       + " do dia: " + inputDate + "\n");
                
                String date = inputDate;
                
                inputDate = "log-"+inputDate+".txt";
                
                ControlaLogs.imprimeLogs(inputDate, date);
                
                ControlaLogs.criaLog(namelogs, dft.format(LocalDateTime.now()) + " - O vendedor finalizou a consulta dos"
                        + " Logs.\n");
                
                

           }else if(inputUser !=4){
               
                    System.out.println("\n\n---------------------------");  
                    System.out.println("Escolha uma opcao valida!!!");
                    System.out.println("--------------------------");
                    
                    ControlaLogs.criaLog(namelogs, dft.format(LocalDateTime.now()) + " - A opção escolhida anteriormente"
                            + " pelo usuário é invalida.\n");
                       
               }else{
                System.out.println("Programa Finalizado com Sucesso");       
               }
               
               
       
       
      
   }
   
   
}
