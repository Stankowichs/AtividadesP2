import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        double preco;
        int quantidade;

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        nome = sc.nextLine();
        System.out.print("Preco: ");
        preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        quantidade = sc.nextInt();

        Produtos produto1= new Produtos(nome, preco, quantidade);

        produto1.mostrarInformaçoes();
        produto1.addProduct();
        produto1.removeProduct();
    }
}