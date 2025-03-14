package models;

public class Furao extends Animal{

    private int remelexo;
    private int fofura;

    public Furao(String raca, String cor, String nome, String dono, int idade, int remelexo) {
        super("Mustela furo", raca, cor, nome, dono, idade);
        this.remelexo = remelexo;
    }

    public int getRemelexo() {
        return remelexo;
    }

    public void setRemelexo(int remelexo) {
        this.remelexo = remelexo;
    }

    public void calcularFofura(){
        this.fofura = this.remelexo + 4;
    }

    public int getFofura(){
        calcularFofura();
        return this.fofura;
    }


    @Override
    public String EmitirSom(){
        return "SHIIIICHIIIICHI SHIIICHIICHII";
    }

    @Override
    public String toString() {
        return super.toString() + "\nNível de fofura: LVL." + getFofura();
    }
}
