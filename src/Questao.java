package src;

import java.util.Scanner;

public class Questao {
    String pergunta;
    String opcaoA;
    String opcaoB;
    String opcaoC;
    String opcaoD;
    String opcaoE;
    String correta;

    // Método para exibir a questão
    public void escrevaQuestao() {
        System.out.println(pergunta);
        System.out.println(opcaoA);
        System.out.println(opcaoB);
        System.out.println(opcaoC);
        System.out.println(opcaoD);
        System.out.println(opcaoE);
    }

    // Método para ler a resposta do usuário
    public String leiaResposta() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toUpperCase();
    }

    // Método para verificar se a resposta está correta
    public boolean isCorreta(String respostaUsuario) {
        return respostaUsuario.equals(correta);
    }

    // Função para exibir o cabeçalho
    private static void exibirCabecalho(String nomeFaculdade, String nomeAluno, String nomeProfessor) {
        System.out.println("==================================================");
        System.out.println("Nome da Faculdade: UNIFAN");
        System.out.println("Nome do Aluno: Raphael Kojima");
        System.out.println("Nome do Professor: Breno");
        System.out.println("==================================================");
        System.out.println("Bem-vindo(a)! Você responderá 15 perguntas de múltipla escolha sobre o tema escolhido: Conhecimentos Gerais");
        System.out.println("Vamos começar!");
        System.out.println("==================================================");
    }
}
