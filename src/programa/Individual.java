package programa;

public class Individual extends Contribuintes{
    private double gastoSaude;

    public Individual(){
    }
    public Individual(String nome, double rendaAnual, double gastoSaude){
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }


    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double imposto() {
        if (getRendaAnual() < 2000) {
            return (getRendaAnual() * 0.15) - (gastoSaude * 0.5);

        } else {
            return (getRendaAnual() * 0.25) - (gastoSaude * 0.5);
        }
    }
}
