/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IconsController;
import controller.LovaController;
import controller.OdabirController;
import controller.PriceController;
import java.awt.CardLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import view.drinks.DrinksPanel;

/**
 *
 * @author MacaZekoMiš
 */
public class CategoriesPanel extends javax.swing.JPanel {

    /**
     * Creates new form CategoriesPanel
     */
    public static final String MEALED = "KURAC";
    private CardLayout c2 = new CardLayout();
    private JPanel drinksPanel = new DrinksPanel("drinks");
    private MainFrame mainFrame;
    private IconsController iconControl;
    private PriceController priceControl;
    private LovaController lovaControl;
    private OdabirController odabirControl;

  

//    public CategoriesPanel(String Named) {
//        this.mainFrame = mainFrame;
//        initComponents();
//
//        CardLayout c2 = (CardLayout) parentPanel.getLayout();
//        c2.show(parentPanel, Named);
//        jLabel1.setText(Named);
//    }

    public CategoriesPanel(MainFrame mainFrame, String Named){
        this.mainFrame = mainFrame;
        initComponents();
        jFromMain.setHorizontalTextPosition(SwingConstants.LEFT);
     
//        EDC
        CardLayout c2 = (CardLayout) parentPanel.getLayout();
        c2.show(parentPanel, Named);
//        jLabelMealed.setText(Named);
//        LOVAC.setText(lovaControl.getLovica().toString());
        mainFrame.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if (e.getPropertyName().equals(mainFrame.PHYSICIST)) {
                    String value = e.getNewValue().toString();
                    jFromMain.setText(value);
                    iconControl = new IconsController(value, jLabIconMain);
                    priceControl = new PriceController(value, jLabelPriceMain);
                    
                    System.out.println("iconControl: " + value);
                }
            }
        });

    }
     
    public JLabel getjLabelMealed() {
        return jLabelMealed;
    }

    public void setjLabelMealed(JLabel jLabelMealed) {
        this.jLabelMealed = jLabelMealed;
    }
    public String passMealed() {
        
//      return jLabelMealed.getText();
        return jLabelMealed.getText();
//          
   }
    
  
    
        public void otherMethod2() {

        System.out.println(mainFrame.someMethod2());
        String texter = mainFrame.someMethod2();
        LOVAC.setText(texter);
    }
        
        
        
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new keeptoo.KGradientPanel();
        zeleniPanel = new keeptoo.KGradientPanel();
        jLabelMealed = new javax.swing.JLabel();
        iconRight = new javax.swing.JLabel();
        tirkPanel = new keeptoo.KGradientPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnDrinks = new javax.swing.JButton();
        btnDodajNovi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnDodajNovi3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnDodajNovi2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        iconRight1 = new javax.swing.JLabel();
        siviPanel3 = new keeptoo.KGradientPanel();
        jButton4 = new javax.swing.JButton();
        jFromMain = new javax.swing.JLabel();
        jButtonGo = new javax.swing.JButton();
        jLabelPriceMain = new javax.swing.JLabel();
        jLabIconMain = new javax.swing.JLabel();
        LOVAC = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        parentPanel.setLayout(new java.awt.CardLayout());

        zeleniPanel.setkEndColor(new java.awt.Color(102, 255, 51));
        zeleniPanel.setkStartColor(new java.awt.Color(51, 204, 255));

        jLabelMealed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMealed.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMealed.setText("Meals");
        jLabelMealed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMealedMousePressed(evt);
            }
        });

        iconRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Right_52px.png"))); // NOI18N
        iconRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconRightMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconRightMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconRightMousePressed(evt);
            }
        });

        javax.swing.GroupLayout zeleniPanelLayout = new javax.swing.GroupLayout(zeleniPanel);
        zeleniPanel.setLayout(zeleniPanelLayout);
        zeleniPanelLayout.setHorizontalGroup(
            zeleniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, zeleniPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(iconRight))
            .addGroup(zeleniPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabelMealed, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        zeleniPanelLayout.setVerticalGroup(
            zeleniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zeleniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconRight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabelMealed, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        parentPanel.add(zeleniPanel, "green");

        tirkPanel.setkEndColor(new java.awt.Color(204, 204, 255));
        tirkPanel.setkStartColor(new java.awt.Color(153, 153, 255));
        tirkPanel.setLayout(null);

        jButton2.setText("nazad");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        tirkPanel.add(jButton2);
        jButton2.setBounds(404, 344, 33, 23);

        jLabel5.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Drinks");
        tirkPanel.add(jLabel5);
        jLabel5.setBounds(74, 11, 55, 22);

        btnDrinks.setBackground(new java.awt.Color(0, 0, 0));
        btnDrinks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Beer_Glass_52px.png"))); // NOI18N
        btnDrinks.setFocusable(false);
        btnDrinks.setOpaque(false);
        btnDrinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinksActionPerformed(evt);
            }
        });
        tirkPanel.add(btnDrinks);
        btnDrinks.setBounds(25, 44, 166, 134);

        btnDodajNovi.setBackground(new java.awt.Color(0, 0, 0));
        btnDodajNovi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Bread_52px.png"))); // NOI18N
        btnDodajNovi.setFocusable(false);
        btnDodajNovi.setOpaque(false);
        btnDodajNovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNoviActionPerformed(evt);
            }
        });
        tirkPanel.add(btnDodajNovi);
        btnDodajNovi.setBounds(209, 44, 166, 134);

        jLabel6.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Food");
        tirkPanel.add(jLabel6);
        jLabel6.setBounds(262, 11, 44, 22);

        btnDodajNovi3.setBackground(new java.awt.Color(0, 0, 0));
        btnDodajNovi3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Vegan_Food_52px.png"))); // NOI18N
        btnDodajNovi3.setFocusable(false);
        btnDodajNovi3.setOpaque(false);
        btnDodajNovi3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNovi3ActionPerformed(evt);
            }
        });
        tirkPanel.add(btnDodajNovi3);
        btnDodajNovi3.setBounds(25, 222, 166, 134);

        jLabel8.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salad");
        tirkPanel.add(jLabel8);
        jLabel8.setBounds(77, 189, 51, 22);

        btnDodajNovi2.setBackground(new java.awt.Color(0, 0, 0));
        btnDodajNovi2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Cupcake_52px.png"))); // NOI18N
        btnDodajNovi2.setFocusable(false);
        btnDodajNovi2.setOpaque(false);
        btnDodajNovi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajNovi2ActionPerformed(evt);
            }
        });
        tirkPanel.add(btnDodajNovi2);
        btnDodajNovi2.setBounds(209, 222, 166, 134);

        jLabel7.setFont(new java.awt.Font("Raleway Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Desert");
        tirkPanel.add(jLabel7);
        jLabel7.setBounds(258, 189, 59, 22);

        iconRight1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconRight1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Right_52px.png"))); // NOI18N
        iconRight1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconRight1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconRight1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconRight1MousePressed(evt);
            }
        });
        tirkPanel.add(iconRight1);
        iconRight1.setBounds(385, 11, 52, 39);

        parentPanel.add(tirkPanel, "tirk");

        siviPanel3.setkEndColor(new java.awt.Color(0, 51, 51));
        siviPanel3.setkStartColor(new java.awt.Color(102, 102, 102));

        jButton4.setText("nazad");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jFromMain.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jFromMain.setForeground(new java.awt.Color(255, 255, 255));
        jFromMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jFromMainMousePressed(evt);
            }
        });

        jButtonGo.setText("GO");
        jButtonGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoActionPerformed(evt);
            }
        });

        jLabelPriceMain.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPriceMain.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPriceMain.setText("Java Powered");
        jLabelPriceMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelPriceMainMousePressed(evt);
            }
        });

        jLabIconMain.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabIconMain.setForeground(new java.awt.Color(255, 255, 255));
        jLabIconMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Coffee_52px.png"))); // NOI18N
        jLabIconMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabIconMainMousePressed(evt);
            }
        });

        LOVAC.setBackground(new java.awt.Color(255, 255, 255));
        LOVAC.setForeground(new java.awt.Color(255, 255, 255));
        LOVAC.setText("Stats");

        javax.swing.GroupLayout siviPanel3Layout = new javax.swing.GroupLayout(siviPanel3);
        siviPanel3.setLayout(siviPanel3Layout);
        siviPanel3Layout.setHorizontalGroup(
            siviPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siviPanel3Layout.createSequentialGroup()
                .addGroup(siviPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, siviPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGo))
                    .addGroup(siviPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(siviPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(siviPanel3Layout.createSequentialGroup()
                                .addComponent(LOVAC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(siviPanel3Layout.createSequentialGroup()
                                .addComponent(jFromMain, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabIconMain, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPriceMain, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 78, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        siviPanel3Layout.setVerticalGroup(
            siviPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(siviPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(siviPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(LOVAC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(siviPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPriceMain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabIconMain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFromMain, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jButtonGo)
                .addContainerGap())
        );

        parentPanel.add(siviPanel3, "sivi");

        add(parentPanel, "xxx");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CardLayout c2 = (CardLayout) parentPanel.getLayout();
        c2.previous(parentPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDrinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinksActionPerformed
    
    }//GEN-LAST:event_btnDrinksActionPerformed

    private void btnDodajNoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNoviActionPerformed

    }//GEN-LAST:event_btnDodajNoviActionPerformed

    private void btnDodajNovi3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNovi3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajNovi3ActionPerformed

    private void btnDodajNovi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajNovi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDodajNovi2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CardLayout c2 = (CardLayout) parentPanel.getLayout();
        c2.previous(parentPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jFromMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFromMainMousePressed


    }//GEN-LAST:event_jFromMainMousePressed

    private void jButtonGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoActionPerformed
         otherMethod2();
    }//GEN-LAST:event_jButtonGoActionPerformed

    private void jLabelPriceMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPriceMainMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPriceMainMousePressed

    private void jLabIconMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabIconMainMousePressed
        
//        lovaControl = new LovaController(value, jLabelPriceMain);        
    }//GEN-LAST:event_jLabIconMainMousePressed

    private void jLabelMealedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMealedMousePressed
       String Uvjet = "Sword";
       odabirControl = new OdabirController(Uvjet, jLabelMealed);
       
    }//GEN-LAST:event_jLabelMealedMousePressed

    private void iconRightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRightMouseEntered
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px_t.png"));
        iconRight.setIcon(Info);
    }//GEN-LAST:event_iconRightMouseEntered

    private void iconRightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRightMouseExited
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px.png"));
        iconRight.setIcon(Info);
    }//GEN-LAST:event_iconRightMouseExited

    private void iconRightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRightMousePressed
        CardLayout c2 = (CardLayout) parentPanel.getLayout();
        c2.next(parentPanel);
    }//GEN-LAST:event_iconRightMousePressed

    private void iconRight1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRight1MouseEntered
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px_t.png"));
        iconRight1.setIcon(Info);
    }//GEN-LAST:event_iconRight1MouseEntered

    private void iconRight1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRight1MouseExited
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px.png"));
        iconRight1.setIcon(Info);
    }//GEN-LAST:event_iconRight1MouseExited

    private void iconRight1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRight1MousePressed
        CardLayout c2 = (CardLayout) parentPanel.getLayout();
        c2.next(parentPanel);
    }//GEN-LAST:event_iconRight1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOVAC;
    private javax.swing.JButton btnDodajNovi;
    private javax.swing.JButton btnDodajNovi2;
    private javax.swing.JButton btnDodajNovi3;
    private javax.swing.JButton btnDrinks;
    private javax.swing.JLabel iconRight;
    private javax.swing.JLabel iconRight1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonGo;
    private javax.swing.JLabel jFromMain;
    private javax.swing.JLabel jLabIconMain;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelMealed;
    private javax.swing.JLabel jLabelPriceMain;
    private keeptoo.KGradientPanel parentPanel;
    private keeptoo.KGradientPanel siviPanel3;
    private keeptoo.KGradientPanel tirkPanel;
    private keeptoo.KGradientPanel zeleniPanel;
    // End of variables declaration//GEN-END:variables

}
