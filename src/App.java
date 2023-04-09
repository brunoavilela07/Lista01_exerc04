import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração de variáveis + entrada de dados
        Scanner input = new Scanner(System.in);
        System.out.println("Qual foi a primeira nota? ");
        double nota1;
        nota1 = input.nextDouble();
        System.out.println("Qual foi a segunda nota? ");
        double nota2;
        nota2 = input.nextDouble();
        System.out.println("Qual foi a terceira nota? ");
        double nota3;
        nota3 = input.nextDouble();
        System.out.println("Qual foi a quarta nota? ");
        double nota4;
        nota4 = input.nextDouble();
        double media;
        // Soma das notas
        media = nota1 + nota2 + nota3 + nota4;
        // Resultado
        System.out.println("A sua média final é: " + media);

    }
}

