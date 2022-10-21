package vendas;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tp_Vendedor extends javax.swing.JFrame {
public String nome;
public String matricula;
int prestoque;
int estoque;
int i =0;
Itens q = new Itens();
    public Tp_Vendedor() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nomecliente = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        cpfcliente = new javax.swing.JFormattedTextField();
        limpar2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Data = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ValorTotalP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ValorDes = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ValorPago = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TrocoV = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FormaPagar = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        codprod = new javax.swing.JTextField();
        nomeprod = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        quantidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaI = new javax.swing.JTable();
        Consultar = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        NomeV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Mtriv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela do Vendedor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 76, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Nome do Cliente :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, -1, -1));

        jLabel6.setText(" CPF :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 85, -1));
        jPanel2.add(nomecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 39, 190, -1));

        jButton5.setText("Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        try {
            cpfcliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(cpfcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 65, 260, -1));

        limpar2.setText("Limpar");
        limpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar2ActionPerformed(evt);
            }
        });
        jPanel2.add(limpar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 79, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Desconto");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 11, -1, -1));

        jPanel4.setBackground(new java.awt.Color(102, 76, 51));

        jLabel13.setText("Data:");

        Data.setEditable(false);
        Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataActionPerformed(evt);
            }
        });
        Data.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DataAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel15.setText("Valor Total:");

        ValorTotalP.setEditable(false);
        ValorTotalP.setText("0");
        ValorTotalP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValorTotalPMouseClicked(evt);
            }
        });

        jLabel16.setText("Valor Desconto:");

        ValorDes.setText("0");

        jLabel17.setText("Valor Pago:");

        ValorPago.setText("0");

        jLabel18.setText("Valor Troco:");

        TrocoV.setEditable(false);
        TrocoV.setText("0");
        TrocoV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrocoVMouseClicked(evt);
            }
        });

        jButton8.setText("Finalizar Venda");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Cancelar Venda");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Venda");

        jLabel20.setText("Forma de Pagamento:");

        FormaPagar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dinheiro", "Cartão", "Cheque" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4)
                        .addComponent(ValorTotalP, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(ValorDes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17)
                        .addGap(4, 4, 4)
                        .addComponent(ValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TrocoV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel20)
                        .addGap(4, 4, 4)
                        .addComponent(FormaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton8)
                        .addGap(113, 113, 113)
                        .addComponent(jButton9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel13))
                    .addComponent(Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValorTotalP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TrocoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(FormaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 125, 369, 450));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 0, 369, -1));

        jPanel3.setBackground(new java.awt.Color(102, 76, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Codigo - Nome do produto");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, 171, -1));

        codprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codprodActionPerformed(evt);
            }
        });
        jPanel3.add(codprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 68, -1));
        jPanel3.add(nomeprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 73, 145, -1));

        jLabel10.setText("Quantidade");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 113, -1, -1));

        quantidade.setText("1");
        jPanel3.add(quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 70, -1));

        jLabel11.setText("Valor Unitário");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 113, -1, -1));

        valor.setEditable(false);
        jPanel3.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 134, 140, -1));

        jButton6.setText("Adicionar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 133, 80, -1));

        jButton7.setText("Limpar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 72, 79, -1));

        TabelaI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaI.getTableHeader().setResizingAllowed(false);
        TabelaI.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TabelaI);
        if (TabelaI.getColumnModel().getColumnCount() > 0) {
            TabelaI.getColumnModel().getColumn(0).setMinWidth(50);
            TabelaI.getColumnModel().getColumn(0).setMaxWidth(60);
            TabelaI.getColumnModel().getColumn(1).setResizable(false);
            TabelaI.getColumnModel().getColumn(2).setResizable(false);
            TabelaI.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 162, 422, 412));

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });
        jPanel3.add(Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 72, -1, -1));

        jButton11.setText("Remover");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 133, 80, -1));

        NomeV.setEditable(false);
        NomeV.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                NomeVAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(NomeV, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 282, 14, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Carrinho");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 12, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 76, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 11, -1, -1));

        Mtriv.setEditable(false);
        Mtriv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MtrivActionPerformed(evt);
            }
        });
        Mtriv.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MtrivAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(Mtriv, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 282, 14, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 585));

        setSize(new java.awt.Dimension(840, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MtrivAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MtrivAncestorAdded
        Mtriv.setText(matricula);
    }//GEN-LAST:event_MtrivAncestorAdded

    private void MtrivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MtrivActionPerformed

    }//GEN-LAST:event_MtrivActionPerformed

    private void NomeVAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_NomeVAncestorAdded
        NomeV.setText(nome);
    }//GEN-LAST:event_NomeVAncestorAdded

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int cont = 0;
        int indice = TabelaI.getSelectedRow(); // mostra o valor da linha selecionada
        // conta quantas pessoas estão selecionadas na tabela obs; i = linha e 0 = coluna. obs: matriz
        for (int i = 0; i < TabelaI.getRowCount(); i++) { // percorre todas as linhas da tabela para verificar a existência de itens
            if (TabelaI.getValueAt(i, 0) != null) {// se houver algum valor na coluna 0 cont++
                cont++;
            }
        }

        if (cont > 0) {// se existe valores o contador será maior que zero
            if (indice != -1) {// se algum item estiver selecionado o valor sempre será maior que -1 já que o menor indice da matriz é zero  // pergunta ao excluir
                if (JOptionPane.showConfirmDialog(null, "Deseja excluir este item ?") == 0) {

                    for(int jj=0; jj<4; jj++){
                        q.MAT[indice][jj]="0";
                        q.MAT[indice][4]="0";
                        TabelaI.setValueAt(q.MAT[indice][jj] , indice , jj);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Deve selecionar um item para excluir.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não existem itens para remover.");
        }
        int ii=0;
        float totallist = 0;
        while(ii< q.cont){
            if(q.MAT[ii][4] == "R"){
            }else{
                String soma = (q.MAT[ii][3]);
                String des = ValorDes.getText();
                float val = Float.parseFloat(soma);
                float desc = Float.parseFloat(des);
                totallist += val;
                float calc = totallist*(desc/100);
                float calcf = totallist-calc;
                String valortota = String.valueOf(calcf);
                ValorTotalP.setText(valortota);
            }
            ii++;
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        String codp = codprod.getText();
        String nomep = nomeprod.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffe_", "root", "");
            Statement stmt = conn.createStatement();
            String query = "select * from produto where id_prod = '"+codp+"' or nome_prod = '"+nomep+"'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                codprod.setText("");
                nomeprod.setText("");

                codp = rs.getString("id_prod");
                nomep = rs.getString("nome_prod");
                String valorp = rs.getString("valor_prod");
                prestoque = rs.getInt("quantidade_prod");
                int reserva = rs.getInt("reserva");
                estoque = prestoque - reserva;
                codprod.setText(codp);
                nomeprod.setText(nomep);
                valor.setText(valorp);

            }else{
                JOptionPane.showMessageDialog(null, "Produto não Encontrado");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException s){
            System.out.println(s.toString());
        } catch (ClassNotFoundException ex) {
            //   Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //   Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        codprod.setText("");
        nomeprod.setText("");
        valor.setText("");
        quantidade.setText("1");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int qua1 = 0;
        int cal = 0;
        int call=0;

        String qnt = quantidade.getText();
        int qnts = Integer.parseInt(qnt);

        String R = "P";
        for(int i=0; i<q.cont; i++){
            if (q.MAT[i][0].equals(codprod.getText())){
                String Quantidade = "0";
                if(q.MAT[i][4] != "R"){
                    Quantidade = q.MAT[i][2];
                }
                int qua = Integer.parseInt(Quantidade);
                qua1 += qua;
                cal = 0;
                cal = estoque-qua1;

                if(estoque < 0){
                    estoque = 0;
                }

                if(qnts > cal){
                    R = "N";
                }else if (qnts <= cal){
                    R = "S";
                }
            }
        }

        if("P".equals(R) || "S".equals(R)){
            if(qnts <= estoque){
                if (q.cont>= 50){

                    JOptionPane.showMessageDialog(null,"Carrinho Cheio");
                }else{

                    String val = valor.getText();

                    float vall = Float.parseFloat(val);
                    float qntt = Float.parseFloat(qnt);
                    float valorT = (vall * qntt);
                    String valortotal = String.valueOf(valorT);
                    q.MAT[q.cont][0] = codprod.getText();
                    q.MAT[q.cont][1] = nomeprod.getText();
                    q.MAT[q.cont][2] = quantidade.getText();
                    q.MAT[q.cont][3] = valortotal;

                    JOptionPane.showMessageDialog(null,"Adicionado ao Carrinho");
                    int teste = 0;
                    TabelaI.setValueAt(q.MAT[q.cont][0] , q.cont , 0);
                    TabelaI.setValueAt(q.MAT[q.cont][1] , q.cont , 1);
                    TabelaI.setValueAt(q.MAT[q.cont][2] , q.cont , 2);
                    TabelaI.setValueAt(q.MAT[q.cont][3] , q.cont , 3);
                    q.cont++;

                }

            }else {
                if (JOptionPane.showConfirmDialog(null, "Quantidade Indisponivel. Disponibilidade: "+estoque+". deseja fazer reserva?") == 0) {
                    if (q.cont>= 50){
                        JOptionPane.showMessageDialog(null,"Carrinho Cheio");
                    }else{

                        String val = valor.getText();

                        float vall = Float.parseFloat(val);
                        float qntt = Float.parseFloat(qnt);
                        float valorT = (vall * qntt);
                        String valortotal = String.valueOf(valorT);
                        q.MAT[q.cont][0] = codprod.getText();
                        q.MAT[q.cont][1] = nomeprod.getText();
                        q.MAT[q.cont][2] = quantidade.getText();
                        q.MAT[q.cont][3] = valortotal;
                        q.MAT[q.cont][4] = "R";
                        JOptionPane.showMessageDialog(null,"Adicionado ao Carrinho");
                        TabelaI.setValueAt(q.MAT[q.cont][0] , q.cont , 0);
                        TabelaI.setValueAt(q.MAT[q.cont][1] , q.cont , 1);
                        TabelaI.setValueAt(q.MAT[q.cont][2] , q.cont , 2);
                        TabelaI.setValueAt(q.MAT[q.cont][3] , q.cont , 3);
                        q.cont++;

                    }
                }

            }

        }else if("N".equals(R)){

            if (JOptionPane.showConfirmDialog(null, "Quantidade Indisponivel. Disponibilidade: "+ call+". deseja fazer reserva?") == 0) {

                if (q.cont>= 50){
                    JOptionPane.showMessageDialog(null,"Carrinho Cheio");
                }else{

                    String val = valor.getText();

                    float vall = Float.parseFloat(val);
                    float qntt = Float.parseFloat(qnt);
                    float valorT = (vall * qntt);
                    String valortotal = String.valueOf(valorT);
                    q.MAT[q.cont][0] = codprod.getText();
                    q.MAT[q.cont][1] = nomeprod.getText();
                    q.MAT[q.cont][2] = quantidade.getText();
                    q.MAT[q.cont][3] = valortotal;
                    q.MAT[q.cont][4] = "R";
                    JOptionPane.showMessageDialog(null,"Adicionado ao Carrinho");
                    TabelaI.setValueAt(q.MAT[q.cont][0] , q.cont , 0);
                    TabelaI.setValueAt(q.MAT[q.cont][1] , q.cont , 1);
                    TabelaI.setValueAt(q.MAT[q.cont][2] , q.cont , 2);
                    TabelaI.setValueAt(q.MAT[q.cont][3] , q.cont , 3);
                    q.cont++;

                }
            }

        }
        int ii=0;
        float totallist = 0;
        while(ii< q.cont){
            if(q.MAT[ii][4] == "R"){
            }else{
                String soma = (q.MAT[ii][3]);
                String des = ValorDes.getText();
                float val = Float.parseFloat(soma);
                float desc = Float.parseFloat(des);
                totallist += val;
                float calc = totallist*(desc/100);
                float calcf = totallist-calc;
                String valortota = String.valueOf(calcf);
                ValorTotalP.setText(valortota);
            }
            ii++;
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void codprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codprodActionPerformed

    }//GEN-LAST:event_codprodActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        codprod.setText("");
        nomeprod.setText("");
        valor.setText("");
        quantidade.setText("1");
        nomecliente.setText("");
        cpfcliente.setText("");
        ValorTotalP.setText("0");
        ValorDes.setText("0");
        ValorPago.setText("0");
        TrocoV.setText("0");
        //desconto.setText("");
        //DataEnt.setText("");
        //cpfcliente1.setText("");
        int ii;
        int jj;
        for(ii=0; ii<50; ii++){
            for(jj=0; jj<4; jj++){
                q.MAT[ii][jj]="";
                q.MAT[ii][4]="";
                TabelaI.setValueAt(q.MAT[ii][jj] , ii , jj);
            }
        }
        q.cont=0;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffe_", "root", "");
            Statement stmt = conn.createStatement();
            String ValT = ValorTotalP.getText();
            float valortotalp = Float.parseFloat(ValT);
            if ((ValorTotalP.getText().isEmpty()) || valortotalp == 0){
                JOptionPane.showMessageDialog(null, "Nenhum Item no carrinho");
            }else {

                Object pagamento = FormaPagar.getSelectedItem();
                String ForPa = String.valueOf(pagamento);
                //String query = "insert into notavenda2(pagamento, valor, fk_cod_fun) values('"+ForPa+"' ,'"+ValorTotalP.getText()+"','"+Mtriv.getText()+"' ) ";
                // stmt.executeUpdate(query);

                String select = "select *from produto order by id_prod desc limit 1";
                ResultSet rs = stmt.executeQuery(select);
                int codvenda = 0;
                if (rs.next()) {
                    codvenda = rs.getInt("id_prod");
                }

                for(int i=0; i<q.cont; i++){
                    if(q.MAT[i][4] != "R"){
                        String cod_prod = q.MAT[i][0];
                        int cod_barra = Integer.parseInt(cod_prod);
                        if(cod_barra > 0){
                            String qnt = q.MAT[i][2];
                            int qnti = Integer.parseInt(qnt);
                            //  String query2 = "insert into itemvenda(fk_cod_barra, qnt, fk_cod_venda) values('"+cod_barra+"', '"+qnti+"', '"+codvenda+"' )";
                            //    stmt.executeUpdate(query2);

                            String select2 = "select *from produto where id_prod = '"+cod_barra+"'";
                            ResultSet rss = stmt.executeQuery(select2);
                            int newqnt = 0;
                            if (rss.next()) {
                                int qntestoque = rss.getInt("quantidade_prod");
                                newqnt = qntestoque - qnti;
                            }
                            String update = "update produto set quantidade_prod = '"+newqnt+"' where id_prod = '"+cod_barra+"'";
                            stmt.executeUpdate(update);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Nenhum Item no carrinho2");
                    }
                }

                codprod.setText("");
                nomeprod.setText("");
                valor.setText("");
                quantidade.setText("1");
                nomecliente.setText("");
                cpfcliente.setText("");
                ValorTotalP.setText("0");
                ValorDes.setText("0");
                ValorPago.setText("0");
                TrocoV.setText("0");
                //desconto.setText("");
                //DataEnt.setText("");
                //cpfcliente1.setText("");
                int ii;
                int jj;
                for(ii=0; ii<50; ii++){
                    for(jj=0; jj<4; jj++){
                        q.MAT[ii][jj]="";
                        TabelaI.setValueAt(q.MAT[ii][jj] , ii , jj);
                    }
                }
                q.cont=0;

                JOptionPane.showMessageDialog(null, "Venda Finalizada");
            }
        } catch (SQLException s){
            System.out.println(s.toString());
        } catch (ClassNotFoundException ex) {
            //   Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //  Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void TrocoVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrocoVMouseClicked
        String Total = ValorTotalP.getText();
        String Pago = ValorPago.getText();
        float vtotal = Float.parseFloat(Total);
        float vpago = Float.parseFloat(Pago);
        float Troco = (vpago - vtotal);
        String ValorTroco = String.valueOf(Troco);
        TrocoV.setText(ValorTroco);
    }//GEN-LAST:event_TrocoVMouseClicked

    private void ValorTotalPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValorTotalPMouseClicked
        int ii=0;
        float totallist = 0;
        while(ii< q.cont){
            if(q.MAT[ii][4] == "R"){
            }else{
                String soma = (q.MAT[ii][3]);
                String des = ValorDes.getText();
                float val = Float.parseFloat(soma);
                float desc = Float.parseFloat(des);
                totallist += val;
                float calc = totallist*(desc/100);
                float calcf = totallist-calc;
                String valortota = String.valueOf(calcf);
                ValorTotalP.setText(valortota);
            }
            ii++;
        }
    }//GEN-LAST:event_ValorTotalPMouseClicked

    private void DataAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DataAncestorAdded
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String data = dateFormat.format(date);
        Data.setText(data);
    }//GEN-LAST:event_DataAncestorAdded

    private void DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataActionPerformed

    private void limpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar2ActionPerformed
        cpfcliente.setText("");
        nomecliente.setText("");
        //desconto.setText("");
    }//GEN-LAST:event_limpar2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String nome = nomecliente.getText();
        String cpf = cpfcliente.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffe_", "root", "");
            Statement stmt = conn.createStatement();
            String query = "select * from cliente where cpf_cli = '"+cpf+"' or nome_cli = '"+nome+"'";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                codprod.setText("");
                nomeprod.setText("");

                cpf = rs.getString("cpf_cli");
                nome = rs.getString("nome_cli");
                //String valorp = rs.getString("valor");
                //prestoque = rs.getInt("qnt");
                // int reserva = rs.getInt("reserva");
                // estoque = prestoque - reserva;
                cpfcliente.setText(cpf);
                nomecliente.setText(nome);

            }else{
                JOptionPane.showMessageDialog(null, "Cliente não Encontrado");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException s){
            System.out.println(s.toString());
        } catch (ClassNotFoundException ex) {
            //   Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            // Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //   Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tp_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tp_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tp_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tp_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tp_Vendedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField Data;
    private javax.swing.JComboBox FormaPagar;
    private javax.swing.JTextField Mtriv;
    private javax.swing.JTextField NomeV;
    private javax.swing.JTable TabelaI;
    private javax.swing.JTextField TrocoV;
    private javax.swing.JTextField ValorDes;
    private javax.swing.JTextField ValorPago;
    private javax.swing.JTextField ValorTotalP;
    private javax.swing.JTextField codprod;
    private javax.swing.JFormattedTextField cpfcliente;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpar2;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JTextField nomeprod;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}