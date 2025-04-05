import java.util.Scanner;

public class menu {
    private static agenda agenda = new agenda();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;

        do{
            System.out.println("\nMenu da agenda de contatos");
            System.out.println("\n(1) adicionar contato");
            System.out.println("(2) listar contatos");
            System.out.println("(3) buscar contato");
            System.out.println("(4) atualizar contato");
            System.out.println("(5) remover contato");
            System.out.println("(6) sair");

            System.out.println("\ndigite um opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    buscarContato();
                    break;
                case 4:
                    atualizarContato();
                    break;
                case 5:
                    removerContato();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente");
            }
        } while (opcao != 6);
    }

    private static void adicionarContato() {
        System.out.println("digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.println("digite seu telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("digite seu cpf");
        String cpf = scanner.nextLine();

        contato contato = new contato(nome, telefone, email, cpf);
        agenda.adicionarContato(contato);
    }

    private static void listarContatos() {
        agenda.listarContatos();
    }

    private static void buscarContato(){
        System.out.println("digite o nome do seu contato: ");
        String nome = scanner.nextLine();
        contato contato = agenda.buscarContato(nome);

        if(contato != null){
            System.out.println("contato encontrado: " + contato);
        }
        else {
            System.out.println("contato nao encontrado. ");
        }
    }

    private static void atualizarContato(){
        System.out.println("digite o nome do contado que deseja atualizar: ");
        String nome = scanner.nextLine();

        System.out.println("digite o novo telefone: ");
        String novoTelefone = scanner.nextLine();

        System.out.println("digite o novo email: ");
        String novoEmail = scanner.nextLine();

        agenda.atualizarContato(nome, novoTelefone, novoEmail);
    }

    private static void removerContato(){
        System.out.println("digite o nome do contato que deseja remover: ");
        String nome = scanner.nextLine();
        agenda.removerContato(nome);
    }
}

