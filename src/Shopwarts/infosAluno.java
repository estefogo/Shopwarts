package Shopwarts;

public class infosAluno {
    int precoCompra;
    
    int totalGringotts = 1000;

    public infosAluno() {
        calculaGringotts(precoCompra);
    }

    
    public int getTotalGringotts() {
        return totalGringotts;
    }

    public void setTotalGringotts(int totalGringotts) {
        this.totalGringotts = totalGringotts;
    }

    public int getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(int precoCompra) {
        this.precoCompra = precoCompra;
    }
    
    public int calculaGringotts(int precoCompra) {
        this.totalGringotts = this.totalGringotts - precoCompra;
        
        return totalGringotts;
    }
    
    public int consultaGringotts(){
        return this.totalGringotts;
    }
    
}
