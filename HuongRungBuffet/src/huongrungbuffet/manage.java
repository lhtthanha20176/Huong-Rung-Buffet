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

public class manage extends javax.swing.JFrame {


    boolean a = false;
    public manage() {
        try
        {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if("Windows".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex){   
        }
        
       this.setExtendedState(manage.MAXIMIZED_BOTH); 
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
        jFood = new javax.swing.JLabel();
        jSupplier = new javax.swing.JLabel();
        jCustomer = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jEmployee = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jWeekMenus = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        dashboardview = new javax.swing.JPanel();
        jTabbedpkiemkho = new javax.swing.JTabbedPane();
        jFoods = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPSupplier = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jPEmployee = new javax.swing.JPanel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jPCustomer = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPWeekMenus = new javax.swing.JPanel();
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

        jFood.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jFood.setForeground(new java.awt.Color(255, 255, 255));
        jFood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFood.setText("Food");
        jFood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFoodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jFoodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jFoodMouseExited(evt);
            }
        });

        jSupplier.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jSupplier.setForeground(new java.awt.Color(255, 255, 255));
        jSupplier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSupplier.setText("Supplier");
        jSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSupplierMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jSupplierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jSupplierMouseExited(evt);
            }
        });

        jCustomer.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jCustomer.setForeground(new java.awt.Color(255, 255, 255));
        jCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCustomer.setText("Customer");
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

        jEmployee.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jEmployee.setForeground(new java.awt.Color(255, 255, 255));
        jEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEmployee.setText("Employee");
        jEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEmployeeMouseExited(evt);
            }
        });

        jWeekMenus.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jWeekMenus.setForeground(new java.awt.Color(255, 255, 255));
        jWeekMenus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWeekMenus.setText("Make Request");
        jWeekMenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jWeekMenusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jWeekMenusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jWeekMenusMouseExited(evt);
            }
        });

        javax.swing.GroupLayout menuhideLayout = new javax.swing.GroupLayout(menuhide);
        menuhide.setLayout(menuhideLayout);
        menuhideLayout.setHorizontalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4)
            .addComponent(jWeekMenus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator5)
        );
        menuhideLayout.setVerticalGroup(
            menuhideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuhideLayout.createSequentialGroup()
                .addComponent(jFood)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jCustomer)
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jWeekMenus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
        );

        menu.add(menuhide, java.awt.BorderLayout.CENTER);

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        dashboardview.setBackground(new java.awt.Color(73, 128, 242));
        dashboardview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jFoodsLayout = new javax.swing.GroupLayout(jFoods);
        jFoods.setLayout(jFoodsLayout);
        jFoodsLayout.setHorizontalGroup(
            jFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFoodsLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(746, Short.MAX_VALUE))
        );
        jFoodsLayout.setVerticalGroup(
            jFoodsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFoodsLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(584, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab1", jFoods);

        javax.swing.GroupLayout jPSupplierLayout = new javax.swing.GroupLayout(jPSupplier);
        jPSupplier.setLayout(jPSupplierLayout);
        jPSupplierLayout.setHorizontalGroup(
            jPSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSupplierLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(609, Short.MAX_VALUE))
        );
        jPSupplierLayout.setVerticalGroup(
            jPSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSupplierLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab2", jPSupplier);

        javax.swing.GroupLayout jPEmployeeLayout = new javax.swing.GroupLayout(jPEmployee);
        jPEmployee.setLayout(jPEmployeeLayout);
        jPEmployeeLayout.setHorizontalGroup(
            jPEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmployeeLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(626, Short.MAX_VALUE))
        );
        jPEmployeeLayout.setVerticalGroup(
            jPEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmployeeLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(511, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab3", jPEmployee);

        jRadioButton1.setText("jRadioButton1");

        javax.swing.GroupLayout jPCustomerLayout = new javax.swing.GroupLayout(jPCustomer);
        jPCustomer.setLayout(jPCustomerLayout);
        jPCustomerLayout.setHorizontalGroup(
            jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCustomerLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jRadioButton1)
                .addContainerGap(516, Short.MAX_VALUE))
        );
        jPCustomerLayout.setVerticalGroup(
            jPCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCustomerLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jRadioButton1)
                .addContainerGap(543, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab4", jPCustomer);

        javax.swing.GroupLayout jPWeekMenusLayout = new javax.swing.GroupLayout(jPWeekMenus);
        jPWeekMenus.setLayout(jPWeekMenusLayout);
        jPWeekMenusLayout.setHorizontalGroup(
            jPWeekMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWeekMenusLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPWeekMenusLayout.setVerticalGroup(
            jPWeekMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPWeekMenusLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jTabbedpkiemkho.addTab("tab5", jPWeekMenus);

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

    private void jFoodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFoodMouseClicked
        jTabbedpkiemkho.setSelectedIndex(0);
    }//GEN-LAST:event_jFoodMouseClicked

    private void jFoodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFoodMouseEntered
        jFood.setForeground(Color.red);
    }//GEN-LAST:event_jFoodMouseEntered

    private void jFoodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFoodMouseExited
        jFood.setForeground(Color.white);
    }//GEN-LAST:event_jFoodMouseExited

    private void jSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSupplierMouseClicked
       jTabbedpkiemkho.setSelectedIndex(1);
    }//GEN-LAST:event_jSupplierMouseClicked

    private void jSupplierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSupplierMouseEntered
       jSupplier.setForeground(Color.red);
    }//GEN-LAST:event_jSupplierMouseEntered

    private void jSupplierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSupplierMouseExited
      jSupplier.setForeground(Color.white);
    }//GEN-LAST:event_jSupplierMouseExited

    private void jCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerMouseClicked
       jTabbedpkiemkho.setSelectedIndex(3);
    }//GEN-LAST:event_jCustomerMouseClicked

    private void jCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerMouseEntered
        jCustomer.setForeground(Color.red);
    }//GEN-LAST:event_jCustomerMouseEntered

    private void jCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCustomerMouseExited
       jCustomer.setForeground(Color.white);
    }//GEN-LAST:event_jCustomerMouseExited

    private void jEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmployeeMouseClicked
          jTabbedpkiemkho.setSelectedIndex(2);
    }//GEN-LAST:event_jEmployeeMouseClicked

    private void jEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmployeeMouseEntered
       jEmployee.setForeground(Color.red);
    }//GEN-LAST:event_jEmployeeMouseEntered

    private void jEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmployeeMouseExited
       jEmployee.setForeground(Color.white);
    }//GEN-LAST:event_jEmployeeMouseExited

    private void jWeekMenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWeekMenusMouseClicked
       jTabbedpkiemkho.setSelectedIndex(4);
    }//GEN-LAST:event_jWeekMenusMouseClicked

    private void jWeekMenusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWeekMenusMouseEntered
         jWeekMenus.setForeground(Color.red);
    }//GEN-LAST:event_jWeekMenusMouseEntered

    private void jWeekMenusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWeekMenusMouseExited
         jWeekMenus.setForeground(Color.white);
    }//GEN-LAST:event_jWeekMenusMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new manage().setVisible(true);
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
    private javax.swing.JLabel jEmployee;
    private javax.swing.JLabel jFood;
    private javax.swing.JPanel jFoods;
    private javax.swing.JPanel jPCustomer;
    private javax.swing.JPanel jPEmployee;
    private javax.swing.JPanel jPSupplier;
    private javax.swing.JPanel jPWeekMenus;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JLabel jSupplier;
    private javax.swing.JTabbedPane jTabbedpkiemkho;
    private javax.swing.JLabel jWeekMenus;
    private javax.swing.JPanel linehidemenu;
    private javax.swing.JPanel lineseting;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuhide;
    private javax.swing.JPanel setting;
    // End of variables declaration//GEN-END:variables

}
