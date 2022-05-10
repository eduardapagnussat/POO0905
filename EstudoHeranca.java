/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.estudoheranca;

/**
 *
 * @author 1128127
 */
public class EstudoHeranca {
    
    public static void main(String[] args){
        
        Capuccino capuccino = new Capuccino();
        /*posso fazer a instancia a seguir pq todo capuccino é um cafeQuente*/
        CafeQuente cafeQuente = new Capuccino();
        /*o objeto instanciado a seguir não vai poder usar os metodos de Capuccino pois vai olhar pro Cafe*/
        Cafe capuccinoBelaGula = new Capuccino();
    }
}
