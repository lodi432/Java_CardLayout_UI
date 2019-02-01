/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.LovaController;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controller.IconsController;
import controller.PriceController;
import java.awt.Component;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
/**
 *
 * @author MacaZekoMiš
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
   
    public static final String PHYSICIST = "Physicist";
//  public static final String CHEMIST = "Chemist";
    private static List<String> list = new ArrayList<String>();
    Integer LOVA;
    static final int f = 10;
    String oldValue;
    String oldValueLova;
    ArrayList<String> arr = new ArrayList<String>();
    ArrayList<String> arr2 = new ArrayList<String>();
    private CardLayout cl = new CardLayout();
//  private JPanel seperatePanel = new CategoriesPanel(this, "tirk");
    private JPanel seperatePanel3 = new CategoriesPanel(this, "zeleni");
    private IconsController iconControl;
    LovaController LovaController;
    PriceController PriceController;
    CustomListRenderer Renderer;
    private String Whatnot;

   
    public MainFrame() {
  
        initComponents();
//      this.seperatePanel3 = seperatePanel3;
        jButtonBuy.setVisible(false);
        Priced.setVisible(false);
        jLabel1.setVisible(false);
        jSeparator1.setVisible(false);
        jScrollPane1.setVisible(false);
        jList1.setVisible(false);
        LovaController = new LovaController(LOVA);
        PriceController = new PriceController();
        LOVA = LovaController.getLovica();
        jLabelLove.setText(LOVA.toString() + " $");
        Content.add(seperatePanel3);
        configList();
        jList1.addListSelectionListener(new jListListener());
        jOut.setHorizontalTextPosition(SwingConstants.LEFT);
        System.out.println("GOLDPRICE :" + PriceController.getGoldPrice());
        String Odabir = jList1.getSelectedValue();
        DefaultListModel model = new DefaultListModel (); 
//       model.addElement ( new CustomListRenderer.CustomData ( new Color ( 209, 52, 23 ), 1, "Anna Williams" ) );
       jList3.setModel(model);
       jList3.setCellRenderer(new CustomListRenderer(jList3, this, Odabir));
        

      
        
    }
   public String someMethod() {
     
      return jList1.getSelectedValue();
          
   }
   
    public String someMethod2() {   
     
      return jLabelLove.getText();  
        
   }
    
     public String sendToRenderer() {   
      String majkumu = jList2.getSelectedValue();
      return majkumu;
//      return jList1.getSelectedValue();  
        
   }
 
   public String getItemSelected(){
        System.out.println(getItemSelected());
      return jList1.getSelectedValue();
     
}

    private void configList(){
//        arr.add("Sword");
//        arr.add("Sheild");
//        arr.add("Hatchet");
//        arr.add("Gold");
        arr.add("Drinks");
        arr.add("Food");
        arr.add("Salad");
        arr.add("Desert");
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < arr.size(); i++)
         {
        listModel.addElement(arr.get(i));
         }
        jList1.setModel(listModel);
        
        System.out.println("You have " + arr.size() + " items in your inventory.");
    }
    
    private void configList2() {
        DefaultListModel listModel2 = new DefaultListModel();
        for (int i = 0; i < arr2.size(); i++) {
            listModel2.addElement(arr2.get(i));
        }
        jList2.setModel(listModel2);
    }
   

      private void configList3() {
        DefaultListModel listModel3 = new DefaultListModel();
        for (int i = 0; i < arr.size(); i++) {
    
            listModel3.addElement ( new CustomListRenderer.CustomData ( new Color ( 209, 52, 23 ), i+1,arr.get(i)  ) );
//          listModel3.addElement(arr2.get(i));
        }
        jList3.setModel(listModel3);
    }
      
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kTopNav = new keeptoo.KGradientPanel();
        jOut = new javax.swing.JLabel();
        jLabelLove = new javax.swing.JLabel();
        logoTxt = new javax.swing.JLabel();
        cartBtn = new keeptoo.KButton();
        logoTxt1 = new javax.swing.JLabel();
        jOutPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Content = new jcMousePanel.jcMousePanel();
        jcDataPanel = new jcMousePanel.jcMousePanel();
        firstPanel = new jcMousePanel.jcMousePanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButtonBuy = new javax.swing.JButton();
        jLabelReturn = new javax.swing.JLabel();
        iconRight = new javax.swing.JLabel();
        Priced = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        kButton1 = new keeptoo.KButton();
        secondPanel = new keeptoo.KGradientPanel();
        iconBack = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        iconRight1 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        jLabel3 = new javax.swing.JLabel();
        Priced1 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        jSeparator2 = new javax.swing.JSeparator();
        thirdPanel = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        kTopNav.setkEndColor(new java.awt.Color(66, 111, 166));
        kTopNav.setkStartColor(new java.awt.Color(103, 174, 118));

        jOut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jOut.setForeground(new java.awt.Color(255, 255, 255));
        jOut.setText("No Item Selected");
        jOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jOutMousePressed(evt);
            }
        });

        jLabelLove.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelLove.setForeground(new java.awt.Color(153, 255, 0));
        jLabelLove.setText("Lova");
        jLabelLove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelLoveMousePressed(evt);
            }
        });
        jLabelLove.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabelLovePropertyChange(evt);
            }
        });

        logoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoTxt.setForeground(new java.awt.Color(255, 255, 255));
        logoTxt.setText("Cart");

        cartBtn.setText("0");
        cartBtn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cartBtn.setkAllowTab(false);
        cartBtn.setkEndColor(new java.awt.Color(153, 0, 0));
        cartBtn.setkHoverForeGround(new java.awt.Color(0, 204, 204));
        cartBtn.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        cartBtn.setkSelectedColor(new java.awt.Color(0, 204, 204));
        cartBtn.setkStartColor(new java.awt.Color(66, 111, 166));
        cartBtn.setOpaque(false);
        cartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cartBtnMousePressed(evt);
            }
        });

        logoTxt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoTxt1.setForeground(new java.awt.Color(255, 255, 255));
        logoTxt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-card-security-48.png"))); // NOI18N
        logoTxt1.setText("  Your Wallet :");

        jOutPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jOutPrice.setForeground(new java.awt.Color(255, 255, 255));
        jOutPrice.setText("0");
        jOutPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jOutPriceMousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Shopping_Cart_52px_w.png"))); // NOI18N

        javax.swing.GroupLayout kTopNavLayout = new javax.swing.GroupLayout(kTopNav);
        kTopNav.setLayout(kTopNavLayout);
        kTopNavLayout.setHorizontalGroup(
            kTopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kTopNavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLove)
                .addGap(72, 72, 72)
                .addComponent(jOut)
                .addGap(18, 18, 18)
                .addComponent(jOutPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(logoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(cartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        kTopNavLayout.setVerticalGroup(
            kTopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kTopNavLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(kTopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoTxt)
                    .addComponent(cartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kTopNavLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kTopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(kTopNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jOut)
                        .addComponent(jLabelLove, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoTxt1)
                        .addComponent(jOutPrice)))
                .addGap(18, 18, 18))
        );

        Content.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/beautiful-color-ui-gradients-backgrounds-pale-wood.png"))); // NOI18N
        Content.setModo(4);
        Content.setVisibleLogo(false);
        Content.setLayout(new java.awt.CardLayout());

        jcDataPanel.setModo(5);
        jcDataPanel.setVisibleLogo(false);
        jcDataPanel.setLayout(new java.awt.CardLayout());

        firstPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blur-blurry-bokeh-347139.jpg"))); // NOI18N
        firstPanel.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-meal-24.png"))); // NOI18N

        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList3MousePressed(evt);
            }
        });
        jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList3ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        jButtonBuy.setText("Buy");
        jButtonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuyActionPerformed(evt);
            }
        });

        jLabelReturn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReturn.setText("Pay");

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

        Priced.setBackground(new java.awt.Color(255, 255, 255));
        Priced.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Priced.setForeground(new java.awt.Color(255, 255, 255));
        Priced.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Price :");

        jSeparator1.setBackground(new java.awt.Color(255, 0, 102));
        jSeparator1.setForeground(new java.awt.Color(255, 0, 0));

        kButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Restaurant_52px.png"))); // NOI18N
        kButton1.setText("Order Now");
        kButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        kButton1.setkAllowTab(false);
        kButton1.setkHoverForeGround(new java.awt.Color(0, 204, 204));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton1.setkSelectedColor(new java.awt.Color(0, 204, 204));
        kButton1.setkStartColor(new java.awt.Color(66, 111, 166));
        kButton1.setOpaque(false);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout firstPanelLayout = new javax.swing.GroupLayout(firstPanel);
        firstPanel.setLayout(firstPanelLayout);
        firstPanelLayout.setHorizontalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(firstPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(firstPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Priced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(firstPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelReturn))
                            .addComponent(iconRight)))
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addComponent(jButtonBuy)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        firstPanelLayout.setVerticalGroup(
            firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstPanelLayout.createSequentialGroup()
                        .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconRight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(Priced, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(firstPanelLayout.createSequentialGroup()
                                .addGroup(firstPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(firstPanelLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabelReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(firstPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(firstPanelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane3)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonBuy))))
        );

        jcDataPanel.add(firstPanel, "jedan");

        secondPanel.setkEndColor(new java.awt.Color(255, 153, 0));
        secondPanel.setkStartColor(new java.awt.Color(102, 0, 102));
        secondPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                secondPanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        iconBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Left_52px.png"))); // NOI18N
        iconBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconBackMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconBackMousePressed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

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

        kButton2.setText("Remove");
        kButton2.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton2.setkStartColor(new java.awt.Color(255, 51, 51));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Price :");

        Priced1.setBackground(new java.awt.Color(255, 255, 255));
        Priced1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Priced1.setForeground(new java.awt.Color(255, 255, 255));

        kButton3.setText("Pay");
        kButton3.setkHoverEndColor(new java.awt.Color(255, 0, 51));
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 0, 102));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconRight1)
                .addContainerGap())
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(secondPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(secondPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))
                            .addGroup(secondPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Priced1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconRight1)
                    .addComponent(iconBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(secondPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(secondPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Priced1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jcDataPanel.add(secondPanel, "dva");

        thirdPanel.setkEndColor(new java.awt.Color(255, 255, 255));
        thirdPanel.setkStartColor(new java.awt.Color(255, 255, 255));
        thirdPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                thirdPanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        thirdPanel.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Thank you, Your order is submitting...");
        thirdPanel.add(jLabel6);
        jLabel6.setBounds(30, 40, 320, 34);

        jLabelTime.setFont(new java.awt.Font("DS-Digital", 0, 32)); // NOI18N
        jLabelTime.setForeground(new java.awt.Color(51, 204, 255));
        jLabelTime.setText("jLabel7");
        thirdPanel.add(jLabelTime);
        jLabelTime.setBounds(230, 150, 100, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Cancel Order");
        thirdPanel.add(jLabel9);
        jLabel9.setBounds(40, 310, 188, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 153, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Delete_26px_1.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        thirdPanel.add(jLabel7);
        jLabel7.setBounds(170, 320, 26, 26);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loader_backinout.gif"))); // NOI18N
        thirdPanel.add(jLabel2);
        jLabel2.setBounds(100, 110, 287, 132);

        jcDataPanel.add(thirdPanel, "tri");

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kTopNav, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kTopNav, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jcDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private class jListListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            String newValue = (String) jList1.getSelectedValue();
            firePropertyChange(PHYSICIST, oldValue, newValue);
            oldValue = newValue;
        }
    }
 
 
     public List<String> getList() {
       return arr2;
   }  
 
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        jOut.setText(jList1.getSelectedValue());
        iconControl = new IconsController(jList1.getSelectedValue(), jOut);
    }//GEN-LAST:event_jList1ValueChanged

    private void jOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOutMousePressed
          if (jOut.getText() == "Sword") {
               Whatnot = "Sword";
               System.out.println(Whatnot);
        } 
          
    }//GEN-LAST:event_jOutMousePressed

    private void jLabelLovePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabelLovePropertyChange
       
    }//GEN-LAST:event_jLabelLovePropertyChange

    private void jLabelLoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoveMousePressed


    }//GEN-LAST:event_jLabelLoveMousePressed
     int Racun = 0;
          
          String strI = "";
          int sum = 0;
           StringBuilder sb = new StringBuilder();
    private void jButtonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuyActionPerformed
        if (jList1.getSelectedValuesList().size() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "First Choose one or more Meals to order");
            return;
        }else{
            String receiveList = jList1.getSelectedValue().toString();
            arr2.add(receiveList);
            Integer kolicina = arr2.size();
            cartBtn.setText(kolicina.toString());
            System.out.println(arr2.toString());
            System.out.println(arr2.size());
            configList2();
//          configList3();

            if (jList1.getSelectedValue() == "Drinks"){
                 int Cijena = 50;
                 System.out.println("Thank you, Gold price is: " + PriceController.getGoldPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();
                 Priced.setText(strI+ " $");
                 Priced1.setText(strI+ " $");
            

            }else if (jList1.getSelectedValue() == "Food"){
                 int Cijena = PriceController.getSwordPrice();
                 System.out.println("Thank you, Sword price is: " + PriceController.getSwordPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();     
                 Priced.setText(strI+ " $");
                 Priced1.setText(strI+ " $");
             
            }else if (jList1.getSelectedValue() == "Salad"){
                 int Cijena = PriceController.getHatchetPrice();
                 System.out.println("Thank you, Hatchet price is: " + PriceController.getHatchetPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();     
                 Priced.setText(strI + " $");
                 Priced1.setText(strI+ " $");
             
            }else if (jList1.getSelectedValue() == "Desert"){
                 int Cijena = PriceController.getShieldPrice();
                 System.out.println("Thank you, Sheild price is: " + PriceController.getShieldPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();     
                 Priced.setText(strI+ " $");
                 Priced1.setText(strI+ " $");
             
            }
          
            
        }
    }//GEN-LAST:event_jButtonBuyActionPerformed

    private void cartBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartBtnMousePressed
     
          System.out.println("view.MainFrame.cartViewMousePressed()");
    }//GEN-LAST:event_cartBtnMousePressed

    private void jList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList3ValueChanged
//       jList2.setSelectedIndex(jList3.getSelectedIndex());
       jList1.setSelectedIndex(jList3.getSelectedIndex());
     //   System.out.println("J3 VALUECHANGED: " + jList3.getSelectedValue());
       PriceController = new PriceController(jList1.getSelectedValue(), jOutPrice);
     
        
    }//GEN-LAST:event_jList3ValueChanged

    private void iconRightMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRightMouseEntered
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px_t.png"));
        iconRight.setIcon(Info);
    }//GEN-LAST:event_iconRightMouseEntered

    private void iconRightMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRightMouseExited
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px.png"));
        iconRight.setIcon(Info);
    }//GEN-LAST:event_iconRightMouseExited

    private void iconRightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRightMousePressed
        CardLayout card = (CardLayout)jcDataPanel.getLayout();
        card.show(jcDataPanel, "dva");
    }//GEN-LAST:event_iconRightMousePressed

    private void iconBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackMouseEntered
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Left_52px_t.png"));
        iconBack.setIcon(Info);
    }//GEN-LAST:event_iconBackMouseEntered

    private void iconBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackMouseExited
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Left_52px.png"));
        iconBack.setIcon(Info);
    }//GEN-LAST:event_iconBackMouseExited

    private void iconBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconBackMousePressed
        CardLayout card = (CardLayout)jcDataPanel.getLayout();
        card.show(jcDataPanel, "jedan");

    }//GEN-LAST:event_iconBackMousePressed

    private void jList3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MousePressed
       
            
    }//GEN-LAST:event_jList3MousePressed

    private void iconRight1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRight1MouseEntered
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px_t.png"));
        iconRight.setIcon(Info);
    }//GEN-LAST:event_iconRight1MouseEntered

    private void iconRight1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRight1MouseExited
        ImageIcon Info = new ImageIcon(getClass().getResource("/img/icons8_Right_52px.png"));
        iconRight.setIcon(Info);
    }//GEN-LAST:event_iconRight1MouseExited

    private void iconRight1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconRight1MousePressed
        CardLayout card = (CardLayout)jcDataPanel.getLayout();
        card.show(jcDataPanel, "tri");

    }//GEN-LAST:event_iconRight1MousePressed
  boolean xed = false;
    private void thirdPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_thirdPanelAncestorAdded
              
        new Thread() {
        int counter = 5;
        public void run() {
            while(counter >= 0 && xed==false) {
                xed = false;
                jLabelTime.setText(" " + (counter--));
                try{
                  Thread.sleep(1000);
                } catch(Exception e) {}
            }
            if (counter < 0 && xed==false){
            
            System.out.println("0 Order Completed");
            System.out.println("You have ordered: " + arr2.toString());
            LOVA = LOVA - sum;
            jLabelLove.setText(LOVA.toString() + " $");
            LovaController x = new LovaController(LOVA, jLabelLove);
            arr2.clear();
            configList2();
            Integer kolicina = arr2.size();
            sum=0;
            Priced.setText("0");
          
            cartBtn.setText(kolicina.toString());
            CardLayout card = (CardLayout)jcDataPanel.getLayout();
            card.show(jcDataPanel, "jedan");
        }
            else{
                System.out.println(".elsi()");
            }
            
        }
    }.start();
    }//GEN-LAST:event_thirdPanelAncestorAdded
  private void removeItem() {
        List<String> arr2 = this.getList();
        if (jList2.getSelectedValuesList().size() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "First Choose one or more Meals to delte");
            return;
        }
        if (jList2.getSelectedValuesList().size() == 1) {
          
            arr2.remove(jList2.getSelectedValuesList().get(0));
            Integer kolicina = arr2.size();
            cartBtn.setText(kolicina.toString());
            configList2();
        } 
      }
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        removeItem();
        configList3();
    }//GEN-LAST:event_kButton2ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        configList3();
    }//GEN-LAST:event_formComponentShown

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
             xed = true;    
             System.out.println("Order Dissmissed");
             arr2.clear();
             sum=0;
             Priced.setText("0");
        
             configList2();
             Integer kolicina = arr2.size();
             cartBtn.setText(kolicina.toString());
             CardLayout card = (CardLayout)jcDataPanel.getLayout();
             card.show(jcDataPanel, "jedan");
    }//GEN-LAST:event_jLabel7MousePressed

    private void secondPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_secondPanelAncestorAdded
        xed = false;
    }//GEN-LAST:event_secondPanelAncestorAdded

    private void jOutPriceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jOutPriceMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOutPriceMousePressed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        jSeparator2.setVisible(true);
        if (jList1.getSelectedValuesList().size() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "First Choose one or more Meals to order");
            return;
        }else{
            String receiveList = jList1.getSelectedValue().toString();
            arr2.add(receiveList);
            Integer kolicina = arr2.size();
            cartBtn.setText(kolicina.toString());
            System.out.println(arr2.toString());
            System.out.println(arr2.size());
            configList2();
//          configList3();

            if (jList1.getSelectedValue() == "Drinks"){
                 int Cijena = 50;
                 System.out.println("Thank you, Gold price is: " + PriceController.getGoldPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();
                 Priced.setText(strI+ " $");
                 Priced1.setText(strI+ " $");
       

            }else if (jList1.getSelectedValue() == "Food"){
                 int Cijena = PriceController.getSwordPrice();
                 System.out.println("Thank you, Sword price is: " + PriceController.getSwordPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();     
                 Priced.setText(strI+ " $");
                 Priced1.setText(strI+ " $");
          
            }else if (jList1.getSelectedValue() == "Salad"){
                 int Cijena = PriceController.getHatchetPrice();
                 System.out.println("Thank you, Hatchet price is: " + PriceController.getHatchetPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();     
                 Priced.setText(strI + " $");
                 Priced1.setText(strI+ " $");
               
            }else if (jList1.getSelectedValue() == "Desert"){
                 int Cijena = PriceController.getShieldPrice();
                 System.out.println("Thank you, Sheild price is: " + PriceController.getShieldPrice());
                 sb.setLength(0);
                 sum += Cijena;
                 sb.append("");
                 sb.append(sum);
                 String strI = sb.toString();     
                 Priced.setText(strI+ " $");
                 Priced1.setText(strI+ " $");
             
            }
          
            
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcMousePanel.jcMousePanel Content;
    private javax.swing.JLabel Priced;
    private javax.swing.JLabel Priced1;
    private keeptoo.KButton cartBtn;
    private jcMousePanel.jcMousePanel firstPanel;
    private javax.swing.JLabel iconBack;
    private javax.swing.JLabel iconRight;
    private javax.swing.JLabel iconRight1;
    private javax.swing.JButton jButtonBuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLove;
    private javax.swing.JLabel jLabelReturn;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList jList3;
    private javax.swing.JLabel jOut;
    private javax.swing.JLabel jOutPrice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private jcMousePanel.jcMousePanel jcDataPanel;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    private keeptoo.KButton kButton3;
    private keeptoo.KGradientPanel kTopNav;
    private javax.swing.JLabel logoTxt;
    private javax.swing.JLabel logoTxt1;
    private keeptoo.KGradientPanel secondPanel;
    private keeptoo.KGradientPanel thirdPanel;
    // End of variables declaration//GEN-END:variables
}
