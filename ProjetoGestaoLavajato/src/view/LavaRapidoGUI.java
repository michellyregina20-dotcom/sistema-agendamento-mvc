/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;



/**
 *
 * @author miche
 */
public class LavaRapidoGUI extends javax.swing.JFrame {
    
    private final controller.ClienteController clienteController = new controller.ClienteController();
    private final controller.AgendamentoController agendamentoController = new controller.AgendamentoController();
    private final controller.VeiculosController veiculosController = new controller.VeiculosController();
    private final controller.ServicoController servicoController = new controller.ServicoController();
    
    
    //Construtor
    public LavaRapidoGUI() {
        initComponents();
    tiposercomboBox.removeAllItems(); 
    tiposercomboBox.addItem("Ducha Rapida");
    tiposercomboBox.addItem("Lavagem simples");
    tiposercomboBox.addItem("Lavagem com cera");
    tiposercomboBox.addItem("lavagem Tecnica");
    }
    
    //tabela dos cliente 
    public void atualizarTabelaClientes(){
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabelacadastradostable.getModel();
        modelo.setRowCount(0);
        for (model.Cliente c : clienteController.listarTodos()){
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getCpf(),
                c.getTelefone(),
                c.getEmail()
            });
        }
    }
    //tabela dos clientes que estao agendados
    public void atualizarTabelaAgendamentos() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) listacliTbl.getModel();
    modelo.setRowCount(0);

    java.time.format.DateTimeFormatter fmtData = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
    java.time.format.DateTimeFormatter fmtHora = java.time.format.DateTimeFormatter.ofPattern("HH:mm");

    for (model.Agendamento ag : agendamentoController.listarTodos()) {
        modelo.addRow(new Object[]{
            ag.getCliente().getId(),
            ag.getVeiculo().getmodelo(),
            ag.getDataHora().format(fmtData),
            ag.getDataHora().format(fmtHora),
            ag.getStatus() // Vai preencher a 5ª coluna (Status)
        });
    }
}
    //Tabela dos veiculos da abas Cadastro de veiculos
  public void atualizarTabelaVeiculos() {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tabelaveiTbl.getModel();
    modelo.setRowCount(0);

    for (model.Veiculo v : veiculosController.listarTodos()) {
        modelo.addRow(new Object[]{
            v.getmodelo(),
            v.getPlacaveiculo(),
            v.getCliente().getId()
        });
    }
}
  private model.Cliente buscarClientePorIdOuNome(String textoBusca){
      String busca = textoBusca.trim();
      if (busca.isEmpty()){
          return null;
      }
      if (busca.matches("\\d+")){
          long id = Long.parseLong(busca);
          for (model.Cliente c : clienteController.listarTodos()){
              if (c.getId() == id){
                  return c;
              }
          }
      }
      for (model.Cliente c : clienteController.listarTodos()) {
        if (c.getNome().equalsIgnoreCase(busca) || c.getNome().toLowerCase().contains(busca.toLowerCase())) {
            return c;
        }
      }
      return null; 

  }
 //Tabela de Servicos
  public void atualizarTabelaServico(){
      javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tiposervicoTable.getModel();
      modelo.setRowCount(0);
      tiposercomboBox.removeAllItems();

    for (model.TipoServico s : servicoController.listarTodos()) {
        modelo.addRow(new Object[]{
            s.getNome(),
            s.getDescricao(),
            s.getPreco()
        });
        tiposercomboBox.addItem(s.getNome());
    }
  }
  
 
   
   


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AgendamentoPnl = new javax.swing.JPanel();
        lavarapidoLbl = new javax.swing.JLabel();
        agendarLbl = new javax.swing.JLabel();
        idclienteLbl = new javax.swing.JLabel();
        idclientetxt = new javax.swing.JTextField();
        veiculoLbl = new javax.swing.JLabel();
        veiculoTxt = new javax.swing.JTextField();
        dataLbl = new javax.swing.JLabel();
        dataTxt = new javax.swing.JTextField();
        horaLbl = new javax.swing.JLabel();
        horatxt = new javax.swing.JTextField();
        agendarBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        listacliTbl = new javax.swing.JTable();
        listaagendados = new javax.swing.JLabel();
        tiposevicoLbl = new javax.swing.JLabel();
        tiposercomboBox = new javax.swing.JComboBox<>();
        atualizaragenBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        TipoServicoPnl = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tipodeservicoLbl = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tiposervicoTable = new javax.swing.JTable();
        cadastrarservicoBtn = new javax.swing.JButton();
        idservicoLdl = new javax.swing.JLabel();
        NomeserLbl = new javax.swing.JLabel();
        descrLbl = new javax.swing.JLabel();
        precoLbl = new javax.swing.JLabel();
        descricaoTxt = new javax.swing.JTextField();
        idserviTxt = new javax.swing.JTextField();
        nomeserTxt = new javax.swing.JTextField();
        precoTxt = new javax.swing.JTextField();
        VeiculoPnl = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cadastroveiLbl = new javax.swing.JLabel();
        modeloLbl = new javax.swing.JLabel();
        placaveiculoLbl = new javax.swing.JLabel();
        iddocliente = new javax.swing.JLabel();
        modelotxt = new javax.swing.JTextField();
        placaveiTxt = new javax.swing.JTextField();
        iddoclienteTxt = new javax.swing.JTextField();
        cadastarveiBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaveiTbl = new javax.swing.JTable();
        atualizarveicu = new javax.swing.JButton();
        ClientePnl = new javax.swing.JPanel();
        lavaRapidoLbl = new javax.swing.JLabel();
        cadastrodeusuarioLbl = new javax.swing.JLabel();
        nomeLbl = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        cpfLbl = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        telefoneLbl = new javax.swing.JLabel();
        telefoneTxt = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        cadastrarBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelacadastradostable = new javax.swing.JTable();
        listaCadastroLbl = new javax.swing.JLabel();
        excluirBtn = new javax.swing.JButton();
        atualizarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        iddoclientecadasTxt = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lavarapidoLbl.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lavarapidoLbl.setText("Lava Rapido");

        agendarLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agendarLbl.setText("Agendar");

        idclienteLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idclienteLbl.setText("ID do Cliente");

        veiculoLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        veiculoLbl.setText("Veiculo:");

        dataLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dataLbl.setText("Data:");

        horaLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        horaLbl.setText("Hora:");

        agendarBtn.setBackground(new java.awt.Color(0, 0, 204));
        agendarBtn.setForeground(new java.awt.Color(255, 255, 255));
        agendarBtn.setText("Agendar");
        agendarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendarBtnActionPerformed(evt);
            }
        });

        listacliTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID do Cliente", "Veiculo", "Data", "Hora", "Status"
            }
        ));
        jScrollPane5.setViewportView(listacliTbl);

        listaagendados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        listaagendados.setText("Lista De Clientes Agendados");

        tiposevicoLbl.setText("Tipo De Seviço:");

        tiposercomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tiposercomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposercomboBoxActionPerformed(evt);
            }
        });

        atualizaragenBtn.setBackground(new java.awt.Color(0, 0, 204));
        atualizaragenBtn.setForeground(new java.awt.Color(255, 255, 255));
        atualizaragenBtn.setText("Atualizar");
        atualizaragenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaragenBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setBackground(new java.awt.Color(0, 0, 204));
        cancelarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelarBtn.setText("Cancelar");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgendamentoPnlLayout = new javax.swing.GroupLayout(AgendamentoPnl);
        AgendamentoPnl.setLayout(AgendamentoPnlLayout);
        AgendamentoPnlLayout.setHorizontalGroup(
            AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                        .addGap(531, 531, 531)
                        .addComponent(lavarapidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(agendarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idclienteLbl)
                                    .addComponent(veiculoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataLbl)
                                    .addComponent(horaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tiposevicoLbl))
                                .addGap(50, 50, 50)
                                .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(veiculoTxt)
                                    .addComponent(idclientetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                                    .addComponent(dataTxt)
                                    .addComponent(horatxt)
                                    .addComponent(tiposercomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(listaagendados, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                                        .addComponent(atualizaragenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(99, 99, 99)
                                        .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(agendarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        AgendamentoPnlLayout.setVerticalGroup(
            AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(idclientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(veiculoLbl)
                            .addComponent(veiculoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataLbl)
                            .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horaLbl)
                            .addComponent(horatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tiposevicoLbl)
                            .addComponent(tiposercomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                        .addComponent(lavarapidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(agendarLbl)
                                    .addComponent(listaagendados))
                                .addGap(46, 46, 46)
                                .addComponent(idclienteLbl))
                            .addGroup(AgendamentoPnlLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(AgendamentoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atualizaragenBtn)
                            .addComponent(cancelarBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(agendarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );

        jTabbedPane1.addTab("tab3", AgendamentoPnl);

        jLabel22.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel22.setText("Lava Rapido.");

        tipodeservicoLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipodeservicoLbl.setText("Tipo de Serviço:");

        tiposervicoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""},
                {"", "", "", ""}
            },
            new String [] {
                "ID", "Nome", "Descrição", "Preço"
            }
        ));
        jScrollPane6.setViewportView(tiposervicoTable);

        cadastrarservicoBtn.setText("Cadastrar");
        cadastrarservicoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarservicoBtnActionPerformed(evt);
            }
        });

        idservicoLdl.setText("ID");

        NomeserLbl.setText("Nome");

        descrLbl.setText("Descrição");

        precoLbl.setText("Preço");

        javax.swing.GroupLayout TipoServicoPnlLayout = new javax.swing.GroupLayout(TipoServicoPnl);
        TipoServicoPnl.setLayout(TipoServicoPnlLayout);
        TipoServicoPnlLayout.setHorizontalGroup(
            TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(cadastrarservicoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                                .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NomeserLbl)
                                            .addComponent(idservicoLdl))
                                        .addGap(58, 58, 58)
                                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nomeserTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                            .addComponent(idserviTxt)))
                                    .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descrLbl)
                                            .addComponent(precoLbl))
                                        .addGap(40, 40, 40)
                                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(descricaoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                            .addComponent(precoTxt))))
                                .addGap(108, 108, 108)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipodeservicoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(646, Short.MAX_VALUE))
        );
        TipoServicoPnlLayout.setVerticalGroup(
            TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipodeservicoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                                .addComponent(idservicoLdl)
                                .addGap(50, 50, 50)
                                .addComponent(NomeserLbl))
                            .addGroup(TipoServicoPnlLayout.createSequentialGroup()
                                .addComponent(idserviTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nomeserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descrLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descricaoTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(TipoServicoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precoLbl)
                            .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(cadastrarservicoBtn)
                .addGap(339, 339, 339))
        );

        jTabbedPane1.addTab("tab4", TipoServicoPnl);

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        jLabel8.setText("Lava Rapido.");

        cadastroveiLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadastroveiLbl.setText("Cadastro do Veiculo");

        modeloLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modeloLbl.setText("Modelo:");

        placaveiculoLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        placaveiculoLbl.setText("Placa do Veiculo:");

        iddocliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iddocliente.setText("Nome do Cliente:");

        modelotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelotxtActionPerformed(evt);
            }
        });

        cadastarveiBtn.setBackground(new java.awt.Color(0, 0, 204));
        cadastarveiBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastarveiBtn.setText("Cadastrar");
        cadastarveiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastarveiBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Lista de Veiculos");

        tabelaveiTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Modelo", "Placa do Veiculo", "ID do Cliente"
            }
        ));
        jScrollPane4.setViewportView(tabelaveiTbl);

        atualizarveicu.setBackground(new java.awt.Color(51, 0, 204));
        atualizarveicu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        atualizarveicu.setForeground(new java.awt.Color(255, 255, 255));
        atualizarveicu.setText("Atualizar");
        atualizarveicu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarveicuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VeiculoPnlLayout = new javax.swing.GroupLayout(VeiculoPnl);
        VeiculoPnl.setLayout(VeiculoPnlLayout);
        VeiculoPnlLayout.setHorizontalGroup(
            VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeiculoPnlLayout.createSequentialGroup()
                .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VeiculoPnlLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(placaveiculoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modeloLbl)
                            .addComponent(iddocliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(placaveiTxt)
                            .addComponent(modelotxt)
                            .addComponent(iddoclienteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)))
                    .addGroup(VeiculoPnlLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(cadastroveiLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VeiculoPnlLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(cadastarveiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(230, 230, 230)
                .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(VeiculoPnlLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(atualizarveicu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VeiculoPnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        VeiculoPnlLayout.setVerticalGroup(
            VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeiculoPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VeiculoPnlLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(VeiculoPnlLayout.createSequentialGroup()
                                .addComponent(cadastroveiLbl)
                                .addGap(39, 39, 39)
                                .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(modeloLbl)
                                    .addComponent(modelotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addComponent(placaveiculoLbl))
                            .addComponent(placaveiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(VeiculoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iddocliente)
                            .addComponent(iddoclienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(VeiculoPnlLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(cadastarveiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(atualizarveicu)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", VeiculoPnl);

        lavaRapidoLbl.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lavaRapidoLbl.setText("Lava Rapido.");

        cadastrodeusuarioLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadastrodeusuarioLbl.setText("Cadastro de Usuario");

        nomeLbl.setText("Nome Completo:");

        cpfLbl.setText("CPF:");

        telefoneLbl.setText("Telefone:");

        emailLbl.setText("Email:");

        cadastrarBtn.setBackground(new java.awt.Color(0, 0, 204));
        cadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBtn.setText("Cadastrar");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        tabelacadastradostable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelacadastradostable);

        listaCadastroLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        listaCadastroLbl.setText("Clientes Cadastrados");

        excluirBtn.setBackground(new java.awt.Color(0, 0, 204));
        excluirBtn.setForeground(new java.awt.Color(255, 255, 255));
        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        atualizarBtn.setBackground(new java.awt.Color(0, 0, 204));
        atualizarBtn.setForeground(new java.awt.Color(255, 255, 255));
        atualizarBtn.setText("Atualizar");
        atualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Id do Cliente");

        javax.swing.GroupLayout ClientePnlLayout = new javax.swing.GroupLayout(ClientePnl);
        ClientePnl.setLayout(ClientePnlLayout);
        ClientePnlLayout.setHorizontalGroup(
            ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientePnlLayout.createSequentialGroup()
                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientePnlLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cadastrodeusuarioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientePnlLayout.createSequentialGroup()
                        .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClientePnlLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ClientePnlLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefoneLbl)
                                    .addComponent(cpfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addGap(18, 18, 18)
                        .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emailTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                            .addComponent(telefoneTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iddoclientecadasTxt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaCadastroLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(642, 642, 642))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientePnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lavaRapidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1164, 1164, 1164))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientePnlLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(641, 641, 641))
        );
        ClientePnlLayout.setVerticalGroup(
            ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientePnlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lavaRapidoLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientePnlLayout.createSequentialGroup()
                        .addComponent(listaCadastroLbl)
                        .addGap(27, 27, 27)))
                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientePnlLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientePnlLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(cadastrodeusuarioLbl)
                        .addGap(27, 27, 27)
                        .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ClientePnlLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telefoneLbl)
                                    .addComponent(telefoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ClientePnlLayout.createSequentialGroup()
                                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeLbl))
                                .addGap(41, 41, 41)
                                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cpfLbl)
                                    .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53)
                        .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailLbl)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(iddoclientecadasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(ClientePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(315, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab14", ClientePnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(645, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    //BOTÃO PARA CADASTAR VEICULO
    private void cadastarveiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastarveiBtnActionPerformed
     try {
       model.Cliente clienteEncontrado =buscarClientePorIdOuNome(iddoclienteTxt.getText());
        veiculosController.cadastrarVeiculo(
            modelotxt.getText(),
            placaveiTxt.getText(),
            "",
            clienteEncontrado
        );
        
        modelotxt.setText("");
        placaveiTxt.setText("");
        iddoclienteTxt.setText("");
        
        //MENSAGENS DE ERRO
        javax.swing.JOptionPane.showMessageDialog(this, "Veículo cadastrado");
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "ERRO NO ID");
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
    }  
     //ATUALIZAÇÃO DA TABELA VEICULOS
      atualizarTabelaVeiculos();
    }//GEN-LAST:event_cadastarveiBtnActionPerformed
   
   
    
    //BOTAO DE ATUALIZAR TABELA DOS CLIENTES
    private void atualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtnActionPerformed
        atualizarTabelaClientes();
       
        
    }//GEN-LAST:event_atualizarBtnActionPerformed
     
    //BOTAO DE CADASTRAR CLIENTES NO LAVA RAPIDO
    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        try{
            long id = Long.parseLong(iddoclientecadasTxt.getText().trim());
            clienteController.cadastrar(
                    id,
                    nomeTxt.getText(),
                    cpfTxt.getText(),
                    telefoneTxt.getText(),
                    emailTxt.getText()
            );
            atualizarTabelaClientes();
            nomeTxt.setText("");
            cpfTxt.setText("");
            telefoneTxt.setText("");
            emailTxt.setText("");
            
           javax.swing.JOptionPane.showMessageDialog(this,"Cliente cadastrado");
}catch (Exception e){
    javax.swing.JOptionPane.showMessageDialog(this,"ERRO AO CADASTRAR!" + e.getMessage());
        }
        
    }//GEN-LAST:event_cadastrarBtnActionPerformed
    
    //BOTAO DE EXCLUIR CLIENTES DA TABELA
    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed
        // TODO add your handling code here:
       int linhaSelecionada = tabelacadastradostable.getSelectedRow();
       if(linhaSelecionada == 1){
           javax.swing.JOptionPane.showMessageDialog(this, "Selecionar um cliente!");
           return;
       }
       long idCliente = Long.parseLong(tabelacadastradostable.getValueAt(linhaSelecionada, 0).toString());
       clienteController.excluir(idCliente);
       atualizarTabelaClientes();
       javax.swing.JOptionPane.showMessageDialog(this, "Cliente excluido");
    }//GEN-LAST:event_excluirBtnActionPerformed
  
    
    //BOTÃO PARA AGENDAR CLIENTES
    
    private void agendarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendarBtnActionPerformed
                                           
    try {
        //Busca o cliente pelo Nome ou ID
        model.Cliente cliente = buscarClientePorIdOuNome(idclientetxt.getText());

        if (cliente == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
            return;
        }

        // Monta o Veículo, Data/Hora e o Serviço a partir do texto da ComboBox
        model.Veiculo veiculo = new model.Veiculo(1, veiculoTxt.getText(), "N/A", cliente);
        java.time.LocalDateTime dataHora = java.time.LocalDateTime.parse(
            dataTxt.getText().trim() + " " + horatxt.getText().trim(),
            java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        );
        String nomeServico = tiposercomboBox.getSelectedItem().toString();
        model.TipoServico servico = new model.TipoServico(1, nomeServico, "", 0.0);

        // Verifica conflito de dia e horário
        for (model.Agendamento a : agendamentoController.listarTodos()) {
            if (a.getStatus() != model.StatusAgendamento.CANCELADO && a.getDataHora().equals(dataHora)) {
                javax.swing.JOptionPane.showMessageDialog(this, "Já existe um agendamento neste dia e horário!");
                return;
            }
        }

        // Agenda, limpa os campos e atualiza a tabela
        if (agendamentoController.agendarServico(cliente, veiculo, servico, dataHora)) {
            idclientetxt.setText("");
            veiculoTxt.setText("");
            dataTxt.setText("");
            horatxt.setText("");
            atualizarTabelaAgendamentos();
            javax.swing.JOptionPane.showMessageDialog(this, "Serviço Agendado!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro real: " + e.toString());
    }

    }//GEN-LAST:event_agendarBtnActionPerformed
    //EXCLUIR ESSA PARTE POIS COLOQUEI O COMBO BOX SO COM OS NOMES DO SERVICOS
    private void tiposercomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiposercomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiposercomboBoxActionPerformed
    
    //BOTAO DE ATUALIZAÇÃO DOS CLIENTES AGENDADOS 
    private void atualizaragenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaragenBtnActionPerformed
    atualizarTabelaAgendamentos();

       
    }//GEN-LAST:event_atualizaragenBtnActionPerformed

     //BOTAO DE CANCELAR AGENDAMENTO
    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
    int linha = listacliTbl.getSelectedRow();
    if (linha == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um agendamento para cancelar!");
        return;
    }

    model.Agendamento selecionado = agendamentoController.listarTodos().get(linha);
    agendamentoController.alteraStatus(selecionado.getId(), model.StatusAgendamento.CANCELADO);

    atualizarTabelaAgendamentos();
    javax.swing.JOptionPane.showMessageDialog(this, "Agendamento cancelado!");
       
    }//GEN-LAST:event_cancelarBtnActionPerformed
    
    //BOTAO E ATUALIZAR VEICULO DO ABAS DO CADASTRO DO VEICULO
    private void atualizarveicuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarveicuActionPerformed
    atualizarTabelaVeiculos();
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarveicuActionPerformed

    private void modelotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelotxtActionPerformed

    //Botao de cadastro de servico
    private void cadastrarservicoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarservicoBtnActionPerformed
       try{
           long id = Long.parseLong(idserviTxt.getText().trim());
           String nome = nomeserTxt.getText();
           String descricao =descricaoTxt.getText();
           double preco =Double.parseDouble(precoTxt.getText().trim().replace(",","."));
           servicoController.cadastrar(id, nome, descricao, preco);
           atualizarTabelaServico();
           
           idserviTxt.setText("");
           nomeserTxt.setText("");
           descricaoTxt.setText("");
           precoTxt.setText("");
           
           javax.swing.JOptionPane.showMessageDialog(this, "Serviço cadastrado com sucesso!");
    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "ID e Preço devem ser números válidos!");
    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
    
           
       }
        
    }//GEN-LAST:event_cadastrarservicoBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LavaRapidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LavaRapidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LavaRapidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LavaRapidoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LavaRapidoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgendamentoPnl;
    private javax.swing.JPanel ClientePnl;
    private javax.swing.JLabel NomeserLbl;
    private javax.swing.JPanel TipoServicoPnl;
    private javax.swing.JPanel VeiculoPnl;
    private javax.swing.JButton agendarBtn;
    private javax.swing.JLabel agendarLbl;
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JButton atualizaragenBtn;
    private javax.swing.JButton atualizarveicu;
    private javax.swing.JButton cadastarveiBtn;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JButton cadastrarservicoBtn;
    private javax.swing.JLabel cadastrodeusuarioLbl;
    private javax.swing.JLabel cadastroveiLbl;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel cpfLbl;
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JLabel dataLbl;
    private javax.swing.JTextField dataTxt;
    private javax.swing.JLabel descrLbl;
    private javax.swing.JTextField descricaoTxt;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JLabel horaLbl;
    private javax.swing.JTextField horatxt;
    private javax.swing.JLabel idclienteLbl;
    private javax.swing.JTextField idclientetxt;
    private javax.swing.JLabel iddocliente;
    private javax.swing.JTextField iddoclienteTxt;
    private javax.swing.JTextField iddoclientecadasTxt;
    private javax.swing.JTextField idserviTxt;
    private javax.swing.JLabel idservicoLdl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lavaRapidoLbl;
    private javax.swing.JLabel lavarapidoLbl;
    private javax.swing.JLabel listaCadastroLbl;
    private javax.swing.JLabel listaagendados;
    private javax.swing.JTable listacliTbl;
    private javax.swing.JLabel modeloLbl;
    private javax.swing.JTextField modelotxt;
    private javax.swing.JLabel nomeLbl;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JTextField nomeserTxt;
    private javax.swing.JTextField placaveiTxt;
    private javax.swing.JLabel placaveiculoLbl;
    private javax.swing.JLabel precoLbl;
    private javax.swing.JTextField precoTxt;
    private javax.swing.JTable tabelacadastradostable;
    private javax.swing.JTable tabelaveiTbl;
    private javax.swing.JLabel telefoneLbl;
    private javax.swing.JTextField telefoneTxt;
    private javax.swing.JLabel tipodeservicoLbl;
    private javax.swing.JComboBox<String> tiposercomboBox;
    private javax.swing.JTable tiposervicoTable;
    private javax.swing.JLabel tiposevicoLbl;
    private javax.swing.JLabel veiculoLbl;
    private javax.swing.JTextField veiculoTxt;
    // End of variables declaration//GEN-END:variables
}
