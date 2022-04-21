package exerc01;

import java.util.Scanner;

public class ListaDeContatos {

    public int qtdContatos = 0;
    public Contato[] contatos = new Contato[10];

    public void Inserir(Contato contato) {
        contatos[qtdContatos] = contato;
        qtdContatos++;
    }

    public void VerificaLista() {
        if (qtdContatos == 0) {
            System.out.println("\nLista vazia");
        }
    }

    public void Editar(String nome) {
        for (int i = 0; i < qtdContatos; i++) {
            if (nome.equals(contatos[i].getNome())) {
                MenuEditar(contatos[i]);

                break;
            }
        }
    }

    public void Editar(long identidade) {
        for (int i = 0; i < qtdContatos; i++) {
            if (identidade == contatos[i].getIdentidade()) {
                MenuEditar(contatos[i]);

                break;
            }
        }
    }

    private void MenuEditar(Contato contato) {
        Scanner input = new Scanner(System.in);
        char option;
        do {
            System.out.println("a) Nome");
            System.out.println("b) Identidade");
            System.out.println("c) Telefone");
            System.out.println("d) Sair\n");
            option = input.next().charAt(0);
            switch (option) {
                case 'a' -> {
                    System.out.print("\nNome: ");
                    input.nextLine();
                    String nomeEditado = input.nextLine();
                    contato.setNome(nomeEditado);
                    break;
                }

                case 'b' -> {
                    System.out.print("\nIdentidade: ");
                    long identidadeEditada = input.nextLong();
                    contato.setIdentidade(identidadeEditada);
                    break;
                }

                case 'c' -> {
                    System.out.print("\nTelefone: ");
                    long telefoneEditado = input.nextLong();
                    contato.setTelefone(telefoneEditado);
                    break;
                }

                case 'd' -> {
                    break;
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
        } while (option != 'd');
    }

    public void Deletar(long identidade) {
        for (int i = 0; i < qtdContatos; i++) {
            if (identidade == contatos[i].getIdentidade()) {
                contatos[i] = contatos[qtdContatos - 1];
                System.out.println("Contato " + "#" + (i + 1) + " excluído");
            }
        }
        qtdContatos--;
    }

    public void Deletar(String nome) {
        for (int i = 0; i < qtdContatos; i++) {
            if (nome.equals(contatos[i].getNome())) {
                contatos[i] = contatos[qtdContatos - 1];
                System.out.println("Contato " + "#" + (i + 1) + " excluído");
            }
        }
        qtdContatos--;

    }

    public void Consultar(long identidade) {
        for (int i = 0; i < qtdContatos; i++) {
            if (identidade == contatos[i].getIdentidade()) {
                System.out.println("\nContato #" + (i + 1));
                System.out.println("Nome: " + contatos[i].getNome());
                System.out.println("Identidade: " + contatos[i].getIdentidade());
                System.out.println("Telefone: " + contatos[i].getTelefone());
            }
        }
    }

    public void Consultar(String nome) {
        for (int i = 0; i < qtdContatos; i++) {
            if (nome.equals(contatos[i].getNome())) {
                System.out.println("\nContato #" + (i + 1));
                System.out.println("Nome: " + contatos[i].getNome());
                System.out.println("Identidade: " + contatos[i].getIdentidade());
                System.out.println("Telefone: " + contatos[i].getTelefone());
            }
        }
    }

    public void ListarTodos() {
        for (int i = 0; i < qtdContatos; i++) {
            System.out.println("\nContato #" + (i + 1));
            System.out.println("Nome: " + contatos[i].getNome());
            System.out.println("Identidade: " + contatos[i].getIdentidade());
            System.out.println("Telefone: " + contatos[i].getTelefone());
        }

    }
}
