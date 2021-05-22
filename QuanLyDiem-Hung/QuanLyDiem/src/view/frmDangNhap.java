package view;

import dao.TaiKhoanDAO;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.TaiKhoan;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ui.RoundedPanel;

public class FrmDangNhap extends javax.swing.JFrame {

    private String id;
    private String pass;

    /**
     * Creates new form frmDangNhap
     */
    public FrmDangNhap() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setShape(new RoundRectangle2D.Double(0, 0, this.getWidth(), this.getHeight(), 20, 20));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new RoundedPanel(30);
        jPanel4 = new RoundedPanel(15);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        btnHuy = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();
        jLabelDong = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelThuNho = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setOpaque(false);

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên đăng nhập:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mật khẩu:");

        txtTenDangNhap.setBackground(new java.awt.Color(44, 62, 80));
        txtTenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTenDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        txtTenDangNhap.setBorder(null);
        txtTenDangNhap.setPreferredSize(new java.awt.Dimension(50, 30));
        txtTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenDangNhapKeyPressed(evt);
            }
        });

        txtMatKhau.setBackground(new java.awt.Color(44, 62, 80));
        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setBorder(null);
        txtMatKhau.setPreferredSize(new java.awt.Dimension(330, 30));
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(240, 52, 52));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Thoát");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        btnHuy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnHuyKeyPressed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(89, 171, 227));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        jLabelDong.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelDong.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDong.setText("X");
        jLabelDong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDong.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabelDong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDongMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đăng Nhập");

        jLabelThuNho.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelThuNho.setForeground(new java.awt.Color(255, 255, 255));
        jLabelThuNho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelThuNho.setText("-");
        jLabelThuNho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelThuNho.setPreferredSize(new java.awt.Dimension(50, 50));
        jLabelThuNho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelThuNhoMouseClicked(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelThuNho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabelDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelThuNho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelDongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDongMouseClicked
        dongPhanMem();
    }//GEN-LAST:event_jLabelDongMouseClicked

    private void jLabelThuNhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelThuNhoMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelThuNhoMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        loginAccount();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginAccount();
        }
    }//GEN-LAST:event_btnDangNhapKeyPressed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        dongPhanMem();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnHuyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnHuyKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dongPhanMem();
        }
    }//GEN-LAST:event_btnHuyKeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginAccount();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
                dongPhanMem();
            }
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void txtTenDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDangNhapKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dongPhanMem();
        }
    }//GEN-LAST:event_txtTenDangNhapKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDong;
    private javax.swing.JLabel jLabelThuNho;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void loginAccount() {
        try {
            ArrayList<TaiKhoan> listTk = TaiKhoanDAO.getInstance().layDSTaiKhoan();
            id = txtTenDangNhap.getText().trim();
            pass = String.valueOf(txtMatKhau.getPassword());
            if (id.equalsIgnoreCase("")) {
                throw new Exception("Vui lòng nhập tên đăng nhập!");
            }

            if (pass.equalsIgnoreCase("")) {
                throw new Exception("Vui lòng nhập mật khẩu!");
            }

            TaiKhoan tk = new TaiKhoan(id, pass);
            if (!listTk.contains(tk)) {
                throw new Exception("Sai tên đăng nhập hoặc mật khẩu");
            }
            tk = listTk.get(listTk.indexOf(tk));
            dispose();
            FrmMain frmMain = new FrmMain();
            frmMain.setTk(tk);
            if (tk.getLoaiTaiKhoan().equalsIgnoreCase("Admin")) {
                frmMain.setLoaiTk(true);

                frmMain.getBtnMon().setEnabled(false);
                frmMain.getBtnQuanLyMonHoc().setEnabled(false);
                frmMain.getBtnSinhVien().setEnabled(false);
                frmMain.getBtnQuanLySinhVien().setEnabled(false);
                frmMain.getBtnDiem().setEnabled(false);
                frmMain.getBtnQuanLyDiem().setEnabled(false);
                frmMain.getBtnQuanLyTaiKhoan().setEnabled(true);
                frmMain.getBtnTaiKhoan().setEnabled(true);
            } else {
                frmMain.setLoaiTk(false);

                frmMain.getBtnMon().setEnabled(true);
                frmMain.getBtnQuanLyMonHoc().setEnabled(true);
                frmMain.getBtnSinhVien().setEnabled(true);
                frmMain.getBtnQuanLySinhVien().setEnabled(true);
                frmMain.getBtnDiem().setEnabled(true);
                frmMain.getBtnQuanLyDiem().setEnabled(true);
                frmMain.getBtnQuanLyTaiKhoan().setEnabled(false);
                frmMain.getBtnTaiKhoan().setEnabled(false);
            }
            frmMain.getLblTenTaiKhoan().setText(tk.getId().toUpperCase());
            frmMain.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(FrmDangNhap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }

    private void dongPhanMem() {
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có thực muốn thoát?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
        if (luaChon == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

}
