package src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
            int acertos = 0;
            int erros = 0;
            int totalQuestoes = 15;

            // Definir o nome da faculdade, aluno e professor
            String nomeFaculdade = "Universidade Alfredo Nasser";
            String nomeAluno = "Raphael Kojima de Freitas";
            String nomeProfessor = "Brenno";

            // Exibir o cabeçalho
            exibirCabecalho(nomeFaculdade, nomeAluno, nomeProfessor);

            // Criando as questões
            Questao[] questoes = new Questao[totalQuestoes];

            // Questão 1
            questoes[0] = new Questao();
            questoes[0].pergunta = "Qual é o maior planeta do sistema solar?";
            questoes[0].opcaoA = "A) Marte";
            questoes[0].opcaoB = "B) Terra";
            questoes[0].opcaoC = "C) Júpiter";
            questoes[0].opcaoD = "D) Saturno";
            questoes[0].opcaoE = "E) Urano";
            questoes[0].correta = "C";

            // Questão 2
            questoes[1] = new Questao();
            questoes[1].pergunta = "Qual é o elemento químico representado pelo símbolo 'O'?";
            questoes[1].opcaoA = "A) Oxigênio";
            questoes[1].opcaoB = "B) Ouro";
            questoes[1].opcaoC = "C) Ósmio";
            questoes[1].opcaoD = "D) Oganesson";
            questoes[1].opcaoE = "E) Opium";
            questoes[1].correta = "A";

            // Questão 3
            questoes[2] = new Questao();
            questoes[2].pergunta = "Qual é a capital da França?";
            questoes[2].opcaoA = "A) Paris";
            questoes[2].opcaoB = "B) Londres";
            questoes[2].opcaoC = "C) Roma";
            questoes[2].opcaoD = "D) Madrid";
            questoes[2].opcaoE = "E) Berlim";
            questoes[2].correta = "A";

            // Questão 4
            questoes[3] = new Questao();
            questoes[3].pergunta = "Quem pintou a Mona Lisa?";
            questoes[3].opcaoA = "A) Pablo Picasso";
            questoes[3].opcaoB = "B) Leonardo da Vinci";
            questoes[3].opcaoC = "C) Vincent van Gogh";
            questoes[3].opcaoD = "D) Michelangelo";
            questoes[3].opcaoE = "E) Salvador Dalí";
            questoes[3].correta = "B";

            // Questão 5
            questoes[4] = new Questao();
            questoes[4].pergunta = "Em que ano o Brasil proclamou sua independência?";
            questoes[4].opcaoA = "A) 1822";
            questoes[4].opcaoB = "B) 1808";
            questoes[4].opcaoC = "C) 1889";
            questoes[4].opcaoD = "D) 1500";
            questoes[4].opcaoE = "E) 1900";
            questoes[4].correta = "A";

            // Questão 6
            questoes[5] = new Questao();
            questoes[5].pergunta = "Qual é o continente onde o deserto do Saara está localizado?";
            questoes[5].opcaoA = "A) Ásia";
            questoes[5].opcaoB = "B) África";
            questoes[5].opcaoC = "C) América do Sul";
            questoes[5].opcaoD = "D) Austrália";
            questoes[5].opcaoE = "E) Europa";
            questoes[5].correta = "B";

            // Questão 7
            questoes[6] = new Questao();
            questoes[6].pergunta = "Qual é o maior órgão do corpo humano?";
            questoes[6].opcaoA = "A) Coração";
            questoes[6].opcaoB = "B) Fígado";
            questoes[6].opcaoC = "C) Pele";
            questoes[6].opcaoD = "D) Cérebro";
            questoes[6].opcaoE = "E) Pulmões";
            questoes[6].correta = "C";

            // Questão 8
            questoes[7] = new Questao();
            questoes[7].pergunta = "Quem foi o primeiro presidente dos Estados Unidos?";
            questoes[7].opcaoA = "A) George Washington";
            questoes[7].opcaoB = "B) Thomas Jefferson";
            questoes[7].opcaoC = "C) Abraham Lincoln";
            questoes[7].opcaoD = "D) Franklin D. Roosevelt";
            questoes[7].opcaoE = "E) John F. Kennedy";
            questoes[7].correta = "A";

            // Questão 9
            questoes[8] = new Questao();
            questoes[8].pergunta = "Qual o nome da maior floresta tropical do mundo?";
            questoes[8].opcaoA = "A) Floresta Amazônica";
            questoes[8].opcaoB = "B) Floresta de Sherwood";
            questoes[8].opcaoC = "C) Floresta Negra";
            questoes[8].opcaoD = "D) Floresta do Congo";
            questoes[8].opcaoE = "E) Floresta do Havaí";
            questoes[8].correta = "A";

            // Questão 10
            questoes[9] = new Questao();
            questoes[9].pergunta = "Qual é o nome da série de livros de J.R.R. Tolkien que inspirou os filmes 'O Senhor dos Anéis'?";
            questoes[9].opcaoA = "A) As Crônicas de Nárnia";
            questoes[9].opcaoB = "B) A Terra das Sombras";
            questoes[9].opcaoC = "C) O Hobbit";
            questoes[9].opcaoD = "D) O Senhor dos Anéis";
            questoes[9].opcaoE = "E) Harry Potter";
            questoes[9].correta = "D";

            // Questão 11
            questoes[10] = new Questao();
            questoes[10].pergunta = "Qual é o animal símbolo da Austrália?";
            questoes[10].opcaoA = "A) Coala";
            questoes[10].opcaoB = "B) Canguru";
            questoes[10].opcaoC = "C) Emu";
            questoes[10].opcaoD = "D) Crocodilo";
            questoes[10].opcaoE = "E) Tigre";
            questoes[10].correta = "B";

            // Questão 12
            questoes[11] = new Questao();
            questoes[11].pergunta = "Qual é o nome do principal satélite natural da Terra?";
            questoes[11].opcaoA = "A) Lua";
            questoes[11].opcaoB = "B) Fobos";
            questoes[11].opcaoC = "C) Titã";
            questoes[11].opcaoD = "D) Europa";
            questoes[11].opcaoE = "E) Marte";
            questoes[11].correta = "A";

            // Questão 13
            questoes[12] = new Questao();
            questoes[12].pergunta = "Qual é a cor do sangue de um polvo?";
            questoes[12].opcaoA = "A) Vermelho";
            questoes[12].opcaoB = "B) Azul";
            questoes[12].opcaoC = "C) Verde";
            questoes[12].opcaoD = "D) Amarelo";
            questoes[12].opcaoE = "E) Preto";
            questoes[12].correta = "B";

            // Questão 14
            questoes[13] = new Questao();
            questoes[13].pergunta = "Qual é a fórmula química da água?";
            questoes[13].opcaoA = "A) H2O";
            questoes[13].opcaoB = "B) CO2";
            questoes[13].opcaoC = "C) O2";
            questoes[13].opcaoD = "D) H2O2";
            questoes[13].opcaoE = "E) CH4";
            questoes[13].correta = "A";

            // Questão 15
            questoes[14] = new Questao();
            questoes[14].pergunta = "Qual é a capital do Japão?";
            questoes[14].opcaoA = "A) Pequim";
            questoes[14].opcaoB = "B) Seul";
            questoes[14].opcaoC = "C) Tóquio";
            questoes[14].opcaoD = "D) Bangkok";
            questoes[14].opcaoE = "E) Hanoi";
            questoes[14].correta = "C";

            // Lógica para responder às questões
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < totalQuestoes; i++) {
                questoes[i].escrevaQuestao();
                System.out.print("Sua resposta: ");
                String respostaUsuario = questoes[i].leiaResposta();
                if (!questoes[i].isCorreta(respostaUsuario)) {
                    erros++;
                } else {
                    acertos++;
                }
            }

            // Calculando a porcentagem de acertos
            double porcentagemAcertos = ((double) acertos / totalQuestoes) * 100;

            // Exibindo o resultado final
            System.out.println("Resultado Final:");
            System.out.println("Você acertou " + acertos + " questões.");
            System.out.println("Você errou " + erros + " questões.");
            System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);
        }

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
