package testeTecnico;

import java.util.Scanner;

public class Questao03 {
    public static Trabalhador[] trabalhadores;

    public static void questao03(){
        int indice = 1;
        int qtdeTrabalhadores = 0;
        boolean x = true;
        Scanner scan = new Scanner(System.in);
        while(x) {
            System.out.println("quantos trabalhadores deseja inserir?(pelo menos 5)");
            qtdeTrabalhadores = scan.nextInt();
            if (qtdeTrabalhadores > 4) x = false;
        }
        trabalhadores = new Trabalhador[qtdeTrabalhadores];
        for (int i = 1;i <= qtdeTrabalhadores; i++) {
            System.out.println("entre o nome do trabalhador "+ indice);
            String nome = scan.next();
            System.out.println("entre o salario por hora do trabalhador " + indice);
            Double salarioHora = scan.nextDouble();
            System.out.println("entre o numero de horas trabalhadas do trabalhador " + indice);
            int horasTrabalhadas = scan.nextInt();
            Trabalhador trabalhador = new Trabalhador(nome, salarioHora, horasTrabalhadas );
            indice ++;
            trabalhadores[i] = trabalhador;
        }

        //Utilizar os métodos abaixo para as consultas específicas

    }
    public static void consultarNome(int indice){
        System.out.println(Questao03.trabalhadores[indice].getNome());
    }
    public static void consultarHorasTrabalhadas(int indice){
        System.out.println(Questao03.trabalhadores[indice].getHorasTrabalhadas());
    }
    public static void consultarSalarioHora(int indice){
        System.out.println(Questao03.trabalhadores[indice].getSalarioPorHora());
    }
    public static void consultarSalarioTotal(int indice){
        System.out.println(Questao03.trabalhadores[indice].getSalarioPorHora()*Questao03.trabalhadores[indice].getHorasTrabalhadas());
    }

}
