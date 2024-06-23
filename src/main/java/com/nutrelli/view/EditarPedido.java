package com.nutrelli.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.nutrelli.dao.PedidoDAO;
import com.nutrelli.model.Pedido;
import com.nutrelli.model.StatusPedido;

public class EditarPedido extends javax.swing.JDialog implements DisplayPopups {

    private final int id;
    private final Dashboard dashboard;

    public EditarPedido(Dashboard dashboard, int id) {
        super(dashboard, "Editar pedido", true);
        initComponents();
        this.id = id;
        this.dashboard = dashboard;
        loadCategoria();
        init();
    }

    private void init() {
        panel.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:16,16,16,16, shade(@background,20%),,15");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblProdutos = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cmbStatus = new javax.swing.JComboBox();
        txtData = new javax.swing.JTextField();
        lblData = new javax.swing.JLabel();
        lblValorTotal1 = new javax.swing.JLabel();
        txtProdutos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Alterar status do pedido");

        lblCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblCliente.setLabelFor(txtCliente);
        lblCliente.setText("Cliente:");

        txtCliente.setEditable(false);
        txtCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblProdutos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblProdutos.setLabelFor(txtProdutos);
        lblProdutos.setText("Produtos:");

        txtValorTotal.setEditable(false);
        txtValorTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblStatus.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblStatus.setText("Status:");

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

        cmbStatus.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        txtData.setEditable(false);
        txtData.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        lblData.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblData.setLabelFor(txtData);
        lblData.setText("Data:");

        lblValorTotal1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblValorTotal1.setLabelFor(txtValorTotal);
        lblValorTotal1.setText("Valor Total:");

        txtProdutos.setEditable(false);
        txtProdutos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdutos)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCliente)
                        .addComponent(txtCliente)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                        .addComponent(lblStatus)
                        .addComponent(cmbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtData)
                        .addComponent(lblData)
                        .addComponent(lblValorTotal1)
                        .addComponent(txtProdutos)))
                .addGap(115, 115, 115))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValorTotal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String statusDescricao = (String) cmbStatus.getSelectedItem();
        StatusPedido status = StatusPedido.fromDescricao(statusDescricao);

        if (status == null) {
            displayWarning("Escolha o status do pedido.");
            return;
        }

        PedidoDAO pedidoDAO = new PedidoDAO();
        try {
            Pedido pedido = pedidoDAO.getPedidoById(id);
            pedido.setStatusPedido(status);
            pedidoDAO.editPedido(pedido);
            displaySuccess("Status do pedido alterado com sucesso!");
            dashboard.loadAllPedidos();
            dispose();
        } catch (Exception e) {
            displayError("Erro alterar status do pedido, tente novamente.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    protected void loadPedido(int id) {
        PedidoDAO pedidoDAO = new PedidoDAO();
        try {
            Pedido pedido = pedidoDAO.getPedidoById(id);
            txtCliente.setText(pedido.getCliente().getNome());
            txtData.setText(String.valueOf(pedido.getDataPedido()));
            txtProdutos.setText(pedido.listaProdutosPedidos());
            txtValorTotal.setText(String.valueOf(pedido.calcularValorTotal()));
            cmbStatus.setSelectedItem(pedido.getStatusPedido().getDescricao());
        } catch (Exception e) {
            e.printStackTrace();
            displayError("Erro ao carregar pedido, tente novamente.");
        }
    }

    private void loadCategoria() {
        cmbStatus.removeAllItems();
        for (StatusPedido status : StatusPedido.values()) {
            cmbStatus.addItem(status.getDescricao());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cmbStatus;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValorTotal1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtProdutos;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
