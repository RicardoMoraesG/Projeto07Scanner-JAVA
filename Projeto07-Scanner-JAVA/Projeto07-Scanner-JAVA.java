/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanner;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SCANNER {

    public static void main(String[] args) {
         
        //classe SCANNER deve ser importada de dentro do pacote java.util.Scanner
        //Definir um Objeto 'entrada' da classe Scanner
        //usando a palavra reservada NEW
        //que é responsável pela instanciacao de objetos de uma classe JAVA
        
        String nome = "Moraes";
        Scanner entrada = new Scanner(System.in);
    
    /* cria um programa que receba ENTRADA de 2 valores (num1 e num2) 
    e verifique qual o maior e o menor numero entre os dois
    */
    
    int num1, num2;
        System.out.println("Digite o Primeiro Número:"); 
        num1 = entrada.nextInt();
        System.out.println("Digite o Segundo Número:");
        num2 = entrada.nextInt();
        //valor atribuido a num1 e num2
        System.out.println("Valor NUM1: " + num1);
        System.out.println("Valor NUM2: " + num2);
        
        //comparação usando IF ELSE
        
        if (num1 > num2){
            System.out.println("Maior número é: " + num1);
            System.out.println("Menor número é: " + num2);
        }
        else
        {
            System.out.println("Maior número é: " + num2);
            System.out.println("Menor número é: " + num1);
            
        }
        
           
            }    
    private static void Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
