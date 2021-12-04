package Shopwarts;

import database.MySQL;
import javax.swing.JOptionPane;


public class Aluno {
    // atributos   
    MySQL conectar = new MySQL();
    
    private String username = "null";
    private String userpassword = "null";
    private String birthday = "";
    private String city = "";
    private String district = "";
    private String nome = "";
    private String rb = "";
    private String street = "";
    private String streetN = "";
    private String house = "";
    private String gringgots = "";
    
    // getter e setter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRb() {
        return rb;
    }

    public void setRb(String rb) {
        this.rb = rb;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getStreetN() {
        return username;
    }
    
    public void setStreetN(String streetN) {
        this.streetN = streetN;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    
     public String getGringgots() {
        return gringgots;
    }

    public void setGringgots(String gringgots) {
        this.username = gringgots;
    }
    
    
    public void limpaVar() {
    username = "";
    userpassword = "";
    birthday = "";
    city = "";
    district = "";
    nome = "";
    rb = "";
    street = "";
    streetN = "";
    house = "";
    gringgots = "";
    }
    
    public void alteraCadastro(String user, String dado, String atributo) {
         this.conectar.conectaBanco();
         try {
            this.conectar.updateSQL(
                "UPDATE users SET "                    
                    + atributo + " = '" + dado + "'"                    
                + " WHERE "
                    + "user_name = '" + user + "'"
                + ";"
            );            
        }catch(Exception e){
            System.out.println("Erro ao atualizar " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cadastro");
        }finally{
            this.conectar.fechaBanco();                        
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso.");
        }
    }
              
    }