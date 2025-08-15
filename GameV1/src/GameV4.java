import java.util.Scanner;

public class GameV4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Jogo jogo1 = new Jogo(5, 69);
        Ferramentas.imprimirSaudacao();
        String n = Ferramentas.coletarNome(sc);
        Ferramentas.apresetnarDesafio(n, jogo1.tentativas);
        Ferramentas.jogar(sc, n, jogo1.tentativas, jogo1.numeroSorteado);
        Ferramentas.finalizarJogo(jogo1.numeroSorteado);
    }

}
