import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    
        String opcao = "";
        Boolean controle = true;

        int timeA = 0, timeB = 0, espera = 0, limite = 6;

        while (controle) {
            System.out.println("\n -SISTEMA DE PELADA-");
            System.out.println("1 - Cadastrar / Entrar");
            System.out.println("2 - Minhas Partidas");
            System.out.println("3 - Nova Partida");
            System.out.println("4 - TIME A (" + timeA + "/" + limite + ")");
            System.out.println("5 - TIME B (" + timeB + "/" + limite + ")");
            System.out.println("6 - Lista de Espera (" + espera + ")");
            System.out.println("7 - Rateio");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("-> Login.");
                    break;
                case "2":
                    System.out.println("-> Suas partidas.");
                    break;
                case "3":
                    System.out.println("-> Criar partida.");
                    break;
                case "4":
                    if (timeA < limite) { timeA++; System.out.println("-> Entrou no A!"); }
                    else { System.out.println("-> Time A lotado!"); }
                    break;
                case "5":
                    if (timeB < limite) { timeB++; System.out.println("-> Entrou no B!"); }
                    else { System.out.println("-> Time B lotado!"); }
                    break;
                case "6":
                    espera++;
                    System.out.println("-> Você está na espera.");
                    break;
                case "7":
                    System.out.println("-> Rateio");
                    break;
                case "0":
                    System.out.println("Saindo...");
                    controle = false; // Muda para false para parar o while
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        leitor.close();
    }
}
