package models;
public class Cachorro extends Animal {

    private int comportamento; //1 - Agitado 2- Bravo 3- Calmo/Neutro
    private String latido;

    public Cachorro(String especie, String raca, String cor, String nome, String dono, int idade, int comportamento){
    super(especie, raca, cor, nome, dono, idade);
    this.comportamento = comportamento;
    }

    //Get & Set
    public int getComportamento(){
        return comportamento;
    }
    public void setComportamento(int comportamento){
        this.comportamento = comportamento;
    }

    public String getLatido(){
        if (getComportamento() == 1){
            this.latido = "Agitado";
        }else if (getComportamento() == 2){
            this.latido = "Bravo";
        }else {
            this.latido = "Neutro";
        }
        return this.latido;

    }

    //Funçoes
    @Override
    public String EmitirSom() {
        if (getComportamento() == 1){
            this.latido = "AuAuAuAuAu! AuAuAuAuAu!";
        }else if (getComportamento() == 2){
            this.latido = "WOOF! WOOF!";
        }else {
            this.latido = "Au! Au!";
        }
        return this.latido;
    }


    @Override
    public String toString() {
        return super.toString() + "\nComportamento: " + getLatido();
    }

}
