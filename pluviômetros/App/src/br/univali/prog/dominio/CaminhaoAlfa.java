package br.univali.prog.dominio;

import java.util.ArrayList;
import java.util.List;

public class CaminhaoAlfa extends Caminhao {
  private List<Pluvimetro> pluvimetros = new ArrayList<Pluvimetro>();

  public CaminhaoAlfa(String nome, int capacidade, int peso) {
    super(nome, capacidade, peso);
  }

  public void inserePluviometro(Pluvimetro pluvimetro){
    int pesoNovo = getPesoAtual() + pluvimetro.getPeso();
    if( pesoNovo > this.getPeso()){
      System.out.println("Erro: Carga maxima alcancada!");
      System.out.println("Peso: " + this.getPeso());
      return;
    }

    this.pluvimetros.add(pluvimetro);
  }
  
}
