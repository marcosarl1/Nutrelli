package com.nutrelli.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.nutrelli.view.table.ChkboxTbl;
import com.nutrelli.view.table.TblHeader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame implements DisplayPopups {

    public Dashboard() {
        initComponents();
        init();
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
        populateTablesWithSampleData();
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "id", "Cliente", "Data", "Produtos", "Status", "Valor Total", "Tipo Pagamento"
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
            tblPedidos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblPedidos.getColumnModel().getColumn(1).setMinWidth(0);
            tblPedidos.getColumnModel().getColumn(1).setMaxWidth(0);
        }

        txtSearchPedidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
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

                }
            } catch (Exception e) {
                displayError("Erro ao excluir produto: " + e.getMessage());
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
        editarPedido.setVisible(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

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

    private void populateTablesWithSampleData() {
        // Sample data for Produtos table
        DefaultTableModel produtosModel = (DefaultTableModel) tblProdutos.getModel();
        produtosModel.setRowCount(0); // Clear existing rows
        produtosModel.addRow(new Object[]{false, 1, "Produto A", "10.00", "Categoria 1", "Disponível"});
        produtosModel.addRow(new Object[]{false, 2, "Produto B", "15.50", "Categoria 2", "Indisponível"});
        produtosModel.addRow(new Object[]{false, 3, "Produto C", "7.75", "Categoria 1", "Disponível"});
        produtosModel.addRow(new Object[]{false, 4, "Produto D", "12.00", "Categoria 3", "Disponível"});

        // Sample data for Pedidos table
        DefaultTableModel pedidosModel = (DefaultTableModel) tblPedidos.getModel();
        pedidosModel.setRowCount(0); // Clear existing rows
        pedidosModel.addRow(new Object[]{false, 101, "Cliente 1", "2024-01-01", "Produto A, Produto B", "Entregue", "25.50", "Cartão"});
        pedidosModel.addRow(new Object[]{false, 102, "Cliente 2", "2024-01-02", "Produto C", "Pendente", "7.75", "Dinheiro"});
        pedidosModel.addRow(new Object[]{false, 103, "Cliente 3", "2024-01-03", "Produto D, Produto A", "Cancelado", "22.00", "Cartão"});

        // Sample data for Clientes table
        DefaultTableModel clientesModel = (DefaultTableModel) tblClientes.getModel();
        clientesModel.setRowCount(0); // Clear existing rows
        clientesModel.addRow(new Object[]{false, 1001, "Cliente 1", "123.456.789-00", "cliente1@example.com", "(11) 1234-5678", "Endereço 1"});
        clientesModel.addRow(new Object[]{false, 1002, "Cliente 2", "987.654.321-00", "cliente2@example.com", "(11) 8765-4321", "Endereço 2"});
        clientesModel.addRow(new Object[]{false, 1003, "Cliente 3", "555.666.777-88", "cliente3@example.com", "(21) 5555-6666", "Endereço 3"});
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
