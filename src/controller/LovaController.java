/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JLabel;

public class LovaController {
     Integer lovica;

    public Integer getLovica() {
        lovica = 200;
        return lovica;
    }

    public void setLovica(Integer lovica) {
        this.lovica = lovica;
    }
         public LovaController(Integer Uvjet, JLabel Labela) {
         if (Uvjet <= 0) {
           Labela.setText("No More Money!");
        } 

         
         
        
    }

    public LovaController(Integer lovica) {
        this.lovica = lovica;
    }
}
