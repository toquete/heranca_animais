/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaex4;

/**
 *
 * @author Guizão
 */
public abstract class Insecta extends Arthropoda{
  
  @Override
  public void obterDescricao(){
    super.obterDescricao();
    System.out.println("Classe Insecta");
  }
}
