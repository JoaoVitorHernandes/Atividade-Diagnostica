import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Lava Car");
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("1. Cadastrar Veículo");
        System.out.println("2. Cadastrar Funcionário");
        System.out.println("3. Cadastrar Cliente");
        System.out.println("4. Cadastrar Pagamento");
        System.out.println("5. Sair");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a marca do veículo:");
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
            System.out.println("Digite a cor do veículo:");
            String cor = sc.nextLine();
            while (cor.equals("")) {
                System.out.println("Digite a cor do veículo:");
                cor = sc.nextLine();
            }

            Veiculo v = new Veiculo(marca, modelo, ano, cor);
            System.out.println("O veículo foi cadastrado com sucesso!");


        } else if (opcao == 2) {
            System.out.println("Digite o nome do funcionário:");
            String nome = sc.nextLine();
            while (nome.equals("")) {
                System.out.println("Digite o nome do funcionário:");
                nome = sc.nextLine();
            }
            System.out.println("Digite a idade do funcionário:");
            int idade = sc.nextInt();
            while (idade < 18) {
                System.out.println("Digite a idade do funcionário:");
                idade = sc.nextInt();
            }
            System.out.println("Digite o telefone do funcionário:");
            String telefone = sc.nextLine();
            while (telefone.equals("")) {
                System.out.println("Digite o telefone do funcionário:");
                telefone = sc.nextLine();
            }
            System.out.println("Digite o email do funcionário:");
            String email = sc.nextLine();
            while (email.equals("")) {
                System.out.println("Digite o email do funcionário:");
                email = sc.nextLine();
            }
            Funcionario f = new Funcionario(nome, idade, telefone, email);
            System.out.println("O funcionário foi cadastrado com sucesso!");


        } else if (opcao == 3) {
            System.out.println("Digite o nome do Cliente:");
            String nome = sc.nextLine();
            while (nome.equals("")) {
                nome = sc.nextLine();
            }

            System.out.println("Digite a idade do Cliente:");
            int idade = sc.nextInt();
            while (idade < 18) {
                System.out.println("Digite a idade do Cliente:");
                idade = sc.nextInt();
            }
            System.out.println("Digite o telefone do Cliente:");
            String telefone = sc.nextLine();
            while (telefone.equals("")) {
                System.out.println("Digite o telefone do Cliente:");
                telefone = sc.nextLine();
            }
            System.out.println("Digite o email do Cliente:");
            String email = sc.nextLine();
            while (email.equals("")) {
                System.out.println("Digite o email do Cliente:");
                email = sc.nextLine();
            }
            Cliente c = new Cliente(nome, idade, telefone, email);
            System.out.println("O Cliente foi cadastrado com sucesso!");
            System.out.println("Nome: " + c.getNome() + " Idade: " + c.getIdade() + " telefone: " + c.getTelefone() + " Email: " + c.getEmail());

        }
    }
}