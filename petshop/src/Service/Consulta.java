package Service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {
  private static final SimpleDateFormat FORMATO_DATA = new SimpleDateFormat("dd/MM/yyyy");
  private Date data;
  private String nomeAnimal;
  private String doutor;

  public Consulta(Date data, String nomeAnimal, String doutor) {
    this.data = data;
    this.nomeAnimal = nomeAnimal;
    this.doutor = doutor;
  }

  public void setData(Date data) {
    this.data = data;

  }

  public Date getData() {
    return data;
  }

  public String getDataFormatada() {
    return FORMATO_DATA.format(data);
  }

  public void setNomeAnimal(String nomeAnimal) {
    this.nomeAnimal = nomeAnimal;
  }

  public String getNomeAnimal() {
    return nomeAnimal;
  }

  public void setDoutor(String doutor) {
    this.doutor = doutor;
  }

  public String getDoutor() {
    return doutor;
  }

  
  @Override
  public String toString() {
      return "📅Data da consulta: " + getDataFormatada() +
             "\n🐾Petciente: " + nomeAnimal +
             "\n🥼Doutor: " + doutor;
  }

}
