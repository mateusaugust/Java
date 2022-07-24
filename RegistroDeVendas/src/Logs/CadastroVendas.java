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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Mateus Augusto
 */
public class CadastroVendas {
    
    public static void CadastroVendas( String dataVenda, String nomeVendedor, String valorDaVenda, String aVista){
        
        DateTimeFormatter dftFormatada = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataRegistro = "vendas-" + dftFormatada.format(LocalDateTime.now());
        
       String caminho = "C:\\Users\\Mateus Augusto\\Desktop\\UdemyJava\\RegistroDeVendas\\RegistroDeVendas\\ " + 
               dataRegistro +".txt";
       
       
        try(
              FileWriter openFile = new FileWriter(caminho, true);
              BufferedWriter buffer = new BufferedWriter(openFile);
              PrintWriter saveVenda = new PrintWriter(buffer);
                ){
            saveVenda.append("-------------------------------------");
            saveVenda.append(dataVenda);
            saveVenda.append(nomeVendedor);
            saveVenda.append(valorDaVenda);
            saveVenda.append(aVista);
            saveVenda.append("\n-------------------------------------\n\n\n");
            
            
        }catch(IOException e){
           
        }
    
 }
    
    public static void imprimeRegistroVendas(String caminho, String date){
       
       String url = "C:\\Users\\Mateus Augusto\\Desktop\\UdemyJava\\RegistroDeVendas\\RegistroDeVendas\\ "+ caminho;
      
       try{
          FileInputStream arquivo = new FileInputStream(url);
          InputStreamReader input = new InputStreamReader(arquivo);
          BufferedReader br = new BufferedReader(input);
          
          String linha;
          
           System.out.println("\n\n---------Registro de Vendas do Dia: " + date + "---------\n" );
          
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
