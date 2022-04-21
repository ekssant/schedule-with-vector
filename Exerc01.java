package exerc01;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ListaDeContatos listadecontatos = new ListaDeContatos();

        int escolha;
        do {
            System.out.println("\nCadastro de Contatos");
            System.out.println("1) Inserir");
            System.out.println("2) Excluir");
            System.out.println("3) Editar");
            System.out.println("4) Consultar");
            System.out.println("5) Listar todos\n");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    char op;

                    do {
                        System.out.print("\nNome: ");
                        input.nextLine();
                        String nome = input.nextLine();

                        System.out.print("Identidade: ");
                        long identidade = input.nextLong();

                        System.out.print("Telefone: ");
                        long telefone = input.nextLong();

                        Contato contatos = new Contato(nome, identidade, telefone);
                        listadecontatos.Inserir(contatos);

                        System.out.print("\nDeseja inserir mais contatos? (s/n): ");
                        op = input.next().charAt(0);

                    } while (op != 'n');

                    break;
                case 2:
                    int escolhaExcluir;

                    System.out.println("Para excluir um contato, é necessário escolher entre entrar com a identidade ou o nome do contato");
                    System.out.println("1) Identidade");
                    System.out.println("2) Nome");
                    System.out.println("3) Sair\n");
                    escolhaExcluir = input.nextInt();

                    if (escolhaExcluir == 1) {
                        System.out.print("Informe a identidade: ");
                        long excluirId = input.nextLong();
                        listadecontatos.Deletar(excluirId);

                    } else if (escolhaExcluir == 2) {
                        System.out.print("Informe o nome: ");
                        input.nextLine();
                        String excluirNome = input.nextLine();
                        listadecontatos.Deletar(excluirNome);
                    }

                    break;

                case 3:
                    int escolhaEditar;
                    System.out.println("Para editar um contato, é necessário escolher entre entrar com a identidade ou o nome do contato");
                    System.out.println("1) Identidade");
                    System.out.println("2) Nome");
                    System.out.println("3) Sair\n");
                    escolhaEditar = input.nextInt();

                    if (escolhaEditar == 1) {
                        System.out.print("Informe a identidade: ");
                        long editarNome = input.nextLong();
                        listadecontatos.Editar(editarNome);
                    } else if (escolhaEditar == 2) {
                        System.out.print("Informe o nome: ");
                        input.nextLine();
                        String editarNome = input.nextLine();
                        listadecontatos.Editar(editarNome);
                    }
                    break;

                case 4:
                    int escolhaConsulta;
                    System.out.println("Para consultar um contato, é necessário escolher entre entrar com a identidade ou o nome do contato");
                    System.out.println("1) Identidade");
                    System.out.println("2) Nome");
                    System.out.println("3) Sair\n");
                    escolhaConsulta = input.nextInt();

                    if (escolhaConsulta == 1) {

                        System.out.print("Informe a identidade: ");
                        long consultaId = input.nextLong();
                        listadecontatos.Consultar(consultaId);

                    } else if (escolhaConsulta == 2) {
                        System.out.print("Informe o nome: ");
                        input.nextLine();
                        String consultaNome = input.nextLine();
                        listadecontatos.Consultar(consultaNome);
                    }
                    break;

                case 5:
                    listadecontatos.VerificaLista();
                    listadecontatos.ListarTodos();
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (escolha <= 6);
    }
}
