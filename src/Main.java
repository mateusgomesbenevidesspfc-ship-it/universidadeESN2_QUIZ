import java.util.ArrayList;
import java.util.List;

/**
 * Quiz de Tecnologia - Algoritmos e Linguagem de Programação II
 * Execução via console.
 */
public class Main {

    public static void main(String[] args) {

        exibirCabecalho();

        List<Questao> questoes = criarQuestoes();

        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);

            System.out.println("Questão " + (i + 1) + " de " + questoes.size());
            System.out.println();
            questao.escrevaQuestao();

            String resposta = questao.leiaResposta();

            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        double porcentagem = (acertos * 100.0) / questoes.size();

        System.out.println("==========================================");
        System.out.println("              RESULTADO FINAL");
        System.out.println("==========================================");
        System.out.println("Acertos: " + acertos + " de " + questoes.size());
        System.out.printf("Porcentagem de acertos: %.2f%%%n", porcentagem);
        System.out.println(mensagemDesempenho(acertos, questoes.size()));
        System.out.println("------------------------------------------");
        System.out.println("Obrigado por participar do Quiz de Tecnologia!");
        System.out.println("==========================================");
    }

    /**
     * Exibe o cabeçalho do sistema.
     */
    private static void exibirCabecalho() {
        System.out.println("==========================================");
        System.out.println("          QUIZ DE TECNOLOGIA");
        System.out.println("==========================================");
        System.out.println("Aluno(a)   : Mateus Gomes De Sousa");
        System.out.println("Professor  : Brenno Pimenta");
        System.out.println("Faculdade  : UNIFAN");
        System.out.println("==========================================");
        System.out.println();
    }

    /**
     * Retorna uma mensagem de acordo com o desempenho do usuário.a
     */
    private static String mensagemDesempenho(int acertos, int total) {
        int faixa = (acertos * 3) / total;

        return switch (faixa) {
            case 3 -> "Excelente! Você domina o assunto!";
            case 2 -> "Muito bom! Continue estudando!";
            case 1 -> "Bom esforço! Dá para melhorar!";
            default -> "Não desanime! Estude mais e tente novamente.";
        };
    }

    /**
     * Cria uma questão com pergunta, 5 alternativas (A a E) e a letra correta.
     */
    private static Questao criarQuestao(String pergunta, String a, String b,
                                        String c, String d, String e,
                                        String correta) {

        Questao q = new Questao();

        q.pergunta = pergunta;
        q.opcaoA = "A) " + a;
        q.opcaoB = "B) " + b;
        q.opcaoC = "C) " + c;
        q.opcaoD = "D) " + d;
        q.opcaoE = "E) " + e;
        q.correta = correta;

        return q;
    }

    /**
     * Cria e retorna a lista com as 15 questões do quiz.
     */
    private static List<Questao> criarQuestoes() {

        List<Questao> questoes = new ArrayList<>();

        questoes.add(criarQuestao(
                "1. O que significa CPU?",
                "Central Processing Unit",
                "Computer Personal Unit",
                "Central Program Utility",
                "Control Processing User",
                "Computer Processing Unit",
                "A"));

        questoes.add(criarQuestao(
                "2. Qual linguagem é conhecida por ser usada no desenvolvimento Android?",
                "HTML",
                "Kotlin",
                "SQL",
                "CSS",
                "PHP",
                "B"));

        questoes.add(criarQuestao(
                "3. O que é hardware?",
                "Programa de computador",
                "Sistema operacional",
                "Parte física do computador",
                "Linguagem de programação",
                "Arquivo digital",
                "C"));

        questoes.add(criarQuestao(
                "4. Qual destes é um sistema operacional?",
                "Google",
                "Windows",
                "Java",
                "Intel",
                "Python",
                "B"));

        questoes.add(criarQuestao(
                "5. Para que serve o Git?",
                "Editar imagens",
                "Criar apresentações",
                "Controlar versões de código",
                "Navegar na internet",
                "Criar planilhas",
                "C"));

        questoes.add(criarQuestao(
                "6. O que significa a sigla RAM?",
                "Random Access Memory",
                "Read Access Machine",
                "Random Application Module",
                "Rapid Access Memory",
                "Read Application Memory",
                "A"));

        questoes.add(criarQuestao(
                "7. Qual linguagem é utilizada principalmente para estruturar páginas web?",
                "Java",
                "Python",
                "HTML",
                "SQL",
                "C",
                "C"));

        questoes.add(criarQuestao(
                "8. O que é um banco de dados?",
                "Um programa para editar vídeos",
                "Um conjunto organizado de informações",
                "Um tipo de processador",
                "Um sistema operacional",
                "Um cabo de rede",
                "B"));

        questoes.add(criarQuestao(
                "9. Qual destes é um navegador de internet?",
                "Linux",
                "Chrome",
                "Java",
                "Windows",
                "Android",
                "B"));

        questoes.add(criarQuestao(
                "10. O que é Inteligência Artificial?",
                "Tecnologia que simula capacidades humanas",
                "Um tipo de cabo",
                "Um sistema operacional",
                "Um componente de computador",
                "Uma rede social",
                "A"));

        questoes.add(criarQuestao(
                "11. Qual linguagem é muito utilizada em desenvolvimento web no lado do servidor?",
                "PHP",
                "HTML",
                "CSS",
                "XML",
                "JSON",
                "A"));

        questoes.add(criarQuestao(
                "12. Para que serve o CSS?",
                "Criar bancos de dados",
                "Estilizar páginas web",
                "Criar sistemas operacionais",
                "Gerenciar arquivos",
                "Controlar o processador",
                "B"));

        questoes.add(criarQuestao(
                "13. O que é um algoritmo?",
                "Um componente físico",
                "Uma sequência de passos para resolver um problema",
                "Um sistema operacional",
                "Um banco de dados",
                "Uma rede de computadores",
                "B"));

        questoes.add(criarQuestao(
                "14. Qual destes é um exemplo de armazenamento em nuvem?",
                "Google Drive",
                "Processador",
                "Memória RAM",
                "Teclado",
                "Placa de vídeo",
                "A"));

        questoes.add(criarQuestao(
                "15. O que significa a sigla URL?",
                "Universal Router Link",
                "Uniform Resource Locator",
                "User Resource Login",
                "Universal Remote Link",
                "User Router Location",
                "B"));

        return questoes;
    }
}
