public class Juridica extends Contribuintes {
    private int funcionarios;

    public Juridica(String nome, double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public double calcTaxes(){
        double valor;

        if(funcionarios>=10){
            valor = rendaAnual * 0.14;
        }
        else{
            valor = rendaAnual * 0.16;
        }

        return valor;
    }

    public double getTaxes(){
        return calcTaxes();
    }
}
