
package vista;

import controlador.ControladorProducto;
import javax.swing.JTextField;


public class Actualizar extends javax.swing.JFrame {
       ControladorProducto cp; 
 
    public Actualizar() {
        initComponents();
    }
     public void setControlador(ControladorProducto cp){
        this.cp = cp;
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelInventario = new javax.swing.JLabel();
        jButtonAct2 = new javax.swing.JButton();
        campoNombreA = new javax.swing.JTextField();
        campoPrecioA = new javax.swing.JTextField();
        campoInventarioA = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Producto");
        setAlwaysOnTop(true);

        jLabelMensaje.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelMensaje.setForeground(new java.awt.Color(255, 0, 0));
        jLabelMensaje.setText("Ingrese los nuevos valores");

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(204, 0, 204));
        jLabelNombre.setText("Nombre");

        jLabelPrecio.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(153, 0, 153));
        jLabelPrecio.setText("Precio");

        jLabelInventario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabelInventario.setForeground(new java.awt.Color(153, 0, 153));
        jLabelInventario.setText("Inventario");

        jButtonAct2.setAction(jButtonAct2.getAction());
        jButtonAct2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButtonAct2.setForeground(new java.awt.Color(0, 0, 204));
        jButtonAct2.setText("Actualizar Producto");
        jButtonAct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accionActualizarProducto(evt);
            }
        });

        campoNombreA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabelMensaje))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelPrecio)
                            .addComponent(jLabelInventario))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNombreA, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(campoPrecioA)
                            .addComponent(campoInventarioA)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jButtonAct2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelMensaje)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(campoNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(campoPrecioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInventario)
                    .addComponent(campoInventarioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButtonAct2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreAActionPerformed

    private void accionActualizarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accionActualizarProducto
        cp.eventoActualizar(this);
    }//GEN-LAST:event_accionActualizarProducto

    public String getCampoInventarioA() {
        return campoInventarioA.getText();
    }

    public String getCampoNombreA() {
        return campoNombreA.getText();
    }

    public String getCampoPrecioA() {
        return campoPrecioA.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoInventarioA;
    private javax.swing.JTextField campoNombreA;
    private javax.swing.JTextField campoPrecioA;
    private javax.swing.JButton jButtonAct2;
    private javax.swing.JLabel jLabelInventario;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
