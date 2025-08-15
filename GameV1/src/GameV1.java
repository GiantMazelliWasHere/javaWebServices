import java.util.Scanner;

public class GameV1 {
    public static void main(String[] args){
        System.out.println("Bem vindo ao Tigrinho!");
        System.out.println("Você deverá descobrir o número!");
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe Seu Nome:");
        String nome = leitor.next();
        leitor.nextLine();
        System.out.println("Olá " + nome + "!");
        // int numeroSorteado = (int)(Math.random()*100);
        int numeroSorteado = 69;
        int tentativas = 5;
        System.out.println("Você terá: " + tentativas);
        while (tentativas > 0) {
            System.out.println("Digite um número entre 1 e 100");
            int numeroEscolhido = leitor.nextInt();
            if (numeroSorteado == numeroEscolhido) {
                System.out.println("Parabéns " + nome + " Você Acertou!");
                if(tentativas == 5){
                    System.out.println("Você acertou de primeira!");
                } else if(tentativas == 4){
                    System.out.println("Você acertou na segunda tentativa");
                } else if(tentativas == 3){
                    System.out.println("Você acertou na terceira tentativa!");
                } else {
                    System.out.println("Você acertou na última tentativa!");
                }
                break;
            } else {
                System.out.println("Que Pena " + nome + ", Você Errou.");
            }
            tentativas--;
            System.out.println("Você tem: " + tentativas);
            if(tentativas == 0 && numeroSorteado != numeroEscolhido){
                System.out.println(nome + " Você Perdeu!!");
            }
        }
        System.out.println("O número era: "+ numeroSorteado);
        System.out.println("Fim de Jogo!");
    }
}
