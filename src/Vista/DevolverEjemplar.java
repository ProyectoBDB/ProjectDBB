/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.NEGOCIO_OBJETOS;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class DevolverEjemplar extends javax.swing.JFrame {

    /**
     * Creates new form DevolverEjemplar
     */
    DefaultTableModel model = new DefaultTableModel();
    
    
    
    ArrayList<ArrayList<String>> registroUsuario;
    ArrayList<String> nombretablaUsuario;
    ArrayList<String> attSeleccionadoUsuario;
    ArrayList<String> condicioneUsuario;
    JTable table ; 
    String codigo = "";
    String codigo1 = "";
    String codigo2 = "";
    
    //devolver ejemplar
    ArrayList<ArrayList<String>> registroEjemplar;
    ArrayList<String> nombretablaEjemplar;
    ArrayList<String> condicioneEjemplar;
    ArrayList<String> wherecondicioneEjemplar;
     
    
    //ejemplar
    
    ArrayList<ArrayList<String>> registroEjemplar1;
    ArrayList<String> nombretablaEjemplar1;
    ArrayList<String> condicioneEjemplar1;
    ArrayList<String> wherecondicioneEjemplar1;
    public DevolverEjemplar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jDateChooserDPrestamo = new com.toedter.calendar.JDateChooser();
        jButtonDBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDCedula = new javax.swing.JTextField();
        jButtonDevolver = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Fecha de Devolucion");

        jButtonDBuscar.setText("Buscar");
        jButtonDBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Cedula");

        jButtonDevolver.setText("Devolver");
        jButtonDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jTextFieldDCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonDevolver)
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCerrar))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDBuscar))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooserDPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDevolver)
                    .addComponent(jButtonCerrar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void cargarDatosTablas(ArrayList<ArrayList<String>> registros){
        
        int filas = registros.size()-1;
        int columnas = registros.get(0).size();

        String cuerpo[][] = new String[filas][columnas];
        String cabecera[] = new String[columnas];

        //Cabecera de la tabla
        for (int i = 0; i<columnas; i++){
            cabecera[i] = registros.get(0).get(i);
        }
        //Cuerpo de la tabla
        for (int i = 0; i<filas; i++)
            for (int j = 0; j<columnas; j++)
                cuerpo[i][j] = registros.get(i+1).get(j);

        //Creacion de la tabla 
        table = new JTable(cuerpo, cabecera); 
        table.setPreferredScrollableViewportSize(new Dimension(filas, columnas));
        //jScrollPaneDevolver.setViewportView(new JTable(cuerpo, cabecera));
    }
    
    private void jButtonDBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDBuscarActionPerformed
        try {
            String Cedula = this.jTextFieldDCedula.getText();
            registroUsuario = new ArrayList();
            nombretablaUsuario = new ArrayList();
            attSeleccionadoUsuario = new ArrayList();
            condicioneUsuario = new ArrayList();
            
            nombretablaUsuario.add("PEDIR_EJEMPLAR");
            attSeleccionadoUsuario.add("ID_LIBRO");
            attSeleccionadoUsuario.add("ID_EJEMPLAR");
            attSeleccionadoUsuario.add("ID_EDISION");
            condicioneUsuario.add("ID_USUARIO = '"+Cedula+"' and ESTADO = '0'");
            registroUsuario = (ArrayList<ArrayList<String>>) NEGOCIO_OBJETOS.getInstance().obtenerRegistros( nombretablaUsuario, this.attSeleccionadoUsuario,condicioneUsuario,null,null);
            //this.cargarDatosTablas(registroUsuario);
           /* for(int i = 0; i>registroUsuario.size() ;i++ ){
                model.addColumn(reg);
            }
            jTable1.setModel(model);*/
            String Titulo[]=new String[registroUsuario.get(0).size()];
            
            for (int i = 0; i < Titulo.length; i++) {
                Titulo[i]=registroUsuario.get(0).get(i);
            }
            
            
            DefaultTableModel modelo= new DefaultTableModel(null,Titulo);
            for (int i = 1; i < registroUsuario.size() ; i++) {
                registroUsuario.get(i);
                modelo.addRow(registroUsuario.get(i).toArray());
            }
            this.jTable1.setModel(modelo);
           
            if (registroUsuario.isEmpty()){
                JOptionPane.showMessageDialog(rootPane,"Cedula No Registrada", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception ex) {
           
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
        }
      
    }//GEN-LAST:event_jButtonDBuscarActionPerformed

    private void jButtonDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverActionPerformed
        try {
            // TODO add your handling code here:
            String Cedula = this.jTextFieldDCedula.getText();
            registroUsuario = new ArrayList();
            nombretablaUsuario = new ArrayList();
            attSeleccionadoUsuario = new ArrayList();
            condicioneUsuario = new ArrayList();
            
            nombretablaUsuario.add("PEDIR_EJEMPLAR");
            attSeleccionadoUsuario.add("ID_LIBRO");
            attSeleccionadoUsuario.add("ID_EJEMPLAR");
            attSeleccionadoUsuario.add("ID_EDISION");
            condicioneUsuario.add("ID_USUARIO = '"+Cedula+"'");
            registroUsuario = (ArrayList<ArrayList<String>>) NEGOCIO_OBJETOS.getInstance().obtenerRegistros( nombretablaUsuario, this.attSeleccionadoUsuario,condicioneUsuario,null,null);
           // ArrayList<String> Titulo=registroUsuario.get(0);
           
            
            System.out.println("* * * * * * * * *      "+registroUsuario.get(0));
            registroUsuario.get(0).get(0);
            Date fecha_devolucion = jDateChooserDPrestamo.getDate();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String FECHA_D = df.format(fecha_devolucion);
            nombretablaEjemplar = new ArrayList();
            condicioneEjemplar = new ArrayList();
            wherecondicioneEjemplar = new ArrayList();
            nombretablaEjemplar.add("PEDIR_EJEMPLAR");
            condicioneEjemplar.add("ESTADO = '1', FECHA_DEVOLUCION = '"+FECHA_D+"' ");
            wherecondicioneEjemplar.add("ID_LIBRO= '"+codigo+"' AND ID_EJEMPLAR= '"+codigo1+"' AND ID_EDISION= '"+codigo2+"'");
             try {
            
                NEGOCIO_OBJETOS.getInstance().actualizarCampos(nombretablaEjemplar, condicioneEjemplar, wherecondicioneEjemplar);
                JOptionPane.showMessageDialog(rootPane, "Se ha actualizado correctamente");

               ///
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);

            }
            nombretablaEjemplar1 = new ArrayList();
            condicioneEjemplar1 = new ArrayList();
            wherecondicioneEjemplar1 = new ArrayList();
            nombretablaEjemplar1.add("EJEMPLAR");
            condicioneEjemplar1.add("ESTADO = '0'");
            wherecondicioneEjemplar1.add("ID_LIBRO= '"+codigo+"' AND ID_EJEMPLAR= '"+codigo1+"' AND ID_EDISION= '"+codigo2+"'");
             try {

                NEGOCIO_OBJETOS.getInstance().actualizarCampos(nombretablaEjemplar1, condicioneEjemplar1, wherecondicioneEjemplar1);
                JOptionPane.showMessageDialog(rootPane, "Se ha actualizado correctamente");

               ///
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);

            }
            
            try {

                NEGOCIO_OBJETOS.getInstance().actualizarCampos(nombretablaEjemplar, condicioneEjemplar, wherecondicioneEjemplar);
                JOptionPane.showMessageDialog(rootPane, "Se ha actualizado correctamente");

               ///
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);

            }
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(DevolverEjemplar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDevolverActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        codigo = (String) jTable1.getValueAt(jTable1.getSelectedRow(),0);
        codigo1 = (String) jTable1.getValueAt(jTable1.getSelectedRow(),1);
        codigo2 = (String) jTable1.getValueAt(jTable1.getSelectedRow(),2);
        System.out.println("esto se devuelve;;;;;;;;;;;;");
        System.out.println(codigo);
        System.out.println(codigo1);
        System.out.println(codigo2);
        System.out.println();
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(DevolverEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DevolverEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DevolverEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DevolverEjemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DevolverEjemplar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonDBuscar;
    private javax.swing.JButton jButtonDevolver;
    private com.toedter.calendar.JDateChooser jDateChooserDPrestamo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDCedula;
    // End of variables declaration//GEN-END:variables
}
