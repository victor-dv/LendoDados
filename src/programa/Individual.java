package programa;

public class Individual extends Contribuintes{
    private double gastoSaude;

    public Individual(){
    }
    public Individual(String name, double rendaAnual, double gastoSaude){
        super(name, rendaAnual);
        this.gastoSaude = gastoSaude;
    }



    @Override
    public double imposto() {
       if (getRendaAnual() < 2000 ){
        return getRendaAnual() * 0.15;

       } else if (getRendaAnual() > 2000) {
          return getRendaAnual() * 0.25;
       }else if (gastoSaude ){

       }

    }
}
