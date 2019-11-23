package locker.system.gui;
import locker.system.connectors.Connector;
import locker.system.entities.Ubicacion;
import locker.system.repositories.interfaces.I_TerminalRepository;
import locker.system.repositories.interfaces.I_UbicacionRepository;
import locker.system.repositories.jdbc.TerminalRepository;
import locker.system.repositories.jdbc.UbicacionRepository;
import locker.system.utils.swing.Table;
import locker.system.utils.swing.Validator;
import javax.swing.JOptionPane;
public class Ubicaciones extends javax.swing.JInternalFrame {
    private I_TerminalRepository tr;
    private I_UbicacionRepository ur;
    public Ubicaciones() {
        super(
                "Formulario de Ubicaciones", 
                false, 
                true, 
                false, 
                true
        );
        initComponents();
        tr = new TerminalRepository(Connector.getConnection());
        ur = new UbicacionRepository(Connector.getConnection());
        cargar();
    }
    
    public void cargar(){
        
        new Table<Ubicacion>().cargar(tblUbicaciones, ur.getAll());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        txtBarrio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLocacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAltaUbicacion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtBuscarDireccion = new javax.swing.JTextField();
        txtBuscarLocacion = new javax.swing.JTextField();
        btnEliminarUbicacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUbicaciones = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Provincia");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Barrio");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Dirección");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Locación");

        btnAltaUbicacion.setText("Alta Ubicación");
        btnAltaUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaUbicacionActionPerformed(evt);
            }
        });

        txtBuscarDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDireccionKeyReleased(evt);
            }
        });

        txtBuscarLocacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarLocacionKeyReleased(evt);
            }
        });

        btnEliminarUbicacion.setText("Eliminar");
        btnEliminarUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUbicacionActionPerformed(evt);
            }
        });

        tblUbicaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUbicaciones);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Buscar por Dirección");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Buscar por Locación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(66, 66, 66)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(66, 66, 66)
                                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAltaUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLocacion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarLocacion, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnEliminarUbicacion)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLocacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAltaUbicacion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtBuscarDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtBuscarLocacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminarUbicacion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDireccionKeyReleased
        // Evento Buscar Direccion
        String buscarDir = txtBuscarDireccion.getText();
        if(buscarDir == null) buscarDir = "";
        new Table<Ubicacion>().cargar(tblUbicaciones, ur.getLikeDireccion(buscarDir));
    }//GEN-LAST:event_txtBuscarDireccionKeyReleased

    private void txtBuscarLocacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarLocacionKeyReleased
        // Evento Buscar Locacion
        String buscarLocal = txtBuscarLocacion.getText();
        if(buscarLocal == null) buscarLocal = "";
        new Table<Ubicacion>().cargar(tblUbicaciones, ur.getLikeLocacion(buscarLocal));
    }//GEN-LAST:event_txtBuscarLocacionKeyReleased

    private void btnAltaUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaUbicacionActionPerformed
        // Evento Alta Ubicacion
        if(!validar()) return;
        Ubicacion ubicacion = new Ubicacion(
                txtProvincia.getText(),
                txtBarrio.getText(),
                txtDireccion.getText(),
                txtLocacion.getText()        
        );
        ur.save(ubicacion);
        JOptionPane.showMessageDialog(this, "Se dio de alta la Ubicacion: " + ubicacion.getIdUbicacion());
        limpiar();
        cargar();
    }//GEN-LAST:event_btnAltaUbicacionActionPerformed

    private void btnEliminarUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUbicacionActionPerformed
        // Evento Eliminar Ubicacion
        int i=tblUbicaciones.getSelectedRow();
        if(i==-1) return;
        Ubicacion ubicacion=ur.getByIdUbicacion(Integer.parseInt(tblUbicaciones.getValueAt(i, 0)+""));
        if(!tr.getByUbicacion(ubicacion).isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "No se puede borrar la Dirección porque tiene un Equipo!", 
                    "Cuidado",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(JOptionPane.showConfirmDialog(this, "Desea borrar la Ubicación: "+ubicacion.getIdUbicacion()
                +" "+ubicacion.getProvincia()+" "+ubicacion.getBarrio()
                +" "+ubicacion.getDireccion()+" "+ubicacion.getLocacion()+ "?")!=0)
            return;
        
        ur.remove(ubicacion);
        JOptionPane.showMessageDialog(this, "Ubicacion elimininada!");
        cargar();
    }//GEN-LAST:event_btnEliminarUbicacionActionPerformed

    
    public void limpiar(){
        txtProvincia.setText("");
        txtBarrio.setText("");
        txtDireccion.setText("");
        txtLocacion.setText("");
        txtProvincia.requestFocus();
    }
    
    private boolean validar(){
        //validar txtProvincia texto entre 3 y 25 caracteres
        if(!new Validator(txtProvincia).length(3, 20)) return false;
        //validar txtBarrio texto entre 3 y 25 caracteres
        if(!new Validator(txtBarrio).length(3, 20)) return false;
        //validar txtDireccion texto entre 3 y 25 caracteres
        if(!new Validator(txtDireccion).length(3, 30)) return false;
        //validar txtLocacion texto entre 3 y 25 caracteres
        if(!new Validator(txtLocacion).length(3, 20)) return false;
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaUbicacion;
    private javax.swing.JButton btnEliminarUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblUbicaciones;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtBuscarDireccion;
    private javax.swing.JTextField txtBuscarLocacion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtLocacion;
    private javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables
}
