/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpackage;
import Logs.ControlaLogs;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Mateus Augusto
 */
public class Menu {
    
    Scanner inputKeyboard = new Scanner(System.in);
    int inputUser = 0;
    
    
    DateTimeFormatter dtfStarProgram = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    public void menu(){
        
        String nameLog = "log-"+dtfStarProgram.format(LocalDateTime.now());
        ControlaLogs.criaLog(nameLog, "\n\n"+dft.format(LocalDateTime.now()) + " - Programa Iniciado.\n");
       
        
        while(inputUser !=4){
            System.out.println(" \n\n ---------Registro de Vendas-------------------");
            System.out.println("|[1] - Para registrar Venda.                   |");
            System.out.println("|[2] - Para mostrar registros de vendas.       | ");
            System.out.println("|[3] - Para mostrar Logs de operacoes.         |");
            System.out.println("|[4] - Finalizar programa.                     |");
            System.out.println(" ----------***********************------------");
            System.out.print("Escolha Usuario ---> ");
            inputUser = inputKeyboard.nextInt();
            
            
            ControlaLogs.criaLog(nameLog, dft.format(LocalDateTime.now())+" - Usuario Escolheu a opcao[" + inputUser + "] "
                    + "do Menu.\n");
            
            
            
             redirectToOperations(inputUser, nameLog, dft);
            
            }
        
        ControlaLogs.criaLog(nameLog, dft.format(LocalDateTime.now())+" - Programa Finalizado.");
        
        
    }
    
    
public void redirectToOperations(int inputUser, String nameLog, DateTimeFormatter dft){
    new Operations().Operations(inputUser, nameLog, dft);
}
    
    
}
