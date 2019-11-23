package locker.system.gui;
import locker.system.connectors.Connector;
import locker.system.entities.Terminal;
import locker.system.entities.Ubicacion;
import locker.system.enumerados.Modelo;
import locker.system.enumerados.Ploteo;
import locker.system.enumerados.Tipo;
import locker.system.enumerados.TnBoxes;
import locker.system.repositories.interfaces.I_ModuloRepository;
import locker.system.repositories.interfaces.I_TerminalRepository;
import locker.system.repositories.interfaces.I_UbicacionRepository;
import locker.system.repositories.jdbc.ModuloRepository;
import locker.system.repositories.jdbc.TerminalRepository;
import locker.system.repositories.jdbc.UbicacionRepository;
import locker.system.utils.swing.Table;
import locker.system.utils.swing.Validator;
import javax.swing.JOptionPane;
public class Terminales extends javax.swing.JInternalFrame {
    private I_TerminalRepository tr;
    private I_UbicacionRepository ur;
    private I_ModuloRepository mr;
    public Terminales() {
        super(
                "Formulario de Terminales", 
                false, 
                true, 
                false, 
                true
        );
        initComponents();
        tr = new TerminalRepository(Connector.getConnection());
        ur = new UbicacionRepository(Connector.getConnection());
        mr = new ModuloRepository(Connector.getConnection());
        cargar();
        
    }
    
    public void cargar(){
        
        cmbBoxes.removeAllItems();
        for(TnBoxes n: TnBoxes.values()) cmbBoxes.addItem(n);
        
        cmbTipo.removeAllItems();
        for(Tipo t: Tipo.values()) cmbTipo.addItem(t);
        
        cmbModelo.removeAllItems();
        for(Modelo m: Modelo.values()) cmbModelo.addItem(m);
        
        cmbPloteo.removeAllItems();
        for(Ploteo p: Ploteo.values()) cmbPloteo.addItem(p);
        
        cmbUbicacion.removeAllItems();
        ur.getAll().forEach(cmbUbicacion::addItem);
        
        new Table<Terminal>().cargar(tblTerminal, tr.getAll());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombrePc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        cmbModelo = new javax.swing.JComboBox<>();
        cmbBoxes = new javax.swing.JComboBox<>();
        cmbPloteo = new javax.swing.JComboBox<>();
        cmbUbicacion = new javax.swing.JComboBox<>();
        btnAltaTerminal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarNombrePc = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTerminal = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NombrePc:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Boxes:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ploteo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Ubicación:");

        btnAltaTerminal.setText("Alta Terminal");
        btnAltaTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaTerminalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Buscar Nombre Pc");

        txtBuscarNombrePc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombrePcKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblTerminal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTerminal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPloteo, 0, 292, Short.MAX_VALUE)
                                    .addComponent(cmbBoxes, 0, 292, Short.MAX_VALUE)
                                    .addComponent(cmbModelo, 0, 292, Short.MAX_VALUE)
                                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNombrePc)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAltaTerminal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbUbicacion, 0, 290, Short.MAX_VALUE))))
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarNombrePc)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(8, 8, 8))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombrePc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbPloteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAltaTerminal)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscarNombrePc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Evento Eliminar Terminal
        int i=tblTerminal.getSelectedRow();
        if(i==-1) return;
        Terminal terminal=tr.getByIdTerminal(Integer.parseInt(tblTerminal.getValueAt(i, 0)+""));
        if(!mr.getByTerminal(terminal).isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "No se puede borrar la Terminal porque tiene Modulos!", 
                    "Cuidado",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(JOptionPane.showConfirmDialog(this, "Desea borrar la Terminal: "+terminal.getIdTerminal()
                +" "+terminal.getNombrePc()+" "+terminal.getTipo()
                +" "+terminal.getModelo() +" "+terminal.getTnBoxes()
                +" "+terminal.getTnBoxes()+ "?")!=0) 
            return;
                
        tr.remove(terminal);
        JOptionPane.showMessageDialog(this, "Terminal elimininada!");
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAltaTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTerminalActionPerformed
        // Evento Alta Terminal
        if(!validar()) return;
        Terminal terminal = new Terminal(
                cmbUbicacion.getItemAt(cmbUbicacion.getSelectedIndex()).getIdUbicacion(), 
                txtNombrePc.getText(), 
                cmbTipo.getItemAt(cmbTipo.getSelectedIndex()), 
                cmbModelo.getItemAt(cmbModelo.getSelectedIndex()), 
                cmbBoxes.getItemAt(cmbBoxes.getSelectedIndex()), 
                cmbPloteo.getItemAt(cmbPloteo.getSelectedIndex())
        );
        tr.save(terminal);
        JOptionPane.showMessageDialog(this, "Se dio de alta la Terminal: " + terminal.getIdTerminal());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaTerminalActionPerformed

    private void txtBuscarNombrePcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombrePcKeyReleased
        // Evento Buscar por Nombre de Pc
        String buscarNombre=txtBuscarNombrePc.getText();
        if(buscarNombre==null) buscarNombre="";
        new Table<Terminal>().cargar(tblTerminal, tr.getLikeNombrePc(buscarNombre));
    }//GEN-LAST:event_txtBuscarNombrePcKeyReleased

    public void limpiar(){
        txtNombrePc.setText("");
        cmbBoxes.setSelectedIndex(0);
        cmbModelo.setSelectedIndex(0);
        cmbPloteo.setSelectedIndex(0);
        cmbTipo.setSelectedIndex(0);
        cmbUbicacion.setSelectedIndex(0);
        txtNombrePc.requestFocus();
    }
    
    private boolean validar(){
        //validar txtNombrePc texto entre 3 y 25 caracteres
        if(!new Validator(txtNombrePc).length(3, 25)) return false;
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaTerminal;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<TnBoxes> cmbBoxes;
    private javax.swing.JComboBox<Modelo> cmbModelo;
    private javax.swing.JComboBox<Ploteo> cmbPloteo;
    private javax.swing.JComboBox<Tipo> cmbTipo;
    private javax.swing.JComboBox<Ubicacion> cmbUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblTerminal;
    private javax.swing.JTextField txtBuscarNombrePc;
    private javax.swing.JTextField txtNombrePc;
    // End of variables declaration//GEN-END:variables
}
