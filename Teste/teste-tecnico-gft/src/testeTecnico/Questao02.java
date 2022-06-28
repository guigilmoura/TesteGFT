package testeTecnico;

import java.util.Scanner;

public class Questao02 {
    public static void questao02(){
        float valor;
        int mesExtra;
        Scanner scan = new Scanner(System.in);
        System.out.println("informe o tipo do recebível (cheque, promissoria ou titulo)");
        String tipoRecebivel = scan.nextLine();
        System.out.println("informe o prazo do recebível em dias");
        int prazo = scan.nextInt();
        System.out.println("informe o valor do rendimento");
        double valorRendimento = scan.nextDouble();
        if (tipoRecebivel.equals("cheque") && ((prazo == 30))){
            valor = (float) (valorRendimento - (valorRendimento*0.05));
            System.out.println(valor);
        }
        if (tipoRecebivel.equals("cheque") && ((prazo == 60))){
            valor = (float) (valorRendimento - ((valorRendimento/100)*7.5));
            System.out.println(valor);
        }
        if (tipoRecebivel.equals("cheque") && ((prazo == 90))){
            valor = (float) (valorRendimento - (valorRendimento/10));
            System.out.println(valor);
        }
        if (prazo > 90){
            mesExtra = (prazo-90)/30;
            valor = (float) (valorRendimento - ((valorRendimento/10)+((valorRendimento/100)*3)));
            System.out.println(valor);
        }

        if (tipoRecebivel.equals("promissoria")){
            if (prazo == 30){
                valor = (float) (valorRendimento - ((valorRendimento/100)*4));
                System.out.println(valor);
            }
            if (prazo == 60){
                valor = (float) (valorRendimento - ((valorRendimento/100)*6.5));
                System.out.println(valor);
            }
            if (prazo == 90){
                valor = (float) (valorRendimento - ((valorRendimento/100)*8.5));
                System.out.println(valor);
            }
            if (prazo > 90){
                mesExtra = (prazo-90)/30;
                valor = (float) (valorRendimento - ((valorRendimento/100)*8.5+(valorRendimento/50)));
                System.out.println(valor);
            }
        }
        if (tipoRecebivel.equals("titulo")){
            if (prazo == 30){
                valor = (float) (valorRendimento - ((valorRendimento/100)*3));
                System.out.println(valor);
            }
            if (prazo == 60){
                valor = (float) (valorRendimento - ((valorRendimento/100)*5.5));
                System.out.println(valor);
            }
            if (prazo == 90){
                valor = (float) (valorRendimento - ((valorRendimento/100)*6.5));
                System.out.println(valor);
            }
            if (prazo > 90){
                mesExtra = (prazo-90)/30;
                valor = (float) (valorRendimento - ((valorRendimento/100)*6.5+(valorRendimento/100)));
                System.out.println(valor);
            }
        }
    }
}
