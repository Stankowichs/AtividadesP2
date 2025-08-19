public abstract class Contribuintes {
    public String nome;
    public double rendaAnual;

    public Contribuintes(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    void mostrarTaxes(){
        System.out.printf("%s: $ %.2f%n", nome, getTaxes());
    }

    public abstract double getTaxes();
}
