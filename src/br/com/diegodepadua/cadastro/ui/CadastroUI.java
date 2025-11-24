package br.com.diegodepadua.cadastro.ui;

import br.com.diegodepadua.cadastro.model.Cliente;
import br.com.diegodepadua.cadastro.repository.ClienteRepository;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class CadastroUI {

    public int opcao;

    public void criarMenu() {
        Scanner sc = new Scanner(System.in);



        System.out.println("CADASTRO DE CLIENTES");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Exibir cliente");
        System.out.println("4 - Excluir cliente");
        System.out.println("5 - Atualizar cliente");
        System.out.println("6 - Sair");
        System.out.println("-------------------");
        System.out.println();
        System.out.println("Escolha uma opcao (1-6): ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                System.out.println("Listar Todos");
                break;
            case 3:
                System.out.println("Exibir cliente");
                break;
            case 4:
                System.out.println("Excluir cliente");
                break;
            case 5:
                System.out.println("Atualizar cliente");
                break;
            case 6:
                System.out.println("Sair");
                System.exit(0);
                break;
              default:
                  System.out.println("Opção inválida! Escolha entre 1 e 6 somente!");
                  criarMenu();
                  break;

        }
    }

    private void cadastrarCliente(){
        UUID id = UUID.randomUUID();

        Cliente cliente = new Cliente();
        cliente.id = id.toString();

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.print("Nome do Cliente: ");
        cliente.nome = sc.nextLine();

        System.out.print("Email do Cliente: ");
        cliente.email = sc.nextLine();

        System.out.print("Salário do cliente:");
        cliente.salario = sc.nextDouble();
        sc.nextLine(); //Gambiarra do Scanner para limpar o cache

        System.out.print("Data de Nascimento do Cliente: ");
        String dataNascimento = sc.nextLine();


        dataNascimento = dataNascimento.replace("-", "/");
        String[] dataNascimentoSplit = dataNascimento.split("/");
        //split corta a string usando a barra como marcador de corte para gerar um vetor (corte quando achar uma "/")
        cliente.dataNascimento = LocalDate.of(
                Integer.parseInt(dataNascimentoSplit[2]),
                Integer.parseInt(dataNascimentoSplit[1]),
                Integer.parseInt(dataNascimentoSplit[0])
        );

        //nessa string torque o "-" por "/"
        //cliente.dataNascimento = LocalDate.parse(dataNascimento);
        //o metodo parse pega uma sequência de digitos e transforma num local date
        //cliente.exibirCliente();
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.cadastrar();



    }
}
