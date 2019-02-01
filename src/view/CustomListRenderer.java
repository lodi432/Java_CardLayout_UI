/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;

/**
 *
 * @author MacaZekoMiš
 */
public class CustomListRenderer  extends DefaultListCellRenderer {
    private static final ImageIcon crossIcon = new ImageIcon ( CustomListRenderer.class.getResource ( "/img/icons8_Delete_26px_1.png" ) );
    private static final ImageIcon tipIcon = new ImageIcon ( CustomListRenderer.class.getResource ( "/img/icons8-meal-24.png" ) );
    
//    public static void main ( String[] args )
//    {
//        JFrame frame = new JFrame ( "Custom list renderer" );
//
//        DefaultListModel model = new DefaultListModel ();
//        model.addElement ( new CustomData ( new Color ( 209, 52, 23 ), 1, "Anna Williams" ) );
//        model.addElement ( new CustomData ( new Color ( 135, 163, 14 ), 0, "Lucy Frank" ) );
//        model.addElement ( new CustomData ( new Color ( 204, 204, 204 ), 0, "Joe Fritz" ) );
//        model.addElement ( new CustomData ( new Color ( 90, 90, 90 ), 3, "Mikle Garin" ) );
//
//        JList list = new JList ( model );
//        list.setCellRenderer ( new CustomListRenderer ( list ) );
//        list.setBorder ( BorderFactory.createEmptyBorder ( 5, 5, 5, 5 ) );
//        frame.add ( list );
//
//        frame.pack ();
//        frame.setLocationRelativeTo ( null );
//        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
//        frame.setVisible ( true );
//    }

    /**
     * Actual renderer.
     */
    private CustomLabel renderer;
    private MainFrame mainFrame;

    /**
     * Custom renderer constructor.
     * We will use it to create actual renderer component instance.
     * We will also add a custom mouse listener to process close button.
     *
     * @param list our JList instance
     */
  
    public CustomListRenderer ( final JList list, MainFrame mainFrame, String Koji)
    {
        
        super ();
        renderer = new CustomLabel ();
         this.mainFrame = mainFrame;
//        list.addMouseListener ( new MouseAdapter ()
//        {
//            @Override
//            public void mouseReleased ( MouseEvent e )
//            {
//                if ( SwingUtilities.isLeftMouseButton ( e ) )
//                {
//                    int index = list.locationToIndex ( e.getPoint () );
//                    if ( index != -1 && list.isSelectedIndex ( index ) )
//                    {
//                        Rectangle rect = list.getCellBounds ( index, index );
//                        Point pointWithinCell = new Point ( e.getX () - rect.x, e.getY () - rect.y );
//                        Rectangle crossRect = new Rectangle ( rect.width - 9 - 5 - crossIcon.getIconWidth () / 2,
//                                rect.height / 2 - crossIcon.getIconHeight () / 2, crossIcon.getIconWidth (), crossIcon.getIconHeight () );
//                        if ( crossRect.contains ( pointWithinCell ) )
//                        {
//                            DefaultListModel model = ( DefaultListModel ) list.getModel ();
//                            System.out.println(".mouseReleased()"+ index );
//                             System.out.println(".odabirje()"+ Koji );
//                            System.out.println("mainframe" + mainFrame.oldValue);
//                             System.out.println("sendToRenderermethod" + mainFrame.sendToRenderer());
//                             
//                            model.remove ( index );
//                           
//                        }
//                    }
//                }
//            }
//        } );
    }


    /**
     * Returns custom renderer for each cell of the list.
     *
     * @param list         list to process
     * @param value        cell value (CustomData object in our case)
     * @param index        cell index
     * @param isSelected   whether cell is selected or not
     * @param cellHasFocus whether cell has focus or not
     * @return custom renderer for each cell of the list
     */
    @Override
    public Component getListCellRendererComponent ( JList list, Object value, int index, boolean isSelected, boolean cellHasFocus )
    {
        renderer.setSelected ( isSelected );
        renderer.setData ( ( CustomData ) value );
        return renderer;
    }

    /**
     * Label that has some custom decorations.
     */
    private static class CustomLabel extends JLabel
    {
        private static final Color selectionColor = new Color ( 82, 158, 202 );

        private boolean selected;
        private CustomData data;

        public CustomLabel ()
        {
            super ();
            setOpaque ( false );
            setBorder ( BorderFactory.createEmptyBorder ( 0, 36 + 5, 0, 40 ) );
        }

        private void setSelected ( boolean selected )
        {
            this.selected = selected;
            setForeground ( selected ? Color.WHITE : Color.BLACK );
        }

        private void setData ( CustomData data )
        {
            this.data = data;
            setText ( data.getName () );
        }

        @Override
        protected void paintComponent ( Graphics g )
        {
            Graphics2D g2d = ( Graphics2D ) g;
            g2d.setRenderingHint ( RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON );

            if ( selected )
            {
                
                Area area = new Area ( new Ellipse2D.Double ( 0, 0, 36, 36 ) );
                area.add ( new Area ( new RoundRectangle2D.Double ( 18, 3, getWidth () - 18, 29, 6, 6 ) ) );
                g2d.setPaint ( selectionColor );
                g2d.fill ( area );

                g2d.setPaint ( Color.WHITE );
                g2d.fill ( new Ellipse2D.Double ( 2, 2, 32, 32 ) );
            }

            g2d.setPaint ( data.getCircleColor () );
            g2d.fill ( new Ellipse2D.Double ( 5, 5, 26, 26 ) );
            g2d.drawImage ( tipIcon.getImage (), 5 + 13 - tipIcon.getIconWidth () / 2, 5 + 13 - tipIcon.getIconHeight () / 2, null );

            if ( selected )
            {
               
                g2d.drawImage ( crossIcon.getImage (), getWidth () - 9 - 5 - crossIcon.getIconWidth () / 2,
                        getHeight () / 2 - crossIcon.getIconHeight () / 2, null );
            }
            else if ( data.getNewMessages () > 0 )
            {
                 
                g2d.setPaint ( selectionColor );
                g2d.fill ( new Ellipse2D.Double ( getWidth () - 18 - 5, getHeight () / 2 - 9, 18, 18 ) );

                final String text = "" + data.getNewMessages ();
                final Font oldFont = g2d.getFont ();
                g2d.setFont ( oldFont.deriveFont ( oldFont.getSize () - 1f ) );
                final FontMetrics fm = g2d.getFontMetrics ();
                g2d.setPaint ( Color.WHITE );
                g2d.drawString ( text, getWidth () - 9 - 5 - fm.stringWidth ( text ) / 2,
                        getHeight () / 2 + ( fm.getAscent () - fm.getLeading () - fm.getDescent () ) / 2 );
                g2d.setFont ( oldFont );
            }

            super.paintComponent ( g );
        }

        @Override
        public Dimension getPreferredSize ()
        {
            final Dimension ps = super.getPreferredSize ();
            ps.height = 36;
            return ps;
        }
    }

    /**
     * Custom data for our list.
     */
    public static class CustomData
    {
        private Color circleColor;
        private int newMessages;
        private String name;

        public CustomData ( Color circleColor, int newMessages, String name )
        {
            super ();
            this.circleColor = circleColor;
            this.newMessages = newMessages;
            this.name = name;
        }

        private Color getCircleColor ()
        {
            return circleColor;
        }

        private int getNewMessages ()
        {
            return newMessages;
        }

        private String getName ()
        {
            return name;
        }
    }
}


