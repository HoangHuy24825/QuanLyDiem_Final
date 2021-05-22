package view;

import dao.TaiKhoanDAO;
import view.frmQuanLyTaiKhoan.FrmQuanLyTaiKhoan;
import view.frmQuanLyMon.FrmQuanLyMon;
import view.frmQuanLySinhVien.FrmQuanLySinhVien;
import view.frmQuanLyDiem.FrmQuanLyDiem;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.TaiKhoan;
import ui.RoundedPanel;

public class FrmMain extends javax.swing.JFrame {

    private int windowState;//1: maxmimize 2: normal 3:miximize
    private boolean menuState; //true: mo rong, false: dong
    private int desktopState = 0;
    private boolean loaiTk;
    /**
     * Khai bao tai khoan dang dang nhap
     */
    private TaiKhoan tk = new TaiKhoan();

    public void setTk(TaiKhoan tk) {
        this.tk = tk;
    }

    public void setLoaiTk(boolean loaiTk) {
        this.loaiTk = loaiTk;
    }

    public JLabel getLblTenTaiKhoan() {
        return lblTenTaiKhoan;
    }

    public JLabel getBtnDiem() {
        return btnDiem;
    }

    public JLabel getBtnMon() {
        return btnMon;
    }

    public JLabel getBtnQuanLyDiem() {
        return btnQuanLyDiem;
    }

    public JLabel getBtnQuanLyMonHoc() {
        return btnQuanLyMonHoc;
    }

    public JLabel getBtnQuanLySinhVien() {
        return btnQuanLySinhVien;
    }

    public JLabel getBtnQuanLyTaiKhoan() {
        return btnQuanLyTaiKhoan;
    }

    public JLabel getBtnSinhVien() {
        return btnSinhVien;
    }

    public JLabel getBtnTaiKhoan() {
        return btnTaiKhoan;
    }

    /**
     * Khai bao icon
     */
    private final ImageIcon iconMaximum = new ImageIcon(getClass().getResource("/resouces/fullscreen.png"));
    private final ImageIcon iconRight_arrow = new ImageIcon(getClass().getResource("/resouces/right-arrow.png"));
    private final ImageIcon iconMenu = new ImageIcon(getClass().getResource("/resouces/menu.png"));
    private final ImageIcon iconSquares = new ImageIcon(getClass().getResource("/resouces/squares.png"));
    /**
     * Declare color:
     */
    private final Color colorHeader = new Color(6, 13, 39);
    private final Color colorMenu = new Color(2, 62, 116);
    private final Color colorHoverMenu = new Color(121, 172, 219);
    private final Color colorBtnDialog = new Color(91, 128, 165);
    private final Color colorBtnDialogHover = new Color(137, 194, 250);
    /**
     * Declare location mouse click header
     */
    private int xPosition;
    private int yposition;
    private int xPositionFinal;
    private int yPositionFinal;
    /**
     * Declare mouse status
     */
    private final Cursor defaultMouse = new Cursor(Cursor.DEFAULT_CURSOR);
    private final Cursor handleMouse = new Cursor(Cursor.HAND_CURSOR);
    /**
     * Khai bao form
     */

    FrmQuanLyDiem frmQuanLyDiem = new FrmQuanLyDiem();
    FrmQuanLySinhVien frmQuanLySinhVien = new FrmQuanLySinhVien();
    FrmQuanLyMon frmQuanLyMon = new FrmQuanLyMon();
    FrmQuanLyTaiKhoan frmQuanLyTaiKhoan = new FrmQuanLyTaiKhoan();

    /**
     * Khai bao mess gia
     */
    JOptionPane msg = new JOptionPane("Loading", JOptionPane.INFORMATION_MESSAGE);
    final JDialog dlg = msg.createDialog("Loading");
    /**
     * get size screen
     */
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        dialogDoiMK.setLocationRelativeTo(null);
        dialogDoiMK.setShape(new RoundRectangle2D.Double(0, 0, dialogDoiMK.getWidth(), dialogDoiMK.getHeight(), 50, 50));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        windowState = 1;
        menuState = true;
        pnMenu.setPreferredSize(new Dimension(220, pnMenu.getHeight()));
        pnMiniMenu.setPreferredSize(new Dimension(0, pnMiniMenu.getHeight()));
        this.getRootPane().setBorder(BorderFactory.createLineBorder(colorHeader, 2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogDoiMK = new javax.swing.JDialog();
        jPanel7 = new RoundedPanel(50);
        jLabel7 = new javax.swing.JLabel();
        pnQuayLai = new RoundedPanel(30);
        btnQuayLai = new javax.swing.JLabel();
        pnDoiMK = new RoundedPanel(30);
        btnDoiMK = new javax.swing.JLabel();
        txtMKCu = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        txtMkMoi = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtNhapLaiMK = new javax.swing.JPasswordField();
        ckbHienThiMk = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pnBackground = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnLargeMenu = new javax.swing.JPanel();
        pnBtnThuNhoMenu = new RoundedPanel(15);
        btnThuNhoMenu = new javax.swing.JLabel();
        pnBtnQuanLySinhVien = new RoundedPanel(15);
        btnQuanLySinhVien = new javax.swing.JLabel();
        pnBtnQuanLyMonHoc = new RoundedPanel(15);
        btnQuanLyMonHoc = new javax.swing.JLabel();
        pnBtnQuanLyDiem = new RoundedPanel(15);
        btnQuanLyDiem = new javax.swing.JLabel();
        pnBtnQuanLyTaiKhoan = new RoundedPanel(15);
        btnQuanLyTaiKhoan = new javax.swing.JLabel();
        pnDoiMatKhau = new RoundedPanel(15);
        btnDoiMatKhau = new javax.swing.JLabel();
        pnMiniMenu = new javax.swing.JPanel();
        pnBtnMoRongMenu = new RoundedPanel(15);
        btnMoRongMenu = new javax.swing.JLabel();
        pnBtnSinhVien = new RoundedPanel(15);
        btnSinhVien = new javax.swing.JLabel();
        pnBtnMon = new RoundedPanel(15);
        btnMon = new javax.swing.JLabel();
        pnBtnDiem = new RoundedPanel(15);
        btnDiem = new javax.swing.JLabel();
        pnBtnTaiKhoan = new RoundedPanel(15);
        btnTaiKhoan = new javax.swing.JLabel();
        jpnHeader = new JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnBtnExit = new RoundedPanel(15);
        btnClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lblTitleMenu = new javax.swing.JLabel();
        lblTenTaiKhoan = new javax.swing.JLabel();
        pnDesktop = new javax.swing.JPanel();

        dialogDoiMK.setMinimumSize(new java.awt.Dimension(450, 520));
        dialogDoiMK.setModal(true);
        dialogDoiMK.setUndecorated(true);

        jPanel7.setBackground(new java.awt.Color(44, 62, 80));
        jPanel7.setPreferredSize(new java.awt.Dimension(450, 520));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mật khẩu cũ:");
        jLabel7.setPreferredSize(new java.awt.Dimension(250, 30));

        pnQuayLai.setBackground(new java.awt.Color(91, 128, 165));
        pnQuayLai.setOpaque(false);
        pnQuayLai.setPreferredSize(new java.awt.Dimension(80, 50));

        btnQuayLai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/curved-arrow-pointing-left.png"))); // NOI18N
        btnQuayLai.setPreferredSize(new java.awt.Dimension(80, 50));
        btnQuayLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuayLaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuayLaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuayLaiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnQuayLaiLayout = new javax.swing.GroupLayout(pnQuayLai);
        pnQuayLai.setLayout(pnQuayLaiLayout);
        pnQuayLaiLayout.setHorizontalGroup(
            pnQuayLaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuayLaiLayout.createSequentialGroup()
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnQuayLaiLayout.setVerticalGroup(
            pnQuayLaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQuayLaiLayout.createSequentialGroup()
                .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnDoiMK.setBackground(new java.awt.Color(91, 128, 165));
        pnDoiMK.setOpaque(false);
        pnDoiMK.setPreferredSize(new java.awt.Dimension(80, 50));

        btnDoiMK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/synchronize.png"))); // NOI18N
        btnDoiMK.setPreferredSize(new java.awt.Dimension(80, 50));
        btnDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnDoiMKLayout = new javax.swing.GroupLayout(pnDoiMK);
        pnDoiMK.setLayout(pnDoiMKLayout);
        pnDoiMKLayout.setHorizontalGroup(
            pnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDoiMKLayout.createSequentialGroup()
                .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnDoiMKLayout.setVerticalGroup(
            pnDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDoiMKLayout.createSequentialGroup()
                .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtMKCu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMKCu.setPreferredSize(new java.awt.Dimension(400, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mật khẩu mới:");
        jLabel10.setPreferredSize(new java.awt.Dimension(250, 30));

        txtMkMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMkMoi.setPreferredSize(new java.awt.Dimension(400, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nhập lại mật khẩu:");
        jLabel11.setPreferredSize(new java.awt.Dimension(250, 30));

        txtNhapLaiMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNhapLaiMK.setPreferredSize(new java.awt.Dimension(400, 30));

        ckbHienThiMk.setBackground(new java.awt.Color(44, 62, 80));
        ckbHienThiMk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ckbHienThiMk.setForeground(new java.awt.Color(255, 255, 255));
        ckbHienThiMk.setText("Hiển thị mật khẩu");
        ckbHienThiMk.setBorder(null);
        ckbHienThiMk.setPreferredSize(new java.awt.Dimension(200, 30));
        ckbHienThiMk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ckbHienThiMkMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐỔI MẬT KHẨU");
        jLabel4.setPreferredSize(new java.awt.Dimension(450, 60));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMKCu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMkMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNhapLaiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ckbHienThiMk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(pnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(pnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMkMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(ckbHienThiMk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout dialogDoiMKLayout = new javax.swing.GroupLayout(dialogDoiMK.getContentPane());
        dialogDoiMK.getContentPane().setLayout(dialogDoiMKLayout);
        dialogDoiMKLayout.setHorizontalGroup(
            dialogDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogDoiMKLayout.setVerticalGroup(
            dialogDoiMKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnMenu.setBackground(new java.awt.Color(121, 172, 219));
        pnMenu.setPreferredSize(new java.awt.Dimension(270, 629));

        jPanel1.setBackground(new java.awt.Color(2, 62, 116));
        jPanel1.setPreferredSize(new java.awt.Dimension(220, 220));

        jPanel4.setBackground(new java.awt.Color(179, 213, 241));
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 220));

        jLabel1.setBackground(new java.awt.Color(179, 213, 241));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/logo.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel1.setPreferredSize(new java.awt.Dimension(220, 220));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pnLargeMenu.setBackground(new java.awt.Color(2, 62, 116));
        pnLargeMenu.setPreferredSize(new java.awt.Dimension(220, 417));

        pnBtnThuNhoMenu.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnThuNhoMenu.setToolTipText("Thu nhỏ");
        pnBtnThuNhoMenu.setOpaque(false);
        pnBtnThuNhoMenu.setPreferredSize(new java.awt.Dimension(50, 50));
        pnBtnThuNhoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnThuNhoMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnThuNhoMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnThuNhoMenuMouseExited(evt);
            }
        });

        btnThuNhoMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThuNhoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/menu.png"))); // NOI18N
        btnThuNhoMenu.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout pnBtnThuNhoMenuLayout = new javax.swing.GroupLayout(pnBtnThuNhoMenu);
        pnBtnThuNhoMenu.setLayout(pnBtnThuNhoMenuLayout);
        pnBtnThuNhoMenuLayout.setHorizontalGroup(
            pnBtnThuNhoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnThuNhoMenuLayout.createSequentialGroup()
                .addComponent(btnThuNhoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnBtnThuNhoMenuLayout.setVerticalGroup(
            pnBtnThuNhoMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnThuNhoMenuLayout.createSequentialGroup()
                .addComponent(btnThuNhoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnQuanLySinhVien.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnQuanLySinhVien.setForeground(new java.awt.Color(255, 255, 255));
        pnBtnQuanLySinhVien.setOpaque(false);
        pnBtnQuanLySinhVien.setPreferredSize(new java.awt.Dimension(210, 50));
        pnBtnQuanLySinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnQuanLySinhVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnQuanLySinhVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnQuanLySinhVienMouseExited(evt);
            }
        });

        btnQuanLySinhVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuanLySinhVien.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLySinhVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLySinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/graduated.png"))); // NOI18N
        btnQuanLySinhVien.setText("Quản lý sinh viên");
        btnQuanLySinhVien.setIconTextGap(10);
        btnQuanLySinhVien.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout pnBtnQuanLySinhVienLayout = new javax.swing.GroupLayout(pnBtnQuanLySinhVien);
        pnBtnQuanLySinhVien.setLayout(pnBtnQuanLySinhVienLayout);
        pnBtnQuanLySinhVienLayout.setHorizontalGroup(
            pnBtnQuanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLySinhVienLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(btnQuanLySinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnBtnQuanLySinhVienLayout.setVerticalGroup(
            pnBtnQuanLySinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLySinhVienLayout.createSequentialGroup()
                .addComponent(btnQuanLySinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnQuanLyMonHoc.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnQuanLyMonHoc.setForeground(new java.awt.Color(255, 255, 255));
        pnBtnQuanLyMonHoc.setOpaque(false);
        pnBtnQuanLyMonHoc.setPreferredSize(new java.awt.Dimension(210, 50));
        pnBtnQuanLyMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyMonHocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyMonHocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyMonHocMouseExited(evt);
            }
        });

        btnQuanLyMonHoc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuanLyMonHoc.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyMonHoc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyMonHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/books-stack-of-three.png"))); // NOI18N
        btnQuanLyMonHoc.setText("Quản lý môn học");
        btnQuanLyMonHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnQuanLyMonHoc.setIconTextGap(10);
        btnQuanLyMonHoc.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout pnBtnQuanLyMonHocLayout = new javax.swing.GroupLayout(pnBtnQuanLyMonHoc);
        pnBtnQuanLyMonHoc.setLayout(pnBtnQuanLyMonHocLayout);
        pnBtnQuanLyMonHocLayout.setHorizontalGroup(
            pnBtnQuanLyMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLyMonHocLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(btnQuanLyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnBtnQuanLyMonHocLayout.setVerticalGroup(
            pnBtnQuanLyMonHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLyMonHocLayout.createSequentialGroup()
                .addComponent(btnQuanLyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnQuanLyDiem.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnQuanLyDiem.setForeground(new java.awt.Color(255, 255, 255));
        pnBtnQuanLyDiem.setOpaque(false);
        pnBtnQuanLyDiem.setPreferredSize(new java.awt.Dimension(210, 50));
        pnBtnQuanLyDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyDiemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyDiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyDiemMouseExited(evt);
            }
        });

        btnQuanLyDiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuanLyDiem.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyDiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/scoreboard.png"))); // NOI18N
        btnQuanLyDiem.setText("Quản lý điểm");
        btnQuanLyDiem.setIconTextGap(10);
        btnQuanLyDiem.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout pnBtnQuanLyDiemLayout = new javax.swing.GroupLayout(pnBtnQuanLyDiem);
        pnBtnQuanLyDiem.setLayout(pnBtnQuanLyDiemLayout);
        pnBtnQuanLyDiemLayout.setHorizontalGroup(
            pnBtnQuanLyDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLyDiemLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(btnQuanLyDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnBtnQuanLyDiemLayout.setVerticalGroup(
            pnBtnQuanLyDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLyDiemLayout.createSequentialGroup()
                .addComponent(btnQuanLyDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnQuanLyTaiKhoan.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnQuanLyTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        pnBtnQuanLyTaiKhoan.setOpaque(false);
        pnBtnQuanLyTaiKhoan.setPreferredSize(new java.awt.Dimension(210, 50));
        pnBtnQuanLyTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyTaiKhoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyTaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnQuanLyTaiKhoanMouseExited(evt);
            }
        });

        btnQuanLyTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuanLyTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        btnQuanLyTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/account.png"))); // NOI18N
        btnQuanLyTaiKhoan.setText("Quản lý tài khoản");
        btnQuanLyTaiKhoan.setIconTextGap(10);
        btnQuanLyTaiKhoan.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout pnBtnQuanLyTaiKhoanLayout = new javax.swing.GroupLayout(pnBtnQuanLyTaiKhoan);
        pnBtnQuanLyTaiKhoan.setLayout(pnBtnQuanLyTaiKhoanLayout);
        pnBtnQuanLyTaiKhoanLayout.setHorizontalGroup(
            pnBtnQuanLyTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLyTaiKhoanLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(btnQuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnBtnQuanLyTaiKhoanLayout.setVerticalGroup(
            pnBtnQuanLyTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnQuanLyTaiKhoanLayout.createSequentialGroup()
                .addComponent(btnQuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnLargeMenuLayout = new javax.swing.GroupLayout(pnLargeMenu);
        pnLargeMenu.setLayout(pnLargeMenuLayout);
        pnLargeMenuLayout.setHorizontalGroup(
            pnLargeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLargeMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnBtnThuNhoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLargeMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnLargeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBtnQuanLySinhVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnBtnQuanLyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnBtnQuanLyDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnBtnQuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        pnLargeMenuLayout.setVerticalGroup(
            pnLargeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLargeMenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pnBtnThuNhoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnBtnQuanLySinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnBtnQuanLyMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnBtnQuanLyDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnBtnQuanLyTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnDoiMatKhau.setBackground(new java.awt.Color(2, 62, 116));
        pnDoiMatKhau.setOpaque(false);
        pnDoiMatKhau.setPreferredSize(new java.awt.Dimension(220, 50));

        btnDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDoiMatKhau.setText("Đổi mật khẩu");
        btnDoiMatKhau.setPreferredSize(new java.awt.Dimension(220, 50));
        btnDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDoiMatKhauMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnDoiMatKhauLayout = new javax.swing.GroupLayout(pnDoiMatKhau);
        pnDoiMatKhau.setLayout(pnDoiMatKhauLayout);
        pnDoiMatKhauLayout.setHorizontalGroup(
            pnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDoiMatKhauLayout.createSequentialGroup()
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnDoiMatKhauLayout.setVerticalGroup(
            pnDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDoiMatKhauLayout.createSequentialGroup()
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnLargeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnLargeMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pnMiniMenu.setBackground(new java.awt.Color(2, 62, 116));
        pnMiniMenu.setToolTipText("");
        pnMiniMenu.setPreferredSize(new java.awt.Dimension(50, 50));

        pnBtnMoRongMenu.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnMoRongMenu.setOpaque(false);
        pnBtnMoRongMenu.setPreferredSize(new java.awt.Dimension(50, 50));
        pnBtnMoRongMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnMoRongMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnMoRongMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnMoRongMenuMouseExited(evt);
            }
        });

        btnMoRongMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMoRongMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/menu.png"))); // NOI18N
        btnMoRongMenu.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout pnBtnMoRongMenuLayout = new javax.swing.GroupLayout(pnBtnMoRongMenu);
        pnBtnMoRongMenu.setLayout(pnBtnMoRongMenuLayout);
        pnBtnMoRongMenuLayout.setHorizontalGroup(
            pnBtnMoRongMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMoRongMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBtnMoRongMenuLayout.setVerticalGroup(
            pnBtnMoRongMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnMoRongMenuLayout.createSequentialGroup()
                .addComponent(btnMoRongMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnSinhVien.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnSinhVien.setOpaque(false);
        pnBtnSinhVien.setPreferredSize(new java.awt.Dimension(50, 50));
        pnBtnSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnSinhVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnSinhVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnSinhVienMouseExited(evt);
            }
        });

        btnSinhVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/graduated.png"))); // NOI18N
        btnSinhVien.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout pnBtnSinhVienLayout = new javax.swing.GroupLayout(pnBtnSinhVien);
        pnBtnSinhVien.setLayout(pnBtnSinhVienLayout);
        pnBtnSinhVienLayout.setHorizontalGroup(
            pnBtnSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBtnSinhVienLayout.setVerticalGroup(
            pnBtnSinhVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnSinhVienLayout.createSequentialGroup()
                .addComponent(btnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnMon.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnMon.setOpaque(false);
        pnBtnMon.setPreferredSize(new java.awt.Dimension(50, 50));
        pnBtnMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnMonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnMonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnMonMouseExited(evt);
            }
        });

        btnMon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/books-stack-of-three.png"))); // NOI18N
        btnMon.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout pnBtnMonLayout = new javax.swing.GroupLayout(pnBtnMon);
        pnBtnMon.setLayout(pnBtnMonLayout);
        pnBtnMonLayout.setHorizontalGroup(
            pnBtnMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBtnMonLayout.setVerticalGroup(
            pnBtnMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnMonLayout.createSequentialGroup()
                .addComponent(btnMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnDiem.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnDiem.setOpaque(false);
        pnBtnDiem.setPreferredSize(new java.awt.Dimension(50, 50));
        pnBtnDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnDiemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnDiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnDiemMouseExited(evt);
            }
        });

        btnDiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/scoreboard.png"))); // NOI18N
        btnDiem.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout pnBtnDiemLayout = new javax.swing.GroupLayout(pnBtnDiem);
        pnBtnDiem.setLayout(pnBtnDiemLayout);
        pnBtnDiemLayout.setHorizontalGroup(
            pnBtnDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBtnDiemLayout.setVerticalGroup(
            pnBtnDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnDiemLayout.createSequentialGroup()
                .addComponent(btnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnBtnTaiKhoan.setBackground(new java.awt.Color(2, 62, 116));
        pnBtnTaiKhoan.setOpaque(false);
        pnBtnTaiKhoan.setPreferredSize(new java.awt.Dimension(50, 50));
        pnBtnTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnBtnTaiKhoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnBtnTaiKhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnBtnTaiKhoanMouseExited(evt);
            }
        });

        btnTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/account.png"))); // NOI18N
        btnTaiKhoan.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout pnBtnTaiKhoanLayout = new javax.swing.GroupLayout(pnBtnTaiKhoan);
        pnBtnTaiKhoan.setLayout(pnBtnTaiKhoanLayout);
        pnBtnTaiKhoanLayout.setHorizontalGroup(
            pnBtnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBtnTaiKhoanLayout.setVerticalGroup(
            pnBtnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnTaiKhoanLayout.createSequentialGroup()
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnMiniMenuLayout = new javax.swing.GroupLayout(pnMiniMenu);
        pnMiniMenu.setLayout(pnMiniMenuLayout);
        pnMiniMenuLayout.setHorizontalGroup(
            pnMiniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMiniMenuLayout.createSequentialGroup()
                .addGroup(pnMiniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBtnMoRongMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnBtnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnBtnMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnBtnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnBtnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnMiniMenuLayout.setVerticalGroup(
            pnMiniMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMiniMenuLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(pnBtnMoRongMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnBtnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnBtnMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnBtnDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnBtnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                .addComponent(pnMiniMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addComponent(pnMiniMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        jpnHeader.setBackground(new java.awt.Color(6, 13, 39));
        jpnHeader.setPreferredSize(new java.awt.Dimension(100, 50));

        jPanel2.setBackground(new java.awt.Color(6, 13, 39));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 50));

        pnBtnExit.setBackground(new java.awt.Color(6, 13, 39));
        pnBtnExit.setOpaque(false);
        pnBtnExit.setPreferredSize(new java.awt.Dimension(50, 50));

        btnClose.setBackground(new java.awt.Color(6, 13, 39));
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/close.png"))); // NOI18N
        btnClose.setToolTipText("");
        btnClose.setPreferredSize(new java.awt.Dimension(50, 50));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnBtnExitLayout = new javax.swing.GroupLayout(pnBtnExit);
        pnBtnExit.setLayout(pnBtnExitLayout);
        pnBtnExitLayout.setHorizontalGroup(
            pnBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnExitLayout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnBtnExitLayout.setVerticalGroup(
            pnBtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBtnExitLayout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(pnBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PHẦN MỀM QUẢN LÝ ĐIỂM");
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 50));

        jPanel6.setBackground(new java.awt.Color(6, 13, 39));
        jPanel6.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/logo_software.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnHeaderLayout = new javax.swing.GroupLayout(jpnHeader);
        jpnHeader.setLayout(jpnHeaderLayout);
        jpnHeaderLayout.setHorizontalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHeaderLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 632, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jpnHeaderLayout.setVerticalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHeaderLayout.createSequentialGroup()
                .addGroup(jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(2, 62, 116));
        jPanel8.setPreferredSize(new java.awt.Dimension(0, 50));

        lblTitleMenu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitleMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleMenu.setText("WELCOME");

        lblTenTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        lblTenTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenTaiKhoan.setIconTextGap(10);
        lblTenTaiKhoan.setPreferredSize(new java.awt.Dimension(150, 50));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(lblTitleMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lblTitleMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pnDesktop.setBackground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout pnDesktopLayout = new javax.swing.GroupLayout(pnDesktop);
        pnDesktop.setLayout(pnDesktopLayout);
        pnDesktopLayout.setHorizontalGroup(
            pnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        pnDesktopLayout.setVerticalGroup(
            pnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addComponent(jpnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        int chose = JOptionPane.showConfirmDialog(null, "Bạn có thực sự muốn thoát phần mềm!", "Xác nhận thoát", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (chose == JOptionPane.YES_OPTION) {
            dispose();
            FrmDangNhap frmDangNhap = new FrmDangNhap();
            frmDangNhap.setVisible(true);
        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        changeColorCursorHover(pnBtnExit, true);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        changeColorCursorHover(pnBtnExit, false);
    }//GEN-LAST:event_btnCloseMouseExited

    private void pnBtnQuanLySinhVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLySinhVienMouseEntered
        if (!loaiTk) {
            hoverBtnMenu(pnBtnQuanLySinhVien, true);
        }
    }//GEN-LAST:event_pnBtnQuanLySinhVienMouseEntered

    private void pnBtnQuanLyMonHocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyMonHocMouseEntered
        if (!loaiTk) {
            hoverBtnMenu(pnBtnQuanLyMonHoc, true);
        }
    }//GEN-LAST:event_pnBtnQuanLyMonHocMouseEntered

    private void pnBtnQuanLyDiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyDiemMouseEntered
        if (!loaiTk) {
            hoverBtnMenu(pnBtnQuanLyDiem, true);
        }
    }//GEN-LAST:event_pnBtnQuanLyDiemMouseEntered

    private void pnBtnQuanLyMonHocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyMonHocMouseExited
        if (!loaiTk) {
            hoverBtnMenu(pnBtnQuanLyMonHoc, false);
        }
    }//GEN-LAST:event_pnBtnQuanLyMonHocMouseExited

    private void pnBtnQuanLyDiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyDiemMouseExited
        if (!loaiTk) {
            hoverBtnMenu(pnBtnQuanLyDiem, false);
        }
    }//GEN-LAST:event_pnBtnQuanLyDiemMouseExited

    private void pnBtnQuanLySinhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLySinhVienMouseExited
        if (!loaiTk) {
            hoverBtnMenu(pnBtnQuanLySinhVien, false);
        }
    }//GEN-LAST:event_pnBtnQuanLySinhVienMouseExited

    private void pnBtnQuanLyTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyTaiKhoanMouseEntered
        if (loaiTk) {
            hoverBtnMenu(pnBtnQuanLyTaiKhoan, true);
        }
    }//GEN-LAST:event_pnBtnQuanLyTaiKhoanMouseEntered

    private void pnBtnQuanLyTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyTaiKhoanMouseExited
        if (loaiTk) {
            hoverBtnMenu(pnBtnQuanLyTaiKhoan, false);
        }
    }//GEN-LAST:event_pnBtnQuanLyTaiKhoanMouseExited

    private void pnBtnQuanLySinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLySinhVienMouseClicked
        if (!loaiTk) {
            desktopState = 1;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnQuanLySinhVienMouseClicked

    private void pnBtnQuanLyMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyMonHocMouseClicked
        if (!loaiTk) {
            desktopState = 2;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnQuanLyMonHocMouseClicked

    private void pnBtnQuanLyDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyDiemMouseClicked
        if (!loaiTk) {
            desktopState = 3;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnQuanLyDiemMouseClicked

    private void pnBtnQuanLyTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnQuanLyTaiKhoanMouseClicked
        if (loaiTk) {
            desktopState = 4;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnQuanLyTaiKhoanMouseClicked

    private void pnBtnMoRongMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnMoRongMenuMouseEntered
        hoverBtnMenuIcon(pnBtnMoRongMenu, true);
    }//GEN-LAST:event_pnBtnMoRongMenuMouseEntered

    private void pnBtnSinhVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnSinhVienMouseEntered
        if (!loaiTk) {
            hoverBtnMenuIcon(pnBtnSinhVien, true);
        }
    }//GEN-LAST:event_pnBtnSinhVienMouseEntered

    private void pnBtnMonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnMonMouseEntered
        if (!loaiTk) {
            hoverBtnMenuIcon(pnBtnMon, true);
        }
    }//GEN-LAST:event_pnBtnMonMouseEntered

    private void pnBtnDiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnDiemMouseEntered
        if (!loaiTk) {
            hoverBtnMenuIcon(pnBtnDiem, true);
        }
    }//GEN-LAST:event_pnBtnDiemMouseEntered

    private void pnBtnThuNhoMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnThuNhoMenuMouseEntered
        hoverBtnMenuIcon(pnBtnThuNhoMenu, true);
    }//GEN-LAST:event_pnBtnThuNhoMenuMouseEntered

    private void pnBtnTaiKhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnTaiKhoanMouseEntered
        if (loaiTk) {
            hoverBtnMenuIcon(pnBtnTaiKhoan, true);
        }
    }//GEN-LAST:event_pnBtnTaiKhoanMouseEntered

    private void pnBtnMoRongMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnMoRongMenuMouseExited
        hoverBtnMenuIcon(pnBtnMoRongMenu, false);
    }//GEN-LAST:event_pnBtnMoRongMenuMouseExited

    private void pnBtnSinhVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnSinhVienMouseExited
        if (!loaiTk) {
            hoverBtnMenuIcon(pnBtnSinhVien, false);
        }
    }//GEN-LAST:event_pnBtnSinhVienMouseExited

    private void pnBtnMonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnMonMouseExited
        if (!loaiTk) {
            hoverBtnMenuIcon(pnBtnMon, false);
        }
    }//GEN-LAST:event_pnBtnMonMouseExited

    private void pnBtnDiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnDiemMouseExited
        if (!loaiTk) {
            hoverBtnMenuIcon(pnBtnDiem, false);
        }
    }//GEN-LAST:event_pnBtnDiemMouseExited

    private void pnBtnTaiKhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnTaiKhoanMouseExited
        if (loaiTk) {
            hoverBtnMenuIcon(pnBtnTaiKhoan, false);
        }
    }//GEN-LAST:event_pnBtnTaiKhoanMouseExited

    private void pnBtnThuNhoMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnThuNhoMenuMouseExited
        hoverBtnMenuIcon(pnBtnThuNhoMenu, false);
    }//GEN-LAST:event_pnBtnThuNhoMenuMouseExited

    private void pnBtnThuNhoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnThuNhoMenuMouseClicked
        changeMenuState();
    }//GEN-LAST:event_pnBtnThuNhoMenuMouseClicked

    private void pnBtnMoRongMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnMoRongMenuMouseClicked
        changeMenuState();
    }//GEN-LAST:event_pnBtnMoRongMenuMouseClicked

    private void pnBtnSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnSinhVienMouseClicked
        if (!loaiTk) {
            desktopState = 1;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnSinhVienMouseClicked

    private void pnBtnMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnMonMouseClicked
        if (!loaiTk) {
            desktopState = 2;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnMonMouseClicked

    private void pnBtnDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnDiemMouseClicked
        if (!loaiTk) {
            desktopState = 3;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnDiemMouseClicked

    private void pnBtnTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnBtnTaiKhoanMouseClicked
        if (loaiTk) {
            desktopState = 4;
            changeDesktopState(desktopState);
        }
    }//GEN-LAST:event_pnBtnTaiKhoanMouseClicked

    private void btnDoiMatKhauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseEntered
        pnDoiMatKhau.setBackground(colorHoverMenu);
        setCursor(handleMouse);
        btnDoiMatKhau.setFont(new Font("Tahoma", 3, 16));
    }//GEN-LAST:event_btnDoiMatKhauMouseEntered

    private void btnDoiMatKhauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseExited
        pnDoiMatKhau.setBackground(colorMenu);
        setCursor(defaultMouse);
        btnDoiMatKhau.setFont(new Font("Tahoma", 1, 14));
    }//GEN-LAST:event_btnDoiMatKhauMouseExited

    private void btnDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMatKhauMouseClicked
        dialogDoiMK.setVisible(true);
    }//GEN-LAST:event_btnDoiMatKhauMouseClicked

    private void btnQuayLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuayLaiMouseClicked
        dialogDoiMK.setVisible(false);
    }//GEN-LAST:event_btnQuayLaiMouseClicked

    private void ckbHienThiMkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ckbHienThiMkMouseClicked
        if (ckbHienThiMk.isSelected()) {
            txtMKCu.setEchoChar((char) 0);
            txtMkMoi.setEchoChar((char) 0);
            txtNhapLaiMK.setEchoChar((char) 0);
        } else {
            txtMKCu.setEchoChar('*');
            txtMkMoi.setEchoChar('*');
            txtNhapLaiMK.setEchoChar('*');
        }
    }//GEN-LAST:event_ckbHienThiMkMouseClicked

    private void btnQuayLaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuayLaiMouseEntered
        pnQuayLai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hoverBtnDialog(pnQuayLai, true);
    }//GEN-LAST:event_btnQuayLaiMouseEntered

    private void btnQuayLaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuayLaiMouseExited
        pnQuayLai.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        hoverBtnDialog(pnQuayLai, false);
    }//GEN-LAST:event_btnQuayLaiMouseExited

    private void btnDoiMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseEntered
        pnDoiMK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        hoverBtnDialog(pnDoiMK, true);
    }//GEN-LAST:event_btnDoiMKMouseEntered

    private void btnDoiMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseExited
        pnDoiMK.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        hoverBtnDialog(pnDoiMK, false);
    }//GEN-LAST:event_btnDoiMKMouseExited

    private void btnDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseClicked
        try {
            String mkCu = String.valueOf(txtMKCu.getPassword());
            String mkMoi = String.valueOf(txtMkMoi.getPassword());
            String nlMK = String.valueOf(txtNhapLaiMK.getPassword());
            if (tk.getPass().equals(mkCu)) {
                if (mkMoi.equals(mkCu)) {
                    throw new Exception("Mật khảu mới không thê trùng với mật khẩu cũ");
                }
                if (!mkMoi.equals(nlMK)) {
                    throw new Exception("Mật khẩu không khớp !");
                }
                if (TaiKhoanDAO.getInstance().doiMatKhau(tk.getId(), nlMK)) {
                    JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công !");
                    tk.setPass(mkMoi);
                    txtMKCu.setText("");
                    txtMkMoi.setText("");
                    txtNhapLaiMK.setText(nlMK);
                    dialogDoiMK.dispose();
                } else {
                    throw new Exception("Có lỗi gì đó! Thử lại sau");
                }
            } else {
                throw new Exception("Mật khẩu cũ không đúng !");
            }
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
    }//GEN-LAST:event_btnDoiMKMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnDiem;
    private javax.swing.JLabel btnDoiMK;
    private javax.swing.JLabel btnDoiMatKhau;
    private javax.swing.JLabel btnMoRongMenu;
    private javax.swing.JLabel btnMon;
    private javax.swing.JLabel btnQuanLyDiem;
    private javax.swing.JLabel btnQuanLyMonHoc;
    private javax.swing.JLabel btnQuanLySinhVien;
    private javax.swing.JLabel btnQuanLyTaiKhoan;
    private javax.swing.JLabel btnQuayLai;
    private javax.swing.JLabel btnSinhVien;
    private javax.swing.JLabel btnTaiKhoan;
    private javax.swing.JLabel btnThuNhoMenu;
    private javax.swing.JCheckBox ckbHienThiMk;
    private javax.swing.JDialog dialogDoiMK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel jpnHeader;
    private javax.swing.JLabel lblTenTaiKhoan;
    private javax.swing.JLabel lblTitleMenu;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnBtnDiem;
    private javax.swing.JPanel pnBtnExit;
    private javax.swing.JPanel pnBtnMoRongMenu;
    private javax.swing.JPanel pnBtnMon;
    private javax.swing.JPanel pnBtnQuanLyDiem;
    private javax.swing.JPanel pnBtnQuanLyMonHoc;
    private javax.swing.JPanel pnBtnQuanLySinhVien;
    private javax.swing.JPanel pnBtnQuanLyTaiKhoan;
    private javax.swing.JPanel pnBtnSinhVien;
    private javax.swing.JPanel pnBtnTaiKhoan;
    private javax.swing.JPanel pnBtnThuNhoMenu;
    private javax.swing.JPanel pnDesktop;
    private javax.swing.JPanel pnDoiMK;
    private javax.swing.JPanel pnDoiMatKhau;
    private javax.swing.JPanel pnLargeMenu;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnMiniMenu;
    private javax.swing.JPanel pnQuayLai;
    private javax.swing.JPasswordField txtMKCu;
    private javax.swing.JPasswordField txtMkMoi;
    private javax.swing.JPasswordField txtNhapLaiMK;
    // End of variables declaration//GEN-END:variables
    //statuc: true: in; false:out
    private void changeColorCursorHover(JPanel pn, boolean status) {
        if (status) {
            pn.setBackground(colorHoverMenu);
            this.setCursor(handleMouse);
        } else {
            pn.setBackground(colorHeader);
            this.setCursor(defaultMouse);
        }
    }

    private void hoverBtnMenu(JPanel pn, boolean b) {
        if (b) {
            this.setCursor(handleMouse);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 10; i++) {
                            Thread.sleep(3);
                            pn.setLocation(i, pn.getY());
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            };
            thread.start();
            pn.setBackground(colorHoverMenu);
        } else {
            this.setCursor(defaultMouse);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 10; i >= 0; i--) {
                            Thread.sleep(4);
                            pn.setLocation(i, pn.getY());
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            };
            thread.start();
            pn.setBackground(colorMenu);
        }
    }

    private void hoverBtnMenuIcon(JPanel pn, boolean b) {
        if (b) {
            setCursor(handleMouse);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 5; i++) {
                            Thread.sleep(3);
                            pn.setLocation(pn.getX(), pn.getY() - 1);
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            };
            thread.start();
            pn.setBackground(colorHoverMenu);
        } else {
            setCursor(defaultMouse);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 5; i >= 0; i--) {
                            Thread.sleep(4);
                            pn.setLocation(pn.getX(), pn.getY() + 1);
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            };
            thread.start();
            pn.setBackground(colorMenu);
        }
    }

    private void changeDesktopState(int desktopState) {
        switch (desktopState) {
            case 1:
                pnDesktop.removeAll();
                lblTitleMenu.setText("QUẢN LÝ SINH VIÊN");
                frmQuanLySinhVien.setSize(pnDesktop.getWidth(), pnDesktop.getHeight());
                frmQuanLySinhVien.setMaLopGV(tk.getLop().getMaLop());
                frmQuanLySinhVien.lamMoi();
                pnDesktop.add(frmQuanLySinhVien).setVisible(true);
                break;
            case 2:
                pnDesktop.removeAll();
                lblTitleMenu.setText("QUẢN LÝ MÔN HỌC");
                frmQuanLyMon.setSize(pnDesktop.getWidth(), pnDesktop.getHeight());
                frmQuanLyMon.lamMoi();
                pnDesktop.add(frmQuanLyMon).setVisible(true);
                break;
            case 3:
                pnDesktop.removeAll();
                lblTitleMenu.setText("QUẢN LÝ ĐIỂM");
                frmQuanLyDiem.setSize(pnDesktop.getWidth(), pnDesktop.getHeight());
                frmQuanLyDiem.setMaLopGV(tk.getLop().getMaLop());
                frmQuanLyDiem.lamMoi();
                pnDesktop.add(frmQuanLyDiem).setVisible(true);
                break;
            case 4:
                pnDesktop.removeAll();
                lblTitleMenu.setText("QUẢN LÝ TÀI KHOẢN");
                frmQuanLyTaiKhoan.setSize(pnDesktop.getWidth(), pnDesktop.getHeight());
                frmQuanLyTaiKhoan.lamMoi();
                pnDesktop.add(frmQuanLyTaiKhoan).setVisible(true);
                break;
        }
        SwingUtilities.updateComponentTreeUI(this);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) frmQuanLySinhVien.getUI();
        ui.setNorthPane(null);
        ui = (BasicInternalFrameUI) frmQuanLyMon.getUI();
        ui.setNorthPane(null);
        ui = (BasicInternalFrameUI) frmQuanLyDiem.getUI();
        ui.setNorthPane(null);
        ui = (BasicInternalFrameUI) frmQuanLyTaiKhoan.getUI();
        ui.setNorthPane(null);
    }

    private void changeMenuState() {
        if (menuState) {
            pnMenu.setPreferredSize(new Dimension(50, pnMenu.getHeight()));
            pnMiniMenu.setPreferredSize(new Dimension(50, pnMiniMenu.getHeight()));
            menuState = false;
        } else {
            pnMenu.setPreferredSize(new Dimension(220, pnMenu.getHeight()));
            pnMiniMenu.setPreferredSize(new Dimension(0, pnMiniMenu.getHeight()));
            menuState = true;
        }
        SwingUtilities.updateComponentTreeUI(this);
        dlg.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dlg.setVisible(false);
            }
        }).start();
        dlg.setVisible(true);
        changeDesktopState(desktopState);
    }

    private void hoverBtnDialog(JPanel pn, boolean b) {
        if (b) {
            this.setCursor(handleMouse);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 5; i++) {
                            Thread.sleep(3);
                            pn.setLocation(pn.getX(), pn.getY() - 1);
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            };
            thread.start();
            pn.setBackground(colorBtnDialogHover);
        } else {
            this.setCursor(defaultMouse);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 5; i >= 0; i--) {
                            Thread.sleep(4);
                            pn.setLocation(pn.getX(), pn.getY() + 1);
                        }
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            };
            thread.start();
            pn.setBackground(colorBtnDialog);
        }
    }
}
