
package vista;

import javax.swing.JLabel;

public class Informe extends javax.swing.JFrame {

    public Informe() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabelMayor = new javax.swing.JLabel();
        jLabelMenor = new javax.swing.JLabel();
        jLabelPromedio = new javax.swing.JLabel();
        jLabelInventario = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelMayor.setText("Producto precio mayor:");

        jLabelMenor.setText("Producto precio menor:");

        jLabelPromedio.setText("Promedio precios:");

        jLabelInventario.setText("Valor del inventario:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInventario)
                    .addComponent(jLabelPromedio)
                    .addComponent(jLabelMenor)
                    .addComponent(jLabelMayor))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelMayor)
                .addGap(46, 46, 46)
                .addComponent(jLabelMenor)
                .addGap(56, 56, 56)
                .addComponent(jLabelPromedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabelInventario)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getInventario() {
        return jLabelInventario.getText();
    }

    public String getMayor() {
        return jLabelMayor.getText();
    }

    public String getMenor() {
        return jLabelMenor.getText();
    }

    public String getPromedio() {
        return jLabelPromedio.getText();
    }

    public void setInventario(String inv) {
        jLabelInventario.setText(inv);
    }

    public void setMayor(String mayor) {
         jLabelMayor.setText(mayor);
    }

    public void setMenor(String Menor) {
        jLabelMenor.setText(Menor);
    }

    public void setPromedio(String Promedio) {
        jLabelPromedio.setText(Promedio);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelInventario;
    private javax.swing.JLabel jLabelMayor;
    private javax.swing.JLabel jLabelMenor;
    private javax.swing.JLabel jLabelPromedio;
    // End of variables declaration//GEN-END:variables
}
