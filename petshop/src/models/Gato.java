package models;

public class Gato extends Animal {

  public Gato(String _raca, String _cor, String _nome, String _dono, int _idade, double comprimento) {
    super("Felis silvestris catus", _raca, _cor, _nome, _dono, _idade);
    this.comprimento = comprimento;
  }
  private double comprimento;
  private  double  alturaPulo ;

  
  public void setComprimento(double comprimento){
    this.comprimento = comprimento;
  }
  public double getComprimento(){
    return comprimento;
  }

  public void calcularAlturaPulo(){
    this.alturaPulo = this.comprimento * 5;
  }
  

  public double getAlturaPulo(){
    return alturaPulo;
  }

  @Override
  public String EmitirSom(){
    return "Miaaaaaaaaaaauu Miaaaaaaauuu MIAAAAAAAAAAAAAUUUUUUUUUUUU";
  }

    @Override
    public String toString() {
        return "[ " + super.toString() + "\nAltura que o felino pula: " + alturaPulo + "m \n" + EmitirSom() + " ]\n" ;
    }

  

}