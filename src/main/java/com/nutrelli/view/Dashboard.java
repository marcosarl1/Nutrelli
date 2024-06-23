package com.nutrelli.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.nutrelli.dao.ClienteDAO;
import com.nutrelli.dao.PedidoDAO;
import com.nutrelli.dao.ProdutoDAO;
import com.nutrelli.model.Cliente;
import com.nutrelli.model.Pedido;
import com.nutrelli.model.Produto;
import com.nutrelli.view.table.ChkboxTbl;
import com.nutrelli.view.table.TblHeader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame implements DisplayPopups {

    public Dashboard() {
        initComponents();
        init();
        loadAllProdutos();
        loadAllPedidos();
        loadAllClientes();
    }

    private void init() {
        tbbdPane.putClientProperty(FlatClientProperties.STYLE, ""
                + "tabArc:5;"
                + "tabAreaAlignment:center;");
        styleTbl(tblProdutos);
        styleTbl(tblPedidos);
        styleTbl(tblClientes);
        styleScrollPane(scrollPaneProdutos);
        styleScrollPane(scrollPanePedidos);
        styleScrollPane(scrollPaneClientes);
        styleTxtSearch(txtSearchProdutos);
        styleTxtSearch(txtSearchPedidos);
        styleTxtSearch(txtSearchClientes);
    }

    private void styleTbl(javax.swing.JTable table) {
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "height:30;"
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background;"
                + "font:bold");
        table.putClientProperty(FlatClientProperties.STYLE, ""
                + "rowHeight:30;"
                + "showHorizontalLines:true;"
                + "intercellSpacing:0,1;"
                + "cellFocusColor:$TableHeader.hoverBackground;"
                + "selectionBackground:$TableHeader.hoverBackground;"
                + "selectionForeground:$Table.foreground;");
        table.getColumnModel().getColumn(0).setHeaderRenderer(new ChkboxTbl(table, 0));
        table.getTableHeader().setDefaultRenderer(new TblHeader(table));
    }

    private void styleScrollPane(javax.swing.JScrollPane scrollPane) {
        scrollPane.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "trackArc:999;"
                + "trackInsets:3,3,3,3;"
                + "thumbInsets:3,3,3,3;"
                + "background:$Table.background");
    }

    private void styleTxtSearch(javax.swing.JTextField search) {
        search.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, ""
                + "Pesquisar");
    }

    private void updateTbl(javax.swing.JTable table, List<?> data) {
        DefaultTableModel tblModel = (DefaultTableModel) table.getModel();
        tblModel.setRowCount(0);
        for (Object obj : data) {
            switch (obj) {
                case Produto produto ->
                    tblModel.addRow(new Object[]{
                        false, produto.getId(), produto.getNome(), String.format("R$ %.2f", produto.getPreco()), produto.getCategoria().getNome(), 
                        produto.isDisponibilidade() ? "Disponível" : "Indisponível"});
                case Pedido pedido ->
                    tblModel.addRow(new Object[]{
                        false, pedido.getId(), pedido.getCliente().getNome(), pedido.listaProdutosPedidos(), pedido.getDataPedido(), pedido.getStatusPedido().getDescricao(), String.format("R$ %.2f", pedido.calcularValorTotal()), pedido.getTipoPagamento().getNome()});
                case Cliente cliente ->
                    tblModel.addRow(new Object[]{
                        false, cliente.getId(), cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.getTelefone(), cliente.getEndereco()});
                default -> {
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        tbbdPane = new javax.swing.JTabbedPane();
        panelProdutos = new javax.swing.JPanel();
        scrollPaneProdutos = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnDeletar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        txtSearchProdutos = new javax.swing.JTextField();
        panelPedidos = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        scrollPanePedidos = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        txtSearchPedidos = new javax.swing.JTextField();
        panelClientes = new javax.swing.JPanel();
        scrollPaneClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtSearchClientes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nutrelli Funcionário");

        panelLogo.setBackground(new java.awt.Color(224, 219, 181));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nutrelli-Photoroom.png"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLogo)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo)
                .addGap(345, 345, 345))
        );

        tbbdPane.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "id", "Nome", "Preço", "Categoria", "Disponibilidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.getTableHeader().setReorderingAllowed(false);
        scrollPaneProdutos.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(1).setMinWidth(0);
            tblProdutos.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        btnDeletar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAdicionar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        txtSearchProdutos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtSearchProdutos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchProdutosCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout panelProdutosLayout = new javax.swing.GroupLayout(panelProdutos);
        panelProdutos.setLayout(panelProdutosLayout);
        panelProdutosLayout.setHorizontalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
            .addGroup(panelProdutosLayout.createSequentialGroup()
                .addComponent(txtSearchProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelProdutosLayout.setVerticalGroup(
            panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(scrollPaneProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE))
        );

        tbbdPane.addTab("Produtos", panelProdutos);

        btnAlterar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Pedido", "Cliente", "Produtos", "Data", "Status", "Valor Total", "Tipo Pagamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPedidos.getTableHeader().setReorderingAllowed(false);
        scrollPanePedidos.setViewportView(tblPedidos);
        if (tblPedidos.getColumnModel().getColumnCount() > 0) {
            tblPedidos.getColumnModel().getColumn(0).setMinWidth(60);
            tblPedidos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblPedidos.getColumnModel().getColumn(1).setMinWidth(55);
            tblPedidos.getColumnModel().getColumn(1).setMaxWidth(55);
            tblPedidos.getColumnModel().getColumn(2).setMinWidth(150);
            tblPedidos.getColumnModel().getColumn(2).setMaxWidth(150);
            tblPedidos.getColumnModel().getColumn(4).setMinWidth(90);
            tblPedidos.getColumnModel().getColumn(4).setMaxWidth(90);
            tblPedidos.getColumnModel().getColumn(5).setMinWidth(90);
            tblPedidos.getColumnModel().getColumn(5).setMaxWidth(90);
            tblPedidos.getColumnModel().getColumn(6).setMinWidth(80);
            tblPedidos.getColumnModel().getColumn(6).setMaxWidth(80);
            tblPedidos.getColumnModel().getColumn(7).setMinWidth(120);
            tblPedidos.getColumnModel().getColumn(7).setMaxWidth(120);
        }

        txtSearchPedidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtSearchPedidos.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchPedidosCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout panelPedidosLayout = new javax.swing.GroupLayout(panelPedidos);
        panelPedidos.setLayout(panelPedidosLayout);
        panelPedidosLayout.setHorizontalGroup(
            panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosLayout.createSequentialGroup()
                .addComponent(txtSearchPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(scrollPanePedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
        );
        panelPedidosLayout.setVerticalGroup(
            panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(scrollPanePedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE))
        );

        tbbdPane.addTab("Pedidos", panelPedidos);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "id", "Nome", "CPF", "E-mail", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.getTableHeader().setReorderingAllowed(false);
        scrollPaneClientes.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(60);
            tblClientes.getColumnModel().getColumn(1).setMinWidth(0);
            tblClientes.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        txtSearchClientes.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchClientesCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addComponent(txtSearchClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtSearchClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(scrollPaneClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE))
        );

        tbbdPane.addTab("Clientes", panelClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbbdPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbbdPane)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1440, 1024));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        new AdicionarProduto(this).setVisible(true);
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int[] selectedIndex = getSelectedProdutosIndexes();
        if (selectedIndex.length == 0) {
            displayWarning("Selecione pelo menos um produto.");
            return;
        }
        int confirm = displayConfirmation("Tem certeza que deseja excluir o(s) produto(s) selecionado(s)?");
        if (confirm == 0) {
            try {
                for (int index : selectedIndex) {
                    int id = (int) tblProdutos.getValueAt(index, 1);
                    ProdutoDAO produtoDAO = new ProdutoDAO();
                    produtoDAO.deleteProduto(id);
                }
                displaySuccess("Produto(s) excluído(s) com sucesso!");
                loadAllProdutos(); 
            } catch (Exception e) {
                displayError("Erro ao excluir produto, tente novamente.");
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int[] selectedIndex = getSelectedProdutosIndexes();
        if (selectedIndex.length == 0) {
            displayWarning("Selecione um produto para editar.");
            return;
        }
        if (selectedIndex.length != 1) {
            displayWarning("Selecione apenas um produto para editar.");
            return;
        }

        int selected = selectedIndex[0];
        int id = (int) tblProdutos.getValueAt(selected, 1);
        EditarProduto editarProduto = new EditarProduto(this, id);
        editarProduto.loadProduto(id);
        editarProduto.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int[] selectedIndex = getSelectedPedidosIndexes();
        if (selectedIndex.length == 0) {
            displayWarning("Selecione um pedido para alterar o status.");
            return;
        }
        if (selectedIndex.length != 1) {
            displayWarning("Selecione apenas um pedido para alterar o status.");
            return;
        }

        int selected = selectedIndex[0];
        int id = (int) tblProdutos.getValueAt(selected, 1);

        EditarPedido editarPedido = new EditarPedido(this, id);
        editarPedido.loadPedido(id);
        editarPedido.setVisible(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtSearchProdutosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchProdutosCaretUpdate
        String filter = txtSearchProdutos.getText().trim();
        try {
            ProdutoDAO produtoDAO = new ProdutoDAO();
            List<Produto> produtos = produtoDAO.getProduto(filter);
            updateTbl(tblProdutos, produtos);
        } catch (Exception e) {
            displayError("Nenhum produto encontrado");
        }
    }//GEN-LAST:event_txtSearchProdutosCaretUpdate

    private void txtSearchPedidosCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchPedidosCaretUpdate
        String filter = txtSearchPedidos.getText().trim();
        try {
            PedidoDAO pedidoDAO = new PedidoDAO();
            List<Pedido> pedidos = pedidoDAO.getPedido(filter);
            updateTbl(tblPedidos, pedidos);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtSearchPedidosCaretUpdate

    private void txtSearchClientesCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchClientesCaretUpdate
        String filter = txtSearchClientes.getText().trim();
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            List<Cliente> clientes = clienteDAO.getCliente(filter);
            updateTbl(tblClientes, clientes);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtSearchClientesCaretUpdate

    private int[] getSelectedRowIndex(javax.swing.JTable table) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            if ((boolean) table.getValueAt(i, 0)) {
                indexes.add(i);
            }
        }
        return indexes.stream().mapToInt(i -> i).toArray();
    }

    private int[] getSelectedProdutosIndexes() {
        return getSelectedRowIndex(tblProdutos);
    }

    private int[] getSelectedPedidosIndexes() {
        return getSelectedRowIndex(tblPedidos);
    }

    protected void loadAllProdutos() {
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            List<Produto> produtos = produtoDAO.getProduto("");
            updateTbl(tblProdutos, produtos);
        } catch (Exception e) {
        }
    }

    protected void loadAllPedidos() {
        PedidoDAO pedidoDAO = new PedidoDAO();
        try {
            List<Pedido> pedidos = pedidoDAO.getPedido("");
            updateTbl(tblPedidos, pedidos);
        } catch (Exception e) {
        }
    }

    private void loadAllClientes() {
        ClienteDAO clienteDAO = new ClienteDAO();
        try {
            List<Cliente> clientes = clienteDAO.getCliente("");
            updateTbl(tblClientes, clientes);
        } catch (Exception e) {
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPedidos;
    private javax.swing.JPanel panelProdutos;
    private javax.swing.JScrollPane scrollPaneClientes;
    private javax.swing.JScrollPane scrollPanePedidos;
    private javax.swing.JScrollPane scrollPaneProdutos;
    private javax.swing.JTabbedPane tbbdPane;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtSearchClientes;
    private javax.swing.JTextField txtSearchPedidos;
    private javax.swing.JTextField txtSearchProdutos;
    // End of variables declaration//GEN-END:variables
}
