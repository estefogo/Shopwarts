package Shopwarts;

import javax.swing.JOptionPane;
import database.MySQL;

public class pacotesDeAula extends javax.swing.JFrame {

    public pacotesDeAula() {
        initComponents();
    }
    // atributos
    MySQL conectar = new MySQL();
    Aluno usuario = new Aluno();
    Produtos pacote = new Produtos();

    
     public void selectPacote(int id) {
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + id + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                pacote.setPacote(this.conectar.getResultSet().getString(2));
                pacote.setPreco(Integer.parseInt(String.valueOf(this.conectar.getResultSet().getString(3))));
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{
            System.out.println(pacote.getPreco());
            System.out.println(pacote.getPacote());
            this.conectar.fechaBanco();         
        }
    }
     
     public void setLabels() {               
         this.conectar.conectaBanco();
         try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 1 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                jLabel203.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 2 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                jLabel350.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 3 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                jLabel363.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 4 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                jLabel370.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 5 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                historiamagialabel.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 6 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                jLabel329.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 7 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                jLabel347.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
        this.conectar.conectaBanco();
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "id,"
                    + "nome,"
                    + "preco"
                 + " FROM"
                     + " produtos"
                 + " WHERE"
                     + " id = '" + 8 + "'"
                + ";"
            );

            while(this.conectar.getResultSet().next()){               
                jLabel296.setText("Total: " +  this.conectar.getResultSet().getString(3) + " Gringotts");                
           }

        } catch (Exception e) {
            System.out.println("Erro ao puxar preço " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao puxar preço");

        }finally{            
            this.conectar.fechaBanco();         
        }
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comprar2 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel130 = new javax.swing.JPanel();
        jPanel131 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        jPanel132 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        comprar9 = new javax.swing.JButton();
        jPanel133 = new javax.swing.JPanel();
        jPanel134 = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jPanel135 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jPanel137 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jPanel139 = new javax.swing.JPanel();
        jPanel140 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jPanel141 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel195 = new javax.swing.JPanel();
        jPanel196 = new javax.swing.JPanel();
        jLabel259 = new javax.swing.JLabel();
        jPanel197 = new javax.swing.JPanel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        comprar14 = new javax.swing.JButton();
        jPanel198 = new javax.swing.JPanel();
        jPanel199 = new javax.swing.JPanel();
        jLabel264 = new javax.swing.JLabel();
        jLabel265 = new javax.swing.JLabel();
        jLabel266 = new javax.swing.JLabel();
        jPanel200 = new javax.swing.JPanel();
        jPanel201 = new javax.swing.JPanel();
        jLabel267 = new javax.swing.JLabel();
        jLabel268 = new javax.swing.JLabel();
        jPanel202 = new javax.swing.JPanel();
        jPanel203 = new javax.swing.JPanel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jPanel204 = new javax.swing.JPanel();
        jPanel205 = new javax.swing.JPanel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jPanel206 = new javax.swing.JPanel();
        jPanel207 = new javax.swing.JPanel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel182 = new javax.swing.JPanel();
        jPanel183 = new javax.swing.JPanel();
        jLabel241 = new javax.swing.JLabel();
        jPanel184 = new javax.swing.JPanel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        comprar13 = new javax.swing.JButton();
        jPanel185 = new javax.swing.JPanel();
        jPanel186 = new javax.swing.JPanel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jPanel187 = new javax.swing.JPanel();
        jPanel188 = new javax.swing.JPanel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jPanel189 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        jLabel251 = new javax.swing.JLabel();
        jLabel252 = new javax.swing.JLabel();
        jPanel191 = new javax.swing.JPanel();
        jPanel192 = new javax.swing.JPanel();
        jLabel253 = new javax.swing.JLabel();
        jLabel254 = new javax.swing.JLabel();
        jPanel193 = new javax.swing.JPanel();
        jPanel194 = new javax.swing.JPanel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jPanel161 = new javax.swing.JPanel();
        jLabel307 = new javax.swing.JLabel();
        comprarPocoes1 = new javax.swing.JButton();
        sair9 = new javax.swing.JButton();
        fechar9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel143 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        jLabel187 = new javax.swing.JLabel();
        jPanel145 = new javax.swing.JPanel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        comprarPacoteBasico = new javax.swing.JButton();
        jPanel146 = new javax.swing.JPanel();
        jPanel147 = new javax.swing.JPanel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jPanel148 = new javax.swing.JPanel();
        jPanel149 = new javax.swing.JPanel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jPanel150 = new javax.swing.JPanel();
        jPanel151 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jPanel152 = new javax.swing.JPanel();
        jPanel153 = new javax.swing.JPanel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jPanel154 = new javax.swing.JPanel();
        jPanel155 = new javax.swing.JPanel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        sair1 = new javax.swing.JButton();
        fechar = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel217 = new javax.swing.JPanel();
        jPanel218 = new javax.swing.JPanel();
        jLabel298 = new javax.swing.JLabel();
        jPanel219 = new javax.swing.JPanel();
        jLabel303 = new javax.swing.JLabel();
        jLabel300 = new javax.swing.JLabel();
        jLabel302 = new javax.swing.JLabel();
        comprarPacoteBasico1 = new javax.swing.JButton();
        jPanel224 = new javax.swing.JPanel();
        jPanel225 = new javax.swing.JPanel();
        jLabel304 = new javax.swing.JLabel();
        jLabel308 = new javax.swing.JLabel();
        jLabel309 = new javax.swing.JLabel();
        jLabel350 = new javax.swing.JLabel();
        jLabel351 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        sair2 = new javax.swing.JButton();
        fechar8 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel162 = new javax.swing.JPanel();
        jPanel163 = new javax.swing.JPanel();
        jLabel206 = new javax.swing.JLabel();
        jPanel164 = new javax.swing.JPanel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        comprarDefesa = new javax.swing.JButton();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jLabel216 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jPanel167 = new javax.swing.JPanel();
        jPanel168 = new javax.swing.JPanel();
        jLabel218 = new javax.swing.JLabel();
        jLabel299 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jPanel266 = new javax.swing.JPanel();
        jPanel267 = new javax.swing.JPanel();
        jLabel361 = new javax.swing.JLabel();
        jLabel359 = new javax.swing.JLabel();
        jLabel360 = new javax.swing.JLabel();
        jPanel268 = new javax.swing.JPanel();
        jPanel269 = new javax.swing.JPanel();
        jLabel220 = new javax.swing.JLabel();
        jLabel280 = new javax.swing.JLabel();
        jLabel362 = new javax.swing.JLabel();
        jLabel363 = new javax.swing.JLabel();
        jLabel364 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        sair3 = new javax.swing.JButton();
        fechar2 = new javax.swing.JButton();
        jPanel282 = new javax.swing.JPanel();
        jPanel283 = new javax.swing.JPanel();
        jLabel379 = new javax.swing.JLabel();
        jLabel380 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel169 = new javax.swing.JPanel();
        jPanel170 = new javax.swing.JPanel();
        jLabel221 = new javax.swing.JLabel();
        jPanel171 = new javax.swing.JPanel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        comprarFeiticos = new javax.swing.JButton();
        jPanel172 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        jLabel227 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel228 = new javax.swing.JLabel();
        jPanel270 = new javax.swing.JPanel();
        jPanel271 = new javax.swing.JPanel();
        jLabel301 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel365 = new javax.swing.JLabel();
        jLabel370 = new javax.swing.JLabel();
        jLabel371 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        sair4 = new javax.swing.JButton();
        fechar3 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        jPanel176 = new javax.swing.JPanel();
        jLabel236 = new javax.swing.JLabel();
        comprarHistoria = new javax.swing.JButton();
        jPanel179 = new javax.swing.JPanel();
        jPanel180 = new javax.swing.JPanel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        historiamagialabel = new javax.swing.JLabel();
        jLabel378 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        sair5 = new javax.swing.JButton();
        fechar4 = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel234 = new javax.swing.JPanel();
        jPanel235 = new javax.swing.JPanel();
        jLabel313 = new javax.swing.JLabel();
        jPanel236 = new javax.swing.JPanel();
        jLabel314 = new javax.swing.JLabel();
        jLabel315 = new javax.swing.JLabel();
        jLabel317 = new javax.swing.JLabel();
        comprarHerbologia = new javax.swing.JButton();
        jPanel237 = new javax.swing.JPanel();
        jPanel238 = new javax.swing.JPanel();
        jLabel319 = new javax.swing.JLabel();
        jLabel320 = new javax.swing.JLabel();
        jPanel241 = new javax.swing.JPanel();
        jPanel242 = new javax.swing.JPanel();
        jLabel316 = new javax.swing.JLabel();
        jLabel318 = new javax.swing.JLabel();
        jLabel324 = new javax.swing.JLabel();
        jLabel329 = new javax.swing.JLabel();
        jLabel330 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        sair6 = new javax.swing.JButton();
        fechar5 = new javax.swing.JButton();
        jPanel174 = new javax.swing.JPanel();
        jPanel175 = new javax.swing.JPanel();
        jLabel205 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jPanel247 = new javax.swing.JPanel();
        jPanel248 = new javax.swing.JPanel();
        jLabel331 = new javax.swing.JLabel();
        jPanel249 = new javax.swing.JPanel();
        jLabel341 = new javax.swing.JLabel();
        jLabel335 = new javax.swing.JLabel();
        comprarAstronomia = new javax.swing.JButton();
        jPanel250 = new javax.swing.JPanel();
        jPanel251 = new javax.swing.JPanel();
        jLabel337 = new javax.swing.JLabel();
        jLabel338 = new javax.swing.JLabel();
        jLabel347 = new javax.swing.JLabel();
        jLabel348 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        sair7 = new javax.swing.JButton();
        fechar6 = new javax.swing.JButton();
        jScrollPane18 = new javax.swing.JScrollPane();
        jPanel156 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        jPanel158 = new javax.swing.JPanel();
        jLabel281 = new javax.swing.JLabel();
        jLabel282 = new javax.swing.JLabel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        comprarPocoes = new javax.swing.JButton();
        jPanel159 = new javax.swing.JPanel();
        jPanel160 = new javax.swing.JPanel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jPanel209 = new javax.swing.JPanel();
        jPanel210 = new javax.swing.JPanel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jPanel211 = new javax.swing.JPanel();
        jPanel212 = new javax.swing.JPanel();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        jPanel213 = new javax.swing.JPanel();
        jPanel214 = new javax.swing.JPanel();
        jLabel292 = new javax.swing.JLabel();
        jLabel293 = new javax.swing.JLabel();
        jPanel215 = new javax.swing.JPanel();
        jPanel216 = new javax.swing.JPanel();
        jLabel294 = new javax.swing.JLabel();
        jLabel295 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        sair8 = new javax.swing.JButton();
        fechar7 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel39.setForeground(new java.awt.Color(255, 255, 255));

        jPanel40.setBackground(new java.awt.Color(8, 77, 110));
        jPanel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/defesa_contra_arte_das_trevas.png"))); // NOI18N

        jPanel41.setBackground(new java.awt.Color(8, 77, 110));
        jPanel41.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel45.setBackground(new java.awt.Color(0, 0, 0));
        jLabel45.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Defesa Contra as Artes");

        jLabel46.setBackground(new java.awt.Color(0, 0, 0));
        jLabel46.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("das Trevas: Um Retorno");

        jLabel47.setBackground(new java.awt.Color(0, 0, 0));
        jLabel47.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("aos Princípios Básicos");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(27, 27, 27))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setBackground(new java.awt.Color(102, 102, 102));
        jLabel11.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DEFESA CONTRA AS ARTES DAS TREVAS");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprar2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprar2.setText("COMPRAR");
        comprar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar2ActionPerformed(evt);
            }
        });

        jPanel42.setBackground(new java.awt.Color(8, 77, 110));
        jPanel42.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel43.setBackground(new java.awt.Color(8, 77, 110));
        jPanel43.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel48.setBackground(new java.awt.Color(0, 0, 0));
        jLabel48.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("se Alimentam de Carne");

        jLabel49.setBackground(new java.awt.Color(0, 0, 0));
        jLabel49.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Árvores do Mundo que");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48))
                .addGap(11, 11, 11))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/arvores_do_mundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(27, 27, 27))))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel44.setBackground(new java.awt.Color(8, 77, 110));
        jPanel44.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel45.setBackground(new java.awt.Color(8, 77, 110));
        jPanel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel51.setBackground(new java.awt.Color(0, 0, 0));
        jLabel51.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Varinha");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel51)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel51)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/varinha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel52)
                .addGap(25, 25, 25))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel46.setBackground(new java.awt.Color(8, 77, 110));
        jPanel46.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel47.setBackground(new java.awt.Color(8, 77, 110));
        jPanel47.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel53.setBackground(new java.awt.Color(0, 0, 0));
        jLabel53.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Água Salgada");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(44, 44, 44))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(28, 28, 28))
        );

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/aguaSalgada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel48.setBackground(new java.awt.Color(8, 77, 110));
        jPanel48.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel75.setBackground(new java.awt.Color(8, 77, 110));
        jPanel75.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel89.setBackground(new java.awt.Color(0, 0, 0));
        jLabel89.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("Pena");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel89)
                .addGap(76, 76, 76))
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel89)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/penaaa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel90)
                .addGap(27, 27, 27))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel76.setBackground(new java.awt.Color(8, 77, 110));
        jPanel76.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel77.setBackground(new java.awt.Color(8, 77, 110));
        jPanel77.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel91.setBackground(new java.awt.Color(0, 0, 0));
        jLabel91.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Pergaminho");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel91)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel91)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/pergaminho.png"))); // NOI18N

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel76Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel92)
                .addGap(26, 26, 26))
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel93.setBackground(new java.awt.Color(0, 0, 0));
        jLabel93.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel93.setText("Total: 50 Gringotts");

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        jButton3.setText("Fechar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel39Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel39Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(13, 13, 13)
                                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(827, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 761, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        jScrollPane5.setViewportView(jScrollPane6);

        jPanel130.setBackground(new java.awt.Color(255, 255, 255));
        jPanel130.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel130.setForeground(new java.awt.Color(255, 255, 255));

        jPanel131.setBackground(new java.awt.Color(8, 77, 110));
        jPanel131.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/defesa_contra_arte_das_trevas.png"))); // NOI18N

        jPanel132.setBackground(new java.awt.Color(8, 77, 110));
        jPanel132.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel170.setBackground(new java.awt.Color(0, 0, 0));
        jLabel170.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setText("Defesa Contra as Artes");

        jLabel171.setBackground(new java.awt.Color(0, 0, 0));
        jLabel171.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setText("das Trevas: Um Retorno");

        jLabel172.setBackground(new java.awt.Color(0, 0, 0));
        jLabel172.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setText("aos Princípios Básicos");

        javax.swing.GroupLayout jPanel132Layout = new javax.swing.GroupLayout(jPanel132);
        jPanel132.setLayout(jPanel132Layout);
        jPanel132Layout.setHorizontalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel132Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel170)
                    .addComponent(jLabel172))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel132Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel171)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel132Layout.setVerticalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel132Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel170)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel172)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel131Layout = new javax.swing.GroupLayout(jPanel131);
        jPanel131.setLayout(jPanel131Layout);
        jPanel131Layout.setHorizontalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel131Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel131Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel169)
                .addGap(27, 27, 27))
        );
        jPanel131Layout.setVerticalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel131Layout.createSequentialGroup()
                .addComponent(jLabel169)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel173.setBackground(new java.awt.Color(102, 102, 102));
        jLabel173.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel173.setText("FEITIÇOS");
        jLabel173.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprar9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprar9.setText("COMPRAR");
        comprar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar9ActionPerformed(evt);
            }
        });

        jPanel133.setBackground(new java.awt.Color(8, 77, 110));
        jPanel133.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel134.setBackground(new java.awt.Color(8, 77, 110));
        jPanel134.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel174.setBackground(new java.awt.Color(0, 0, 0));
        jLabel174.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setText("se Alimentam de Carne");

        jLabel175.setBackground(new java.awt.Color(0, 0, 0));
        jLabel175.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setText("Árvores do Mundo que");

        javax.swing.GroupLayout jPanel134Layout = new javax.swing.GroupLayout(jPanel134);
        jPanel134.setLayout(jPanel134Layout);
        jPanel134Layout.setHorizontalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel134Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel175)
                    .addComponent(jLabel174))
                .addGap(11, 11, 11))
        );
        jPanel134Layout.setVerticalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel134Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel175)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel174)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/arvores_do_mundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel133Layout = new javax.swing.GroupLayout(jPanel133);
        jPanel133.setLayout(jPanel133Layout);
        jPanel133Layout.setHorizontalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel133Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel133Layout.createSequentialGroup()
                        .addComponent(jPanel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel133Layout.createSequentialGroup()
                        .addComponent(jLabel176)
                        .addGap(24, 24, 24))))
        );
        jPanel133Layout.setVerticalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel133Layout.createSequentialGroup()
                .addComponent(jLabel176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel135.setBackground(new java.awt.Color(8, 77, 110));
        jPanel135.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel136.setBackground(new java.awt.Color(8, 77, 110));
        jPanel136.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel177.setBackground(new java.awt.Color(0, 0, 0));
        jLabel177.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(255, 255, 255));
        jLabel177.setText("Varinha");

        javax.swing.GroupLayout jPanel136Layout = new javax.swing.GroupLayout(jPanel136);
        jPanel136.setLayout(jPanel136Layout);
        jPanel136Layout.setHorizontalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel136Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel177)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel136Layout.setVerticalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel136Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel177)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/varinha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel135Layout = new javax.swing.GroupLayout(jPanel135);
        jPanel135.setLayout(jPanel135Layout);
        jPanel135Layout.setHorizontalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel135Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel135Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel178)
                .addGap(25, 25, 25))
        );
        jPanel135Layout.setVerticalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel135Layout.createSequentialGroup()
                .addComponent(jLabel178)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel137.setBackground(new java.awt.Color(8, 77, 110));
        jPanel137.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel138.setBackground(new java.awt.Color(8, 77, 110));
        jPanel138.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel179.setBackground(new java.awt.Color(0, 0, 0));
        jLabel179.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(255, 255, 255));
        jLabel179.setText("Água Salgada");

        javax.swing.GroupLayout jPanel138Layout = new javax.swing.GroupLayout(jPanel138);
        jPanel138.setLayout(jPanel138Layout);
        jPanel138Layout.setHorizontalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel138Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel179)
                .addGap(44, 44, 44))
        );
        jPanel138Layout.setVerticalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel138Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel179)
                .addGap(28, 28, 28))
        );

        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/aguaSalgada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel137Layout = new javax.swing.GroupLayout(jPanel137);
        jPanel137.setLayout(jPanel137Layout);
        jPanel137Layout.setHorizontalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel137Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel137Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel180)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel137Layout.setVerticalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel137Layout.createSequentialGroup()
                .addComponent(jLabel180)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel139.setBackground(new java.awt.Color(8, 77, 110));
        jPanel139.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel140.setBackground(new java.awt.Color(8, 77, 110));
        jPanel140.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel181.setBackground(new java.awt.Color(0, 0, 0));
        jLabel181.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setText("Pena");

        javax.swing.GroupLayout jPanel140Layout = new javax.swing.GroupLayout(jPanel140);
        jPanel140.setLayout(jPanel140Layout);
        jPanel140Layout.setHorizontalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel140Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel181)
                .addGap(76, 76, 76))
        );
        jPanel140Layout.setVerticalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel140Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel181)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/penaaa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel139Layout = new javax.swing.GroupLayout(jPanel139);
        jPanel139.setLayout(jPanel139Layout);
        jPanel139Layout.setHorizontalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel139Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel139Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel182)
                .addGap(27, 27, 27))
        );
        jPanel139Layout.setVerticalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel139Layout.createSequentialGroup()
                .addComponent(jLabel182)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel141.setBackground(new java.awt.Color(8, 77, 110));
        jPanel141.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel142.setBackground(new java.awt.Color(8, 77, 110));
        jPanel142.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel183.setBackground(new java.awt.Color(0, 0, 0));
        jLabel183.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setText("Pergaminho");

        javax.swing.GroupLayout jPanel142Layout = new javax.swing.GroupLayout(jPanel142);
        jPanel142.setLayout(jPanel142Layout);
        jPanel142Layout.setHorizontalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel142Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel183)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel142Layout.setVerticalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel142Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel183)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel184.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/pergaminho.png"))); // NOI18N

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel141Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel141Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel184)
                .addGap(26, 26, 26))
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel141Layout.createSequentialGroup()
                .addComponent(jLabel184)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel185.setBackground(new java.awt.Color(0, 0, 0));
        jLabel185.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel185.setText("Total: 50 Gringotts");

        jLabel186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        jButton15.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        jButton15.setText("Voltar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        jButton16.setText("Fechar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel130Layout = new javax.swing.GroupLayout(jPanel130);
        jPanel130.setLayout(jPanel130Layout);
        jPanel130Layout.setHorizontalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel130Layout.createSequentialGroup()
                .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel130Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel130Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel130Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(comprar9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton16))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel130Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(13, 13, 13)
                                    .addComponent(jPanel141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel130Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel130Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel185)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel186)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel130Layout.setVerticalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel130Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel137, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel131, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel139, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel135, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(824, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel130);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1497, Short.MAX_VALUE)
        );

        jScrollPane4.setViewportView(jPanel2);

        jPanel195.setBackground(new java.awt.Color(255, 255, 255));
        jPanel195.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel195.setForeground(new java.awt.Color(255, 255, 255));

        jPanel196.setBackground(new java.awt.Color(8, 77, 110));
        jPanel196.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel259.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/defesa_contra_arte_das_trevas.png"))); // NOI18N

        jPanel197.setBackground(new java.awt.Color(8, 77, 110));
        jPanel197.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel260.setBackground(new java.awt.Color(0, 0, 0));
        jLabel260.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel260.setForeground(new java.awt.Color(255, 255, 255));
        jLabel260.setText("Defesa Contra as Artes");

        jLabel261.setBackground(new java.awt.Color(0, 0, 0));
        jLabel261.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel261.setForeground(new java.awt.Color(255, 255, 255));
        jLabel261.setText("das Trevas: Um Retorno");

        jLabel262.setBackground(new java.awt.Color(0, 0, 0));
        jLabel262.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel262.setForeground(new java.awt.Color(255, 255, 255));
        jLabel262.setText("aos Princípios Básicos");

        javax.swing.GroupLayout jPanel197Layout = new javax.swing.GroupLayout(jPanel197);
        jPanel197.setLayout(jPanel197Layout);
        jPanel197Layout.setHorizontalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel197Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel260)
                    .addComponent(jLabel262))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel197Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel261)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel197Layout.setVerticalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel197Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel260)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel261, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel262)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel196Layout = new javax.swing.GroupLayout(jPanel196);
        jPanel196.setLayout(jPanel196Layout);
        jPanel196Layout.setHorizontalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel196Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel196Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel259)
                .addGap(27, 27, 27))
        );
        jPanel196Layout.setVerticalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel196Layout.createSequentialGroup()
                .addComponent(jLabel259)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel197, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel263.setBackground(new java.awt.Color(102, 102, 102));
        jLabel263.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel263.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel263.setText("ASTRONOMIA");
        jLabel263.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprar14.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprar14.setText("COMPRAR");
        comprar14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar14ActionPerformed(evt);
            }
        });

        jPanel198.setBackground(new java.awt.Color(8, 77, 110));
        jPanel198.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel199.setBackground(new java.awt.Color(8, 77, 110));
        jPanel199.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel264.setBackground(new java.awt.Color(0, 0, 0));
        jLabel264.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(255, 255, 255));
        jLabel264.setText("se Alimentam de Carne");

        jLabel265.setBackground(new java.awt.Color(0, 0, 0));
        jLabel265.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel265.setForeground(new java.awt.Color(255, 255, 255));
        jLabel265.setText("Árvores do Mundo que");

        javax.swing.GroupLayout jPanel199Layout = new javax.swing.GroupLayout(jPanel199);
        jPanel199.setLayout(jPanel199Layout);
        jPanel199Layout.setHorizontalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel199Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel265)
                    .addComponent(jLabel264))
                .addGap(11, 11, 11))
        );
        jPanel199Layout.setVerticalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel199Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel265)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel264)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel266.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/arvores_do_mundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel198Layout = new javax.swing.GroupLayout(jPanel198);
        jPanel198.setLayout(jPanel198Layout);
        jPanel198Layout.setHorizontalGroup(
            jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel198Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel198Layout.createSequentialGroup()
                        .addComponent(jPanel199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel198Layout.createSequentialGroup()
                        .addComponent(jLabel266)
                        .addGap(24, 24, 24))))
        );
        jPanel198Layout.setVerticalGroup(
            jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel198Layout.createSequentialGroup()
                .addComponent(jLabel266)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel199, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel200.setBackground(new java.awt.Color(8, 77, 110));
        jPanel200.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel201.setBackground(new java.awt.Color(8, 77, 110));
        jPanel201.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel267.setBackground(new java.awt.Color(0, 0, 0));
        jLabel267.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel267.setForeground(new java.awt.Color(255, 255, 255));
        jLabel267.setText("Varinha");

        javax.swing.GroupLayout jPanel201Layout = new javax.swing.GroupLayout(jPanel201);
        jPanel201.setLayout(jPanel201Layout);
        jPanel201Layout.setHorizontalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel201Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel267)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel201Layout.setVerticalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel201Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel267)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel268.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/varinha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel200Layout = new javax.swing.GroupLayout(jPanel200);
        jPanel200.setLayout(jPanel200Layout);
        jPanel200Layout.setHorizontalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel200Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel200Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel268)
                .addGap(25, 25, 25))
        );
        jPanel200Layout.setVerticalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel200Layout.createSequentialGroup()
                .addComponent(jLabel268)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel201, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel202.setBackground(new java.awt.Color(8, 77, 110));
        jPanel202.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel203.setBackground(new java.awt.Color(8, 77, 110));
        jPanel203.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel269.setBackground(new java.awt.Color(0, 0, 0));
        jLabel269.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel269.setForeground(new java.awt.Color(255, 255, 255));
        jLabel269.setText("Água Salgada");

        javax.swing.GroupLayout jPanel203Layout = new javax.swing.GroupLayout(jPanel203);
        jPanel203.setLayout(jPanel203Layout);
        jPanel203Layout.setHorizontalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel203Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel269)
                .addGap(44, 44, 44))
        );
        jPanel203Layout.setVerticalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel203Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel269)
                .addGap(28, 28, 28))
        );

        jLabel270.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/aguaSalgada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel202Layout = new javax.swing.GroupLayout(jPanel202);
        jPanel202.setLayout(jPanel202Layout);
        jPanel202Layout.setHorizontalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel202Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel202Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel270)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel202Layout.setVerticalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel202Layout.createSequentialGroup()
                .addComponent(jLabel270)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel203, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel204.setBackground(new java.awt.Color(8, 77, 110));
        jPanel204.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel205.setBackground(new java.awt.Color(8, 77, 110));
        jPanel205.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel271.setBackground(new java.awt.Color(0, 0, 0));
        jLabel271.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel271.setForeground(new java.awt.Color(255, 255, 255));
        jLabel271.setText("Pena");

        javax.swing.GroupLayout jPanel205Layout = new javax.swing.GroupLayout(jPanel205);
        jPanel205.setLayout(jPanel205Layout);
        jPanel205Layout.setHorizontalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel205Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel271)
                .addGap(76, 76, 76))
        );
        jPanel205Layout.setVerticalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel205Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel271)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel272.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/penaaa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel204Layout = new javax.swing.GroupLayout(jPanel204);
        jPanel204.setLayout(jPanel204Layout);
        jPanel204Layout.setHorizontalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel204Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel204Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel272)
                .addGap(27, 27, 27))
        );
        jPanel204Layout.setVerticalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel204Layout.createSequentialGroup()
                .addComponent(jLabel272)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel205, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel206.setBackground(new java.awt.Color(8, 77, 110));
        jPanel206.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel207.setBackground(new java.awt.Color(8, 77, 110));
        jPanel207.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel273.setBackground(new java.awt.Color(0, 0, 0));
        jLabel273.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel273.setForeground(new java.awt.Color(255, 255, 255));
        jLabel273.setText("Pergaminho");

        javax.swing.GroupLayout jPanel207Layout = new javax.swing.GroupLayout(jPanel207);
        jPanel207.setLayout(jPanel207Layout);
        jPanel207Layout.setHorizontalGroup(
            jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel207Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel273)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel207Layout.setVerticalGroup(
            jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel207Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel273)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel274.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/pergaminho.png"))); // NOI18N

        javax.swing.GroupLayout jPanel206Layout = new javax.swing.GroupLayout(jPanel206);
        jPanel206.setLayout(jPanel206Layout);
        jPanel206Layout.setHorizontalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel206Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel207, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel206Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel274)
                .addGap(26, 26, 26))
        );
        jPanel206Layout.setVerticalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel206Layout.createSequentialGroup()
                .addComponent(jLabel274)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel207, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel275.setBackground(new java.awt.Color(0, 0, 0));
        jLabel275.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel275.setText("Total: 50 Gringotts");

        jLabel276.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        jButton25.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        jButton25.setText("Voltar");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        jButton26.setText("Fechar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel195Layout = new javax.swing.GroupLayout(jPanel195);
        jPanel195.setLayout(jPanel195Layout);
        jPanel195Layout.setHorizontalGroup(
            jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel195Layout.createSequentialGroup()
                .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel195Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel198, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel195Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel196, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel202, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel195Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(comprar14, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton26))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel195Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel204, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(13, 13, 13)
                                    .addComponent(jPanel206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel195Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel263, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel195Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel275)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel276)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel195Layout.setVerticalGroup(
            jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel195Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel263, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel196, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel204, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel200, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel206, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel276, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel275, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(824, Short.MAX_VALUE))
        );

        jScrollPane11.setViewportView(jPanel195);

        jScrollPane7.setViewportView(jScrollPane9);

        jScrollPane8.setViewportView(jScrollPane10);

        jPanel182.setBackground(new java.awt.Color(255, 255, 255));
        jPanel182.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel182.setForeground(new java.awt.Color(255, 255, 255));

        jPanel183.setBackground(new java.awt.Color(8, 77, 110));
        jPanel183.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/defesa_contra_arte_das_trevas.png"))); // NOI18N

        jPanel184.setBackground(new java.awt.Color(8, 77, 110));
        jPanel184.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel242.setBackground(new java.awt.Color(0, 0, 0));
        jLabel242.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel242.setForeground(new java.awt.Color(255, 255, 255));
        jLabel242.setText("Defesa Contra as Artes");

        jLabel243.setBackground(new java.awt.Color(0, 0, 0));
        jLabel243.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel243.setText("das Trevas: Um Retorno");

        jLabel244.setBackground(new java.awt.Color(0, 0, 0));
        jLabel244.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel244.setForeground(new java.awt.Color(255, 255, 255));
        jLabel244.setText("aos Princípios Básicos");

        javax.swing.GroupLayout jPanel184Layout = new javax.swing.GroupLayout(jPanel184);
        jPanel184.setLayout(jPanel184Layout);
        jPanel184Layout.setHorizontalGroup(
            jPanel184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel184Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel242)
                    .addComponent(jLabel244))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel184Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel243)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel184Layout.setVerticalGroup(
            jPanel184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel184Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel242)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel243, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel244)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel183Layout = new javax.swing.GroupLayout(jPanel183);
        jPanel183.setLayout(jPanel183Layout);
        jPanel183Layout.setHorizontalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel183Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel184, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel183Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel241)
                .addGap(27, 27, 27))
        );
        jPanel183Layout.setVerticalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel183Layout.createSequentialGroup()
                .addComponent(jLabel241)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel184, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel245.setBackground(new java.awt.Color(102, 102, 102));
        jLabel245.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel245.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel245.setText("ASTRONOMIA");
        jLabel245.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprar13.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprar13.setText("COMPRAR");
        comprar13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprar13ActionPerformed(evt);
            }
        });

        jPanel185.setBackground(new java.awt.Color(8, 77, 110));
        jPanel185.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel186.setBackground(new java.awt.Color(8, 77, 110));
        jPanel186.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel246.setBackground(new java.awt.Color(0, 0, 0));
        jLabel246.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel246.setForeground(new java.awt.Color(255, 255, 255));
        jLabel246.setText("se Alimentam de Carne");

        jLabel247.setBackground(new java.awt.Color(0, 0, 0));
        jLabel247.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel247.setForeground(new java.awt.Color(255, 255, 255));
        jLabel247.setText("Árvores do Mundo que");

        javax.swing.GroupLayout jPanel186Layout = new javax.swing.GroupLayout(jPanel186);
        jPanel186.setLayout(jPanel186Layout);
        jPanel186Layout.setHorizontalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel186Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel247)
                    .addComponent(jLabel246))
                .addGap(11, 11, 11))
        );
        jPanel186Layout.setVerticalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel186Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel247)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel246)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel248.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/arvores_do_mundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel185Layout = new javax.swing.GroupLayout(jPanel185);
        jPanel185.setLayout(jPanel185Layout);
        jPanel185Layout.setHorizontalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel185Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel185Layout.createSequentialGroup()
                        .addComponent(jPanel186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel185Layout.createSequentialGroup()
                        .addComponent(jLabel248)
                        .addGap(24, 24, 24))))
        );
        jPanel185Layout.setVerticalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel185Layout.createSequentialGroup()
                .addComponent(jLabel248)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel186, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel187.setBackground(new java.awt.Color(8, 77, 110));
        jPanel187.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel188.setBackground(new java.awt.Color(8, 77, 110));
        jPanel188.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel249.setBackground(new java.awt.Color(0, 0, 0));
        jLabel249.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel249.setForeground(new java.awt.Color(255, 255, 255));
        jLabel249.setText("Varinha");

        javax.swing.GroupLayout jPanel188Layout = new javax.swing.GroupLayout(jPanel188);
        jPanel188.setLayout(jPanel188Layout);
        jPanel188Layout.setHorizontalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel188Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel249)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel188Layout.setVerticalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel188Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel249)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel250.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/varinha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel187Layout = new javax.swing.GroupLayout(jPanel187);
        jPanel187.setLayout(jPanel187Layout);
        jPanel187Layout.setHorizontalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel187Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel187Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel250)
                .addGap(25, 25, 25))
        );
        jPanel187Layout.setVerticalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel187Layout.createSequentialGroup()
                .addComponent(jLabel250)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel188, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel189.setBackground(new java.awt.Color(8, 77, 110));
        jPanel189.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel190.setBackground(new java.awt.Color(8, 77, 110));
        jPanel190.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel251.setBackground(new java.awt.Color(0, 0, 0));
        jLabel251.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel251.setForeground(new java.awt.Color(255, 255, 255));
        jLabel251.setText("Água Salgada");

        javax.swing.GroupLayout jPanel190Layout = new javax.swing.GroupLayout(jPanel190);
        jPanel190.setLayout(jPanel190Layout);
        jPanel190Layout.setHorizontalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel190Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel251)
                .addGap(44, 44, 44))
        );
        jPanel190Layout.setVerticalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel190Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel251)
                .addGap(28, 28, 28))
        );

        jLabel252.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/aguaSalgada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel189Layout = new javax.swing.GroupLayout(jPanel189);
        jPanel189.setLayout(jPanel189Layout);
        jPanel189Layout.setHorizontalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel189Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel190, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel189Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel252)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel189Layout.setVerticalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel189Layout.createSequentialGroup()
                .addComponent(jLabel252)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel190, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel191.setBackground(new java.awt.Color(8, 77, 110));
        jPanel191.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel192.setBackground(new java.awt.Color(8, 77, 110));
        jPanel192.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel253.setBackground(new java.awt.Color(0, 0, 0));
        jLabel253.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel253.setForeground(new java.awt.Color(255, 255, 255));
        jLabel253.setText("Pena");

        javax.swing.GroupLayout jPanel192Layout = new javax.swing.GroupLayout(jPanel192);
        jPanel192.setLayout(jPanel192Layout);
        jPanel192Layout.setHorizontalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel192Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel253)
                .addGap(76, 76, 76))
        );
        jPanel192Layout.setVerticalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel192Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel253)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel254.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/penaaa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel191Layout = new javax.swing.GroupLayout(jPanel191);
        jPanel191.setLayout(jPanel191Layout);
        jPanel191Layout.setHorizontalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel191Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel192, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel191Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel254)
                .addGap(27, 27, 27))
        );
        jPanel191Layout.setVerticalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel191Layout.createSequentialGroup()
                .addComponent(jLabel254)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel192, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel193.setBackground(new java.awt.Color(8, 77, 110));
        jPanel193.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel194.setBackground(new java.awt.Color(8, 77, 110));
        jPanel194.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel255.setBackground(new java.awt.Color(0, 0, 0));
        jLabel255.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel255.setForeground(new java.awt.Color(255, 255, 255));
        jLabel255.setText("Pergaminho");

        javax.swing.GroupLayout jPanel194Layout = new javax.swing.GroupLayout(jPanel194);
        jPanel194.setLayout(jPanel194Layout);
        jPanel194Layout.setHorizontalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel194Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel255)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel194Layout.setVerticalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel194Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel255)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel256.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/pergaminho.png"))); // NOI18N

        javax.swing.GroupLayout jPanel193Layout = new javax.swing.GroupLayout(jPanel193);
        jPanel193.setLayout(jPanel193Layout);
        jPanel193Layout.setHorizontalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel193Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel194, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel193Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel256)
                .addGap(26, 26, 26))
        );
        jPanel193Layout.setVerticalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel193Layout.createSequentialGroup()
                .addComponent(jLabel256)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel194, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel257.setBackground(new java.awt.Color(0, 0, 0));
        jLabel257.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel257.setText("Total: 50 Gringotts");

        jLabel258.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        jButton23.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        jButton23.setText("Voltar");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        jButton24.setText("Fechar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel182Layout = new javax.swing.GroupLayout(jPanel182);
        jPanel182.setLayout(jPanel182Layout);
        jPanel182Layout.setHorizontalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel182Layout.createSequentialGroup()
                .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel182Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel185, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel187, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel182Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel183, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel189, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel182Layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(comprar13, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton24))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel182Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel191, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(13, 13, 13)
                                    .addComponent(jPanel193, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel182Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel182Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel257)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel258)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel182Layout.setVerticalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel182Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel245, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel189, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel185, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel183, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel191, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel187, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel193, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel258, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel257, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(824, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );

        jPanel4.setLayout(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 777, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1501, Short.MAX_VALUE)
        );

        jPanel161.setBackground(new java.awt.Color(255, 255, 255));
        jPanel161.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel161.setForeground(new java.awt.Color(255, 255, 255));

        jLabel307.setBackground(new java.awt.Color(102, 102, 102));
        jLabel307.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel307.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel307.setText("POÇÕES");
        jLabel307.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarPocoes1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarPocoes1.setText("COMPRAR");
        comprarPocoes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarPocoes1ActionPerformed(evt);
            }
        });

        sair9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair9.setText("Voltar");
        sair9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair9ActionPerformed(evt);
            }
        });

        fechar9.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar9.setText("Fechar");
        fechar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel161Layout = new javax.swing.GroupLayout(jPanel161);
        jPanel161.setLayout(jPanel161Layout);
        jPanel161Layout.setHorizontalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel161Layout.createSequentialGroup()
                .addGroup(jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel161Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sair9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(comprarPocoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(fechar9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel161Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel307, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel161Layout.setVerticalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel161Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel307, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(588, 588, 588)
                .addGroup(jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarPocoes1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane19.setViewportView(jPanel161);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jTabbedPane1.setBackground(new java.awt.Color(153, 102, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N

        jPanel143.setBackground(new java.awt.Color(255, 255, 255));
        jPanel143.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel143.setForeground(new java.awt.Color(255, 255, 255));

        jPanel144.setBackground(new java.awt.Color(8, 77, 110));
        jPanel144.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel187.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/defesa_contra_arte_das_trevas.png"))); // NOI18N

        jPanel145.setBackground(new java.awt.Color(8, 77, 110));
        jPanel145.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel188.setBackground(new java.awt.Color(0, 0, 0));
        jLabel188.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setText("Defesa Contra as Artes");

        jLabel189.setBackground(new java.awt.Color(0, 0, 0));
        jLabel189.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setText("das Trevas: Um Retorno");

        jLabel190.setBackground(new java.awt.Color(0, 0, 0));
        jLabel190.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(255, 255, 255));
        jLabel190.setText("aos Princípios Básicos");

        javax.swing.GroupLayout jPanel145Layout = new javax.swing.GroupLayout(jPanel145);
        jPanel145.setLayout(jPanel145Layout);
        jPanel145Layout.setHorizontalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel145Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel188)
                    .addComponent(jLabel190))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel145Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel189)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel145Layout.setVerticalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel145Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel188)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel190)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel144Layout = new javax.swing.GroupLayout(jPanel144);
        jPanel144.setLayout(jPanel144Layout);
        jPanel144Layout.setHorizontalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel144Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel144Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel187)
                .addGap(27, 27, 27))
        );
        jPanel144Layout.setVerticalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel144Layout.createSequentialGroup()
                .addComponent(jLabel187)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel191.setBackground(new java.awt.Color(102, 102, 102));
        jLabel191.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel191.setText("PACOTE BÁSICO PARA AS AULAS");
        jLabel191.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarPacoteBasico.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarPacoteBasico.setText("COMPRAR");
        comprarPacoteBasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarPacoteBasicoActionPerformed(evt);
            }
        });

        jPanel146.setBackground(new java.awt.Color(8, 77, 110));
        jPanel146.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel147.setBackground(new java.awt.Color(8, 77, 110));
        jPanel147.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel192.setBackground(new java.awt.Color(0, 0, 0));
        jLabel192.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel192.setText("se Alimentam de Carne");

        jLabel193.setBackground(new java.awt.Color(0, 0, 0));
        jLabel193.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setText("Árvores do Mundo que");

        javax.swing.GroupLayout jPanel147Layout = new javax.swing.GroupLayout(jPanel147);
        jPanel147.setLayout(jPanel147Layout);
        jPanel147Layout.setHorizontalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel147Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel193)
                    .addComponent(jLabel192))
                .addGap(11, 11, 11))
        );
        jPanel147Layout.setVerticalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel147Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel193)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel192)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel194.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/arvores_do_mundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel146Layout = new javax.swing.GroupLayout(jPanel146);
        jPanel146.setLayout(jPanel146Layout);
        jPanel146Layout.setHorizontalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel146Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel146Layout.createSequentialGroup()
                        .addComponent(jPanel147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel146Layout.createSequentialGroup()
                        .addComponent(jLabel194)
                        .addGap(24, 24, 24))))
        );
        jPanel146Layout.setVerticalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel146Layout.createSequentialGroup()
                .addComponent(jLabel194)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel148.setBackground(new java.awt.Color(8, 77, 110));
        jPanel148.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel149.setBackground(new java.awt.Color(8, 77, 110));
        jPanel149.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel195.setBackground(new java.awt.Color(0, 0, 0));
        jLabel195.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setText("Varinha");

        javax.swing.GroupLayout jPanel149Layout = new javax.swing.GroupLayout(jPanel149);
        jPanel149.setLayout(jPanel149Layout);
        jPanel149Layout.setHorizontalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel149Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel195)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel149Layout.setVerticalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel149Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel195)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/varinha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel148Layout = new javax.swing.GroupLayout(jPanel148);
        jPanel148.setLayout(jPanel148Layout);
        jPanel148Layout.setHorizontalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel148Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel148Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel196)
                .addGap(25, 25, 25))
        );
        jPanel148Layout.setVerticalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel148Layout.createSequentialGroup()
                .addComponent(jLabel196)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel150.setBackground(new java.awt.Color(8, 77, 110));
        jPanel150.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel151.setBackground(new java.awt.Color(8, 77, 110));
        jPanel151.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel197.setBackground(new java.awt.Color(0, 0, 0));
        jLabel197.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setText("Água Salgada");

        javax.swing.GroupLayout jPanel151Layout = new javax.swing.GroupLayout(jPanel151);
        jPanel151.setLayout(jPanel151Layout);
        jPanel151Layout.setHorizontalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel151Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel197)
                .addGap(44, 44, 44))
        );
        jPanel151Layout.setVerticalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel151Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel197)
                .addGap(28, 28, 28))
        );

        jLabel198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/aguaSalgada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel150Layout = new javax.swing.GroupLayout(jPanel150);
        jPanel150.setLayout(jPanel150Layout);
        jPanel150Layout.setHorizontalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel150Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel151, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel150Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel198)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel150Layout.setVerticalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel150Layout.createSequentialGroup()
                .addComponent(jLabel198)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel152.setBackground(new java.awt.Color(8, 77, 110));
        jPanel152.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel153.setBackground(new java.awt.Color(8, 77, 110));
        jPanel153.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel199.setBackground(new java.awt.Color(0, 0, 0));
        jLabel199.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setText("Pena");

        javax.swing.GroupLayout jPanel153Layout = new javax.swing.GroupLayout(jPanel153);
        jPanel153.setLayout(jPanel153Layout);
        jPanel153Layout.setHorizontalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel153Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel199)
                .addGap(76, 76, 76))
        );
        jPanel153Layout.setVerticalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel153Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel199)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/penaaa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel152Layout = new javax.swing.GroupLayout(jPanel152);
        jPanel152.setLayout(jPanel152Layout);
        jPanel152Layout.setHorizontalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel152Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel152Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel200)
                .addGap(27, 27, 27))
        );
        jPanel152Layout.setVerticalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel152Layout.createSequentialGroup()
                .addComponent(jLabel200)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel154.setBackground(new java.awt.Color(8, 77, 110));
        jPanel154.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel155.setBackground(new java.awt.Color(8, 77, 110));
        jPanel155.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel201.setBackground(new java.awt.Color(0, 0, 0));
        jLabel201.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(255, 255, 255));
        jLabel201.setText("Pergaminho");

        javax.swing.GroupLayout jPanel155Layout = new javax.swing.GroupLayout(jPanel155);
        jPanel155.setLayout(jPanel155Layout);
        jPanel155Layout.setHorizontalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel155Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel201)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel155Layout.setVerticalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel155Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel201)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/pergaminho.png"))); // NOI18N

        javax.swing.GroupLayout jPanel154Layout = new javax.swing.GroupLayout(jPanel154);
        jPanel154.setLayout(jPanel154Layout);
        jPanel154Layout.setHorizontalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel154Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel154Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel202)
                .addGap(26, 26, 26))
        );
        jPanel154Layout.setVerticalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel154Layout.createSequentialGroup()
                .addComponent(jLabel202)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel203.setBackground(new java.awt.Color(0, 0, 0));
        jLabel203.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel203.setText("Total: 60 Gringotts");

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair1.setText("Voltar");
        sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair1ActionPerformed(evt);
            }
        });

        fechar.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel143Layout = new javax.swing.GroupLayout(jPanel143);
        jPanel143.setLayout(jPanel143Layout);
        jPanel143Layout.setHorizontalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel143Layout.createSequentialGroup()
                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel143Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel143Layout.createSequentialGroup()
                                .addComponent(sair1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel143Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel143Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(comprarPacoteBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel143Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel143Layout.createSequentialGroup()
                                        .addComponent(jPanel152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel143Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel143Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel203)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel204)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel143Layout.setVerticalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel143Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel144, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel152, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel148, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarPacoteBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel143);

        jTabbedPane1.addTab("Pacote Básico", jScrollPane3);

        jPanel217.setBackground(new java.awt.Color(255, 255, 255));
        jPanel217.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel217.setForeground(new java.awt.Color(255, 255, 255));

        jPanel218.setBackground(new java.awt.Color(8, 77, 110));
        jPanel218.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel298.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transfiguracao/Guia de Transfiguração para Iniciantes.png"))); // NOI18N

        jPanel219.setBackground(new java.awt.Color(8, 77, 110));
        jPanel219.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel303.setBackground(new java.awt.Color(0, 0, 0));
        jLabel303.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel303.setForeground(new java.awt.Color(255, 255, 255));
        jLabel303.setText("Guia de Transfiguração");

        jLabel300.setBackground(new java.awt.Color(0, 0, 0));
        jLabel300.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel300.setForeground(new java.awt.Color(255, 255, 255));
        jLabel300.setText("para Iniciantes");

        javax.swing.GroupLayout jPanel219Layout = new javax.swing.GroupLayout(jPanel219);
        jPanel219.setLayout(jPanel219Layout);
        jPanel219Layout.setHorizontalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel219Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel219Layout.createSequentialGroup()
                        .addComponent(jLabel303)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel219Layout.createSequentialGroup()
                        .addComponent(jLabel300)
                        .addGap(37, 37, 37))))
        );
        jPanel219Layout.setVerticalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel219Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel303)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel300, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel218Layout = new javax.swing.GroupLayout(jPanel218);
        jPanel218.setLayout(jPanel218Layout);
        jPanel218Layout.setHorizontalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel218Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel219, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel218Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel298)
                .addGap(27, 27, 27))
        );
        jPanel218Layout.setVerticalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel218Layout.createSequentialGroup()
                .addComponent(jLabel298)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel219, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel302.setBackground(new java.awt.Color(102, 102, 102));
        jLabel302.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel302.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel302.setText("TRANSFIGURAÇÃO");
        jLabel302.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarPacoteBasico1.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarPacoteBasico1.setText("COMPRAR");
        comprarPacoteBasico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarPacoteBasico1ActionPerformed(evt);
            }
        });

        jPanel224.setBackground(new java.awt.Color(8, 77, 110));
        jPanel224.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel225.setBackground(new java.awt.Color(8, 77, 110));
        jPanel225.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel304.setBackground(new java.awt.Color(0, 0, 0));
        jLabel304.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel304.setForeground(new java.awt.Color(255, 255, 255));
        jLabel304.setText("Transfiguração para o");

        jLabel308.setBackground(new java.awt.Color(0, 0, 0));
        jLabel308.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel308.setForeground(new java.awt.Color(255, 255, 255));
        jLabel308.setText("Curso Médio");

        javax.swing.GroupLayout jPanel225Layout = new javax.swing.GroupLayout(jPanel225);
        jPanel225.setLayout(jPanel225Layout);
        jPanel225Layout.setHorizontalGroup(
            jPanel225Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel225Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel304)
                .addGap(14, 14, 14))
            .addGroup(jPanel225Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel308)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel225Layout.setVerticalGroup(
            jPanel225Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel225Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel304)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel308)
                .addGap(11, 11, 11))
        );

        jLabel309.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transfiguracao/Transfiguração para o Curso Médio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel224Layout = new javax.swing.GroupLayout(jPanel224);
        jPanel224.setLayout(jPanel224Layout);
        jPanel224Layout.setHorizontalGroup(
            jPanel224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel224Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel225, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel224Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel309)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel224Layout.setVerticalGroup(
            jPanel224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel224Layout.createSequentialGroup()
                .addComponent(jLabel309)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel225, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel350.setBackground(new java.awt.Color(0, 0, 0));
        jLabel350.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel350.setText("Total: 20 Gringotts");

        jLabel351.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair2.setText("Voltar");
        sair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair2ActionPerformed(evt);
            }
        });

        fechar8.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar8.setText("Fechar");
        fechar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel217Layout = new javax.swing.GroupLayout(jPanel217);
        jPanel217.setLayout(jPanel217Layout);
        jPanel217Layout.setHorizontalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel217Layout.createSequentialGroup()
                .addGroup(jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel217Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(comprarPacoteBasico1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(fechar8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel217Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sair2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel217Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel217Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel350)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel351))
                    .addGroup(jPanel217Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jPanel218, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel224, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel217Layout.setVerticalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel217Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel302, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addGroup(jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel224, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel218, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148)
                .addGroup(jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel351, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel350, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarPacoteBasico1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane12.setViewportView(jPanel217);

        jTabbedPane1.addTab("Transfiguração", jScrollPane12);

        jPanel162.setBackground(new java.awt.Color(255, 255, 255));
        jPanel162.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel162.setForeground(new java.awt.Color(255, 255, 255));

        jPanel163.setBackground(new java.awt.Color(8, 77, 110));
        jPanel163.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DefesaContraArtesdasTrevas/As Forças das Trevas - Um Guia de Autoproteção.png"))); // NOI18N

        jPanel164.setBackground(new java.awt.Color(8, 77, 110));
        jPanel164.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel207.setBackground(new java.awt.Color(0, 0, 0));
        jLabel207.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setText("As Forças das Trevas:");

        jLabel208.setBackground(new java.awt.Color(0, 0, 0));
        jLabel208.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setText("um Guia de Autoproteção");

        javax.swing.GroupLayout jPanel164Layout = new javax.swing.GroupLayout(jPanel164);
        jPanel164.setLayout(jPanel164Layout);
        jPanel164Layout.setHorizontalGroup(
            jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel164Layout.createSequentialGroup()
                .addGroup(jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel164Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel208))
                    .addGroup(jPanel164Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel207)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel164Layout.setVerticalGroup(
            jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel164Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel207)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel163Layout = new javax.swing.GroupLayout(jPanel163);
        jPanel163.setLayout(jPanel163Layout);
        jPanel163Layout.setHorizontalGroup(
            jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel163Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel163Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel206)
                .addGap(27, 27, 27))
        );
        jPanel163Layout.setVerticalGroup(
            jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel163Layout.createSequentialGroup()
                .addComponent(jLabel206)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel164, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel214.setBackground(new java.awt.Color(102, 102, 102));
        jLabel214.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel214.setText("DEFESA CONTRA AS ARTES DAS TREVAS");
        jLabel214.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarDefesa.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarDefesa.setText("COMPRAR");
        comprarDefesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarDefesaActionPerformed(evt);
            }
        });

        jPanel165.setBackground(new java.awt.Color(8, 77, 110));
        jPanel165.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel166.setBackground(new java.awt.Color(8, 77, 110));
        jPanel166.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel216.setBackground(new java.awt.Color(0, 0, 0));
        jLabel216.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setText("Um Ano com o");

        jLabel279.setBackground(new java.awt.Color(0, 0, 0));
        jLabel279.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel279.setForeground(new java.awt.Color(255, 255, 255));
        jLabel279.setText("Iéti ");

        javax.swing.GroupLayout jPanel166Layout = new javax.swing.GroupLayout(jPanel166);
        jPanel166.setLayout(jPanel166Layout);
        jPanel166Layout.setHorizontalGroup(
            jPanel166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel166Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel216)
                .addGap(45, 45, 45))
            .addGroup(jPanel166Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel279)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel166Layout.setVerticalGroup(
            jPanel166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel166Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel216)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel279)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel217.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DefesaContraArtesdasTrevas/Um Ano com o Iéti.png"))); // NOI18N

        javax.swing.GroupLayout jPanel165Layout = new javax.swing.GroupLayout(jPanel165);
        jPanel165.setLayout(jPanel165Layout);
        jPanel165Layout.setHorizontalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel165Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel165Layout.createSequentialGroup()
                        .addComponent(jPanel166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel165Layout.createSequentialGroup()
                        .addComponent(jLabel217)
                        .addGap(24, 24, 24))))
        );
        jPanel165Layout.setVerticalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel165Layout.createSequentialGroup()
                .addComponent(jLabel217)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel166, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel167.setBackground(new java.awt.Color(8, 77, 110));
        jPanel167.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel168.setBackground(new java.awt.Color(8, 77, 110));
        jPanel168.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel218.setBackground(new java.awt.Color(0, 0, 0));
        jLabel218.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setText("Como se Divertir com");

        jLabel299.setBackground(new java.awt.Color(0, 0, 0));
        jLabel299.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel299.setForeground(new java.awt.Color(255, 255, 255));
        jLabel299.setText("Vampiros");

        javax.swing.GroupLayout jPanel168Layout = new javax.swing.GroupLayout(jPanel168);
        jPanel168.setLayout(jPanel168Layout);
        jPanel168Layout.setHorizontalGroup(
            jPanel168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel168Layout.createSequentialGroup()
                .addGroup(jPanel168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel168Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel218))
                    .addGroup(jPanel168Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel299)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel168Layout.setVerticalGroup(
            jPanel168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel168Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel218, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel299)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel219.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/varinha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel167Layout = new javax.swing.GroupLayout(jPanel167);
        jPanel167.setLayout(jPanel167Layout);
        jPanel167Layout.setHorizontalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel167Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel167Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel219)
                .addGap(25, 25, 25))
        );
        jPanel167Layout.setVerticalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel167Layout.createSequentialGroup()
                .addComponent(jLabel219)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel168, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel266.setBackground(new java.awt.Color(8, 77, 110));
        jPanel266.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel267.setBackground(new java.awt.Color(8, 77, 110));
        jPanel267.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel361.setBackground(new java.awt.Color(0, 0, 0));
        jLabel361.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel361.setForeground(new java.awt.Color(255, 255, 255));
        jLabel361.setText("Defesa Contra a Arte");

        jLabel359.setBackground(new java.awt.Color(0, 0, 0));
        jLabel359.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel359.setForeground(new java.awt.Color(255, 255, 255));
        jLabel359.setText("das Trevas");

        javax.swing.GroupLayout jPanel267Layout = new javax.swing.GroupLayout(jPanel267);
        jPanel267.setLayout(jPanel267Layout);
        jPanel267Layout.setHorizontalGroup(
            jPanel267Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel267Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel267Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel267Layout.createSequentialGroup()
                        .addComponent(jLabel361)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel267Layout.createSequentialGroup()
                        .addComponent(jLabel359)
                        .addGap(57, 57, 57))))
        );
        jPanel267Layout.setVerticalGroup(
            jPanel267Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel267Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel361)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel359)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DefesaContraArtesdasTrevas/Defesa_Contra_as_Artes_das_Trevas-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel266Layout = new javax.swing.GroupLayout(jPanel266);
        jPanel266.setLayout(jPanel266Layout);
        jPanel266Layout.setHorizontalGroup(
            jPanel266Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel266Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel267, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel266Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel360)
                .addGap(27, 27, 27))
        );
        jPanel266Layout.setVerticalGroup(
            jPanel266Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel266Layout.createSequentialGroup()
                .addComponent(jLabel360)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel267, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel268.setBackground(new java.awt.Color(8, 77, 110));
        jPanel268.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel269.setBackground(new java.awt.Color(8, 77, 110));
        jPanel269.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel220.setBackground(new java.awt.Color(0, 0, 0));
        jLabel220.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setText("Como Dominar um");

        jLabel280.setBackground(new java.awt.Color(0, 0, 0));
        jLabel280.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(255, 255, 255));
        jLabel280.setText("Espírito Agourento");

        javax.swing.GroupLayout jPanel269Layout = new javax.swing.GroupLayout(jPanel269);
        jPanel269.setLayout(jPanel269Layout);
        jPanel269Layout.setHorizontalGroup(
            jPanel269Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel269Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel269Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel280)
                    .addComponent(jLabel220))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel269Layout.setVerticalGroup(
            jPanel269Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel269Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel220)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel280)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel362.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DefesaContraArtesdasTrevas/Como Dominar um Espírito Agourento.png"))); // NOI18N

        javax.swing.GroupLayout jPanel268Layout = new javax.swing.GroupLayout(jPanel268);
        jPanel268.setLayout(jPanel268Layout);
        jPanel268Layout.setHorizontalGroup(
            jPanel268Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel268Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel269, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel268Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel362)
                .addGap(26, 26, 26))
        );
        jPanel268Layout.setVerticalGroup(
            jPanel268Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel268Layout.createSequentialGroup()
                .addComponent(jLabel362)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel269, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel363.setBackground(new java.awt.Color(0, 0, 0));
        jLabel363.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel363.setText("Total: 100 Gringotts");

        jLabel364.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair3.setText("voltar");
        sair3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair3ActionPerformed(evt);
            }
        });

        fechar2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar2.setText("Fechar");
        fechar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar2ActionPerformed(evt);
            }
        });

        jPanel282.setBackground(new java.awt.Color(8, 77, 110));
        jPanel282.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel283.setBackground(new java.awt.Color(8, 77, 110));
        jPanel283.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel379.setBackground(new java.awt.Color(0, 0, 0));
        jLabel379.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel379.setForeground(new java.awt.Color(255, 255, 255));
        jLabel379.setText("Excursões com Vampiros");

        javax.swing.GroupLayout jPanel283Layout = new javax.swing.GroupLayout(jPanel283);
        jPanel283.setLayout(jPanel283Layout);
        jPanel283Layout.setHorizontalGroup(
            jPanel283Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel283Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel379)
                .addContainerGap())
        );
        jPanel283Layout.setVerticalGroup(
            jPanel283Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel283Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel379)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel380.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DefesaContraArtesdasTrevas/Excursões com Vampiros.png"))); // NOI18N

        javax.swing.GroupLayout jPanel282Layout = new javax.swing.GroupLayout(jPanel282);
        jPanel282.setLayout(jPanel282Layout);
        jPanel282Layout.setHorizontalGroup(
            jPanel282Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel282Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel283, javax.swing.GroupLayout.PREFERRED_SIZE, 199, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel282Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel380)
                .addGap(26, 26, 26))
        );
        jPanel282Layout.setVerticalGroup(
            jPanel282Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel282Layout.createSequentialGroup()
                .addComponent(jLabel380)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel283, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel162Layout = new javax.swing.GroupLayout(jPanel162);
        jPanel162.setLayout(jPanel162Layout);
        jPanel162Layout.setHorizontalGroup(
            jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel162Layout.createSequentialGroup()
                .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel162Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel165, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel167, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel162Layout.createSequentialGroup()
                                .addComponent(sair3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel162Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel162Layout.createSequentialGroup()
                                        .addComponent(jPanel266, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel282, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel162Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel163, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel268, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel162Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(comprarDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(fechar2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel162Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel162Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel363)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel364)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel162Layout.setVerticalGroup(
            jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel162Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel165, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel163, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel268, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel266, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel167, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel282, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel364, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel363, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane13.setViewportView(jPanel162);

        jTabbedPane1.addTab("D.C.A.T.", jScrollPane13);

        jPanel169.setBackground(new java.awt.Color(255, 255, 255));
        jPanel169.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel169.setForeground(new java.awt.Color(255, 255, 255));

        jPanel170.setBackground(new java.awt.Color(8, 77, 110));
        jPanel170.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel221.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Feitiços/Livro Padrão de Feitiços por Miranda Goshawk.png"))); // NOI18N

        jPanel171.setBackground(new java.awt.Color(8, 77, 110));
        jPanel171.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel222.setBackground(new java.awt.Color(0, 0, 0));
        jLabel222.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setText("Livro Padrão de Feitiços");

        jLabel223.setBackground(new java.awt.Color(0, 0, 0));
        jLabel223.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel223.setText("por Miranda Goshawk");

        javax.swing.GroupLayout jPanel171Layout = new javax.swing.GroupLayout(jPanel171);
        jPanel171.setLayout(jPanel171Layout);
        jPanel171Layout.setHorizontalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel171Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel222)
                    .addGroup(jPanel171Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel223)))
                .addContainerGap())
        );
        jPanel171Layout.setVerticalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel171Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel222)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel223, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel170Layout = new javax.swing.GroupLayout(jPanel170);
        jPanel170.setLayout(jPanel170Layout);
        jPanel170Layout.setHorizontalGroup(
            jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel170Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel170Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel221)
                .addGap(27, 27, 27))
        );
        jPanel170Layout.setVerticalGroup(
            jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel170Layout.createSequentialGroup()
                .addComponent(jLabel221)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel171, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel225.setBackground(new java.awt.Color(102, 102, 102));
        jLabel225.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel225.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel225.setText("FEITIÇOS");
        jLabel225.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarFeiticos.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarFeiticos.setText("COMPRAR");
        comprarFeiticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarFeiticosActionPerformed(evt);
            }
        });

        jPanel172.setBackground(new java.awt.Color(8, 77, 110));
        jPanel172.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel173.setBackground(new java.awt.Color(8, 77, 110));
        jPanel173.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel227.setBackground(new java.awt.Color(0, 0, 0));
        jLabel227.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel227.setForeground(new java.awt.Color(255, 255, 255));
        jLabel227.setText("Feitos nos");

        jLabel226.setBackground(new java.awt.Color(0, 0, 0));
        jLabel226.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel226.setForeground(new java.awt.Color(255, 255, 255));
        jLabel226.setText("Feitiços");

        javax.swing.GroupLayout jPanel173Layout = new javax.swing.GroupLayout(jPanel173);
        jPanel173.setLayout(jPanel173Layout);
        jPanel173Layout.setHorizontalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel173Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel173Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel226))
                    .addComponent(jLabel227))
                .addGap(59, 59, 59))
        );
        jPanel173Layout.setVerticalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel173Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel227)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel226)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel228.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Feitiços/Feitos nos Feitiços.png"))); // NOI18N

        javax.swing.GroupLayout jPanel172Layout = new javax.swing.GroupLayout(jPanel172);
        jPanel172.setLayout(jPanel172Layout);
        jPanel172Layout.setHorizontalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel172Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel172Layout.createSequentialGroup()
                        .addComponent(jPanel173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel172Layout.createSequentialGroup()
                        .addComponent(jLabel228)
                        .addGap(24, 24, 24))))
        );
        jPanel172Layout.setVerticalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel172Layout.createSequentialGroup()
                .addComponent(jLabel228)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel173, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel270.setBackground(new java.awt.Color(8, 77, 110));
        jPanel270.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel271.setBackground(new java.awt.Color(8, 77, 110));
        jPanel271.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel301.setBackground(new java.awt.Color(0, 0, 0));
        jLabel301.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel301.setForeground(new java.awt.Color(255, 255, 255));
        jLabel301.setText("Quintessence -");

        jLabel231.setBackground(new java.awt.Color(0, 0, 0));
        jLabel231.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel231.setForeground(new java.awt.Color(255, 255, 255));
        jLabel231.setText("A Busca");

        javax.swing.GroupLayout jPanel271Layout = new javax.swing.GroupLayout(jPanel271);
        jPanel271.setLayout(jPanel271Layout);
        jPanel271Layout.setHorizontalGroup(
            jPanel271Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel271Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel301)
                .addGap(42, 42, 42))
            .addGroup(jPanel271Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel231)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel271Layout.setVerticalGroup(
            jPanel271Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel271Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel301)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel231)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel365.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Feitiços/Quintessence - A Busca.png"))); // NOI18N

        javax.swing.GroupLayout jPanel270Layout = new javax.swing.GroupLayout(jPanel270);
        jPanel270.setLayout(jPanel270Layout);
        jPanel270Layout.setHorizontalGroup(
            jPanel270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel270Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel271, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel270Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel365)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel270Layout.setVerticalGroup(
            jPanel270Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel270Layout.createSequentialGroup()
                .addComponent(jLabel365)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel271, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel370.setBackground(new java.awt.Color(0, 0, 0));
        jLabel370.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel370.setText("Total: 30 Gringotts");

        jLabel371.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair4.setText("Voltar");
        sair4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair4ActionPerformed(evt);
            }
        });

        fechar3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar3.setText("Fechar");
        fechar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel169Layout = new javax.swing.GroupLayout(jPanel169);
        jPanel169.setLayout(jPanel169Layout);
        jPanel169Layout.setHorizontalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel169Layout.createSequentialGroup()
                .addGroup(jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel169Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sair4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel169Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(comprarFeiticos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(fechar3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel169Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel169Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel225, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel169Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel370)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel371))
                    .addGroup(jPanel169Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel172, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel170, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel270, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel169Layout.setVerticalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel169Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel225, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addGroup(jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel270, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel170, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142)
                .addGroup(jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel371, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel370, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarFeiticos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane14.setViewportView(jPanel169);

        jTabbedPane1.addTab("Feitiços", jScrollPane14);

        jPanel176.setBackground(new java.awt.Color(255, 255, 255));
        jPanel176.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel176.setForeground(new java.awt.Color(255, 255, 255));

        jLabel236.setBackground(new java.awt.Color(102, 102, 102));
        jLabel236.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel236.setText("HISTÓRIA DA MAGIA");
        jLabel236.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarHistoria.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarHistoria.setText("COMPRAR");
        comprarHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarHistoriaActionPerformed(evt);
            }
        });

        jPanel179.setBackground(new java.awt.Color(8, 77, 110));
        jPanel179.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel180.setBackground(new java.awt.Color(8, 77, 110));
        jPanel180.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel238.setBackground(new java.awt.Color(0, 0, 0));
        jLabel238.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel238.setForeground(new java.awt.Color(255, 255, 255));
        jLabel238.setText("Uma História da Magia");

        javax.swing.GroupLayout jPanel180Layout = new javax.swing.GroupLayout(jPanel180);
        jPanel180.setLayout(jPanel180Layout);
        jPanel180Layout.setHorizontalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel180Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel238)
                .addContainerGap())
        );
        jPanel180Layout.setVerticalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel180Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel238)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel239.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HistoriadaMagia/Uma História da Magia.png"))); // NOI18N

        javax.swing.GroupLayout jPanel179Layout = new javax.swing.GroupLayout(jPanel179);
        jPanel179.setLayout(jPanel179Layout);
        jPanel179Layout.setHorizontalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel179Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel179Layout.createSequentialGroup()
                        .addComponent(jPanel180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel179Layout.createSequentialGroup()
                        .addComponent(jLabel239)
                        .addGap(24, 24, 24))))
        );
        jPanel179Layout.setVerticalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel179Layout.createSequentialGroup()
                .addComponent(jLabel239)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel180, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        historiamagialabel.setBackground(new java.awt.Color(0, 0, 0));
        historiamagialabel.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        historiamagialabel.setText("Total: 50 Gringotts");

        jLabel378.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair5.setText("Voltar");
        sair5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair5ActionPerformed(evt);
            }
        });

        fechar4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar4.setText("Fechar");
        fechar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel176Layout = new javax.swing.GroupLayout(jPanel176);
        jPanel176.setLayout(jPanel176Layout);
        jPanel176Layout.setHorizontalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel176Layout.createSequentialGroup()
                .addGroup(jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel176Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sair5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addGroup(jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel176Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(comprarHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(fechar4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel176Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel179, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel176Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel176Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(historiamagialabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel378)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel176Layout.setVerticalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel176Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel236, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jPanel179, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addGroup(jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel378, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historiamagialabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane15.setViewportView(jPanel176);

        jTabbedPane1.addTab("História da Magia", jScrollPane15);

        jPanel234.setBackground(new java.awt.Color(255, 255, 255));
        jPanel234.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel234.setForeground(new java.awt.Color(255, 255, 255));

        jPanel235.setBackground(new java.awt.Color(8, 77, 110));
        jPanel235.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel313.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Herbologia/Luvas de couro de Dragão.png"))); // NOI18N

        jPanel236.setBackground(new java.awt.Color(8, 77, 110));
        jPanel236.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel314.setBackground(new java.awt.Color(0, 0, 0));
        jLabel314.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel314.setForeground(new java.awt.Color(255, 255, 255));
        jLabel314.setText("Luvas de Couro de");

        jLabel315.setBackground(new java.awt.Color(0, 0, 0));
        jLabel315.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel315.setForeground(new java.awt.Color(255, 255, 255));
        jLabel315.setText("Dragão");

        javax.swing.GroupLayout jPanel236Layout = new javax.swing.GroupLayout(jPanel236);
        jPanel236.setLayout(jPanel236Layout);
        jPanel236Layout.setHorizontalGroup(
            jPanel236Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel236Layout.createSequentialGroup()
                .addGroup(jPanel236Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel236Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel314))
                    .addGroup(jPanel236Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel315)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel236Layout.setVerticalGroup(
            jPanel236Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel236Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel314)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel315, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel235Layout = new javax.swing.GroupLayout(jPanel235);
        jPanel235.setLayout(jPanel235Layout);
        jPanel235Layout.setHorizontalGroup(
            jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel235Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel236, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel235Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel313)
                .addGap(27, 27, 27))
        );
        jPanel235Layout.setVerticalGroup(
            jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel235Layout.createSequentialGroup()
                .addComponent(jLabel313)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel236, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel317.setBackground(new java.awt.Color(102, 102, 102));
        jLabel317.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel317.setText("HERBOLOGIA");
        jLabel317.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarHerbologia.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarHerbologia.setText("COMPRAR");
        comprarHerbologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarHerbologiaActionPerformed(evt);
            }
        });

        jPanel237.setBackground(new java.awt.Color(8, 77, 110));
        jPanel237.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel238.setBackground(new java.awt.Color(8, 77, 110));
        jPanel238.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel319.setBackground(new java.awt.Color(0, 0, 0));
        jLabel319.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel319.setForeground(new java.awt.Color(255, 255, 255));
        jLabel319.setText("Abafador");

        javax.swing.GroupLayout jPanel238Layout = new javax.swing.GroupLayout(jPanel238);
        jPanel238.setLayout(jPanel238Layout);
        jPanel238Layout.setHorizontalGroup(
            jPanel238Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel238Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel319)
                .addGap(62, 62, 62))
        );
        jPanel238Layout.setVerticalGroup(
            jPanel238Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel238Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel319)
                .addGap(27, 27, 27))
        );

        jLabel320.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Herbologia/Abafador.png"))); // NOI18N

        javax.swing.GroupLayout jPanel237Layout = new javax.swing.GroupLayout(jPanel237);
        jPanel237.setLayout(jPanel237Layout);
        jPanel237Layout.setHorizontalGroup(
            jPanel237Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel237Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel237Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel237Layout.createSequentialGroup()
                        .addComponent(jPanel238, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel237Layout.createSequentialGroup()
                        .addComponent(jLabel320)
                        .addGap(24, 24, 24))))
        );
        jPanel237Layout.setVerticalGroup(
            jPanel237Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel237Layout.createSequentialGroup()
                .addComponent(jLabel320)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel238, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel241.setBackground(new java.awt.Color(8, 77, 110));
        jPanel241.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel242.setBackground(new java.awt.Color(8, 77, 110));
        jPanel242.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel316.setBackground(new java.awt.Color(0, 0, 0));
        jLabel316.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel316.setForeground(new java.awt.Color(255, 255, 255));
        jLabel316.setText("Mil Ervas e Fungos");

        jLabel318.setBackground(new java.awt.Color(0, 0, 0));
        jLabel318.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel318.setForeground(new java.awt.Color(255, 255, 255));
        jLabel318.setText("Mágicos");

        javax.swing.GroupLayout jPanel242Layout = new javax.swing.GroupLayout(jPanel242);
        jPanel242.setLayout(jPanel242Layout);
        jPanel242Layout.setHorizontalGroup(
            jPanel242Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel242Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel242Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel316)
                    .addGroup(jPanel242Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel318)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel242Layout.setVerticalGroup(
            jPanel242Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel242Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel316)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel318, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel324.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Herbologia/Mil Ervas e Fungos Mágicos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel241Layout = new javax.swing.GroupLayout(jPanel241);
        jPanel241.setLayout(jPanel241Layout);
        jPanel241Layout.setHorizontalGroup(
            jPanel241Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel241Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel242, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel241Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel324)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel241Layout.setVerticalGroup(
            jPanel241Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel241Layout.createSequentialGroup()
                .addComponent(jLabel324)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel242, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel329.setBackground(new java.awt.Color(0, 0, 0));
        jLabel329.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel329.setText("Total: 50 Gringotts");

        jLabel330.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair6.setText("Voltar");
        sair6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair6ActionPerformed(evt);
            }
        });

        fechar5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar5.setText("Fechar");
        fechar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar5ActionPerformed(evt);
            }
        });

        jPanel174.setBackground(new java.awt.Color(8, 77, 110));
        jPanel174.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel175.setBackground(new java.awt.Color(8, 77, 110));
        jPanel175.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel205.setBackground(new java.awt.Color(0, 0, 0));
        jLabel205.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(255, 255, 255));
        jLabel205.setText("se Alimentam de Carne");

        jLabel209.setBackground(new java.awt.Color(0, 0, 0));
        jLabel209.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel209.setText("Árvores do Mundo que");

        javax.swing.GroupLayout jPanel175Layout = new javax.swing.GroupLayout(jPanel175);
        jPanel175.setLayout(jPanel175Layout);
        jPanel175Layout.setHorizontalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel175Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel209)
                    .addComponent(jLabel205))
                .addGap(11, 11, 11))
        );
        jPanel175Layout.setVerticalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel175Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel209)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel205)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/arvores_do_mundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel174Layout = new javax.swing.GroupLayout(jPanel174);
        jPanel174.setLayout(jPanel174Layout);
        jPanel174Layout.setHorizontalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel174Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel174Layout.createSequentialGroup()
                        .addComponent(jPanel175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel174Layout.createSequentialGroup()
                        .addComponent(jLabel210)
                        .addGap(24, 24, 24))))
        );
        jPanel174Layout.setVerticalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel174Layout.createSequentialGroup()
                .addComponent(jLabel210)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel175, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel234Layout = new javax.swing.GroupLayout(jPanel234);
        jPanel234.setLayout(jPanel234Layout);
        jPanel234Layout.setHorizontalGroup(
            jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel234Layout.createSequentialGroup()
                .addGroup(jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel234Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel237, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel234Layout.createSequentialGroup()
                                .addComponent(sair6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel234Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel235, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel241, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel234Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(comprarHerbologia, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechar5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel234Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel234Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jPanel174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel234Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel317, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel234Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel329)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel330)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel234Layout.setVerticalGroup(
            jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel234Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel317, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel241, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel237, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel235, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel174, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel330, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel329, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarHerbologia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane16.setViewportView(jPanel234);

        jTabbedPane1.addTab("Herbologia", jScrollPane16);

        jPanel247.setBackground(new java.awt.Color(255, 255, 255));
        jPanel247.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel247.setForeground(new java.awt.Color(255, 255, 255));

        jPanel248.setBackground(new java.awt.Color(8, 77, 110));
        jPanel248.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel331.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Astronomia/telescopio.png"))); // NOI18N

        jPanel249.setBackground(new java.awt.Color(8, 77, 110));
        jPanel249.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel341.setBackground(new java.awt.Color(0, 0, 0));
        jLabel341.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel341.setForeground(new java.awt.Color(255, 255, 255));
        jLabel341.setText("Telescópio");

        javax.swing.GroupLayout jPanel249Layout = new javax.swing.GroupLayout(jPanel249);
        jPanel249.setLayout(jPanel249Layout);
        jPanel249Layout.setHorizontalGroup(
            jPanel249Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel249Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel341)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel249Layout.setVerticalGroup(
            jPanel249Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel249Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel341)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel248Layout = new javax.swing.GroupLayout(jPanel248);
        jPanel248.setLayout(jPanel248Layout);
        jPanel248Layout.setHorizontalGroup(
            jPanel248Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel248Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel249, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel248Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel331)
                .addGap(27, 27, 27))
        );
        jPanel248Layout.setVerticalGroup(
            jPanel248Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel248Layout.createSequentialGroup()
                .addComponent(jLabel331)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel249, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel335.setBackground(new java.awt.Color(102, 102, 102));
        jLabel335.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel335.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel335.setText("ASTRONOMIA");
        jLabel335.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarAstronomia.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarAstronomia.setText("COMPRAR");
        comprarAstronomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarAstronomiaActionPerformed(evt);
            }
        });

        jPanel250.setBackground(new java.awt.Color(8, 77, 110));
        jPanel250.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel251.setBackground(new java.awt.Color(8, 77, 110));
        jPanel251.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel337.setBackground(new java.awt.Color(0, 0, 0));
        jLabel337.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel337.setForeground(new java.awt.Color(255, 255, 255));
        jLabel337.setText("Mapa Estelar");

        javax.swing.GroupLayout jPanel251Layout = new javax.swing.GroupLayout(jPanel251);
        jPanel251.setLayout(jPanel251Layout);
        jPanel251Layout.setHorizontalGroup(
            jPanel251Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel251Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel337)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel251Layout.setVerticalGroup(
            jPanel251Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel251Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel337)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel338.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Astronomia/mapa estelar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel250Layout = new javax.swing.GroupLayout(jPanel250);
        jPanel250.setLayout(jPanel250Layout);
        jPanel250Layout.setHorizontalGroup(
            jPanel250Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel250Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel250Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel250Layout.createSequentialGroup()
                        .addComponent(jPanel251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel250Layout.createSequentialGroup()
                        .addComponent(jLabel338)
                        .addGap(24, 24, 24))))
        );
        jPanel250Layout.setVerticalGroup(
            jPanel250Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel250Layout.createSequentialGroup()
                .addComponent(jLabel338)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel251, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel347.setBackground(new java.awt.Color(0, 0, 0));
        jLabel347.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel347.setText("Total: 50 Gringotts");

        jLabel348.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair7.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair7.setText("Voltar");
        sair7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair7ActionPerformed(evt);
            }
        });

        fechar6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar6.setText("Fechar");
        fechar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel247Layout = new javax.swing.GroupLayout(jPanel247);
        jPanel247.setLayout(jPanel247Layout);
        jPanel247Layout.setHorizontalGroup(
            jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel247Layout.createSequentialGroup()
                .addGroup(jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel247Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(sair7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel247Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(comprarAstronomia, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(fechar6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel247Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel247Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel335, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel247Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel347)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel348))
                    .addGroup(jPanel247Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jPanel250, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel248, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel247Layout.setVerticalGroup(
            jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel247Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel335, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addGroup(jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel250, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel248, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148)
                .addGroup(jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel348, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel347, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarAstronomia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane17.setViewportView(jPanel247);

        jTabbedPane1.addTab("Astronomia", jScrollPane17);

        jPanel156.setBackground(new java.awt.Color(255, 255, 255));
        jPanel156.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel156.setForeground(new java.awt.Color(255, 255, 255));

        jPanel157.setBackground(new java.awt.Color(8, 77, 110));
        jPanel157.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/defesa_contra_arte_das_trevas.png"))); // NOI18N

        jPanel158.setBackground(new java.awt.Color(8, 77, 110));
        jPanel158.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel281.setBackground(new java.awt.Color(0, 0, 0));
        jLabel281.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(255, 255, 255));
        jLabel281.setText("Defesa Contra as Artes");

        jLabel282.setBackground(new java.awt.Color(0, 0, 0));
        jLabel282.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel282.setForeground(new java.awt.Color(255, 255, 255));
        jLabel282.setText("das Trevas: Um Retorno");

        jLabel283.setBackground(new java.awt.Color(0, 0, 0));
        jLabel283.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel283.setForeground(new java.awt.Color(255, 255, 255));
        jLabel283.setText("aos Princípios Básicos");

        javax.swing.GroupLayout jPanel158Layout = new javax.swing.GroupLayout(jPanel158);
        jPanel158.setLayout(jPanel158Layout);
        jPanel158Layout.setHorizontalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel158Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel281)
                    .addComponent(jLabel283))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel158Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel282)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel158Layout.setVerticalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel158Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel281)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel282, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel283)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel157Layout = new javax.swing.GroupLayout(jPanel157);
        jPanel157.setLayout(jPanel157Layout);
        jPanel157Layout.setHorizontalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel157Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel157Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel215)
                .addGap(27, 27, 27))
        );
        jPanel157Layout.setVerticalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel157Layout.createSequentialGroup()
                .addComponent(jLabel215)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel158, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel284.setBackground(new java.awt.Color(102, 102, 102));
        jLabel284.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel284.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel284.setText("POÇÕES");
        jLabel284.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        comprarPocoes.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        comprarPocoes.setText("COMPRAR");
        comprarPocoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarPocoesActionPerformed(evt);
            }
        });

        jPanel159.setBackground(new java.awt.Color(8, 77, 110));
        jPanel159.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel160.setBackground(new java.awt.Color(8, 77, 110));
        jPanel160.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel285.setBackground(new java.awt.Color(0, 0, 0));
        jLabel285.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel285.setForeground(new java.awt.Color(255, 255, 255));
        jLabel285.setText("se Alimentam de Carne");

        jLabel286.setBackground(new java.awt.Color(0, 0, 0));
        jLabel286.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel286.setForeground(new java.awt.Color(255, 255, 255));
        jLabel286.setText("Árvores do Mundo que");

        javax.swing.GroupLayout jPanel160Layout = new javax.swing.GroupLayout(jPanel160);
        jPanel160.setLayout(jPanel160Layout);
        jPanel160Layout.setHorizontalGroup(
            jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel160Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel286)
                    .addComponent(jLabel285))
                .addGap(11, 11, 11))
        );
        jPanel160Layout.setVerticalGroup(
            jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel160Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel286)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel285)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel287.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/arvores_do_mundo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel159Layout = new javax.swing.GroupLayout(jPanel159);
        jPanel159.setLayout(jPanel159Layout);
        jPanel159Layout.setHorizontalGroup(
            jPanel159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel159Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel159Layout.createSequentialGroup()
                        .addComponent(jPanel160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel159Layout.createSequentialGroup()
                        .addComponent(jLabel287)
                        .addGap(24, 24, 24))))
        );
        jPanel159Layout.setVerticalGroup(
            jPanel159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel159Layout.createSequentialGroup()
                .addComponent(jLabel287)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel160, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel209.setBackground(new java.awt.Color(8, 77, 110));
        jPanel209.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel210.setBackground(new java.awt.Color(8, 77, 110));
        jPanel210.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel288.setBackground(new java.awt.Color(0, 0, 0));
        jLabel288.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel288.setForeground(new java.awt.Color(255, 255, 255));
        jLabel288.setText("Varinha");

        javax.swing.GroupLayout jPanel210Layout = new javax.swing.GroupLayout(jPanel210);
        jPanel210.setLayout(jPanel210Layout);
        jPanel210Layout.setHorizontalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel210Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel288)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel210Layout.setVerticalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel210Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel288)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel289.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/varinha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel209Layout = new javax.swing.GroupLayout(jPanel209);
        jPanel209.setLayout(jPanel209Layout);
        jPanel209Layout.setHorizontalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel209Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel209Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel289)
                .addGap(25, 25, 25))
        );
        jPanel209Layout.setVerticalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel209Layout.createSequentialGroup()
                .addComponent(jLabel289)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel210, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel211.setBackground(new java.awt.Color(8, 77, 110));
        jPanel211.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel212.setBackground(new java.awt.Color(8, 77, 110));
        jPanel212.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel290.setBackground(new java.awt.Color(0, 0, 0));
        jLabel290.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel290.setForeground(new java.awt.Color(255, 255, 255));
        jLabel290.setText("Água Salgada");

        javax.swing.GroupLayout jPanel212Layout = new javax.swing.GroupLayout(jPanel212);
        jPanel212.setLayout(jPanel212Layout);
        jPanel212Layout.setHorizontalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel212Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel290)
                .addGap(44, 44, 44))
        );
        jPanel212Layout.setVerticalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel212Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel290)
                .addGap(28, 28, 28))
        );

        jLabel291.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/aguaSalgada.png"))); // NOI18N

        javax.swing.GroupLayout jPanel211Layout = new javax.swing.GroupLayout(jPanel211);
        jPanel211.setLayout(jPanel211Layout);
        jPanel211Layout.setHorizontalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel211Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel211Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel291)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel211Layout.setVerticalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel211Layout.createSequentialGroup()
                .addComponent(jLabel291)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel212, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel213.setBackground(new java.awt.Color(8, 77, 110));
        jPanel213.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel214.setBackground(new java.awt.Color(8, 77, 110));
        jPanel214.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel292.setBackground(new java.awt.Color(0, 0, 0));
        jLabel292.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel292.setForeground(new java.awt.Color(255, 255, 255));
        jLabel292.setText("Pena");

        javax.swing.GroupLayout jPanel214Layout = new javax.swing.GroupLayout(jPanel214);
        jPanel214.setLayout(jPanel214Layout);
        jPanel214Layout.setHorizontalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel214Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel292)
                .addGap(76, 76, 76))
        );
        jPanel214Layout.setVerticalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel214Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel292)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel293.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/penaaa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel213Layout = new javax.swing.GroupLayout(jPanel213);
        jPanel213.setLayout(jPanel213Layout);
        jPanel213Layout.setHorizontalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel213Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel213Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel293)
                .addGap(27, 27, 27))
        );
        jPanel213Layout.setVerticalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel213Layout.createSequentialGroup()
                .addComponent(jLabel293)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel214, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel215.setBackground(new java.awt.Color(8, 77, 110));
        jPanel215.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel216.setBackground(new java.awt.Color(8, 77, 110));
        jPanel216.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel294.setBackground(new java.awt.Color(0, 0, 0));
        jLabel294.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setText("Pergaminho");

        javax.swing.GroupLayout jPanel216Layout = new javax.swing.GroupLayout(jPanel216);
        jPanel216.setLayout(jPanel216Layout);
        jPanel216Layout.setHorizontalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel216Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel294)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel216Layout.setVerticalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel216Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel294)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel295.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pacote Básico/pergaminho.png"))); // NOI18N

        javax.swing.GroupLayout jPanel215Layout = new javax.swing.GroupLayout(jPanel215);
        jPanel215.setLayout(jPanel215Layout);
        jPanel215Layout.setHorizontalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel215Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel216, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel215Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel295)
                .addGap(26, 26, 26))
        );
        jPanel215Layout.setVerticalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel215Layout.createSequentialGroup()
                .addComponent(jLabel295)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel216, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel296.setBackground(new java.awt.Color(0, 0, 0));
        jLabel296.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        jLabel296.setText("Total: 50 Gringotts");

        jLabel297.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gringotts-removebg-preview.png"))); // NOI18N

        sair8.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        sair8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back-button.png"))); // NOI18N
        sair8.setText("Voltar");
        sair8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair8ActionPerformed(evt);
            }
        });

        fechar7.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        fechar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x-mark.png"))); // NOI18N
        fechar7.setText("Fechar");
        fechar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel156Layout = new javax.swing.GroupLayout(jPanel156);
        jPanel156.setLayout(jPanel156Layout);
        jPanel156Layout.setHorizontalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel156Layout.createSequentialGroup()
                .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel156Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel159, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel209, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel156Layout.createSequentialGroup()
                                .addComponent(sair8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)))
                        .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel156Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel157, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel211, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel156Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(comprarPocoes, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(fechar7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel156Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel156Layout.createSequentialGroup()
                                        .addComponent(jPanel213, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel215, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel156Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel156Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel296)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel297)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel156Layout.setVerticalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel156Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel211, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel159, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel157, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel213, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel209, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel215, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel297, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel296, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarPocoes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(825, Short.MAX_VALUE))
        );

        jScrollPane18.setViewportView(jPanel156);

        jTabbedPane1.addTab("Poções", jScrollPane18);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comprar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprar2ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void comprar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprar9ActionPerformed

    private void comprar13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprar13ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void comprar14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprar14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprar14ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void fechar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar7ActionPerformed
        new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fechar7ActionPerformed

    private void sair8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair8ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair8ActionPerformed

    private void comprarPocoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarPocoesActionPerformed
        selectPacote(8);
        Compra compra = new Compra();
        compra.setIdProduto("8");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarPocoesActionPerformed

    private void fechar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar6ActionPerformed
        new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fechar6ActionPerformed

    private void sair7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair7ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair7ActionPerformed

    private void comprarAstronomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarAstronomiaActionPerformed
        selectPacote(7);
        Compra compra = new Compra();
        compra.setIdProduto("7");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarAstronomiaActionPerformed

    private void fechar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fechar5ActionPerformed

    private void sair6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair6ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair6ActionPerformed

    private void comprarHerbologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarHerbologiaActionPerformed
        selectPacote(6);
        Compra compra = new Compra();
        compra.setIdProduto("6");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarHerbologiaActionPerformed

    private void fechar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar4ActionPerformed
       new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fechar4ActionPerformed

    private void sair5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair5ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair5ActionPerformed

    private void comprarHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarHistoriaActionPerformed
        selectPacote(5);
        Compra compra = new Compra();
        compra.setIdProduto("5");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarHistoriaActionPerformed

    private void fechar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar3ActionPerformed
        new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fechar3ActionPerformed

    private void sair4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair4ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair4ActionPerformed

    private void comprarFeiticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarFeiticosActionPerformed
        selectPacote(4);
        Compra compra = new Compra();
        compra.setIdProduto("4");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarFeiticosActionPerformed

    private void fechar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar2ActionPerformed
        new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fechar2ActionPerformed

    private void sair3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair3ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair3ActionPerformed

    private void comprarDefesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarDefesaActionPerformed
        selectPacote(3);
        Compra compra = new Compra();
        compra.setIdProduto("3");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarDefesaActionPerformed

    private void fechar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar8ActionPerformed
        // TODO add your handling code here:
        new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fechar8ActionPerformed

    private void sair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair2ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair2ActionPerformed

    private void comprarPacoteBasico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarPacoteBasico1ActionPerformed
        selectPacote(2);
        Compra compra = new Compra();
        compra.setIdProduto("2");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarPacoteBasico1ActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair1ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair1ActionPerformed

    private void comprarPacoteBasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarPacoteBasicoActionPerformed
        selectPacote(1);
        Compra compra = new Compra();
        compra.setIdProduto("1");
        compra.usuario.setUsername(usuario.getUsername());
        compra.setPrecoProduto(pacote.getPreco());
        compra.setNomeProduto(pacote.getPacote());
        compra.setVisible(true);
        dispose();
    }//GEN-LAST:event_comprarPacoteBasicoActionPerformed

    private void comprarPocoes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarPocoes1ActionPerformed

    }//GEN-LAST:event_comprarPocoes1ActionPerformed

    private void sair9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair9ActionPerformed
        escolherTela escolhertela = new escolherTela();
        escolhertela.setUser(usuario.getUsername());
        escolhertela.setVisible(true);
        dispose();
    }//GEN-LAST:event_sair9ActionPerformed

    private void fechar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar9ActionPerformed
        new tela_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_fechar9ActionPerformed

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
            java.util.logging.Logger.getLogger(pacotesDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pacotesDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pacotesDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pacotesDeAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pacotesDeAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comprar13;
    private javax.swing.JButton comprar14;
    private javax.swing.JButton comprar2;
    private javax.swing.JButton comprar9;
    private javax.swing.JButton comprarAstronomia;
    private javax.swing.JButton comprarDefesa;
    private javax.swing.JButton comprarFeiticos;
    private javax.swing.JButton comprarHerbologia;
    private javax.swing.JButton comprarHistoria;
    private javax.swing.JButton comprarPacoteBasico;
    private javax.swing.JButton comprarPacoteBasico1;
    private javax.swing.JButton comprarPocoes;
    private javax.swing.JButton comprarPocoes1;
    private javax.swing.JButton fechar;
    private javax.swing.JButton fechar2;
    private javax.swing.JButton fechar3;
    private javax.swing.JButton fechar4;
    private javax.swing.JButton fechar5;
    private javax.swing.JButton fechar6;
    private javax.swing.JButton fechar7;
    private javax.swing.JButton fechar8;
    private javax.swing.JButton fechar9;
    private javax.swing.JLabel historiamagialabel;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel299;
    private javax.swing.JLabel jLabel300;
    private javax.swing.JLabel jLabel301;
    private javax.swing.JLabel jLabel302;
    private javax.swing.JLabel jLabel303;
    private javax.swing.JLabel jLabel304;
    private javax.swing.JLabel jLabel307;
    private javax.swing.JLabel jLabel308;
    private javax.swing.JLabel jLabel309;
    private javax.swing.JLabel jLabel313;
    private javax.swing.JLabel jLabel314;
    private javax.swing.JLabel jLabel315;
    private javax.swing.JLabel jLabel316;
    private javax.swing.JLabel jLabel317;
    private javax.swing.JLabel jLabel318;
    private javax.swing.JLabel jLabel319;
    private javax.swing.JLabel jLabel320;
    private javax.swing.JLabel jLabel324;
    private javax.swing.JLabel jLabel329;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel331;
    private javax.swing.JLabel jLabel335;
    private javax.swing.JLabel jLabel337;
    private javax.swing.JLabel jLabel338;
    private javax.swing.JLabel jLabel341;
    private javax.swing.JLabel jLabel347;
    private javax.swing.JLabel jLabel348;
    private javax.swing.JLabel jLabel350;
    private javax.swing.JLabel jLabel351;
    private javax.swing.JLabel jLabel359;
    private javax.swing.JLabel jLabel360;
    private javax.swing.JLabel jLabel361;
    private javax.swing.JLabel jLabel362;
    private javax.swing.JLabel jLabel363;
    private javax.swing.JLabel jLabel364;
    private javax.swing.JLabel jLabel365;
    private javax.swing.JLabel jLabel370;
    private javax.swing.JLabel jLabel371;
    private javax.swing.JLabel jLabel377;
    private javax.swing.JLabel jLabel378;
    private javax.swing.JLabel jLabel379;
    private javax.swing.JLabel jLabel380;
    private javax.swing.JLabel jLabel381;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel224;
    private javax.swing.JPanel jPanel225;
    private javax.swing.JPanel jPanel234;
    private javax.swing.JPanel jPanel235;
    private javax.swing.JPanel jPanel236;
    private javax.swing.JPanel jPanel237;
    private javax.swing.JPanel jPanel238;
    private javax.swing.JPanel jPanel241;
    private javax.swing.JPanel jPanel242;
    private javax.swing.JPanel jPanel247;
    private javax.swing.JPanel jPanel248;
    private javax.swing.JPanel jPanel249;
    private javax.swing.JPanel jPanel250;
    private javax.swing.JPanel jPanel251;
    private javax.swing.JPanel jPanel266;
    private javax.swing.JPanel jPanel267;
    private javax.swing.JPanel jPanel268;
    private javax.swing.JPanel jPanel269;
    private javax.swing.JPanel jPanel270;
    private javax.swing.JPanel jPanel271;
    private javax.swing.JPanel jPanel282;
    private javax.swing.JPanel jPanel283;
    private javax.swing.JPanel jPanel284;
    private javax.swing.JPanel jPanel285;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton sair1;
    private javax.swing.JButton sair2;
    private javax.swing.JButton sair3;
    private javax.swing.JButton sair4;
    private javax.swing.JButton sair5;
    private javax.swing.JButton sair6;
    private javax.swing.JButton sair7;
    private javax.swing.JButton sair8;
    private javax.swing.JButton sair9;
    // End of variables declaration//GEN-END:variables
}
