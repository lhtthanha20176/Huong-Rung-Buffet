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

public class kiemkho extends javax.swing.JFrame {


    boolean a = false;
    public kiemkho() {
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){   
        }
        
       this.setExtendedState(kiemkho.MAXIMIZED_BOTH); 
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
        jIngredients = new javax.swing.JLabel();
        jpategory = new javax.swing.JLabel();
        jviewMenus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jviewRequest = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jMakeRequest = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        dashboardview = new javax.swing.JPanel();
        jTabbedpkiemkho = new javax.swing.JTabbedPane();
        jPIngredients = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPpategory = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPviewRequest = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPviewMenus = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPMakeRequest = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();

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

        jIngredients.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jIngredients.setForeground(new java.awt.Color(255, 255, 255));
        jIngredients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIngredients.setText("Ingredients");
        jIngredients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIngredientsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jIngredientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jIngredientsMouseExited(evt);
            }
        });

        jpategory.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jpategory.setForeground(new java.awt.Color(255, 255, 255));
        jpategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpategory.setText("Category");
        jpategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpategoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpategoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpategoryMouseExited(evt);
            }
        });

        jviewMenus.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jviewMenus.setForeground(new java.awt.Color(255, 255, 255));
        jviewMenus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jviewMenus.setText("View Menus");
        jviewMenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jviewMenusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jviewMenusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jviewMenusMouseExited(evt);
            }
        });

        jviewRequest.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jviewRequest.setForeground(new java.awt.Color(255, 255, 255));
        jviewRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jviewRequest.setText("View Request");
        jviewRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jviewRequestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jviewRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jviewRequestMouseExited(evt);
            }
        });

        jMakeRequest.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jMakeRequest.setForeground(new java.awt.Color(255, 255, 255));
        jMakeRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMakeRequest.setText("Make Request");
        jMakeRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMakeRequestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMakeRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMakeRequestMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuhideLayout = new javax.swing.GroupLayout(menuhide);
        menuhide.setLayout(menuhideLayout);
        menuhideLayout.setHorizontalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jIngredients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jpategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jviewMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jviewRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4)
            .addComponent(jMakeRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
            .addComponent(jSeparator5)
        );
        menuhideLayout.setVerticalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhideLayout.createSequentialGroup()
                .addComponent(jIngredients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jviewRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jviewMenus)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jMakeRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboardview.setBackground(new java.awt.Color(73, 128, 242));
        dashboardview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPIngredientsLayout = new javax.swing.GroupLayout(jPIngredients);
        jPIngredients.setLayout(jPIngredientsLayout);
        jPIngredientsLayout.setHorizontalGroup(
            jPIngredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIngredientsLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(746, Short.MAX_VALUE))
        );
        jPIngredientsLayout.setVerticalGroup(
            jPIngredientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPIngredientsLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(584, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab1", jPIngredients);

        javax.swing.GroupLayout jPpategoryLayout = new javax.swing.GroupLayout(jPpategory);
        jPpategory.setLayout(jPpategoryLayout);
        jPpategoryLayout.setHorizontalGroup(
            jPpategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpategoryLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jPpategoryLayout.setVerticalGroup(
            jPpategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPpategoryLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab2", jPpategory);

        javax.swing.GroupLayout jPviewRequestLayout = new javax.swing.GroupLayout(jPviewRequest);
        jPviewRequest.setLayout(jPviewRequestLayout);
        jPviewRequestLayout.setHorizontalGroup(
            jPviewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPviewRequestLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        jPviewRequestLayout.setVerticalGroup(
            jPviewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPviewRequestLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab3", jPviewRequest);

        jRadioButton1.setText("jRadioButton1");

        javax.swing.GroupLayout jPviewMenusLayout = new javax.swing.GroupLayout(jPviewMenus);
        jPviewMenus.setLayout(jPviewMenusLayout);
        jPviewMenusLayout.setHorizontalGroup(
            jPviewMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPviewMenusLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jRadioButton1)
                .addContainerGap(516, Short.MAX_VALUE))
        );
        jPviewMenusLayout.setVerticalGroup(
            jPviewMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPviewMenusLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jRadioButton1)
                .addContainerGap(543, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab4", jPviewMenus);

        javax.swing.GroupLayout jPMakeRequestLayout = new javax.swing.GroupLayout(jPMakeRequest);
        jPMakeRequest.setLayout(jPMakeRequestLayout);
        jPMakeRequestLayout.setHorizontalGroup(
            jPMakeRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMakeRequestLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPMakeRequestLayout.setVerticalGroup(
            jPMakeRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMakeRequestLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab5", jPMakeRequest);

        dashboardview.add(jTabbedpkiemkho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -22, -1, 740));

        getContentPane().add(dashboardview, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    public void treelist(String folderfile){
        
    }
   
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

    private void jIngredientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIngredientsMouseClicked
        jTabbedpkiemkho.setSelectedIndex(0);
    }//GEN-LAST:event_jIngredientsMouseClicked

    private void jIngredientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIngredientsMouseEntered
        jIngredients.setForeground(Color.red);
    }//GEN-LAST:event_jIngredientsMouseEntered

    private void jIngredientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIngredientsMouseExited
        jIngredients.setForeground(Color.white);
    }//GEN-LAST:event_jIngredientsMouseExited

    private void jpategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpategoryMouseClicked
       jTabbedpkiemkho.setSelectedIndex(1);
    }//GEN-LAST:event_jpategoryMouseClicked

    private void jpategoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpategoryMouseEntered
       jpategory.setForeground(Color.red);
    }//GEN-LAST:event_jpategoryMouseEntered

    private void jpategoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpategoryMouseExited
      jpategory.setForeground(Color.white);
    }//GEN-LAST:event_jpategoryMouseExited

    private void jviewMenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jviewMenusMouseClicked
       jTabbedpkiemkho.setSelectedIndex(3);
    }//GEN-LAST:event_jviewMenusMouseClicked

    private void jviewMenusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jviewMenusMouseEntered
        jviewMenus.setForeground(Color.red);
    }//GEN-LAST:event_jviewMenusMouseEntered

    private void jviewMenusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jviewMenusMouseExited
       jviewMenus.setForeground(Color.white);
    }//GEN-LAST:event_jviewMenusMouseExited

    private void jviewRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jviewRequestMouseClicked
          jTabbedpkiemkho.setSelectedIndex(2);
    }//GEN-LAST:event_jviewRequestMouseClicked

    private void jviewRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jviewRequestMouseEntered
       jviewRequest.setForeground(Color.red);
    }//GEN-LAST:event_jviewRequestMouseEntered

    private void jviewRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jviewRequestMouseExited
       jviewRequest.setForeground(Color.white);
    }//GEN-LAST:event_jviewRequestMouseExited

    private void jMakeRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMakeRequestMouseClicked
       jTabbedpkiemkho.setSelectedIndex(4);
    }//GEN-LAST:event_jMakeRequestMouseClicked

    private void jMakeRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMakeRequestMouseEntered
         jMakeRequest.setForeground(Color.red);
    }//GEN-LAST:event_jMakeRequestMouseEntered

    private void jMakeRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMakeRequestMouseExited
         jMakeRequest.setForeground(Color.white);
    }//GEN-LAST:event_jMakeRequestMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new kiemkho().setVisible(true);
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
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jIngredients;
    private javax.swing.JLabel jMakeRequest;
    private javax.swing.JPanel jPIngredients;
    private javax.swing.JPanel jPMakeRequest;
    private javax.swing.JPanel jPpategory;
    private javax.swing.JPanel jPviewMenus;
    private javax.swing.JPanel jPviewRequest;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTabbedPane jTabbedpkiemkho;
    private javax.swing.JLabel jpategory;
    private javax.swing.JLabel jviewMenus;
    private javax.swing.JLabel jviewRequest;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel lineseting;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel setting;
    // End of variables declaration//GEN-END:variables

}
