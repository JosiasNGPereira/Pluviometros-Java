package br.univali.prog.dominio;

import java.util.*;

abstract public class Caminhao {
  private String nome;
  private List<Pluvimetro> pluvimetros = new ArrayList<Pluvimetro>();
  private int peso;
  private int capacidade;

  public Caminhao (String nome, int capacidade, int peso){
    this.nome = nome;
    this.capacidade = capacidade;
    this.peso = peso;
  }

  abstract public void inserePluviometro(Pluvimetro pluvimetro);

  final public int getPesoAtual(){
    int pesoAtual = 0;

    for(Pluvimetro pluvimetro: pluvimetros){
      pesoAtual += pluvimetro.getPeso();
    }

    return pesoAtual;
  }


  public double getPeso() { 
    return this.peso;
  }

}
