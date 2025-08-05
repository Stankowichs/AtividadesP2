import java.util.Scanner;

public class Produtos {
    private String nome ;
    private double preco;
    private int quantidade;

    public Produtos(String nome, double preco , int quantidade ){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrarInformaçoes(){
        double totalEstoque = quantidade * preco;
        System.out.println("Informações do produto: " + nome +", R$ " + preco + ", " + quantidade + " unidades, Total: R$ " + totalEstoque);
    }

    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of products to be added in stock:");
        int novaQuantidade =  input.nextInt();
        quantidade += novaQuantidade;
        mostrarInformaçoes();
    }

    public void removeProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of products to be removed in stock:");
        int novaQuantidade =  input.nextInt();
        quantidade -= novaQuantidade;
        mostrarInformaçoes();
    }
}
