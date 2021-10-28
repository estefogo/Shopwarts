package Shopwarts;


public class userInfo {
    // atributos   
    private String username = "";
    private String userpassword = "";
    private String birthday = "";
    private String city = "";
    private String district = "";
    private String nome = "";
    private String rb = "";
    private String street = "";
    private String streetN = "";
    private String house = "";
    
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
    }
}
