/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;


public class JelaRenderer extends JLabel implements ListCellRenderer<String> {
 
    @Override
    public Component getListCellRendererComponent(JList<? extends String> list, String Jelas, int index,
        boolean isSelected, boolean cellHasFocus) {
        
        
        String s = "Jebote Led";
        setOpaque(true);
       
        BufferedImage image = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 50, 50);
      
        g.setColor(Color.WHITE);
        g.drawString(s, 2, 20);
        ImageIcon i = new ImageIcon(image);
        setIcon(i);
        
        if(isSelected){
            setBackground(Color.GRAY);
        }else{
            setBackground(list.getBackground());
        }
        
         
        return this;
    }
    
}
