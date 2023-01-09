/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huongrungbuffet;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Bar extends javax.swing.JFrame {


    boolean a = false;
    public Bar() {
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){   
        }
        
       this.setExtendedState(Bar.MAXIMIZED_BOTH); 
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        Buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        Buttonmax = new javax.swing.JPanel();
        ButtonMin = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        lineseting = new javax.swing.JPanel();
        setting = new javax.swing.JPanel();
        hidemenu = new javax.swing.JPanel();
        buttonhidemenu = new javax.swing.JLabel();
        linehidemenu = new javax.swing.JPanel();
        menuhide = new javax.swing.JPanel();
        jSales = new javax.swing.JLabel();
        jCustomer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMakeRequesttm = new javax.swing.JLabel();
        dashboardview = new javax.swing.JPanel();
        jTabbedpthumua = new javax.swing.JTabbedPane();
        jPSales = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPCustomer = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPMakeRequest = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(5, 10, 46));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(5, 10, 46));
        iconminmaxclose.setPreferredSize(new java.awt.Dimension(150, 50));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonclose.setBackground(new java.awt.Color(5, 10, 46));
        Buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Buttonclose.add(close, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 50));

        Buttonmax.setBackground(new java.awt.Color(5, 10, 46));
        Buttonmax.setLayout(new java.awt.BorderLayout());
        iconminmaxclose.add(Buttonmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        ButtonMin.setBackground(new java.awt.Color(5, 10, 46));
        ButtonMin.setLayout(new java.awt.BorderLayout());
        iconminmaxclose.add(ButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        Header.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        menu.setPreferredSize(new java.awt.Dimension(50, 450));
        menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(5, 10, 46));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lineseting.setBackground(new java.awt.Color(5, 10, 46));
        lineseting.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linesetingLayout = new javax.swing.GroupLayout(lineseting);
        lineseting.setLayout(linesetingLayout);
        linesetingLayout.setHorizontalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linesetingLayout.setVerticalGroup(
            linesetingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(lineseting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 5));

        setting.setBackground(new java.awt.Color(5, 10, 46));
        setting.setLayout(new java.awt.BorderLayout());
        MenuIcon.add(setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 50));

        hidemenu.setBackground(new java.awt.Color(5, 10, 46));
        hidemenu.setLayout(new java.awt.BorderLayout());

        buttonhidemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonhidemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/menu_32px.png"))); // NOI18N
        buttonhidemenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonhidemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonhidemenuMouseExited(evt);
            }
        });
        hidemenu.add(buttonhidemenu, java.awt.BorderLayout.CENTER);

        MenuIcon.add(hidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        linehidemenu.setBackground(new java.awt.Color(5, 10, 46));
        linehidemenu.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linehidemenuLayout = new javax.swing.GroupLayout(linehidemenu);
        linehidemenu.setLayout(linehidemenuLayout);
        linehidemenuLayout.setHorizontalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linehidemenuLayout.setVerticalGroup(
            linehidemenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(linehidemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        menuhide.setBackground(new java.awt.Color(25, 29, 74));

        jSales.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jSales.setForeground(new java.awt.Color(255, 255, 255));
        jSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSales.setText("Sales");
        jSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSalesMouseExited(evt);
            }
        });

        jCustomer.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCustomer.setText("Find Suppliers");
        jCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCustomerMouseExited(evt);
            }
        });

        jMakeRequesttm.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jMakeRequesttm.setForeground(new java.awt.Color(255, 255, 255));
        jMakeRequesttm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMakeRequesttm.setText("Make Request");
        jMakeRequesttm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMakeRequesttmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMakeRequesttmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMakeRequesttmMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuhideLayout = new javax.swing.GroupLayout(menuhide);
        menuhide.setLayout(menuhideLayout);
        menuhideLayout.setHorizontalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jMakeRequesttm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuhideLayout.setVerticalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhideLayout.createSequentialGroup()
                .addComponent(jSales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMakeRequesttm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(550, Short.MAX_VALUE))
        );

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboardview.setBackground(new java.awt.Color(73, 128, 242));
        dashboardview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPSalesLayout = new javax.swing.GroupLayout(jPSales);
        jPSales.setLayout(jPSalesLayout);
        jPSalesLayout.setHorizontalGroup(
            jPSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalesLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(746, Short.MAX_VALUE))
        );
        jPSalesLayout.setVerticalGroup(
            jPSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSalesLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(584, Short.MAX_VALUE))
        );

        jTabbedpthumua.addTab("tab1", jPSales);

        javax.swing.GroupLayout jPCustomerLayout = new javax.swing.GroupLayout(jPCustomer);
        jPCustomer.setLayout(jPCustomerLayout);
        jPCustomerLayout.setHorizontalGroup(
            jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCustomerLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jPCustomerLayout.setVerticalGroup(
            jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCustomerLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedpthumua.addTab("tab2", jPCustomer);

        javax.swing.GroupLayout jPMakeRequestLayout = new javax.swing.GroupLayout(jPMakeRequest);
        jPMakeRequest.setLayout(jPMakeRequestLayout);
        jPMakeRequestLayout.setHorizontalGroup(
            jPMakeRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMakeRequestLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        jPMakeRequestLayout.setVerticalGroup(
            jPMakeRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMakeRequestLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
        );

        jTabbedpthumua.addTab("tab3", jPMakeRequest);

        dashboardview.add(jTabbedpthumua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -22, -1, 740));

        getContentPane().add(dashboardview, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        if(numberbool == 1){
            h1.setBackground(new Color(25, 29, 74));
            h2.setBackground(new Color(5, 10, 46));
        }
        else{
            h1.setBackground(new Color(5, 10, 46));
            h2.setBackground(new Color(25, 29, 74));
        }
    }
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Icon/menu_32px.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/Icon/back_32px.png");
        }
        
    }
    
    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(Buttonclose, new Color(25, 29, 74));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(Buttonclose, new Color(5, 10, 46));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void buttonhidemenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseEntered
        changecolor(linehidemenu, new Color(247, 78, 105));
    }//GEN-LAST:event_buttonhidemenuMouseEntered

    private void buttonhidemenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseExited
        changecolor(linehidemenu, new Color(5, 10, 46));
    }//GEN-LAST:event_buttonhidemenuMouseExited

    private void buttonhidemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonhidemenuMouseClicked
        clickmenu(hidemenu, setting, 1);
        if(a==true){
          hideshow(menu, a, buttonhidemenu);
          SwingUtilities.updateComponentTreeUI(this);   
          a=false;
        }
        else{
            hideshow(menu, a, buttonhidemenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
        
    }//GEN-LAST:event_buttonhidemenuMouseClicked

    private void jSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalesMouseClicked
        jTabbedpthumua.setSelectedIndex(0);
    }//GEN-LAST:event_jSalesMouseClicked

    private void jSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalesMouseEntered
        jSales.setForeground(Color.red);
    }//GEN-LAST:event_jSalesMouseEntered

    private void jSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalesMouseExited
        jSales.setForeground(Color.white);
    }//GEN-LAST:event_jSalesMouseExited

    private void jCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerMouseClicked
       jTabbedpthumua.setSelectedIndex(1);
    }//GEN-LAST:event_jCustomerMouseClicked

    private void jCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerMouseEntered
       jCustomer.setForeground(Color.red);
    }//GEN-LAST:event_jCustomerMouseEntered

    private void jCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerMouseExited
      jCustomer.setForeground(Color.white);
    }//GEN-LAST:event_jCustomerMouseExited

    private void jMakeRequesttmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMakeRequesttmMouseClicked
          jTabbedpthumua.setSelectedIndex(2);
    }//GEN-LAST:event_jMakeRequesttmMouseClicked

    private void jMakeRequesttmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMakeRequesttmMouseEntered
       jMakeRequesttm.setForeground(Color.red);
    }//GEN-LAST:event_jMakeRequesttmMouseEntered

    private void jMakeRequesttmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMakeRequesttmMouseExited
       jMakeRequesttm.setForeground(Color.white);
    }//GEN-LAST:event_jMakeRequesttmMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Bar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonMin;
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JPanel Buttonmax;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JLabel buttonhidemenu;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashboardview;
    private javax.swing.JPanel hidemenu;
    private javax.swing.JPanel iconminmaxclose;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jCustomer;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jMakeRequesttm;
    private javax.swing.JPanel jPCustomer;
    private javax.swing.JPanel jPMakeRequest;
    private javax.swing.JPanel jPSales;
    private javax.swing.JLabel jSales;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedpthumua;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel lineseting;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel setting;
    // End of variables declaration//GEN-END:variables

}
