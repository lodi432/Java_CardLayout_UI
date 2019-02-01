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
public class PriceController {
    Integer goldPrice = 50;
    Integer swordPrice = 20;
    Integer shieldPrice = 10;
    Integer hatchetPrice = 25;
    Integer drinkPrice = 50;
    Integer foodPrice = 20;
    Integer saladPrice = 10;
    Integer desertPrice = 25;
    public PriceController() {
        
    }
    
     

    public Integer getGoldPrice() {
        return goldPrice;
    }

    public Integer getSwordPrice() {
        return swordPrice;
    }

    public Integer getShieldPrice() {
        return shieldPrice;
    }

    public Integer getHatchetPrice() {
        return hatchetPrice;
    }

    public void setGoldPrice(Integer goldPrice) {
        this.goldPrice = goldPrice;
    }
    public PriceController(String Uvjet, JLabel Labela) {
//         if (Uvjet == "Sword") {
//       
//           Labela.setText("Price: " + swordPrice.toString());
//        }  else if (Uvjet == "Gold") {
//        
//           Labela.setText("Price: " + goldPrice.toString());
//        }
//         else if (Uvjet == "Hatchet") {
//        
//           Labela.setText("Price: " + hatchetPrice.toString());
//        }
//         else if (Uvjet == "Shield") {
//        
//           Labela.setText("Price: " + shieldPrice.toString());
//        }

//Drinks Prices
         if (Uvjet == "Drinks") {
           Labela.setText("Price: " + drinkPrice.toString());
        }  
         else if (Uvjet == "Food") {
           Labela.setText("Price: " + foodPrice.toString());
        }
         else if (Uvjet == "Salad") {
        
           Labela.setText("Price: " + saladPrice.toString());
        }
         else if (Uvjet == "Desert") {
        
           Labela.setText("Price: " + desertPrice.toString());
        }
        
    }
}
