/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiovariaveisconstantes;

import java.util.Scanner;

import java.text.DecimalFormat;
/**
 *
 * @author mateu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constantes
        final double divisao =5.0/9;
        final double diferenca = 32;
        
        //Variaveis(a variavel fahrenheit irei arrumar com um metodo scanner e fazer mais alguns upgrades;
        double celsius;
        Scanner entrada = new Scanner(System.in);
        
        //DecimalFormat usado para formatar o resultado, deixando assim duas casas após a vírgula;
        DecimalFormat deci = new DecimalFormat("0.0");
        
        System.out.println("Digite o valor em fahrenheit: ");
        double fahrenheit = entrada.nextDouble();
        
        celsius = (fahrenheit - diferenca)*divisao;
        
        System.out.println("Valor convertido em Celsius:" + deci.format(celsius)+ "°C");   
    }
    
}
