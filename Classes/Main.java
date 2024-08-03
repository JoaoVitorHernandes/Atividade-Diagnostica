import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Bem Vindo ao Lava Car!");
        Scanner sc = new Scanner(System.in);

        OutputStream os = new FileOutputStream("Veiculos_Salvos.txt", true); // nome do arquivo que será escrito
        Writer wr = new OutputStreamWriter(os); // criação de um escritor
        BufferedWriter br = new BufferedWriter(wr); // adiciono a um escritor de buffer

        OutputStream nmA = new FileOutputStream("Dados_Salvos.txt", true);
        Writer writer = new OutputStreamWriter(nmA);
        BufferedWriter cl = new BufferedWriter(writer);

        try {
            System.out.println("Como quer logar? ");
            System.out.println("1-> Cliente");
            System.out.println("2-> Funcionário");
            System.out.println("3-> Sair");
            int login = sc.nextInt();

            if (login == 1) {
                while (true) {
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1. Cadastrar seu Veículo");
                    System.out.println("2. Se Cadastrar");
                    System.out.println("3. Sair");
                    int opcao = sc.nextInt();

                    if (opcao == 1) {
                        String marca = sc.nextLine();
                        while (marca.equals("")) {
                            System.out.println("Digite a marca do veículo:");
                            marca = sc.nextLine();
                        }

                        System.out.println("Digite o modelo do veículo:");
                        String modelo = sc.nextLine();
                        while (modelo.equals("")) {
                            System.out.println("Digite o modelo do veículo:");
                            modelo = sc.nextLine();
                        }

                        System.out.println("Digite o ano do veículo:");
                        int ano = sc.nextInt();
                        while (ano > 2025) {
                            System.out.println("Digite o ano do veículo:");
                            ano = sc.nextInt();
                        }

                        String cor = sc.nextLine();
                        while (cor.equals("")) {
                            System.out.println("Digite a cor do veículo:");
                            cor = sc.nextLine();
                        }

                        Veiculo v = new Veiculo(marca, modelo, ano, cor);
                        System.out.println("O veículo foi cadastrado com sucesso!");
                        System.out.println("Marca: " + v.getMarca() + " Modelo: " + v.getModelo() + " Ano: " + v.getAno() + " Cor: " + v.getCor());

                        br.write("-Veículo-");
                        br.newLine();
                        br.write("Marca: " + v.getMarca());
                        br.newLine();
                        br.write("Modelo: " + v.getModelo());
                        br.newLine();
                        br.write("Ano: " + v.getAno());
                        br.newLine();
                        br.write("Cor: " + v.getCor());
                        br.newLine();

                        while (true) {
                            System.out.println("---Escolha o serviço que quer utilizar: ---");
                            System.out.println("1-> Lavar Veículo");
                            System.out.println("2-> Voltar");
                            int escolha = sc.nextInt();
                            if (escolha == 1) {
                                System.out.println("O veículo " + "Marca: " + v.getMarca() + " Modelo: " + v.getModelo() + " Ano: " + v.getAno() + " Cor: " + v.getCor() + " será lavado");
                                break;
                            } else if (escolha == 2) {
                                break;
                            } else {
                                System.out.println("Opção inválida. Tente novamente.");
                            }
                        }

                    } else if (opcao == 2) {
                        System.out.println("Digite seu nome:");
                        String nome = sc.nextLine();
                        while (nome.equals("")) {
                            nome = sc.nextLine();
                        }

                        System.out.println("Digite sua idade:");
                        int idade = sc.nextInt();
                        while (idade < 18) {
                            System.out.println("Digite sua idade:");
                            idade = sc.nextInt();
                        }

                        System.out.println("Digite seu telefone:");
                        String telefone = sc.nextLine();
                        while (telefone.equals("")) {
                            telefone = sc.nextLine();
                        }

                        System.out.println("Digite seu email:");
                        String email = sc.nextLine();
                        while (email.equals("")) {
                            email = sc.nextLine();
                        }

                        Cliente c = new Cliente(nome, idade, telefone, email);
                        System.out.println("O Cliente foi cadastrado com sucesso!");
                        System.out.println("Nome: " + c.getNome() + " Idade: " + c.getIdade() + " Telefone: " + c.getTelefone() + " Email: " + c.getEmail());

                        cl.write("-Cliente-");
                        cl.newLine();
                        cl.write("Nome: " + c.getNome());
                        cl.newLine();
                        cl.write("Idade: " + c.getIdade());
                        cl.newLine();
                        cl.write("Telefone: " + c.getTelefone());
                        cl.newLine();
                        cl.write("Email: " + c.getEmail());
                        cl.newLine();

                    } else if (opcao == 3) {
                        break;
                    }
                }

            } else if (login == 2) {
                while (true) {
                    System.out.println("Escolha uma opção: ");
                    System.out.println("1. Ver Veículos");
                    System.out.println("2. Cadastrar Funcionário");
                    System.out.println("3. Ver Clientes");
                    System.out.println("4. Sair");
                    int opcao = sc.nextInt();
                    sc.nextLine();

                    if (opcao == 1) {
                        br.write("-Veículo-");
                        Funcionario.listarVeiculos();

                    } else if (opcao == 2) {
                        System.out.println("Digite o nome do funcionário:");
                        String nome = sc.nextLine();
                        while (nome.equals("")) {
                            nome = sc.nextLine();
                        }

                        System.out.println("Digite a idade do funcionário:");
                        int idade = sc.nextInt();
                        while (idade < 18) {
                            idade = sc.nextInt();
                        }

                        System.out.println("Digite o telefone do funcionário:");
                        String telefone = sc.nextLine();
                        while (telefone.equals("")) {
                            telefone = sc.nextLine();
                        }

                        System.out.println("Digite o email do funcionário:");
                        String email = sc.nextLine();
                        while (email.equals("")) {
                            email = sc.nextLine();
                        }

                        Funcionario f = new Funcionario(nome, idade, telefone, email);
                        System.out.println("O funcionário foi cadastrado com sucesso!");
                        System.out.println("Nome: " + f.getNome() + " Idade: " + f.getIdade() + " Telefone: " + f.getTelefone() + " Email: " + f.getEmail());

                        cl.write("-Funcionário-");
                        cl.newLine();
                        cl.write("Nome: " + f.getNome());
                        cl.newLine();
                        cl.write("Idade: " + f.getIdade());
                        cl.newLine();
                        cl.write("Telefone: " + f.getTelefone());
                        cl.newLine();
                        cl.write("Email: " + f.getEmail());
                        cl.newLine();

                    } else if (opcao == 3) {
                        cl.write("-Cliente-");
                        Funcionario.listarClientes();

                    } else if (opcao == 4) {
                        break;
                    }
                }

            } else if (login == 3) {
                System.exit(0);
            }
        } finally {
            br.close();
            cl.close();
            sc.close();
        }
    }
}