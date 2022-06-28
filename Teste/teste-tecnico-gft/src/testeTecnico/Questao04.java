package testeTecnico;

import java.util.Scanner;

public class Questao04 {
    public static void questao04(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre um número entre 3 e 999 para checar se é primo: ");
        int numero = sc.nextInt();
        if (numero < 3 || numero > 999){
            System.out.println("número fora do escopo desejado. Tente um número entre 3 e 999");
            numero = sc.nextInt();
        }
        if(isPrime(numero)) {
            System.out.println(numero + " é primo");
        }
        else{
            System.out.println(numero + " não é primo");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i=2;i<num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
}
