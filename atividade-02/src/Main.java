import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int quantidade = sc.nextInt();

        String nome;
        double rendaAnual;
        double gastoSaude;
        double[] tax = new double[quantidade];
        int funcionarios;

        Contribuintes[] contribuintes = new Contribuintes[quantidade];

        for(int i = 0 ; i < quantidade ; i++){
            System.out.print("Individual or company (i/c)? ");
            char personType = sc.next().charAt(0);

            if(personType == 'i'){
                System.out.print("Nome: ");
                nome = sc.next();
                System.out.print("Anual Income: ");
                rendaAnual = sc.nextDouble();
                System.out.print("Health expenditures: ");
                gastoSaude = sc.nextDouble();

                contribuintes[i] = new Fisica(nome, rendaAnual, gastoSaude);
            }
            else if(personType == 'c'){
                System.out.print("Nome: ");
                nome = sc.next();
                System.out.print("Anual Income: ");
                rendaAnual = sc.nextDouble();
                System.out.print("Number of employes: ");
                funcionarios = sc.nextInt();

                contribuintes[i] = new Juridica(nome, rendaAnual, funcionarios);
            }

        }

        System.out.println("TAXES PAID:");
        for(Contribuintes c : contribuintes){
            c.mostrarTaxes();
        }

        double totalTaxes = 0;
        for(Contribuintes c : contribuintes){
            totalTaxes += c.getTaxes();
        }
        System.out.println("\nTotal Taxes: " + totalTaxes);
        sc.close();
        
    }
}