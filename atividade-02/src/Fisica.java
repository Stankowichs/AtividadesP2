public class Fisica extends Contribuintes {
    private double gastoSaude;

    public Fisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double calcTaxes(){
        double valor;

        if(rendaAnual >= 20000){
            if(gastoSaude != 0)
                valor = (rendaAnual * 0.25) - (gastoSaude * 0.5);
            else
                valor = (rendaAnual * 0.25);
        }
        else{
            if(gastoSaude != 0)
                valor = (rendaAnual * 0.15) - (gastoSaude * 0.5);
            else
                valor = (rendaAnual * 0.15);
        }

        return valor;
    }

    public double getTaxes(){
        return calcTaxes();
    }
}
