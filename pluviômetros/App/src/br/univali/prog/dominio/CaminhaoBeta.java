package br.univali.prog.dominio;

import java.util.ArrayList;
import java.util.List;

public class CaminhaoBeta extends Caminhao {

  private List<Pluvimetro> pluvimetros = new ArrayList<Pluvimetro>();

  public CaminhaoBeta(String nome, int capacidade, int peso) {
    super(nome, capacidade, peso);
  }

  public void inserePluviometro(Pluvimetro pluvimetro){
    int pesoNovo = getPesoAtual() + pluvimetro.getPeso();
    if( pesoNovo > this.getPeso()){
      System.out.println("Erro: Carga maxima alcancada!");
      return;
    }

    for(Pluvimetro pluvimetroAUX: this.pluvimetros){
       boolean temIgual = pluvimetroAUX.GetTipo().equals(pluvimetro.GetTipo());
      
       if(temIgual){
          System.out.println("Ja tem um pluvimetro desse tipo");
       }
    }

    this.pluvimetros.add(pluvimetro);
  }
  
}
