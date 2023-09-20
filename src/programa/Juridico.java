package programa;

public class Juridico extends Contribuintes{
    private int funcionarios;

    public Juridico(){
    }

    public Juridico(String nome, double rendaAnual, int funcionarios){
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }
    @Override
    public double imposto() {
      if (funcionarios > 10){
          return getRendaAnual() * 0.14;
      } else {
          return getRendaAnual() * 0.16;
      }
    }
}
