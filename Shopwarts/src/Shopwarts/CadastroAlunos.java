package Shopwarts;

import database.MySQL;
import javax.swing.JOptionPane;

public class CadastroAlunos extends javax.swing.JFrame {
    MySQL conectar = new MySQL(); //acessar os métodos de conexao com o banco
    userInfo novoCliente = new userInfo(); //acessar os atributos da classe userInfo
    int x = 0;

  
    public CadastroAlunos() {
        initComponents();
    }
    
    private void cadastraUser(userInfo novoCliente){
        this.conectar.conectaBanco(); 
        
        novoCliente.setUsername(usernameField.getText());
        novoCliente.setUserpassword(passwordField.getText());
        novoCliente.setBirthday(bornDateField.getText());        
        novoCliente.setCity(cityField.getText());
        novoCliente.setDistrict(districtField.getText());
        novoCliente.setNome((String) fullNameField.getText());
        novoCliente.setRb((String) rbField.getText());
        novoCliente.setStreet(userStreetField.getText());
        novoCliente.setStreetN(houseNumberField.getText());
        novoCliente.setHouse((String) houseField.getSelectedItem());
        
        try {
                        
            this.conectar.insertSQL("INSERT INTO users ("
                    + "user_name,"
                    + "user_password,"
                    + "rb,"
                    + "nome,"
                    + "birthday,"                    
                    + "street,"
                    + "district,"
                    + "city,"  
                    + "streetn,"
                    + "house"
                    
                + ") VALUES ("
                    + "'" + novoCliente.getUsername() + "',"
                    + "'" + novoCliente.getUserpassword() + "',"
                    + "'" + novoCliente.getRb() + "',"
                    + "'" + novoCliente.getNome() + "',"
                    + "'" + novoCliente.getBirthday() + "',"      
                    + "'" + novoCliente.getStreet() + "',"
                    + "'" + novoCliente.getDistrict() + "',"
                    + "'" + novoCliente.getCity() + "',"
                    + "'" + novoCliente.getStreetN() + "',"
                    + "'" + novoCliente.getHouse() + "'"
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");
            
        } finally{            
            this.conectar.fechaBanco();
           
        }                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        fullNameField = new javax.swing.JTextField();
        bornDateField = new javax.swing.JTextField();
        userStreetField = new javax.swing.JTextField();
        houseNumberField = new javax.swing.JTextField();
        districtField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        houseField = new javax.swing.JComboBox<>();
        rbField = new javax.swing.JTextField();
        labelusuario1 = new javax.swing.JLabel();
        labelusuario2 = new javax.swing.JLabel();
        labelusuario3 = new javax.swing.JLabel();
        labelusuario4 = new javax.swing.JLabel();
        labelusuario6 = new javax.swing.JLabel();
        labelusuario7 = new javax.swing.JLabel();
        labelusuario5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelusuario9 = new javax.swing.JLabel();
        labelusuario10 = new javax.swing.JLabel();
        finishRegister = new javax.swing.JButton();
        backLoginPassword = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - Shopwarts");
        setPreferredSize(new java.awt.Dimension(740, 485));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        fullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameFieldActionPerformed(evt);
            }
        });

        bornDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bornDateFieldActionPerformed(evt);
            }
        });

        userStreetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userStreetFieldActionPerformed(evt);
            }
        });

        houseNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNumberFieldActionPerformed(evt);
            }
        });

        districtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtFieldActionPerformed(evt);
            }
        });

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        houseField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grifinória", "Sonserina", "Lufa-Lufa", "Corvinal" }));
        houseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseFieldActionPerformed(evt);
            }
        });

        rbField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFieldActionPerformed(evt);
            }
        });

        labelusuario1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario1.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario1.setText("Nome:");

        labelusuario2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario2.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario2.setText("Endereço:");

        labelusuario3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario3.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario3.setText("Data de nascimento:");

        labelusuario4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario4.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario4.setText("Número:");

        labelusuario6.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario6.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario6.setText("Rua:");

        labelusuario7.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario7.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario7.setText("Bairro:");

        labelusuario5.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario5.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario5.setText("Cidade:");

        labelusuario9.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario9.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario9.setText("Registro Bruxo:");

        labelusuario10.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 14)); // NOI18N
        labelusuario10.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario10.setText("Casa:");

        finishRegister.setText("Cadastrar");
        finishRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishRegisterActionPerformed(evt);
            }
        });

        backLoginPassword.setText("Voltar");
        backLoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLoginPasswordActionPerformed(evt);
            }
        });

        jLabel2.setText("Informações de login");

        jLabel5.setText("Usuário");

        jLabel6.setText("Senha");

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_cadastro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelusuario2)
                    .addComponent(labelusuario3)
                    .addComponent(labelusuario6)
                    .addComponent(labelusuario4)
                    .addComponent(labelusuario1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backLoginPassword)
                            .addComponent(labelusuario9))
                        .addGap(41, 41, 41)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelusuario10)
                                .addGap(12, 12, 12)
                                .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(finishRegister)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(houseNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelusuario7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(districtField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelusuario5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bornDateField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userStreetField, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(268, 268, 268))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(164, 164, 164))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bornDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelusuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelusuario6)
                    .addComponent(userStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario4)
                    .addComponent(labelusuario7)
                    .addComponent(districtField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario5)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelusuario10)
                        .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelusuario9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finishRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Insira seus dados pessoais:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vamos lá!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backLoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLoginPasswordActionPerformed
        // TODO add your handling code here:
        new tela_login().setVisible(true);
        dispose();        
    }//GEN-LAST:event_backLoginPasswordActionPerformed

    private void finishRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishRegisterActionPerformed
        // TODO add your handling code here:
        if(x == 1) {
        
        } else {
            cadastraUser(novoCliente);
            novoCliente.limpaVar();
            new tela_login().setVisible(true);
            dispose();
        }       
    }//GEN-LAST:event_finishRegisterActionPerformed

    private void rbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void districtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtFieldActionPerformed

    private void houseNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseNumberFieldActionPerformed

    private void userStreetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userStreetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userStreetFieldActionPerformed

    private void bornDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bornDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bornDateFieldActionPerformed

    private void fullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldActionPerformed

    private void houseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseFieldActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAlunos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backLoginPassword;
    private javax.swing.JTextField bornDateField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField districtField;
    private javax.swing.JButton finishRegister;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JComboBox<String> houseField;
    private javax.swing.JTextField houseNumberField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelusuario1;
    private javax.swing.JLabel labelusuario10;
    private javax.swing.JLabel labelusuario2;
    private javax.swing.JLabel labelusuario3;
    private javax.swing.JLabel labelusuario4;
    private javax.swing.JLabel labelusuario5;
    private javax.swing.JLabel labelusuario6;
    private javax.swing.JLabel labelusuario7;
    private javax.swing.JLabel labelusuario9;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField rbField;
    private javax.swing.JTextField userStreetField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
