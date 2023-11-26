package br.univali.prog.dominio;

public class Pluvimetro {
  private String tipo;
  private int peso;
  private int capacidade;

  public Pluvimetro(String tipo, int peso, int capacidade){
    this.tipo = tipo;
    this.peso = peso;
    this.capacidade = capacidade;
  }

  public int getPeso(){
    return this.peso;
  }
  
  public int getCapacidade(){
    return this.capacidade;
  }

   public String GetTipo(){
    return this.tipo;
  }
}
