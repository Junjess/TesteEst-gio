
package fibo_e_invercao;

import java.util.ArrayList;
import java.util.Scanner;

public class Fibo_E_Invercao {

    public static boolean Fibo(int n){
         ArrayList<Integer> fibSequence = generateFibonacciSequence(n);

        return fibSequence.contains(n);
     }
    
    public static ArrayList<Integer> generateFibonacciSequence(int limit) {
        ArrayList<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);

        int a = 0, b = 1;

        while (b <= limit) {
            int temp = b;
            b = a + b;
            a = temp;
            fibSequence.add(b);
        }

        return fibSequence;
    }
    
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
    
    public static void Fibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para calcular e verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> fibSequence = generateFibonacciSequence(num);
        if (Fibo(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

        System.out.println("Sequência de Fibonacci até " + num + ": " + fibSequence);
    }
    
    public static void Reverse(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String inputString = scanner.nextLine();
        scanner.close();
        String reversedString = reverseString(inputString);
        System.out.println("String invertida: " + reversedString);
    }
    
    public static void main(String[] args) {
        
        //Necessário escolher qual irá testar, um de cada vez.
        Fibonacci();
        Reverse();
    }
    
    }
    

