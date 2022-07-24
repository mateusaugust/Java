/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logs;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;





/**
 *
 * @author Mateus Augusto
 */
public class ControlaLogs {
    
   
    public static void criaLog(String nomeLog, String logs){
       String caminho = "C:\\Users\\Mateus Augusto\\Desktop\\UdemyJava\\RegistroDeVendas\\Logs\\" + nomeLog +".txt";
       
       
        try(
              FileWriter openFile = new FileWriter(caminho, true);
              BufferedWriter buffer = new BufferedWriter(openFile);
              PrintWriter saveLog = new PrintWriter(buffer);
                ){
            saveLog.append(logs);
        }catch(IOException e){
            
        }
      
    }
    
    public static void imprimeLogs(String caminho, String date){
       
       String url = "C:\\Users\\Mateus Augusto\\Desktop\\UdemyJava\\RegistroDeVendas\\Logs\\"+ caminho;
      
       try{
          FileInputStream arquivo = new FileInputStream(url);
          InputStreamReader input = new InputStreamReader(arquivo);
          BufferedReader br = new BufferedReader(input);
          
          String linha;
          
           System.out.println("\n\n---------Logs do Dia: " + date + "---------\n" );
          
          do{
            linha = br.readLine();
            
            if(linha != null){
                System.out.println(linha);  
            }
            
          }while(linha != null);
          
       }catch(Exception e){
           System.out.println("[x] Registro Nao Encontrado [x]");
       }
    }

    
   
}
