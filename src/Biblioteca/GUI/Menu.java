/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca.GUI;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnHome = new javax.swing.JPanel();
        IcoHome = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        BtnPre = new javax.swing.JPanel();
        IcoPre = new javax.swing.JLabel();
        btnprestamo = new javax.swing.JLabel();
        BtnDev = new javax.swing.JPanel();
        IcoDev = new javax.swing.JLabel();
        btndevolucion = new javax.swing.JLabel();
        BtnUser = new javax.swing.JPanel();
        IcoUser = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        BtnMat = new javax.swing.JPanel();
        IcoMat = new javax.swing.JLabel();
        Material = new javax.swing.JLabel();
        BtnBus = new javax.swing.JPanel();
        IcoBus = new javax.swing.JLabel();
        Buscar = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JPanel();
        IcoSalir = new javax.swing.JLabel();
        btnsalir = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 100, 150));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("udbLib");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        BtnHome.setBackground(new java.awt.Color(0, 100, 150));

        IcoHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IcoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagees/353416_home_icon.png"))); // NOI18N

        Home.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home.setText("Principal");
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnHomeLayout = new javax.swing.GroupLayout(BtnHome);
        BtnHome.setLayout(BtnHomeLayout);
        BtnHomeLayout.setHorizontalGroup(
            BtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnHomeLayout.createSequentialGroup()
                .addComponent(IcoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        BtnHomeLayout.setVerticalGroup(
            BtnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IcoHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BtnPre.setBackground(new java.awt.Color(0, 100, 150));
        BtnPre.setPreferredSize(new java.awt.Dimension(271, 64));

        IcoPre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IcoPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagees/9165409_file_contract_icon.png"))); // NOI18N
        IcoPre.setPreferredSize(new java.awt.Dimension(64, 64));

        btnprestamo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnprestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnprestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnprestamo.setText("Préstamo");
        btnprestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnprestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnprestamoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnPreLayout = new javax.swing.GroupLayout(BtnPre);
        BtnPre.setLayout(BtnPreLayout);
        BtnPreLayout.setHorizontalGroup(
            BtnPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnPreLayout.createSequentialGroup()
                .addComponent(IcoPre, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BtnPreLayout.setVerticalGroup(
            BtnPreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IcoPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnprestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BtnDev.setBackground(new java.awt.Color(0, 100, 150));
        BtnDev.setPreferredSize(new java.awt.Dimension(271, 64));

        IcoDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IcoDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagees/3586371_calendar_date_schedule_icon.png"))); // NOI18N

        btndevolucion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btndevolucion.setForeground(new java.awt.Color(255, 255, 255));
        btndevolucion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btndevolucion.setText("Devolución");
        btndevolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndevolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndevolucionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndevolucionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnDevLayout = new javax.swing.GroupLayout(BtnDev);
        BtnDev.setLayout(BtnDevLayout);
        BtnDevLayout.setHorizontalGroup(
            BtnDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnDevLayout.createSequentialGroup()
                .addComponent(IcoDev)
                .addGap(18, 18, 18)
                .addComponent(btndevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );
        BtnDevLayout.setVerticalGroup(
            BtnDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IcoDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btndevolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BtnUser.setBackground(new java.awt.Color(0, 100, 150));
        BtnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUser.setPreferredSize(new java.awt.Dimension(271, 64));
        BtnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnUserMouseExited(evt);
            }
        });

        IcoUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IcoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagees/4213440_community_group_leader_people_team_icon.png"))); // NOI18N

        User.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User.setText("Usuarios");
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnUserLayout = new javax.swing.GroupLayout(BtnUser);
        BtnUser.setLayout(BtnUserLayout);
        BtnUserLayout.setHorizontalGroup(
            BtnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnUserLayout.createSequentialGroup()
                .addComponent(IcoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );
        BtnUserLayout.setVerticalGroup(
            BtnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IcoUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BtnMat.setBackground(new java.awt.Color(0, 100, 150));
        BtnMat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMat.setPreferredSize(new java.awt.Dimension(271, 64));
        BtnMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnMatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnMatMouseEntered(evt);
            }
        });

        IcoMat.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        IcoMat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IcoMat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagees/3209232_element_layer_material_pile_stack_icon.png"))); // NOI18N

        Material.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Material.setForeground(new java.awt.Color(255, 255, 255));
        Material.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Material.setText("Materiales");
        Material.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Material.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaterialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaterialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnMatLayout = new javax.swing.GroupLayout(BtnMat);
        BtnMat.setLayout(BtnMatLayout);
        BtnMatLayout.setHorizontalGroup(
            BtnMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnMatLayout.createSequentialGroup()
                .addComponent(IcoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Material, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );
        BtnMatLayout.setVerticalGroup(
            BtnMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IcoMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Material, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BtnBus.setBackground(new java.awt.Color(0, 100, 150));
        BtnBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBus.setPreferredSize(new java.awt.Dimension(271, 64));
        BtnBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBusMouseEntered(evt);
            }
        });

        IcoBus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IcoBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagees/211818_search_icon.png"))); // NOI18N

        Buscar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Buscar.setText("Buscar");
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnBusLayout = new javax.swing.GroupLayout(BtnBus);
        BtnBus.setLayout(BtnBusLayout);
        BtnBusLayout.setHorizontalGroup(
            BtnBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBusLayout.createSequentialGroup()
                .addComponent(IcoBus, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );
        BtnBusLayout.setVerticalGroup(
            BtnBusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IcoBus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BtnSalir.setBackground(new java.awt.Color(0, 100, 150));
        BtnSalir.setPreferredSize(new java.awt.Dimension(271, 64));

        IcoSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IcoSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagees/3005766_account_door_exit_logout_icon.png"))); // NOI18N

        btnsalir.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsalir.setText("Salir");
        btnsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalirMouseExited(evt);
            }
        });
        btnsalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnsalirKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSalirLayout.createSequentialGroup()
                .addComponent(IcoSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IcoSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(BtnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnDev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 850));

        Contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jPanel1.add(Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 690, 750));

        Head.setBackground(new java.awt.Color(255, 255, 255));
        Head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadMouseDragged(evt);
            }
        });
        Head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(Head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeMouseClicked

    private void btnsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseClicked

        System.exit(0);
    }//GEN-LAST:event_btnsalirMouseClicked

    private void btnsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseEntered
       BtnSalir.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_btnsalirMouseEntered

    private void btnsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalirMouseExited
       BtnSalir.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_btnsalirMouseExited

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        Pestañas p1= new Pestañas();
        p1.setSize(690,750);
        p1.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(p1,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_UserMouseClicked

    private void HeadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeadMousePressed

    private void HeadMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeadMouseDragged

    private void UserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseEntered
        BtnUser.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_UserMouseEntered

    private void BtnUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUserMouseExited
        BtnUser.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_BtnUserMouseExited

    private void UserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseExited
        BtnUser.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_UserMouseExited

    private void BtnMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMatMouseClicked
        Pestañas_Material p2= new Pestañas_Material();
        p2.setSize(690,750);
        p2.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(p2,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BtnMatMouseClicked

    private void BtnMatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnMatMouseEntered
        
    }//GEN-LAST:event_BtnMatMouseEntered

    private void MaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaterialMouseEntered
        BtnMat.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_MaterialMouseEntered

    private void MaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaterialMouseExited
         BtnMat.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_MaterialMouseExited

    private void MaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaterialMouseClicked
        Pestañas_Material p2= new Pestañas_Material();
        p2.setSize(690,750);
        p2.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(p2,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_MaterialMouseClicked

    private void BtnBusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBusMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBusMouseEntered

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        Buscar p3= new Buscar();
        p3.setSize(690,750);
        p3.setLocation(0,0);
        
        Contenido.removeAll();
        Contenido.add(p3,BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }//GEN-LAST:event_BuscarMouseClicked

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
       BtnBus.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
       BtnBus.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_BuscarMouseExited

    private void btndevolucionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndevolucionMouseEntered
        BtnDev.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_btndevolucionMouseEntered

    private void btnprestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprestamoMouseEntered
        BtnPre.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_btnprestamoMouseEntered

    private void btnsalirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnsalirKeyReleased
        btnsalir.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_btnsalirKeyReleased

    private void btndevolucionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndevolucionMouseExited
        BtnDev.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_btndevolucionMouseExited

    private void btnprestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprestamoMouseExited
        BtnPre.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_btnprestamoMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        BtnHome.setBackground(new Color(5, 124, 226));
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
         BtnHome.setBackground(new Color(0, 100, 150));
    }//GEN-LAST:event_HomeMouseExited

    /**
     * @param args the command line arguments
     */
    public static void menu(String args[]) { //ANTES: menuPpal()
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnBus;
    private javax.swing.JPanel BtnDev;
    private javax.swing.JPanel BtnHome;
    private javax.swing.JPanel BtnMat;
    private javax.swing.JPanel BtnPre;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JPanel BtnUser;
    private javax.swing.JLabel Buscar;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel Head;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel IcoBus;
    private javax.swing.JLabel IcoDev;
    private javax.swing.JLabel IcoHome;
    private javax.swing.JLabel IcoMat;
    private javax.swing.JLabel IcoPre;
    private javax.swing.JLabel IcoSalir;
    private javax.swing.JLabel IcoUser;
    private javax.swing.JLabel Material;
    private javax.swing.JLabel User;
    private javax.swing.JLabel btndevolucion;
    private javax.swing.JLabel btnprestamo;
    private javax.swing.JLabel btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
