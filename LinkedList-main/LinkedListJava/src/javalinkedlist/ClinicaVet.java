package javalinkedlist;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ClinicaVet extends javax.swing.JFrame {
    LinkedList<Paciente> lista = new LinkedList<>();
    Comparator<Paciente> compareTempo = 
            (Paciente p1, Paciente p2) ->
                    p1.getTempo() - p2.getTempo();
    
    Comparator<Paciente> comparePrioridade = 
            (Paciente p1, Paciente p2) ->
                    p1.getPrioridade()- p2.getPrioridade();
    
    public ClinicaVet() {
        initComponents();
        carregaArquivo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblProx = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtAnimal = new javax.swing.JTextField();
        txtNivelEmergencia = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        txtNumeroAtendimento = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnBuscarContains = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAtendimento = new javax.swing.JTextArea();
        btnResolver = new javax.swing.JButton();
        txtPosicaoRemove = new javax.swing.JTextField();
        btnOrdPrioridade = new javax.swing.JButton();
        btnOrdNome = new javax.swing.JButton();
        btnOrdPrioridade1 = new javax.swing.JButton();
        txtTempoEmergencia = new javax.swing.JTextField();
        txtTutor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 0, 255));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("Proximo:");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/veterinario (1).png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(102, 256));
        jLabel1.setMinimumSize(new java.awt.Dimension(102, 256));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        txtAnimal.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Pet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        txtAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnimalActionPerformed(evt);
            }
        });

        txtNivelEmergencia.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtNivelEmergencia.setAction(btnOrdPrioridade1.getAction());
        txtNivelEmergencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nivel Emergência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        txtNivelEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNivelEmergenciaActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/cadastro.png"))); // NOI18N
        btnAdd.setText("Adicionar Atendimento");
        btnAdd.setContentAreaFilled(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtNumeroAtendimento.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtNumeroAtendimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "numero atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/procurarVet.png"))); // NOI18N
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnBuscarContains.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarContains.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnBuscarContains.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/buscaPet.png"))); // NOI18N
        btnBuscarContains.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarContains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarContainsActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Painel de Atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        listAtendimento.setEditable(false);
        listAtendimento.setColumns(20);
        listAtendimento.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        listAtendimento.setRows(5);
        listAtendimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N
        jScrollPane1.setViewportView(listAtendimento);

        btnResolver.setBackground(new java.awt.Color(255, 255, 255));
        btnResolver.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnResolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/veterinario (1)_1.png"))); // NOI18N
        btnResolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResolver.setLabel("Atendimento");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        txtPosicaoRemove.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtPosicaoRemove.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N

        btnOrdPrioridade.setBackground(new java.awt.Color(255, 255, 255));
        btnOrdPrioridade.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdPrioridade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/btn atendimento.png"))); // NOI18N
        btnOrdPrioridade.setText("Ordenar por emergencia");
        btnOrdPrioridade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdPrioridade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrdPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdPrioridadeActionPerformed(evt);
            }
        });

        btnOrdNome.setBackground(new java.awt.Color(255, 255, 255));
        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/btn atendimento.png"))); // NOI18N
        btnOrdNome.setText("Ordenar por animal");
        btnOrdNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        btnOrdPrioridade1.setBackground(new java.awt.Color(255, 255, 255));
        btnOrdPrioridade1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnOrdPrioridade1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javalinkedlist/btn atendimento.png"))); // NOI18N
        btnOrdPrioridade1.setText("Ordenar por tempo emergencia");
        btnOrdPrioridade1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdPrioridade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdPrioridade1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrdPrioridade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdPrioridade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnResolver)
                        .addGap(5, 5, 5)
                        .addComponent(txtPosicaoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPosicaoRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrdPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnOrdPrioridade1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
        );

        txtTempoEmergencia.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtTempoEmergencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tempo Atendimento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        txtTempoEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempoEmergenciaActionPerformed(evt);
            }
        });

        txtTutor.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        txtTutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome Tutor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 18))); // NOI18N
        txtTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNivelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarContains, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnBuscarContains, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNivelEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txtTempoEmergencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        txtNivelEmergencia.getAccessibleContext().setAccessibleName("txtTempo");
        jPanel3.getAccessibleContext().setAccessibleName("Painel de atendimento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "dados.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Paciente p = new Paciente();
                leitura = line.split(",");
                System.out.println("Nome Pet: "+leitura[0]+", Nome Tutor: "+leitura[1] + ", Emergência= " + leitura[2] + " , tempo=" + leitura[3] + "");
                p.setNomePet(leitura[0]);
                p.setNomeTutor(leitura[1]);
                p.setPrioridade(Integer.parseInt(leitura[2]));
                int tempo = (Integer.parseInt(leitura[3]));
                p.setTempo(tempo);
                lista.add(p); 
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void mostra(){
        listAtendimento.setText("");
        if(!lista.isEmpty())
            for(Paciente p:lista)
                listAtendimento.append(p+"\n");
    }// fim mostra
   
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       Paciente p = new Paciente();
       p.setNomePet(txtAnimal.getText());
       p.setNomeTutor(txtTutor.getText());
       p.setPrioridade(
         Integer.parseInt(txtNivelEmergencia.getText()) );
       p.setTempo(
               Integer.parseInt(txtTempoEmergencia.getText()));
       if(txtNumeroAtendimento.getText().equals(""))
           lista.add(p);
       else
           lista.add(Integer.parseInt(txtNumeroAtendimento.getText()),p);
       mostra();
    }//GEN-LAST:event_btnAddActionPerformed

   
    
    
    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        Paciente p;
        if(!lista.isEmpty()){
            if(txtPosicaoRemove.getText().equals(""))
                p = lista.remove();
            else
                p = lista.remove(
                    Integer.parseInt(
                        txtPosicaoRemove.getText()) );
            
            lblProx.setText("Prox: "+p.getNomePet() + ", Tutor: "+p.getNomeTutor());
            mostra();
            if(lista.isEmpty()){
                lblProx.setText("Sem Pacientes");
            }
        }// fim if isEmpty        
                
    }//GEN-LAST:event_btnResolverActionPerformed

    private void btnOrdPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdPrioridadeActionPerformed
        lista.sort(comparePrioridade);
        mostra();
    }//GEN-LAST:event_btnOrdPrioridadeActionPerformed

    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed
        Collections.sort(lista);
        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int c=0;
        boolean encontrou = false;
        for(Paciente p:lista){
            if(p.getNomePet().contains(txtAnimal.getText())){
                JOptionPane.showMessageDialog
                    (null, "Buscar numero atendimento "+c);
                encontrou = true;
            }
            c++;
        }// fim for
        if(!encontrou)
            JOptionPane.showMessageDialog
                    (null, "Não foi encontrado o atendimento ");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnBuscarContainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarContainsActionPerformed
        Paciente p = new Paciente();
        p.setNomePet(txtAnimal.getText());
        int n = lista.indexOf(p);
        if(lista.contains(p))   
            JOptionPane.showMessageDialog
                    (null, "Atendimento encontrado no numero "+n);
        else
            JOptionPane.showMessageDialog
                    (null, "Não foi encontrado nennhum atendimento "+n);
    }//GEN-LAST:event_btnBuscarContainsActionPerformed

    private void btnOrdPrioridade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdPrioridade1ActionPerformed
        // TODO add your handling code here:
        lista.sort(compareTempo);
        mostra();
    }//GEN-LAST:event_btnOrdPrioridade1ActionPerformed

    private void txtAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnimalActionPerformed

    private void txtTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTutorActionPerformed

    private void txtNivelEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNivelEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNivelEmergenciaActionPerformed

    private void txtTempoEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempoEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempoEmergenciaActionPerformed

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
            java.util.logging.Logger.getLogger(ClinicaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicaVet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicaVet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscarContains;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.JButton btnOrdPrioridade;
    private javax.swing.JButton btnOrdPrioridade1;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JTextArea listAtendimento;
    private javax.swing.JTextField txtAnimal;
    private javax.swing.JTextField txtNivelEmergencia;
    private javax.swing.JTextField txtNumeroAtendimento;
    private javax.swing.JTextField txtPosicaoRemove;
    private javax.swing.JTextField txtTempoEmergencia;
    private javax.swing.JTextField txtTutor;
    // End of variables declaration//GEN-END:variables
}
