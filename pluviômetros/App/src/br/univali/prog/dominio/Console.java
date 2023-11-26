package br.univali.prog.dominio;

import java.util.Scanner;

public class Console {
  Caminhao caminhaoAlfa;
  Caminhao caminhaoBeta;
  public Console(){
    this.caminhaoAlfa = new CaminhaoAlfa("BETONEIRA", 300, 500);
    this.caminhaoBeta = new CaminhaoBeta("BETONEIRA", 300, Integer.MAX_VALUE);
  }

  public String lerValor(String rotulo) {
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
  }

  public void menu() {
    char opcao;
    do {
        System.out.println("1 - Adicionar pluvimetro");
        System.out.println("S - sair");
        
        opcao = this.lerValor("Selecione uma opção").toUpperCase().charAt(0);

            switch (opcao) {
                case '1': adicionarPluvimetro(); break;
            }

        for(int i =0; i < 3; i++){
          System.out.println();
        }
        
    } while (opcao != 'S');
  }

  private void adicionarPluvimetro(){
    String tipo = this.lerValor("Tipo do pluvimetro");
    int peso = Integer.parseInt(this.lerValor("Qual peso do pluvimetro?"));
    int capacidade = Integer.parseInt(this.lerValor("Qual capacidade do pluvimetro?"));

    Pluvimetro pluvimetro = new Pluvimetro(tipo, peso, capacidade);

    char tipoCaminhao = this.lerValor("Deseja adicionar no caminhao Alfa (A) ou Beta (B) ?").toUpperCase().charAt(0);

    if(tipoCaminhao == 'A'){
      this.caminhaoAlfa.inserePluviometro(pluvimetro);
      return;
    } else { 
      this.caminhaoBeta.inserePluviometro(pluvimetro);
      return;
    }

  }
}
