import java.util.Scanner;

public class GameV2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tentativas = 5;
        imprimirSaudacao();
        String n = coletarNome(sc);
        apresetnarDesafio(n, tentativas);
        jogar(sc, n, tentativas);
        finalizarJogo();
    }

    static void finalizarJogo() {
        System.out.println("O número era: ");
        System.out.println("Fim de Jogo!");
    }

    static void jogar(Scanner leitor, String nome, int tentativas) {
        int numeroSorteado = 69;
        while (tentativas > 0) {
            System.out.println("Digite um número entre 1 e 100");
            int numeroEscolhido = leitor.nextInt();
            if (numeroSorteado == numeroEscolhido) {
                System.out.println("Parabéns, " + nome + " Você Acertou!");
                if (tentativas == 5) {
                    System.out.println("Você acertou de primeira!");
                } else if (tentativas == 4) {
                    System.out.println("Você acertou na segunda tentativa");
                } else if (tentativas == 3) {
                    System.out.println("Você acertou na terceira tentativa!");
                } else {
                    System.out.println("Você acertou na última tentativa!");
                }
                break;
            } else {
                System.out.println("Que Pena, " + nome + " Você Errou.");
            }
            tentativas--;
            System.out.println("Você tem: " + tentativas);
            if (tentativas == 0 && numeroSorteado != numeroEscolhido) {
                System.out.println(nome + " Você Perdeu!!");
            }
        }
    }

    static void apresetnarDesafio(String nome, int tentativas) {
        System.out.println("Olá " + nome + "!");
        System.out.println("Você deverá descobrir o número!");
        System.out.println("Você terá: " + tentativas + " tentativas");
    }

    static String coletarNome(Scanner leitor) {
        System.out.println("Informe Seu Nome:");
        String nome = leitor.next();
        leitor.nextLine();
        return nome;
    }

    static void imprimirSaudacao() {
        System.out.println("Bem vindo ao Tigrinho!");
    }
}
