/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author MacaZekoMiš
 */
public class IconsController {

    public IconsController(String Uvjet, JLabel Labela) {

//        if (Uvjet == "Sword") {
//            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Sword_48px.png"));
//            Labela.setIcon(Info);
//        } else if (Uvjet == "Hatchet") {
//            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Hatchet_48px.png"));
//            Labela.setIcon(Info);
//        } else if (Uvjet == "Shield") {
//            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Shield_48px.png"));
//            Labela.setIcon(Info);
//        } else if (Uvjet == "Gold") {
//            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Gold_Bars_48px.png"));
//            Labela.setIcon(Info);
//         
//        }

   if (Uvjet == "Drinks") {
            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Beer_Glass_52px.png"));
            Labela.setIcon(Info);
        } else if (Uvjet == "Food") {
            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Bread_52px.png"));
            Labela.setIcon(Info);
        } else if (Uvjet == "Salad") {
            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Vegan_Food_52px.png"));
            Labela.setIcon(Info);
        } else if (Uvjet == "Desert") {
            ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Cupcake_52px.png"));
            Labela.setIcon(Info);
         
        }
        

    }

}
