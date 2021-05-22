package view.frmQuanLyTaiKhoan;

import controller.Controller;
import dao.LopDAO;
import dao.TaiKhoanDAO;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import model.Lop;
import model.TaiKhoan;
import ui.CustomCellRenderer;
import ui.CustomTableTaiKhoan;
import ui.RoundedPanel;

public class FrmQuanLyTaiKhoan extends javax.swing.JInternalFrame {

    /**
     * Loai dialog
     */
    private boolean dialogType;//true: them, false:sua
    /**
     * Khai bao hang duoc chon
     */
    private int selectedRow = -1;
    /**
     * Khai bao icon
     */
    private final ImageIcon iconThem = new ImageIcon(getClass().getResource("/resouces/add.png"));
    private final ImageIcon iconSua = new ImageIcon(getClass().getResource("/resouces/draw.png"));
    private final ImageIcon iconVHH = new ImageIcon(getClass().getResource("/resouces/disabled .png"));
    /**
     * Declare mouse status
     */
    private final Cursor defaultMouse = new Cursor(Cursor.DEFAULT_CURSOR);
    private final Cursor handleMouse = new Cursor(Cursor.HAND_CURSOR);
    /**
     * Declare color:
     */
    private final Color colorMenu = new Color(2, 62, 116);
    private final Color colorHoverMenu = new Color(121, 172, 219);
    private final Color colorBtnDialog = new Color(91, 128, 165);
    private final Color colorBtnDialogHover = new Color(137, 194, 250);
    /**
     * Khai bao danh sach, so trang, trang hien tai
     */
    private ArrayList<TaiKhoan> dsTKhoans = new ArrayList<>();
    private ArrayList<Lop> dsLops = new ArrayList<>();
    private int tongTrang = 0;
    private int trangHienTai = 1;

    /**
     * Khai bao custom table header format
     */
    CustomCellRenderer customHeaderCellRendered = new CustomCellRenderer(
            Color.white,
            new Color(1, 62, 142),
            new Font("Segoe UI", Font.BOLD, 16),
            BorderFactory.createEmptyBorder(), true
    );

    public FrmQuanLyTaiKhoan() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        dialogTaiKhoan.setShape(new RoundRectangle2D.Double(0, 0, dialogTaiKhoan.getWidth(), dialogTaiKhoan.getHeight(), 50, 50));
        dialogTaiKhoan.setLocationRelativeTo(null);
        txtID.setEnabled(false);
        dsLops = LopDAO.getInstance().layDSLop();
        for (Lop l : dsLops) {
            cbbMaLop.addItem(l.getMaLop());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogTaiKhoan = new javax.swing.JDialog();
        jPanel3 = new RoundedPanel(50);
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pnQuayLai = new RoundedPanel(30);
        btnQuayLai = new javax.swing.JLabel();
        pnDieuKhien = new RoundedPanel(30);
        btnDieuKhien = new javax.swing.JLabel();
        cbbMaLop = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtTuKhoa = new javax.swing.JTextField();
        pnTimKiem = new RoundedPanel(30);
        btnTimKiem = new javax.swing.JLabel();
        pnThem = new RoundedPanel(30);
        btnThem = new javax.swing.JLabel();
        pnSua = new RoundedPanel(30);
        btnSua = new javax.swing.JLabel();
        pnResetPass = new RoundedPanel(30);
        btnResetPass = new javax.swing.JLabel();
        pnVoHH = new RoundedPanel(30);
        btnVoHH = new javax.swing.JLabel();
        pnReload = new RoundedPanel(30);
        btnReload = new javax.swing.JLabel();
        pnData = new javax.swing.JPanel();
        pnTbl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTaiKhoan = new javax.swing.JTable();
        pnPhanTrang = new javax.swing.JPanel();
        pnTrangDau = new RoundedPanel(30);
        btnTrangDau = new javax.swing.JLabel();
        pnTrangTruoc = new RoundedPanel(30);
        btnTrangTruoc = new javax.swing.JLabel();
        pnSoTrang = new RoundedPanel(15);
        lblSoTrang = new javax.swing.JLabel();
        pnTrangSau = new RoundedPanel(30);
        btnTrangSau = new javax.swing.JLabel();
        pnTrangCuoi = new RoundedPanel(30);
        btnTrangCuoi = new javax.swing.JLabel();

        dialogTaiKhoan.setMinimumSize(new java.awt.Dimension(450, 420));
        dialogTaiKhoan.setModal(true);
        dialogTaiKhoan.setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 450));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 30));

        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID.setPreferredSize(new java.awt.Dimension(400, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã lớp:");
        jLabel2.setPreferredSize(new java.awt.Dimension(250, 30));

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

        pnDieuKhien.setBackground(new java.awt.Color(91, 128, 165));
        pnDieuKhien.setOpaque(false);
        pnDieuKhien.setPreferredSize(new java.awt.Dimension(80, 50));

        btnDieuKhien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDieuKhien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/add.png"))); // NOI18N
        btnDieuKhien.setPreferredSize(new java.awt.Dimension(80, 50));
        btnDieuKhien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDieuKhienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDieuKhienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDieuKhienMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnDieuKhienLayout = new javax.swing.GroupLayout(pnDieuKhien);
        pnDieuKhien.setLayout(pnDieuKhienLayout);
        pnDieuKhienLayout.setHorizontalGroup(
            pnDieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDieuKhienLayout.createSequentialGroup()
                .addComponent(btnDieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnDieuKhienLayout.setVerticalGroup(
            pnDieuKhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDieuKhienLayout.createSequentialGroup()
                .addComponent(btnDieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cbbMaLop.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbMaLop.setPreferredSize(new java.awt.Dimension(400, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("THÔNG TIN TÀI KHOẢN");
        jLabel3.setPreferredSize(new java.awt.Dimension(33, 60));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbMaLop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(pnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(pnDieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnDieuKhien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout dialogTaiKhoanLayout = new javax.swing.GroupLayout(dialogTaiKhoan.getContentPane());
        dialogTaiKhoan.getContentPane().setLayout(dialogTaiKhoanLayout);
        dialogTaiKhoanLayout.setHorizontalGroup(
            dialogTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTaiKhoanLayout.setVerticalGroup(
            dialogTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogTaiKhoanLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(179, 213, 241));

        jPanel2.setBackground(new java.awt.Color(179, 213, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));

        txtTuKhoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTuKhoa.setPreferredSize(new java.awt.Dimension(400, 30));
        txtTuKhoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTuKhoaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTuKhoaFocusLost(evt);
            }
        });
        jPanel2.add(txtTuKhoa);

        pnTimKiem.setBackground(new java.awt.Color(2, 62, 116));
        pnTimKiem.setOpaque(false);
        pnTimKiem.setPreferredSize(new java.awt.Dimension(80, 50));

        btnTimKiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/magnifying-glass.png"))); // NOI18N
        btnTimKiem.setPreferredSize(new java.awt.Dimension(80, 50));
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTimKiemLayout.setVerticalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(pnTimKiem);

        pnThem.setBackground(new java.awt.Color(2, 62, 116));
        pnThem.setOpaque(false);
        pnThem.setPreferredSize(new java.awt.Dimension(80, 50));

        btnThem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/add.png"))); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(80, 50));
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnThemLayout = new javax.swing.GroupLayout(pnThem);
        pnThem.setLayout(pnThemLayout);
        pnThemLayout.setHorizontalGroup(
            pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThemLayout.createSequentialGroup()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnThemLayout.setVerticalGroup(
            pnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThemLayout.createSequentialGroup()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(pnThem);

        pnSua.setBackground(new java.awt.Color(2, 62, 116));
        pnSua.setOpaque(false);
        pnSua.setPreferredSize(new java.awt.Dimension(80, 50));

        btnSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/draw.png"))); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(80, 50));
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSuaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnSuaLayout = new javax.swing.GroupLayout(pnSua);
        pnSua.setLayout(pnSuaLayout);
        pnSuaLayout.setHorizontalGroup(
            pnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuaLayout.createSequentialGroup()
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnSuaLayout.setVerticalGroup(
            pnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSuaLayout.createSequentialGroup()
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(pnSua);

        pnResetPass.setBackground(new java.awt.Color(2, 62, 116));
        pnResetPass.setToolTipText("");
        pnResetPass.setOpaque(false);
        pnResetPass.setPreferredSize(new java.awt.Dimension(80, 50));

        btnResetPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnResetPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/rotation-lock.png"))); // NOI18N
        btnResetPass.setPreferredSize(new java.awt.Dimension(80, 50));
        btnResetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetPassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnResetPassLayout = new javax.swing.GroupLayout(pnResetPass);
        pnResetPass.setLayout(pnResetPassLayout);
        pnResetPassLayout.setHorizontalGroup(
            pnResetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnResetPassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnResetPassLayout.setVerticalGroup(
            pnResetPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnResetPassLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnResetPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnResetPass);

        pnVoHH.setBackground(new java.awt.Color(2, 62, 116));
        pnVoHH.setToolTipText("");
        pnVoHH.setOpaque(false);
        pnVoHH.setPreferredSize(new java.awt.Dimension(80, 50));

        btnVoHH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVoHH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/disabled .png"))); // NOI18N
        btnVoHH.setPreferredSize(new java.awt.Dimension(80, 50));
        btnVoHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoHHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoHHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoHHMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnVoHHLayout = new javax.swing.GroupLayout(pnVoHH);
        pnVoHH.setLayout(pnVoHHLayout);
        pnVoHHLayout.setHorizontalGroup(
            pnVoHHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVoHHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnVoHHLayout.setVerticalGroup(
            pnVoHHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVoHHLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVoHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnVoHH);

        pnReload.setBackground(new java.awt.Color(2, 62, 116));
        pnReload.setToolTipText("");
        pnReload.setOpaque(false);
        pnReload.setPreferredSize(new java.awt.Dimension(80, 50));

        btnReload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/refresh.png"))); // NOI18N
        btnReload.setPreferredSize(new java.awt.Dimension(80, 50));
        btnReload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReloadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReloadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReloadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnReloadLayout = new javax.swing.GroupLayout(pnReload);
        pnReload.setLayout(pnReloadLayout);
        pnReloadLayout.setHorizontalGroup(
            pnReloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnReloadLayout.createSequentialGroup()
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnReloadLayout.setVerticalGroup(
            pnReloadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnReloadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnReload);

        pnData.setBackground(new java.awt.Color(179, 213, 241));
        pnData.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách môn"));

        pnTbl.setBackground(new java.awt.Color(179, 213, 241));

        tblTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTaiKhoan.setFocusable(false);
        tblTaiKhoan.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblTaiKhoan.setRowHeight(30);
        tblTaiKhoan.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tblTaiKhoan.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTaiKhoan.setShowVerticalLines(false);
        tblTaiKhoan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTaiKhoan);

        javax.swing.GroupLayout pnTblLayout = new javax.swing.GroupLayout(pnTbl);
        pnTbl.setLayout(pnTblLayout);
        pnTblLayout.setHorizontalGroup(
            pnTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
        );
        pnTblLayout.setVerticalGroup(
            pnTblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTblLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pnPhanTrang.setBackground(new java.awt.Color(179, 213, 241));
        pnPhanTrang.setPreferredSize(new java.awt.Dimension(0, 80));

        pnTrangDau.setBackground(new java.awt.Color(2, 62, 116));
        pnTrangDau.setOpaque(false);
        pnTrangDau.setPreferredSize(new java.awt.Dimension(80, 50));

        btnTrangDau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrangDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/double-left-chevron.png"))); // NOI18N
        btnTrangDau.setToolTipText("");
        btnTrangDau.setPreferredSize(new java.awt.Dimension(80, 50));
        btnTrangDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangDauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangDauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangDauMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTrangDauLayout = new javax.swing.GroupLayout(pnTrangDau);
        pnTrangDau.setLayout(pnTrangDauLayout);
        pnTrangDauLayout.setHorizontalGroup(
            pnTrangDauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangDauLayout.createSequentialGroup()
                .addComponent(btnTrangDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTrangDauLayout.setVerticalGroup(
            pnTrangDauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangDauLayout.createSequentialGroup()
                .addComponent(btnTrangDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnPhanTrang.add(pnTrangDau);

        pnTrangTruoc.setBackground(new java.awt.Color(2, 62, 116));
        pnTrangTruoc.setOpaque(false);
        pnTrangTruoc.setPreferredSize(new java.awt.Dimension(80, 50));

        btnTrangTruoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrangTruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/left-arrow-angle-big-gross-symbol.png"))); // NOI18N
        btnTrangTruoc.setToolTipText("");
        btnTrangTruoc.setPreferredSize(new java.awt.Dimension(80, 50));
        btnTrangTruoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangTruocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangTruocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangTruocMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTrangTruocLayout = new javax.swing.GroupLayout(pnTrangTruoc);
        pnTrangTruoc.setLayout(pnTrangTruocLayout);
        pnTrangTruocLayout.setHorizontalGroup(
            pnTrangTruocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangTruocLayout.createSequentialGroup()
                .addComponent(btnTrangTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTrangTruocLayout.setVerticalGroup(
            pnTrangTruocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangTruocLayout.createSequentialGroup()
                .addComponent(btnTrangTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnPhanTrang.add(pnTrangTruoc);

        pnSoTrang.setBackground(new java.awt.Color(179, 213, 241));
        pnSoTrang.setPreferredSize(new java.awt.Dimension(80, 50));

        lblSoTrang.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSoTrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSoTrang.setText("2/2");
        lblSoTrang.setToolTipText("");
        lblSoTrang.setPreferredSize(new java.awt.Dimension(80, 50));

        javax.swing.GroupLayout pnSoTrangLayout = new javax.swing.GroupLayout(pnSoTrang);
        pnSoTrang.setLayout(pnSoTrangLayout);
        pnSoTrangLayout.setHorizontalGroup(
            pnSoTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoTrangLayout.createSequentialGroup()
                .addComponent(lblSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnSoTrangLayout.setVerticalGroup(
            pnSoTrangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoTrangLayout.createSequentialGroup()
                .addComponent(lblSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnPhanTrang.add(pnSoTrang);

        pnTrangSau.setBackground(new java.awt.Color(2, 62, 116));
        pnTrangSau.setOpaque(false);
        pnTrangSau.setPreferredSize(new java.awt.Dimension(80, 50));

        btnTrangSau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrangSau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/right-arrow.png"))); // NOI18N
        btnTrangSau.setToolTipText("");
        btnTrangSau.setPreferredSize(new java.awt.Dimension(80, 50));
        btnTrangSau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangSauMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangSauMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangSauMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTrangSauLayout = new javax.swing.GroupLayout(pnTrangSau);
        pnTrangSau.setLayout(pnTrangSauLayout);
        pnTrangSauLayout.setHorizontalGroup(
            pnTrangSauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangSauLayout.createSequentialGroup()
                .addComponent(btnTrangSau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTrangSauLayout.setVerticalGroup(
            pnTrangSauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangSauLayout.createSequentialGroup()
                .addComponent(btnTrangSau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnPhanTrang.add(pnTrangSau);

        pnTrangCuoi.setBackground(new java.awt.Color(2, 62, 116));
        pnTrangCuoi.setOpaque(false);
        pnTrangCuoi.setPreferredSize(new java.awt.Dimension(80, 50));

        btnTrangCuoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrangCuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/double-angle-pointing-to-right.png"))); // NOI18N
        btnTrangCuoi.setToolTipText("");
        btnTrangCuoi.setPreferredSize(new java.awt.Dimension(80, 50));
        btnTrangCuoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangCuoiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangCuoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangCuoiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnTrangCuoiLayout = new javax.swing.GroupLayout(pnTrangCuoi);
        pnTrangCuoi.setLayout(pnTrangCuoiLayout);
        pnTrangCuoiLayout.setHorizontalGroup(
            pnTrangCuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangCuoiLayout.createSequentialGroup()
                .addComponent(btnTrangCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnTrangCuoiLayout.setVerticalGroup(
            pnTrangCuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTrangCuoiLayout.createSequentialGroup()
                .addComponent(btnTrangCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnPhanTrang.add(pnTrangCuoi);

        javax.swing.GroupLayout pnDataLayout = new javax.swing.GroupLayout(pnData);
        pnData.setLayout(pnDataLayout);
        pnDataLayout.setHorizontalGroup(
            pnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnPhanTrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnDataLayout.setVerticalGroup(
            pnDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDataLayout.createSequentialGroup()
                .addComponent(pnTbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPhanTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1161, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangSauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangSauMouseClicked
        if (trangHienTai < tongTrang) {
            trangHienTai++;
            layDsTheoTrang(trangHienTai);
            loadDuLieu();
        }
    }//GEN-LAST:event_btnTrangSauMouseClicked

    private void btnTrangCuoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangCuoiMouseClicked
        trangHienTai = tongTrang;
        layDsTheoTrang(trangHienTai);
        loadDuLieu();
    }//GEN-LAST:event_btnTrangCuoiMouseClicked

    private void btnTrangTruocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangTruocMouseClicked
        if (trangHienTai > 1) {
            trangHienTai--;
            layDsTheoTrang(trangHienTai);
            loadDuLieu();
        }
    }//GEN-LAST:event_btnTrangTruocMouseClicked

    private void btnTrangDauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangDauMouseClicked
        trangHienTai = 1;
        layDsTheoTrang(trangHienTai);
        loadDuLieu();
    }//GEN-LAST:event_btnTrangDauMouseClicked

    private void btnTrangDauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangDauMouseEntered
        hoverBtn(pnTrangDau, true);
    }//GEN-LAST:event_btnTrangDauMouseEntered

    private void btnTrangDauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangDauMouseExited
        hoverBtn(pnTrangDau, false);
    }//GEN-LAST:event_btnTrangDauMouseExited

    private void btnTrangTruocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangTruocMouseEntered
        hoverBtn(pnTrangTruoc, true);
    }//GEN-LAST:event_btnTrangTruocMouseEntered

    private void btnTrangTruocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangTruocMouseExited
        hoverBtn(pnTrangTruoc, false);
    }//GEN-LAST:event_btnTrangTruocMouseExited

    private void btnTrangSauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangSauMouseEntered
        hoverBtn(pnTrangSau, true);
    }//GEN-LAST:event_btnTrangSauMouseEntered

    private void btnTrangSauMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangSauMouseExited
        hoverBtn(pnTrangSau, false);
    }//GEN-LAST:event_btnTrangSauMouseExited

    private void btnTrangCuoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangCuoiMouseEntered
        hoverBtn(pnTrangCuoi, true);
    }//GEN-LAST:event_btnTrangCuoiMouseEntered

    private void btnTrangCuoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangCuoiMouseExited
        hoverBtn(pnTrangCuoi, false);
    }//GEN-LAST:event_btnTrangCuoiMouseExited

    private void btnTimKiemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseEntered
        hoverBtn(pnTimKiem, true);
    }//GEN-LAST:event_btnTimKiemMouseEntered

    private void btnTimKiemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseExited
        hoverBtn(pnTimKiem, false);
    }//GEN-LAST:event_btnTimKiemMouseExited

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        hoverBtn(pnThem, true);
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseExited
        hoverBtn(pnThem, false);
    }//GEN-LAST:event_btnThemMouseExited

    private void btnSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseEntered
        hoverBtn(pnSua, true);
    }//GEN-LAST:event_btnSuaMouseEntered

    private void btnSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseExited
        hoverBtn(pnSua, false);
    }//GEN-LAST:event_btnSuaMouseExited

    private void btnReloadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseEntered
        hoverBtn(pnReload, true);
    }//GEN-LAST:event_btnReloadMouseEntered

    private void btnReloadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseExited
        hoverBtn(pnReload, false);
    }//GEN-LAST:event_btnReloadMouseExited

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        dialogType = true;
        txtID.setEnabled(true);
        txtID.setText("");
        btnDieuKhien.setIcon(iconThem);
        dialogTaiKhoan.setVisible(true);
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnQuayLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuayLaiMouseClicked
        dialogTaiKhoan.setVisible(false);
        txtID.setEnabled(false);
    }//GEN-LAST:event_btnQuayLaiMouseClicked

    private void btnDieuKhienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDieuKhienMouseClicked
        txtID.setEnabled(false);
        themSuaTaiKhoan();
    }//GEN-LAST:event_btnDieuKhienMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        try {
            selectedRow = tblTaiKhoan.getSelectedRow();
            if (selectedRow < 0 || selectedRow > dsTKhoans.size()) {
                throw new Exception("Vui lòng chọn bản ghi cần sửa!");
            }
            TaiKhoan tk = dsTKhoans.get(selectedRow);
            txtID.setText(tk.getId() + "");
            cbbMaLop.setSelectedItem(tk.getLop().getMaLop());
            btnDieuKhien.setIcon(iconSua);
            dialogTaiKhoan.setVisible(true);
            dialogType = false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void txtTuKhoaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTuKhoaFocusGained
        if (txtTuKhoa.getText().equals("Nhập từ khóa tìm kiếm...")) {
            txtTuKhoa.setText("");
            txtTuKhoa.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtTuKhoaFocusGained

    private void txtTuKhoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTuKhoaFocusLost
        if (txtTuKhoa.getText().equals("")) {
            txtTuKhoa.setText("Nhập từ khóa tìm kiếm...");
            txtTuKhoa.setForeground(new Color(205, 205, 205));
        }
    }//GEN-LAST:event_txtTuKhoaFocusLost

    private void btnReloadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReloadMouseClicked
        lamMoi();
    }//GEN-LAST:event_btnReloadMouseClicked

    private void btnResetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPassMouseClicked
        try {
            selectedRow = tblTaiKhoan.getSelectedRow();
            if (selectedRow < 0 || selectedRow > dsTKhoans.size()) {
                throw new Exception("Vui lòng chọn bản ghi cần thay đổi trạng thái!");
            }
            TaiKhoan tk = dsTKhoans.get(selectedRow);
            int chose = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đặt lại mặt khẩu " + tk.getId(), "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (chose == JOptionPane.YES_OPTION) {
                tk.setPass("1");
                if (Controller.getInstance().capNhat(tk)) {
                    JOptionPane.showMessageDialog(null, "Reset Password thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    laySoTrang();
                    layDsTheoTrang(trangHienTai);
                    loadDuLieu();
                } else {
                    JOptionPane.showMessageDialog(null, "Reset Password thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnResetPassMouseClicked

    private void btnResetPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPassMouseEntered
        hoverBtn(pnResetPass, true);
    }//GEN-LAST:event_btnResetPassMouseEntered

    private void btnResetPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetPassMouseExited
        hoverBtn(pnResetPass, false);
    }//GEN-LAST:event_btnResetPassMouseExited

    private void btnVoHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoHHMouseClicked
        try {
            selectedRow = tblTaiKhoan.getSelectedRow();
            if (selectedRow < 0 || selectedRow > dsTKhoans.size()) {
                throw new Exception("Vui lòng chọn bản ghi cần thay đổi trạng thái!");
            }
            TaiKhoan tk = dsTKhoans.get(selectedRow);
            int chose = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đổi trạng thái " + tk.getId(), "Xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (chose == JOptionPane.YES_OPTION) {
                if (tk.isTrangThai().equals("Hoạt động")) {
                    tk.setTrangThai("Vô hiệu hóa");
                } else {
                    tk.setTrangThai("Hoạt động");
                }
                if (Controller.getInstance().capNhat(tk)) {
                    JOptionPane.showMessageDialog(null, "Thay đổi trạng thái thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    laySoTrang();
                    layDsTheoTrang(trangHienTai);
                    loadDuLieu();
                } else {
                    JOptionPane.showMessageDialog(null, "Thay đổi trạng thái thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVoHHMouseClicked

    private void btnVoHHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoHHMouseEntered
        hoverBtn(pnVoHH, true);
    }//GEN-LAST:event_btnVoHHMouseEntered

    private void btnVoHHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoHHMouseExited
        hoverBtn(pnVoHH, false);
    }//GEN-LAST:event_btnVoHHMouseExited

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        try {
            ArrayList<TaiKhoan> tks = TaiKhoanDAO.getInstance().layTaiKhoanTheoID(txtTuKhoa.getText());
            tblTaiKhoan.setModel(new CustomTableTaiKhoan(tks));
            for (int i = 0; i < tblTaiKhoan.getColumnCount(); i++) {
                tblTaiKhoan.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(customHeaderCellRendered);
                tblTaiKhoan.getTableHeader().getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
                    @Override
                    public void setHorizontalAlignment(int alignment) {
                        super.setHorizontalAlignment(CENTER); //To change body of generated methods, choose Tools | Templates.
                    }
                });
            }
            txtTuKhoa.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(FrmQuanLyTaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnQuayLaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuayLaiMouseEntered
        btnQuayLai.setCursor(handleMouse);
        hoverBtnDialog(pnQuayLai, true);
    }//GEN-LAST:event_btnQuayLaiMouseEntered

    private void btnQuayLaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuayLaiMouseExited
        btnQuayLai.setCursor(defaultMouse);
        hoverBtnDialog(pnQuayLai, false);
    }//GEN-LAST:event_btnQuayLaiMouseExited

    private void btnDieuKhienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDieuKhienMouseEntered
        btnDieuKhien.setCursor(handleMouse);
        hoverBtnDialog(pnDieuKhien, true);
    }//GEN-LAST:event_btnDieuKhienMouseEntered

    private void btnDieuKhienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDieuKhienMouseExited
        btnDieuKhien.setCursor(handleMouse);
        hoverBtnDialog(pnDieuKhien, false);
    }//GEN-LAST:event_btnDieuKhienMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDieuKhien;
    private javax.swing.JLabel btnQuayLai;
    private javax.swing.JLabel btnReload;
    private javax.swing.JLabel btnResetPass;
    private javax.swing.JLabel btnSua;
    private javax.swing.JLabel btnThem;
    private javax.swing.JLabel btnTimKiem;
    private javax.swing.JLabel btnTrangCuoi;
    private javax.swing.JLabel btnTrangDau;
    private javax.swing.JLabel btnTrangSau;
    private javax.swing.JLabel btnTrangTruoc;
    private javax.swing.JLabel btnVoHH;
    private javax.swing.JComboBox<String> cbbMaLop;
    private javax.swing.JDialog dialogTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblSoTrang;
    private javax.swing.JPanel pnData;
    private javax.swing.JPanel pnDieuKhien;
    private javax.swing.JPanel pnPhanTrang;
    private javax.swing.JPanel pnQuayLai;
    private javax.swing.JPanel pnReload;
    private javax.swing.JPanel pnResetPass;
    private javax.swing.JPanel pnSoTrang;
    private javax.swing.JPanel pnSua;
    private javax.swing.JPanel pnTbl;
    private javax.swing.JPanel pnThem;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JPanel pnTrangCuoi;
    private javax.swing.JPanel pnTrangDau;
    private javax.swing.JPanel pnTrangSau;
    private javax.swing.JPanel pnTrangTruoc;
    private javax.swing.JPanel pnVoHH;
    private javax.swing.JTable tblTaiKhoan;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTuKhoa;
    // End of variables declaration//GEN-END:variables

    private void laySoTrang() {
        tongTrang = TaiKhoanDAO.getInstance().layTongSoBanGhi();
        tongTrang = tongTrang % 15 == 0 ? tongTrang / 15 : tongTrang / 15 + 1;
    }

    private void loadDuLieu() {
        dsLops = LopDAO.getInstance().layDSLop();
        tblTaiKhoan.setModel(new CustomTableTaiKhoan(dsTKhoans));
        lblSoTrang.setText(trangHienTai + "/" + tongTrang);
        for (int i = 0; i < tblTaiKhoan.getColumnCount(); i++) {
            tblTaiKhoan.getTableHeader().getColumnModel().getColumn(i).setHeaderRenderer(customHeaderCellRendered);
            tblTaiKhoan.getTableHeader().getColumnModel().getColumn(i).setCellRenderer(new DefaultTableCellRenderer() {
                @Override
                public void setHorizontalAlignment(int alignment) {
                    super.setHorizontalAlignment(CENTER); //To change body of generated methods, choose Tools | Templates.
                }
            });
        }
    }

    private void layDsTheoTrang(int trangHienTai) {
        dsTKhoans = TaiKhoanDAO.getInstance().layDSTaiKhoanTheoTrang(trangHienTai);
    }

    private void hoverBtn(JPanel pn, boolean b) {
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
            pn.setBackground(colorHoverMenu);
        } else {
            this.setCursor(defaultMouse);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 5; i >= 0; i--) {
                            Thread.sleep(3);
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

    private void themSuaTaiKhoan() {
        try {
            if (dialogType) {
                TaiKhoan tk = new TaiKhoan();
                tk.setId(txtID.getText().trim());
                tk.setLoaiTaiKhoan("Giảng viên");
                tk.setPass("1");
                tk.setTrangThai("Hoạt động");
                Lop lop = new Lop();
                for (Lop l : dsLops) {
                    if (l.getMaLop().equals(cbbMaLop.getSelectedItem().toString())) {
                        lop = l;
                    }
                }
                tk.setLop(lop);
                if (txtID.getText().equals("")) {
                    throw new Exception("ID không được để trống!");
                }
                if (Controller.getInstance().themMoi(tk)) {
                    JOptionPane.showMessageDialog(null, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    laySoTrang();
                    layDsTheoTrang(trangHienTai);
                    loadDuLieu();
                } else {
                    JOptionPane.showMessageDialog(null, "Thêm thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                dialogTaiKhoan.setVisible(false);
            } else {
                TaiKhoan tk = dsTKhoans.get(selectedRow);
                Lop lop = new Lop();
                for (Lop l : dsLops) {
                    if (l.getMaLop().equals(cbbMaLop.getSelectedItem().toString())) {
                        lop = l;
                    }
                }
                tk.setLop(lop);
                if (Controller.getInstance().capNhat(tk)) {
                    JOptionPane.showMessageDialog(null, "Sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    laySoTrang();
                    layDsTheoTrang(trangHienTai);
                    loadDuLieu();
                } else {
                    JOptionPane.showMessageDialog(null, "Sửa thất bại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
                dialogTaiKhoan.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
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

    public void lamMoi() {
        laySoTrang();
        layDsTheoTrang(trangHienTai);
        loadDuLieu();
    }
}
