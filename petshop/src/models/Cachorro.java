package models;
public class Cachorro extends Animal {

    private String comportamento;

    public Cachorro(String especie, String raca, String cor, String nome, String dono, int idade, String comportamento){
        super(especie, raca, cor, nome, dono, idade);
        this.comportamento = comportamento;
    }

    public String getComportamento(){
        return comportamento;
    }
    public void setComportamento(String comportamento){
        this.comportamento = comportamento;
    }

    @Override
    public String toString() {
        super.toString();
        return "\nComportamento: " + comportamento;
    }

}
