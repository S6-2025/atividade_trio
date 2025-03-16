package models;

public class Animal {
  private final String especie;
  private String raca;
  private String cor;
  private String nome;
  private String dono;
  private int idade;

  public Animal(String especie, String raca, String cor,String nome, String dono, int idade) {
    this.especie = especie;
    this.raca = raca;
    this.cor = cor;
    this.nome = nome;
    this.dono = dono;
    this.idade = idade;
  }

  public String getEspecie() {
    return especie;
  }

  public void setRaca(String raca) {
    this.raca = raca;
  }
  public String getRaca() {
    return raca;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }
  public String getCor() {
    return cor;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
  public int getIdade() {
    return idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }

  public void setDono(String dono) {
    this.dono = dono;
  }
  public String getDono() {
    return dono;
  }

  public String EmitirSom(){
    return "emitindo som";
  }

 

  @Override
  public String toString() {
    return "Espécie:" + especie + "Raça: " + raca + "Cor: " + cor + "Idade:" + idade;
  }

}
