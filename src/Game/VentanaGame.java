package Game;

import javax.swing.JLabel;

public class VentanaGame extends javax.swing.JFrame {

    private char[] palabraMostrar;
    private JLabel[] labelPalabras = new JLabel[13];

    public VentanaGame() {
        initComponents();
        iniciarValores();
        iniciarPalabra();
        jLabelLose.setVisible(false);
        jLabelWin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLose = new javax.swing.JLabel();
        jLabelWin = new javax.swing.JLabel();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonNN = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonQ = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        lienzo1 = new Game.lienzo();
        jLabelP0 = new javax.swing.JLabel();
        jLabelP1 = new javax.swing.JLabel();
        jLabelP2 = new javax.swing.JLabel();
        jLabelP3 = new javax.swing.JLabel();
        jLabelP4 = new javax.swing.JLabel();
        jLabelP5 = new javax.swing.JLabel();
        jLabelP6 = new javax.swing.JLabel();
        jLabelP8 = new javax.swing.JLabel();
        jLabelP9 = new javax.swing.JLabel();
        jLabelP10 = new javax.swing.JLabel();
        jLabelP11 = new javax.swing.JLabel();
        jLabelP12 = new javax.swing.JLabel();
        jLabelP7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLose.setFont(new java.awt.Font("Segoe UI Symbol", 0, 48)); // NOI18N
        jLabelLose.setForeground(new java.awt.Color(102, 0, 0));
        jLabelLose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLose.setText("YOU LOSE");
        jLabelLose.setOpaque(true);
        getContentPane().add(jLabelLose, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 380, 60));

        jLabelWin.setFont(new java.awt.Font("Segoe UI Symbol", 0, 48)); // NOI18N
        jLabelWin.setForeground(new java.awt.Color(0, 153, 0));
        jLabelWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWin.setText("YOU WIN");
        jLabelWin.setOpaque(true);
        getContentPane().add(jLabelWin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 380, 60));

        jButtonA.setBackground(new java.awt.Color(0, 51, 51));
        jButtonA.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonA.setForeground(new java.awt.Color(255, 255, 255));
        jButtonA.setText("A");
        jButtonA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 30, 20));

        jButtonB.setBackground(new java.awt.Color(0, 51, 51));
        jButtonB.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonB.setForeground(new java.awt.Color(255, 255, 255));
        jButtonB.setText("B");
        jButtonB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 30, 20));

        jButtonC.setBackground(new java.awt.Color(0, 51, 51));
        jButtonC.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonC.setForeground(new java.awt.Color(255, 255, 255));
        jButtonC.setText("C");
        jButtonC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 30, 20));

        jButtonI.setBackground(new java.awt.Color(0, 51, 51));
        jButtonI.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonI.setForeground(new java.awt.Color(255, 255, 255));
        jButtonI.setText("I");
        jButtonI.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonI, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 30, 20));

        jButtonD.setBackground(new java.awt.Color(0, 51, 51));
        jButtonD.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonD.setForeground(new java.awt.Color(255, 255, 255));
        jButtonD.setText("D");
        jButtonD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonD, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 30, 20));

        jButtonE.setBackground(new java.awt.Color(0, 51, 51));
        jButtonE.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonE.setForeground(new java.awt.Color(255, 255, 255));
        jButtonE.setText("E");
        jButtonE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonE, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 30, 20));

        jButtonF.setBackground(new java.awt.Color(0, 51, 51));
        jButtonF.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonF.setForeground(new java.awt.Color(255, 255, 255));
        jButtonF.setText("F");
        jButtonF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 30, 20));

        jButtonG.setBackground(new java.awt.Color(0, 51, 51));
        jButtonG.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonG.setForeground(new java.awt.Color(255, 255, 255));
        jButtonG.setText("G");
        jButtonG.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonG, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 30, 20));

        jButtonH.setBackground(new java.awt.Color(0, 51, 51));
        jButtonH.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonH.setForeground(new java.awt.Color(255, 255, 255));
        jButtonH.setText("H");
        jButtonH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonH, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 30, 20));

        jButtonJ.setBackground(new java.awt.Color(0, 51, 51));
        jButtonJ.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonJ.setForeground(new java.awt.Color(255, 255, 255));
        jButtonJ.setText("J");
        jButtonJ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 30, 20));

        jButtonK.setBackground(new java.awt.Color(0, 51, 51));
        jButtonK.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonK.setForeground(new java.awt.Color(255, 255, 255));
        jButtonK.setText("K");
        jButtonK.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonK, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 30, 20));

        jButtonL.setBackground(new java.awt.Color(0, 51, 51));
        jButtonL.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonL.setForeground(new java.awt.Color(255, 255, 255));
        jButtonL.setText("L");
        jButtonL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 30, 20));

        jButtonM.setBackground(new java.awt.Color(0, 51, 51));
        jButtonM.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonM.setForeground(new java.awt.Color(255, 255, 255));
        jButtonM.setText("M");
        jButtonM.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 30, 20));

        jButtonN.setBackground(new java.awt.Color(0, 51, 51));
        jButtonN.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonN.setText("N");
        jButtonN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonN, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 30, 20));

        jButtonNN.setBackground(new java.awt.Color(0, 51, 51));
        jButtonNN.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonNN.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNN.setText("Ñ");
        jButtonNN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonNN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNNActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 30, 20));

        jButtonO.setBackground(new java.awt.Color(0, 51, 51));
        jButtonO.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonO.setForeground(new java.awt.Color(255, 255, 255));
        jButtonO.setText("O");
        jButtonO.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 30, 20));

        jButtonP.setBackground(new java.awt.Color(0, 51, 51));
        jButtonP.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonP.setForeground(new java.awt.Color(255, 255, 255));
        jButtonP.setText("P");
        jButtonP.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 30, 20));

        jButtonQ.setBackground(new java.awt.Color(0, 51, 51));
        jButtonQ.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonQ.setForeground(new java.awt.Color(255, 255, 255));
        jButtonQ.setText("Q");
        jButtonQ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 30, 20));

        jButtonR.setBackground(new java.awt.Color(0, 51, 51));
        jButtonR.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonR.setForeground(new java.awt.Color(255, 255, 255));
        jButtonR.setText("R");
        jButtonR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 30, 20));

        jButtonS.setBackground(new java.awt.Color(0, 51, 51));
        jButtonS.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonS.setForeground(new java.awt.Color(255, 255, 255));
        jButtonS.setText("S");
        jButtonS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 30, 20));

        jButtonT.setBackground(new java.awt.Color(0, 51, 51));
        jButtonT.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonT.setForeground(new java.awt.Color(255, 255, 255));
        jButtonT.setText("T");
        jButtonT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 30, 20));

        jButtonU.setBackground(new java.awt.Color(0, 51, 51));
        jButtonU.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonU.setForeground(new java.awt.Color(255, 255, 255));
        jButtonU.setText("U");
        jButtonU.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonU, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 30, 20));

        jButtonV.setBackground(new java.awt.Color(0, 51, 51));
        jButtonV.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonV.setForeground(new java.awt.Color(255, 255, 255));
        jButtonV.setText("V");
        jButtonV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonV, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 30, 20));

        jButtonW.setBackground(new java.awt.Color(0, 51, 51));
        jButtonW.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonW.setForeground(new java.awt.Color(255, 255, 255));
        jButtonW.setText("W");
        jButtonW.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 30, 20));

        jButtonX.setBackground(new java.awt.Color(0, 51, 51));
        jButtonX.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonX.setForeground(new java.awt.Color(255, 255, 255));
        jButtonX.setText("X");
        jButtonX.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 30, 20));

        jButtonY.setBackground(new java.awt.Color(0, 51, 51));
        jButtonY.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonY.setForeground(new java.awt.Color(255, 255, 255));
        jButtonY.setText("Y");
        jButtonY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonY, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 30, 20));

        jButtonZ.setBackground(new java.awt.Color(0, 51, 51));
        jButtonZ.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        jButtonZ.setForeground(new java.awt.Color(255, 255, 255));
        jButtonZ.setText("Z");
        jButtonZ.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, 20));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 240));

        jLabelP0.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP0.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP0, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabelP1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP1.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabelP2.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP2.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabelP3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP3.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabelP4.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP4.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabelP5.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP5.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabelP6.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP6.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jLabelP8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP8.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        jLabelP9.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP9.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabelP10.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP10.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jLabelP11.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP11.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabelP12.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP12.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        jLabelP7.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabelP7.setForeground(new java.awt.Color(0, 102, 102));
        jLabelP7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("a"));
        jButtonA.setEnabled(false);

    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("b"));
        jButtonB.setEnabled(false);
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("c"));
        jButtonC.setEnabled(false);
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("d"));
        jButtonD.setEnabled(false);
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("e"));
        jButtonE.setEnabled(false);
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("f"));
        jButtonF.setEnabled(false);
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("g"));
        jButtonG.setEnabled(false);
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("h"));
        jButtonH.setEnabled(false);
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("i"));
        jButtonI.setEnabled(false);
    }//GEN-LAST:event_jButtonIActionPerformed

    private void jButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("j"));
        jButtonJ.setEnabled(false);
    }//GEN-LAST:event_jButtonJActionPerformed

    private void jButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("k"));
        jButtonK.setEnabled(false);
    }//GEN-LAST:event_jButtonKActionPerformed

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("l"));
        jButtonL.setEnabled(false);
    }//GEN-LAST:event_jButtonLActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("m"));
        jButtonM.setEnabled(false);
    }//GEN-LAST:event_jButtonMActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("n"));
        jButtonN.setEnabled(false);
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButtonNNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNNActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("ñ"));
        jButtonNN.setEnabled(false);
    }//GEN-LAST:event_jButtonNNActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("o"));
        jButtonO.setEnabled(false);
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("p"));
        jButtonP.setEnabled(false);
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("q"));
        jButtonQ.setEnabled(false);
    }//GEN-LAST:event_jButtonQActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("r"));
        jButtonR.setEnabled(false);
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("s"));
        jButtonS.setEnabled(false);
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("t"));
        jButtonT.setEnabled(false);
    }//GEN-LAST:event_jButtonTActionPerformed

    private void jButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("u"));
        jButtonU.setEnabled(false);
    }//GEN-LAST:event_jButtonUActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("v"));
        jButtonV.setEnabled(false);
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("w"));
        jButtonW.setEnabled(false);
    }//GEN-LAST:event_jButtonWActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("x"));
        jButtonX.setEnabled(false);
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("y"));
        jButtonY.setEnabled(false);
    }//GEN-LAST:event_jButtonYActionPerformed

    private void jButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZActionPerformed
        escribirPalabra(lienzo1.comprobarLetra("z"));
        jButtonZ.setEnabled(false);
    }//GEN-LAST:event_jButtonZActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonNN;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JLabel jLabelLose;
    private javax.swing.JLabel jLabelP0;
    private javax.swing.JLabel jLabelP1;
    private javax.swing.JLabel jLabelP10;
    private javax.swing.JLabel jLabelP11;
    private javax.swing.JLabel jLabelP12;
    private javax.swing.JLabel jLabelP2;
    private javax.swing.JLabel jLabelP3;
    private javax.swing.JLabel jLabelP4;
    private javax.swing.JLabel jLabelP5;
    private javax.swing.JLabel jLabelP6;
    private javax.swing.JLabel jLabelP7;
    private javax.swing.JLabel jLabelP8;
    private javax.swing.JLabel jLabelP9;
    private javax.swing.JLabel jLabelWin;
    private Game.lienzo lienzo1;
    // End of variables declaration//GEN-END:variables

    public void iniciarValores() {
        labelPalabras[0] = jLabelP0;
        labelPalabras[1] = jLabelP1;
        labelPalabras[2] = jLabelP2;
        labelPalabras[3] = jLabelP3;
        labelPalabras[4] = jLabelP4;
        labelPalabras[5] = jLabelP5;
        labelPalabras[6] = jLabelP6;
        labelPalabras[7] = jLabelP7;
        labelPalabras[8] = jLabelP8;
        labelPalabras[9] = jLabelP9;
        labelPalabras[10] = jLabelP10;
        labelPalabras[11] = jLabelP11;
        labelPalabras[12] = jLabelP12;
    }

    public void escribirPalabra(char[] pal) {
        for (int z = 0; z < pal.length; z++) {
            labelPalabras[z].setText(String.valueOf(pal[z]));
        }
        if (lienzo1.getEstadoWin()) {            
            jLabelWin.setVisible(true);
        }
        if (lienzo1.getEstadoLose()) {
            jLabelLose.setVisible(true);
        }
    }

    public void iniciarPalabra() {
        char[] camposIniciales = lienzo1.getPalabraMostrar();
        for (int z = 0; z < camposIniciales.length; z++) {
            labelPalabras[z].setText(String.valueOf(camposIniciales[z]));
        }
    }
}
