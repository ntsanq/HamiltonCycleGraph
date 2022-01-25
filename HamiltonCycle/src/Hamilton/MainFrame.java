package Hamilton;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static Hamilton.Connectivity.connectivityString;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        //im ex icon
        Icon im = new ImageIcon("src\\IMG\\im.png");
        Icon ex = new ImageIcon("src\\IMG\\ex.png");
        imBtn.setIcon(im);
        exBtn.setIcon(ex);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlMode = new javax.swing.JPanel();
        openBtn = new javax.swing.JButton();
        addEdBtn = new javax.swing.JButton();
        addVerBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        controlLabel = new javax.swing.JLabel();
        connectivityCheck = new javax.swing.JPanel();
        cncLabel = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        vNumLbl = new javax.swing.JLabel();
        eNumLbl = new javax.swing.JLabel();
        edgeNumField = new javax.swing.JTextField();
        vNumField = new javax.swing.JTextField();
        cntComponentLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cntField = new javax.swing.JTextPane();
        Result = new javax.swing.JPanel();
        findPATHBtn = new javax.swing.JButton();
        pathField = new javax.swing.JTextField();
        resultLabel = new javax.swing.JLabel();
        bigTiltle = new javax.swing.JLabel();
        imBtn = new javax.swing.JButton();
        exBtn = new javax.swing.JButton();
        questionLbl = new javax.swing.JLabel();
        ownerLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("frame()"); // NOI18N
        setResizable(false);

        controlMode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));

        openBtn.setText("Open Drawing Panel");
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });

        addEdBtn.setText("Add edge");
        addEdBtn.setMaximumSize(new java.awt.Dimension(87, 22));
        addEdBtn.setMinimumSize(new java.awt.Dimension(87, 22));
        addEdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEdBtnActionPerformed(evt);
            }
        });

        addVerBtn.setText("Add node");
        addVerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVerBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.setMaximumSize(new java.awt.Dimension(87, 22));
        resetBtn.setMinimumSize(new java.awt.Dimension(87, 22));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        controlLabel.setFont(new java.awt.Font("UTM Rockwell", 1, 12)); // NOI18N
        controlLabel.setText("Control mode");

        javax.swing.GroupLayout controlModeLayout = new javax.swing.GroupLayout(controlMode);
        controlMode.setLayout(controlModeLayout);
        controlModeLayout.setHorizontalGroup(
            controlModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlModeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(controlModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(controlModeLayout.createSequentialGroup()
                        .addComponent(addVerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addEdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(controlLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlModeLayout.setVerticalGroup(
            controlModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlModeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(controlLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(controlModeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addVerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        connectivityCheck.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        cncLabel.setFont(new java.awt.Font("UTM Rockwell", 1, 12)); // NOI18N
        cncLabel.setText("Connectivity check");

        checkBtn.setText("Click to check");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        vNumLbl.setText("Number of vertexes :");

        eNumLbl.setText("Number of edges :");

        edgeNumField.setEditable(false);

        vNumField.setEditable(false);

        cntComponentLbl.setText("Connected components :");

        jScrollPane1.setViewportView(cntField);

        javax.swing.GroupLayout connectivityCheckLayout = new javax.swing.GroupLayout(connectivityCheck);
        connectivityCheck.setLayout(connectivityCheckLayout);
        connectivityCheckLayout.setHorizontalGroup(
            connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connectivityCheckLayout.createSequentialGroup()
                .addGroup(connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(connectivityCheckLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cncLabel))
                    .addGroup(connectivityCheckLayout.createSequentialGroup()
                        .addGroup(connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(connectivityCheckLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vNumLbl)
                                    .addComponent(eNumLbl))
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, connectivityCheckLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cntComponentLbl)
                                .addGap(18, 18, 18)))
                        .addGroup(connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edgeNumField, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(vNumField)
                            .addComponent(jScrollPane1)))
                    .addGroup(connectivityCheckLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        connectivityCheckLayout.setVerticalGroup(
            connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(connectivityCheckLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cncLabel)
                .addGap(4, 4, 4)
                .addGroup(connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vNumLbl)
                    .addComponent(vNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eNumLbl)
                    .addComponent(edgeNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(connectivityCheckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cntComponentLbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(checkBtn)
                .addContainerGap())
        );

        Result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        findPATHBtn.setText("Click to find cycle");
        findPATHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPATHBtnActionPerformed(evt);
            }
        });

        pathField.setEditable(false);

        resultLabel.setFont(new java.awt.Font("UTM Rockwell", 1, 12)); // NOI18N
        resultLabel.setText("Result");

        javax.swing.GroupLayout ResultLayout = new javax.swing.GroupLayout(Result);
        Result.setLayout(ResultLayout);
        ResultLayout.setHorizontalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultLayout.createSequentialGroup()
                .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultLabel)
                            .addComponent(pathField, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ResultLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(findPATHBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ResultLayout.setVerticalGroup(
            ResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pathField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findPATHBtn)
                .addGap(14, 14, 14))
        );

        bigTiltle.setFont(new java.awt.Font("UTM Rockwell", 1, 26)); // NOI18N
        bigTiltle.setText("Hamilton Cycle");

        imBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imBtnMouseClicked(evt);
            }
        });
        imBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imBtnActionPerformed(evt);
            }
        });

        exBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exBtnActionPerformed(evt);
            }
        });

        questionLbl.setText("❓");
        questionLbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        questionLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionLblMouseClicked(evt);
            }
        });

        ownerLbl.setText("👨‍");
        ownerLbl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ownerLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ownerLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(335, 454, Short.MAX_VALUE)
                .addComponent(imBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(questionLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ownerLbl))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(controlMode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(connectivityCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(bigTiltle, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(questionLbl)
                        .addComponent(ownerLbl)))
                .addGap(4, 4, 4)
                .addComponent(bigTiltle)
                .addGap(18, 18, 18)
                .addComponent(controlMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(connectivityCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findPATHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPATHBtnActionPerformed
        final_path = "";
        popFrame.findHamiltonCycle();
        pathField.setText("The cycle is: " + final_path);
        popFrame.reDraw();
    }//GEN-LAST:event_findPATHBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        popFrame.reset();
        cntField.setText("");
        vNumField.setText("");
        edgeNumField.setText("");
        pathField.setText("");
        
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addVerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVerBtnActionPerformed
        state = NODE_CREATE;
        popFrame.refreshRedline();
    }//GEN-LAST:event_addVerBtnActionPerformed

    private void addEdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEdBtnActionPerformed
        state = EDGE_FIRST;
        popFrame.refreshRedline();
    }//GEN-LAST:event_addEdBtnActionPerformed

    private void exBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exBtnActionPerformed
        //export
        popFrame.exportGraph();
        cntField.setText("");
        vNumField.setText("");
        edgeNumField.setText("");
        pathField.setText("");
        
    }//GEN-LAST:event_exBtnActionPerformed

    private void imBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imBtnActionPerformed
        //import
        popFrame.importGraph();
        
    }//GEN-LAST:event_imBtnActionPerformed

    public static String connectivityResult;

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed

        String v = Integer.toString(popFrame.showNode());
        vNumField.setText("There are " + v + " vertexes");

        String e = Integer.toString(popFrame.showEdge());
        edgeNumField.setText("There are " + e + " edges");
        
//       check connectiviry
        popFrame.checkConnectivity();
        cntField.setText(connectivityString);


    }//GEN-LAST:event_checkBtnActionPerformed

    private void questionLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionLblMouseClicked
        JOptionPane.showMessageDialog(null, "1.Open Drawing Panel to begin to draw.\n\n"
                + "2.Then choose funtion in your Control mode and start to click in the panel.\n\n"
                + "3.There are buttons below to check Connectivity and Hamilton Result.\n\n"
                + "HOPE YOU ENJOY!\n\n"
                + "Sang.", "How to use?", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_questionLblMouseClicked

    private void ownerLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ownerLblMouseClicked
        JOptionPane.showMessageDialog(null, "Nguyen Thanh Sang\nB1805911\nCan Tho University", "Author", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_ownerLblMouseClicked

    private void imBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imBtnMouseClicked

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        popFrame = new DrawingFrame();
    }//GEN-LAST:event_openBtnActionPerformed

    public static int state = -1;

    public static DrawingFrame popFrame;

    final int NODE_CREATE = 0;
    final int EDGE_FIRST = 1;
    final int EDGE_SECOND = 2;
//    final int REMOVE_NODE = 3;
    public static String final_path;
    public static String VNumber;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame m = new MainFrame();
                m.setVisible(true);
                m.setTitle("NguyenThanhSang");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Result;
    private javax.swing.JButton addEdBtn;
    private javax.swing.JButton addVerBtn;
    private javax.swing.JLabel bigTiltle;
    private javax.swing.JButton checkBtn;
    private javax.swing.JLabel cncLabel;
    private javax.swing.JLabel cntComponentLbl;
    private javax.swing.JTextPane cntField;
    private javax.swing.JPanel connectivityCheck;
    private javax.swing.JLabel controlLabel;
    private javax.swing.JPanel controlMode;
    private javax.swing.JLabel eNumLbl;
    private javax.swing.JTextField edgeNumField;
    private javax.swing.JButton exBtn;
    private javax.swing.JButton findPATHBtn;
    private javax.swing.JButton imBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openBtn;
    private javax.swing.JLabel ownerLbl;
    private javax.swing.JTextField pathField;
    private javax.swing.JLabel questionLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JTextField vNumField;
    private javax.swing.JLabel vNumLbl;
    // End of variables declaration//GEN-END:variables
}
