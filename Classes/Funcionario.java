import java.io.*;

public class Funcionario {
    private String nome;
    private int idade;
    private String telefone;
    private String email;

    public Funcionario(String nome, int idade, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public static void listarVeiculos() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Veiculos_Salvos.txt"));
        String linha;
        boolean hasContent = false;

        System.out.println("Veículos cadastrados:");

        while ((linha = reader.readLine()) != null) {
            if (linha.trim().startsWith("Marca:")) {
                if (hasContent) {
                    System.out.println();
                }
                System.out.println("-Veículo-");
                hasContent = true;
            }
            System.out.println(linha);
        }
        if (!hasContent) {
            System.out.println("Nenhum veículo cadastrado.");
        }
        reader.close();
    }

    public static void listarClientes() throws IOException {
        BufferedReader cl = new BufferedReader(new FileReader("Dados_Salvos.txt"));
        String linhaCl;
        boolean hasContent = false;

        System.out.println("Clientes cadastrados:");
        while ((linhaCl = cl.readLine()) != null) {
            if (linhaCl.trim().startsWith("Nome:")) {
                if (hasContent) {
                    System.out.println();
                }
                System.out.println("-Cliente-");
                hasContent = true;
            }
            System.out.println(linhaCl);
        }
        if (!hasContent) {
            System.out.println("Nenhum cliente cadastrado.");
        }
        cl.close();
    }
}
