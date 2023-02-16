public class calcu extends javax.swing.JFrame {

   
    public calcu() {
        initComponents();
        pan.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumUm = new javax.swing.JTextField();
        txtNumDois = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAdicao = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnRest = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pan = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("DIGITE UM NÚMERO:");

        jLabel2.setText("DIGITE UM NÚMERO:");

        jLabel3.setText("QUAL OPERAÇÃO DESEJA FAZER?");

        btnAdicao.setText("+");
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMulti.setText("x");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnRest.setText("%");
        btnRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestActionPerformed(evt);
            }
        });

        jButton1.setText("^");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("√");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("∛");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("RESULTADO:");

        lblRes.setText("0");

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(lblRes, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblRes))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumDois))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumUm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnRest)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdicao)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSub)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDiv)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumDois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdicao)
                            .addComponent(btnSub)
                            .addComponent(btnDiv)
                            .addComponent(btnMulti))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRest)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        pan.setVisible(true);
        int v = Integer.parseInt(txtNumUm.getText());
        int v2 = Integer.parseInt(txtNumDois.getText());
        int r = (v + v2);
        lblRes.setText(Integer.toString(r));
        
    }                                         

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {                                       
       pan.setVisible(true);
       int v = Integer.parseInt(txtNumUm.getText());
       int v2 = Integer.parseInt(txtNumDois.getText());
       int r = (v-v2);
       lblRes.setText(Integer.toString(r));
       
    }                                      

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {                                       
       pan.setVisible(true);
       int v = Integer.parseInt(txtNumUm.getText());
       int v2 = Integer.parseInt(txtNumDois.getText());
       double r = (v/v2);
       lblRes.setText(String.format("%.2f",r));
    }                                      

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {                                         
       pan.setVisible(true);
       int v = Integer.parseInt(txtNumUm.getText());
       int v2 = Integer.parseInt(txtNumDois.getText());
       int r = (v*v2);
       lblRes.setText(Integer.toString(r));
    }                                        

    private void btnRestActionPerformed(java.awt.event.ActionEvent evt) {                                        
       pan.setVisible(true);
        int v = Integer.parseInt(txtNumUm.getText());
        int v2 = Integer.parseInt(txtNumDois.getText());
        int r = (v%v2);
        lblRes.setText(Integer.toString(r)); 
    }                                       

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       pan.setVisible(true);
        int v = Integer.parseInt(txtNumUm.getText());
        int v2 = Integer.parseInt(txtNumDois.getText());
        int r = (int) Math.pow(v,v2);
        lblRes.setText(Integer.toString(r));
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        pan.setVisible(true);
        int v = Integer.parseInt(txtNumUm.getText());
        int v2 = Integer.parseInt(txtNumDois.getText());
        double r = (double) Math.sqrt(v);
        lblRes.setText(String.format("%.2f", r));
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       pan.setVisible(true);
        int v = Integer.parseInt(txtNumUm.getText());
        int v2 = Integer.parseInt(txtNumDois.getText());
        double r = (double) Math.cbrt(v);
        lblRes.setText(String.format("%.2f",r));
    }                                        

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
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnRest;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblRes;
    private javax.swing.JPanel pan;
    private javax.swing.JTextField txtNumDois;
    private javax.swing.JTextField txtNumUm;
    // End of variables declaration                   
}