package locker.system.gui;
import locker.system.connectors.Connector;
import locker.system.entities.Modulo;
import locker.system.entities.Terminal;
import locker.system.enumerados.Apertura;
import locker.system.enumerados.NBoxes;
import locker.system.repositories.interfaces.I_ModuloRepository;
import locker.system.repositories.interfaces.I_TerminalRepository;
import locker.system.repositories.jdbc.ModuloRepository;
import locker.system.repositories.jdbc.TerminalRepository;
import locker.system.utils.swing.Table;
import locker.system.utils.swing.Validator;
import javax.swing.JOptionPane;
public class Modulos extends javax.swing.JInternalFrame {
    private I_ModuloRepository  mr;
    private I_TerminalRepository  tr;
    public Modulos() {
        super(
                "Formulario de Modulos", 
                false, 
                true, 
                false, 
                true
        );
        initComponents();
        mr = new ModuloRepository(Connector.getConnection());
        tr = new TerminalRepository(Connector.getConnection());
        cargar();
    }
    
    public void cargar(){
        // cargar nBoxes
        cmbBoxes.removeAllItems();
        for(NBoxes n: NBoxes.values()) cmbBoxes.addItem(n);
        
        // cargar apertura
        cmbApertura.removeAllItems();
        for(Apertura a: Apertura.values()) cmbApertura.addItem(a);
        
        // cargar N Terminales
        cmbNTerminal.removeAllItems();
        tr.getAll().forEach(cmbNTerminal::addItem);
        
        //cargar tblModulos
        new Table<Modulo>().cargar(tblModulos, mr.getAll());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSerial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbBoxes = new javax.swing.JComboBox<>();
        cmbApertura = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbNTerminal = new javax.swing.JComboBox<>();
        btnAltaModulo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModulos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarModelo = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Serial:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Modelo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Serial:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Boxes:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Apertura:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("N Terminal:");

        btnAltaModulo.setText("Alta Modulo");
        btnAltaModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaModuloActionPerformed(evt);
            }
        });

        tblModulos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblModulos);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Buscar Modelo:");

        txtBuscarModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarModeloKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo)
                            .addComponent(txtSerial)
                            .addComponent(cmbBoxes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbApertura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbNTerminal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAltaModulo, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(36, 36, 36)
                .addComponent(txtBuscarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(19, 19, 19))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSerial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbNTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAltaModulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaModuloActionPerformed
        // Evento Alta Modulo
        if(!validar()) return;
        Modulo modulo=new Modulo(
                cmbNTerminal.getItemAt(cmbNTerminal.getSelectedIndex()).getIdTerminal(),
                txtModelo.getText(),
                txtSerial.getText(),
                cmbBoxes.getItemAt(cmbBoxes.getSelectedIndex()),
                cmbApertura.getItemAt(cmbApertura.getSelectedIndex())                
        );
        mr.save(modulo);
        JOptionPane.showMessageDialog(this, "Se dio de alta el Modulo id: " + modulo.getIdModulo());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaModuloActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Evento Eliminar Modulo
        int i=tblModulos.getSelectedRow();
        if(i==-1) return;
        Modulo modulo=mr.getByIdModulo(Integer.parseInt(tblModulos.getValueAt(i, 0).toString()));
        if(JOptionPane.showConfirmDialog(this, "Desea borrar el Modulo: "+modulo.getIdModulo()
                +" "+modulo.getModelo()+" "+modulo.getNSerie()
                +" "+ modulo.getNBoxes()+" "+modulo.getApertura()
                +" "+modulo.getIdTerminal()+ "?")!=0) 
            return;
                
        mr.remove(modulo);
        JOptionPane.showMessageDialog(this, "Modulo elimininado!");
        cargar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarModeloKeyReleased
        // Evento Buscar por Modelo?
        String buscarModelo=txtBuscarModelo.getText();
        if(buscarModelo==null) buscarModelo="";
        new Table<Modulo>().cargar(tblModulos, mr.getLikeModelo(buscarModelo));
    }//GEN-LAST:event_txtBuscarModeloKeyReleased

    
    private void limpiar(){
        txtModelo.setText("");
        txtSerial.setText("");
        cmbBoxes.setSelectedIndex(0);
        cmbApertura.setSelectedIndex(0);
        cmbNTerminal.setSelectedIndex(0);
        txtModelo.requestFocus();
    }
    
    private boolean validar(){
        //validar txtNombre texto entre 3 y 25 caracteres
        if(!new Validator(txtModelo).length(3, 25)) return false;
        //validar txtApellido texto entre 3 y 25 caracteres
        if(!new Validator(txtSerial).length(3, 25)) return false;
        return true;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaModulo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Apertura> cmbApertura;
    private javax.swing.JComboBox<NBoxes> cmbBoxes;
    private javax.swing.JComboBox<Terminal> cmbNTerminal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblModulos;
    private javax.swing.JTextField txtBuscarModelo;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtSerial;
    // End of variables declaration//GEN-END:variables
}
