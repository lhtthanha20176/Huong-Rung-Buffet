package huongrungbuffet;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author ThinkPad
 */
public class Login extends javax.swing.JFrame {

    private boolean show = false;
    boolean a = false;

    public Login() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
        }
        initComponents();
        jButton1.setBorder(new RoundBtn(30));
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
        dashboardview = new javax.swing.JPanel();
        jlbimg = new javax.swing.JLabel();
        jlbtitil = new javax.swing.JLabel();
        jtfusername = new javax.swing.JTextField();
        jlbpasword = new javax.swing.JLabel();
        jlbusername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparatorusername = new javax.swing.JSeparator();
        jSeparatorpasword = new javax.swing.JSeparator();
        jPassword = new javax.swing.JPasswordField();
        jlberrologin = new javax.swing.JLabel();
        jlbiconshowpw = new javax.swing.JLabel();

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

        dashboardview.setBackground(new java.awt.Color(73, 128, 242));
        dashboardview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/kisspngicon.png"))); // NOI18N
        jlbimg.setText("jLabel1");
        dashboardview.add(jlbimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 420, 523));

        jlbtitil.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jlbtitil.setForeground(new java.awt.Color(255, 255, 255));
        jlbtitil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbtitil.setText("Login");
        dashboardview.add(jlbtitil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 90));

        jtfusername.setBackground(new java.awt.Color(73, 128, 242));
        jtfusername.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jtfusername.setForeground(new java.awt.Color(255, 255, 255));
        jtfusername.setBorder(null);
        jtfusername.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfusername.setOpaque(false);
        dashboardview.add(jtfusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 330, 30));

        jlbpasword.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jlbpasword.setForeground(new java.awt.Color(255, 255, 255));
        jlbpasword.setText("Password");
        dashboardview.add(jlbpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 32));

        jlbusername.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jlbusername.setForeground(new java.awt.Color(255, 255, 255));
        jlbusername.setText("Username");
        dashboardview.add(jlbusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        jButton1.setBackground(new java.awt.Color(73, 128, 242));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 25)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        dashboardview.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 160, 40));

        jSeparatorusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dashboardview.add(jSeparatorusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 330, 10));
        dashboardview.add(jSeparatorpasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 252, 330, 10));

        jPassword.setBackground(new java.awt.Color(73, 128, 242));
        jPassword.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPassword.setBorder(null);
        jPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        dashboardview.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 290, 30));

        jlberrologin.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jlberrologin.setForeground(new java.awt.Color(255, 255, 255));
        jlberrologin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboardview.add(jlberrologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 250, 30));

        jlbiconshowpw.setBackground(new java.awt.Color(255, 255, 255));
        jlbiconshowpw.setForeground(new java.awt.Color(255, 255, 255));
        jlbiconshowpw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-hide-25 (1).png"))); // NOI18N
        jlbiconshowpw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbiconshowpwMouseClicked(evt);
            }
        });
        dashboardview.add(jlbiconshowpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 214, -1, 40));

        getContentPane().add(dashboardview, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(652, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void changecolor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    public void clickmenu(JPanel h1, JPanel h2, int numberbool) {
        if (numberbool == 1) {
            h1.setBackground(new Color(25, 29, 74));
            h2.setBackground(new Color(5, 10, 46));
        } else {
            h1.setBackground(new Color(5, 10, 46));
            h2.setBackground(new Color(25, 29, 74));
        }
    }

    public void changeimage(JLabel button, String resourcheimg) {
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }

    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/Icon/menu_32px.png");
        } else {
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jlbiconshowpwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbiconshowpwMouseClicked
        if (show == false) {
            jlbiconshowpw.setIcon(new ImageIcon("src\\Icon\\icons8-eye-25.png"));
            show = true;
            jPassword.setEchoChar((char) (0));
        } else {
            jlbiconshowpw.setIcon(new ImageIcon("src\\Icon\\icons8-hide-25 (1).png"));
            show = false;
            jPassword.setEchoChar((char) 9679);
        }
        System.out.println();
    }//GEN-LAST:event_jlbiconshowpwMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonMin;
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JPanel Buttonmax;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashboardview;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparatorpasword;
    private javax.swing.JSeparator jSeparatorusername;
    private javax.swing.JLabel jlberrologin;
    private javax.swing.JLabel jlbiconshowpw;
    private javax.swing.JLabel jlbimg;
    private javax.swing.JLabel jlbpasword;
    private javax.swing.JLabel jlbtitil;
    private javax.swing.JLabel jlbusername;
    private javax.swing.JTextField jtfusername;
    // End of variables declaration//GEN-END:variables

}
