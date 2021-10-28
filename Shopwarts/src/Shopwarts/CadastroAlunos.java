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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fullNameField = new javax.swing.JTextField();
        userStreetField = new javax.swing.JTextField();
        houseNumberField = new javax.swing.JTextField();
        labelusuario1 = new javax.swing.JLabel();
        labelusuario3 = new javax.swing.JLabel();
        labelusuario9 = new javax.swing.JLabel();
        labelusuario10 = new javax.swing.JLabel();
        houseField = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        labelusuario2 = new javax.swing.JLabel();
        labelusuario6 = new javax.swing.JLabel();
        labelusuario4 = new javax.swing.JLabel();
        labelusuario7 = new javax.swing.JLabel();
        districtField = new javax.swing.JTextField();
        labelusuario5 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        rbField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        finishRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backLoginPassword = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        bornDateField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - Shopwarts");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Insira seus dados pessoais:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vamos lá!");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        fullNameField.setBackground(new java.awt.Color(51, 51, 51));
        fullNameField.setForeground(new java.awt.Color(255, 255, 255));
        fullNameField.setBorder(null);
        fullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameFieldActionPerformed(evt);
            }
        });

        userStreetField.setBackground(new java.awt.Color(51, 51, 51));
        userStreetField.setForeground(new java.awt.Color(255, 255, 255));
        userStreetField.setBorder(null);
        userStreetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userStreetFieldActionPerformed(evt);
            }
        });

        houseNumberField.setBackground(new java.awt.Color(51, 51, 51));
        houseNumberField.setForeground(new java.awt.Color(255, 255, 255));
        houseNumberField.setBorder(null);
        houseNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseNumberFieldActionPerformed(evt);
            }
        });

        labelusuario1.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario1.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario1.setText("Nome:");

        labelusuario3.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario3.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario3.setText("Data de nascimento:");

        labelusuario9.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario9.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario9.setText("Registro Bruxo:");

        labelusuario10.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario10.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario10.setText("Casa:");

        houseField.setBackground(new java.awt.Color(204, 204, 204));
        houseField.setForeground(new java.awt.Color(255, 255, 255));
        houseField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grifinória", "Sonserina", "Lufa-Lufa", "Corvinal" }));
        houseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseFieldActionPerformed(evt);
            }
        });

        labelusuario2.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario2.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario2.setText("Endereço");

        labelusuario6.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario6.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario6.setText("Rua:");

        labelusuario4.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario4.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario4.setText("Número:");

        labelusuario7.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario7.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario7.setText("Bairro:");

        districtField.setBackground(new java.awt.Color(51, 51, 51));
        districtField.setForeground(new java.awt.Color(255, 255, 255));
        districtField.setBorder(null);
        districtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtFieldActionPerformed(evt);
            }
        });

        labelusuario5.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        labelusuario5.setForeground(new java.awt.Color(255, 255, 255));
        labelusuario5.setText("Cidade:");

        cityField.setBackground(new java.awt.Color(51, 51, 51));
        cityField.setForeground(new java.awt.Color(255, 255, 255));
        cityField.setBorder(null);
        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        rbField.setBackground(new java.awt.Color(51, 51, 51));
        rbField.setForeground(new java.awt.Color(255, 255, 255));
        rbField.setBorder(null);
        rbField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFieldActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Criar conta:");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuário:");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha:");

        usernameField.setBackground(new java.awt.Color(51, 51, 51));
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setBorder(null);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        finishRegister.setBackground(new java.awt.Color(204, 204, 204));
        finishRegister.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        finishRegister.setText("Cadastrar");
        finishRegister.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        finishRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishRegisterActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_cadastro.png"))); // NOI18N

        backLoginPassword.setBackground(new java.awt.Color(204, 204, 204));
        backLoginPassword.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        backLoginPassword.setText("Voltar");
        backLoginPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backLoginPassword.setPreferredSize(new java.awt.Dimension(81, 23));
        backLoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLoginPasswordActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(51, 51, 51));
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(null);
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(backLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(finishRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(129, 129, 129))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(finishRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        bornDateField.setBackground(new java.awt.Color(51, 51, 51));
        bornDateField.setBorder(null);
        bornDateField.setForeground(new java.awt.Color(255, 255, 255));
        try {
            bornDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelusuario1)
                            .addComponent(labelusuario3)
                            .addComponent(labelusuario2)
                            .addComponent(labelusuario6))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelusuario9)
                            .addComponent(labelusuario4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fullNameField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userStreetField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rbField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25)
                                            .addComponent(labelusuario10))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(houseNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelusuario7)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(districtField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelusuario5)
                                            .addGap(18, 18, 18)
                                            .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bornDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelusuario3)
                    .addComponent(bornDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelusuario2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelusuario6)
                    .addComponent(userStreetField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario4)
                    .addComponent(labelusuario7)
                    .addComponent(districtField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario5)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelusuario9)
                    .addComponent(labelusuario10)
                    .addComponent(houseField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

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

    private void houseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_houseFieldActionPerformed

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

    private void fullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldActionPerformed

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
    private javax.swing.JFormattedTextField bornDateField;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelusuario1;
    private javax.swing.JLabel labelusuario10;
    private javax.swing.JLabel labelusuario2;
    private javax.swing.JLabel labelusuario3;
    private javax.swing.JLabel labelusuario4;
    private javax.swing.JLabel labelusuario5;
    private javax.swing.JLabel labelusuario6;
    private javax.swing.JLabel labelusuario7;
    private javax.swing.JLabel labelusuario9;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField rbField;
    private javax.swing.JTextField userStreetField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
