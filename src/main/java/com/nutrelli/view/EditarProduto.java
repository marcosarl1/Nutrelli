package com.nutrelli.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.nutrelli.dao.ProdutoCategoriaDAO;
import com.nutrelli.dao.ProdutoDAO;
import com.nutrelli.model.Produto;
import com.nutrelli.model.ProdutoCategoria;
import java.util.List;

public class EditarProduto extends javax.swing.JDialog implements DisplayPopups {

    private final int id;
    private final Dashboard dashboard;

    public EditarProduto(Dashboard dashboard, int id) {
        super(dashboard, "Editar produto", true);
        initComponents();
        this.id = id;
        this.dashboard = dashboard;
        init();
        loadAllCategorias();
    }

    private void init() {
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:16,16,16,16, shade(@background,20%),,15");
        txtNome.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Pão");
        txtPreco.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "R$ 12,00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        chkDisponivel = new javax.swing.JCheckBox();
        cmbCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Editar produto");

        lblNome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblNome.setLabelFor(txtNome);
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblPreco.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblPreco.setLabelFor(txtPreco);
        lblPreco.setText("Preço:");

        txtPreco.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblCategoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCategoria.setText("Categoria:");

        btnCancelar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        chkDisponivel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        chkDisponivel.setText("Disponível");

        cmbCategoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkDisponivel)
                    .addComponent(lblNome)
                    .addComponent(txtNome)
                    .addComponent(lblPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(lblCategoria)
                    .addComponent(cmbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkDisponivel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtNome.setText("");
        txtPreco.setText("");
        cmbCategoria.setSelectedIndex(-1);
        chkDisponivel.setSelected(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String nome = txtNome.getText().trim();
        String precoString = txtPreco.getText().trim().replace(",", ".");
        ProdutoCategoria categoria = (ProdutoCategoria) cmbCategoria.getSelectedItem();
        boolean disponivel = chkDisponivel.isSelected();

        if (nome.isEmpty() || precoString.isEmpty() || categoria == null) {
            displayWarning("Preencha todos os campos!");
            return;
        }

        Double preco;
        try {
            preco = Double.valueOf(precoString);
        } catch (NumberFormatException e) {
            displayWarning("Preço deve ser um número.");
            return;
        }  
        
        Produto produto = new Produto(id, nome, preco, categoria, disponivel);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            produtoDAO.editProduto(produto);
            displaySuccess("Produto editado com sucesso!");
            dashboard.loadAllProdutos();
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
            displayError("Erro ao editar produto, tente novamente.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    protected void loadProduto(int id) {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            Produto produto = produtoDAO.getProdutoById(id);

            txtNome.setText(produto.getNome());
            txtPreco.setText(String.valueOf(produto.getPreco()));
            cmbCategoria.setSelectedItem(produto.getCategoria());
            chkDisponivel.setSelected(produto.isDisponibilidade());
        } catch (Exception e) {
            displayError("Erro ao carregar produto, tente novamente.");
            dispose();
        }
    }

    private void loadAllCategorias() {
        ProdutoCategoriaDAO produtoCategoriaDAO = new ProdutoCategoriaDAO();
        try {
            cmbCategoria.removeAllItems();
            List<ProdutoCategoria> categorias = produtoCategoriaDAO.getProdutoCategoria();
            for (ProdutoCategoria pc : categorias) {
                cmbCategoria.addItem(pc);
            }
        } catch (Exception e) {
            displayError("Erro ao carregar categorias, tente novamente.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkDisponivel;
    private javax.swing.JComboBox<ProdutoCategoria> cmbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
