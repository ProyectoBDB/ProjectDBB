/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.NEGOCIO_OBJETOS;
import java.awt.Dimension;
import java.sql.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author juand
 */
public class Update extends javax.swing.JFrame {

    ArrayList<String> nombresTabla;
    ArrayList<String> attSeleccionados;
    ArrayList<String> condSeleccionados;
    ArrayList<String> wherecondicion;
    ArrayList<ArrayList<String>> registros;
    String nombre_tabla;
    
    String identificador="";

    public Update() {
        try {
            initComponents();
            setLocationRelativeTo(null);
            setTitle("Udate");
            boton_agregar_atributo.setEnabled(false);
            boton_agregar_condicion.setEnabled(false);
            boton_quitar_atributo.setEnabled(false);
            boton_quitar_condicion.setEnabled(false);
            boton_Update.setEnabled(false);
            jTextFieldCondicion.setEditable(false);
            
            ArrayList<String> nombres = NEGOCIO_OBJETOS.getInstance().getNombresTablas();
            for(int i = 0; i<nombres.size();i++){
                this.combo_tablas.addItem(nombres.get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo_tablas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_atributos_tabla = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_atributos_selec = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combo_atributos = new javax.swing.JComboBox<>();
        text_valor_condicion = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_condiciones = new javax.swing.JList<>();
        boton_agregar_atributo = new javax.swing.JButton();
        boton_quitar_atributo = new javax.swing.JButton();
        boton_agregar_condicion = new javax.swing.JButton();
        boton_quitar_condicion = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        boton_cancelar = new javax.swing.JButton();
        boton_Update = new javax.swing.JButton();
        jButtonGuardarCambios = new javax.swing.JButton();
        jScrollPaneTablas = new javax.swing.JScrollPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCondicion = new javax.swing.JTextField();
        jLabelAtributoP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Update");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Tabla");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Atributos Tabla");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setText("Atributos Seleccionados");

        combo_tablas.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        combo_tablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_tablasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                combo_tablasMousePressed(evt);
            }
        });
        combo_tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tablasActionPerformed(evt);
            }
        });

        lista_atributos_tabla.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jScrollPane1.setViewportView(lista_atributos_tabla);

        lista_atributos_selec.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jScrollPane2.setViewportView(lista_atributos_selec);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("Cambio de Atributos");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setText("Lista de Cambios");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setText("Atributo");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setText("Valor");

        combo_atributos.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        combo_atributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_atributosActionPerformed(evt);
            }
        });

        text_valor_condicion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        lista_condiciones.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jScrollPane3.setViewportView(lista_condiciones);

        boton_agregar_atributo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        boton_agregar_atributo.setText("Agregar");
        boton_agregar_atributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_atributoActionPerformed(evt);
            }
        });

        boton_quitar_atributo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        boton_quitar_atributo.setText("Quitar");
        boton_quitar_atributo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_quitar_atributoActionPerformed(evt);
            }
        });

        boton_agregar_condicion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        boton_agregar_condicion.setText("Agregar");
        boton_agregar_condicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_condicionActionPerformed(evt);
            }
        });

        boton_quitar_condicion.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        boton_quitar_condicion.setText("Quitar");
        boton_quitar_condicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_quitar_condicionActionPerformed(evt);
            }
        });

        jButtonCargar.setText("Cargar");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        panel1.setBackground(java.awt.Color.darkGray);

        boton_cancelar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        boton_cancelar.setText("Cancelar");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });

        boton_Update.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        boton_Update.setText("Actualizar");
        boton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_UpdateActionPerformed(evt);
            }
        });

        jButtonGuardarCambios.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButtonGuardarCambios.setText("Guardar Cambios");
        jButtonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(boton_Update)
                .addGap(108, 108, 108)
                .addComponent(jButtonGuardarCambios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_cancelar)
                .addGap(121, 121, 121))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_Update)
                    .addComponent(boton_cancelar)
                    .addComponent(jButtonGuardarCambios))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setText("Condicion  ");

        jLabelAtributoP.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabelAtributoP.setText("atributo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(311, 311, 311)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boton_agregar_atributo))))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boton_quitar_atributo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(combo_tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonCargar)))
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_atributos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(text_valor_condicion))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boton_agregar_condicion)
                                    .addComponent(jLabelAtributoP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boton_quitar_condicion)
                                        .addGap(118, 118, 118))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCondicion)))))
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTablas)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_tablas, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(jButtonCargar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneTablas, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_agregar_atributo)
                            .addComponent(boton_quitar_atributo))
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(combo_atributos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(text_valor_condicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(boton_agregar_condicion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boton_quitar_condicion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAtributoP))
                .addGap(60, 60, 60)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
//        try {
//            Manejador.getInstancia().rollBack();
//            this.dispose();
//        } catch (Exception e) {
//        }
//        
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void boton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_UpdateActionPerformed
        
        String condicion = "";
        wherecondicion = new ArrayList<>();
      
        condicion = identificador+"="+jTextFieldCondicion.getText();
        wherecondicion.add(condicion);
        System.out.println(condicion);
        try {
            
            NEGOCIO_OBJETOS.getInstance().actualizarCampos(nombresTabla, condSeleccionados, wherecondicion);
            JOptionPane.showMessageDialog(rootPane, "Se ha actualizado correctamente");
            
            jTextFieldCondicion.setText("");
           ///
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_boton_UpdateActionPerformed

    private void combo_atributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_atributosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_atributosActionPerformed

    private void combo_tablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tablasActionPerformed
        // evento del combo box
        this.nombresTabla = new ArrayList();
        nombresTabla.add(this.combo_tablas.getSelectedItem().toString());
        if(!this.combo_tablas.getSelectedItem().toString().isEmpty()){
            try {
                //try {
                registros = (ArrayList<ArrayList<String>>) NEGOCIO_OBJETOS.getInstance().obtenerRegistros(nombresTabla, null, null, null, null);
                this.cargarDatosTablas(registros);
                // }
            } catch (Exception ex) {
                Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }   
    }//GEN-LAST:event_combo_tablasActionPerformed

    private void combo_tablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tablasMouseClicked
        
    }//GEN-LAST:event_combo_tablasMouseClicked

    private void boton_agregar_atributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_atributoActionPerformed
       //  this.condicionAtributos.removeAllItems();
        
        String nombre = this.lista_atributos_tabla.getModel().getElementAt(this.lista_atributos_tabla.getSelectedIndex());
        
        if(!this.attSeleccionados.contains(nombre) ){
            this.attSeleccionados.add(nombre);
            DefaultListModel model = new DefaultListModel();
            for(int i=0; i<attSeleccionados.size(); i++){
                model.addElement(attSeleccionados.get(i));
            }
            this.lista_atributos_selec.setModel(model);
            combo_atributos.addItem(nombre);
            boton_quitar_atributo.setEnabled(true);
            boton_agregar_condicion.setEnabled(true);
            text_valor_condicion.setEnabled(true);
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Ya se a seleccionado este atributo");
        }
        
    }//GEN-LAST:event_boton_agregar_atributoActionPerformed

    
    
    

    // correcto
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
        JTable table = new JTable(cuerpo, cabecera); 
        table.setPreferredScrollableViewportSize(new Dimension(filas, columnas));
        jScrollPaneTablas.setViewportView(new JTable(cuerpo, cabecera));
        

    }
    
    private void boton_quitar_atributoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_quitar_atributoActionPerformed
        String nombre = this.lista_atributos_selec.getModel().getElementAt(this.lista_atributos_selec.getSelectedIndex());
        int num = this.lista_atributos_selec.getSelectedIndex();
        this.attSeleccionados.remove(nombre);
        DefaultListModel model = new DefaultListModel();
        for(int i=0; i<attSeleccionados.size(); i++){
            model.addElement(attSeleccionados.get(i));
        }
        this.lista_atributos_selec.setModel(model);
        System.out.println("posicion del numero : "+num);
        combo_atributos.removeItemAt(num);
    }//GEN-LAST:event_boton_quitar_atributoActionPerformed

    private void boton_agregar_condicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_condicionActionPerformed
        
        int verificador;
        jTextFieldCondicion.setEditable(true);
        String nombre = this.combo_atributos.getSelectedItem().toString();
        //jComboBoxLogico.setEnabled(true);
        if(this.condSeleccionados.contains(nombre)){
            JOptionPane.showMessageDialog(rootPane, "Ese atributo ya se ha seleccionado", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
//        else if(this.combo_condiciones.getSelectedItem().toString().isEmpty()){
//            JOptionPane.showMessageDialog(rootPane, "Se debe escoger un condicional", "Aviso", JOptionPane.ERROR_MESSAGE);
//        }
        else if(this.text_valor_condicion.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Se debe especificar un valor para la condicion", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        else if(this.combo_atributos.getSelectedItem().equals("Ningún atributo")){
            JOptionPane.showMessageDialog(rootPane, "Se debe escoger un atributo", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        else{
            verificador=0;
            String condGenerada = nombre +"="+"'" + this.text_valor_condicion.getText() + "'";
            for (int k=0; k<condSeleccionados.size();k++){
                if(condSeleccionados.get(k).contains(nombre)){
                    verificador=1;
                    JOptionPane.showMessageDialog(null, "Ya se a seleccionado este atributo");
                }
            }
            if(verificador==0){
                this.condSeleccionados.add(condGenerada);
                DefaultListModel model = new DefaultListModel();
                for(int i=0; i<condSeleccionados.size(); i++){
                    // las condiciones se almacenan en la lista condSeleccionados

                    model.addElement(this.condSeleccionados.get(i));
                    System.out.println("lista de condiciones: "+condSeleccionados.get(i));


                }
                this.lista_condiciones.setModel(model);
                boton_quitar_condicion.setEnabled(true);
                boton_Update.setEnabled(true);
                text_valor_condicion.setText("");
               
            }
                
            
            
      
//                String condGenerada = nombre+"="
//                                  + "'" + this.text_valor_condicion.getText() + "'";
//                this.condSeleccionados.add(condGenerada);
//        
//            
//            // carga los elementos de la lista de la vista
//            
//            DefaultListModel model = new DefaultListModel();
//            for(int i=0; i<condSeleccionados.size(); i++){
//                // las condiciones se almacenan en la lista condSeleccionados
//                model.addElement(this.condSeleccionados.get(i));
//                System.out.println("lista de condiciones: "+condSeleccionados.get(i));
//            }
//            this.lista_condiciones.setModel(model);
//            boton_quitar_condicion.setEnabled(true);
//            boton_Update.setEnabled(true);
//            text_valor_condicion.setText("");
            
            
        }
    }//GEN-LAST:event_boton_agregar_condicionActionPerformed

    private void boton_quitar_condicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_quitar_condicionActionPerformed
        String nombre = this.lista_condiciones.getModel().getElementAt(this.lista_condiciones.getSelectedIndex());
       
        
        this.condSeleccionados.remove(nombre);
        DefaultListModel model = new DefaultListModel();
        for(int i=0; i<condSeleccionados.size(); i++){
            model.addElement(condSeleccionados.get(i));
        }
        this.lista_condiciones.setModel(model);
    }//GEN-LAST:event_boton_quitar_condicionActionPerformed

    private void combo_tablasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_tablasMousePressed
        this.lista_atributos_tabla.setModel(new DefaultListModel());
        this.lista_atributos_selec.setModel(new DefaultListModel());
        this.lista_condiciones.setModel(new DefaultListModel());
        lista_atributos_tabla.removeAll();
        lista_atributos_selec.removeAll();
        lista_condiciones.removeAll();
        combo_atributos.removeAllItems();
        boton_agregar_condicion.setEnabled(false);
        boton_quitar_atributo.setEnabled(false);
        boton_quitar_condicion.setEnabled(false);
        boton_Update.setEnabled(false);
        text_valor_condicion.setEnabled(false);
    }//GEN-LAST:event_combo_tablasMousePressed

    private void jButtonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarCambiosActionPerformed
        
        
//        try {
//            Manejador.getInstancia().commit();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        
//        
    }//GEN-LAST:event_jButtonGuardarCambiosActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed

        this.condSeleccionados = new ArrayList();
        this.attSeleccionados = new ArrayList();
        jTextFieldCondicion.setEditable(false);
        cargarAtributos();
        // nombre de la tabla que vamos a utilizar para realizar las consultas
        nombre_tabla = combo_tablas.getSelectedItem().toString();
        // System.out.println("nombre de la tabla: "+ nombre_tabla);
        boton_agregar_atributo.setEnabled(true);

    }//GEN-LAST:event_jButtonCargarActionPerformed

    
    public void cargarAtributos(){

        try {
            
          int cont = 0;
          
         // String nombreTabla = combo_tablas.getSelectedItem().toString();
          ArrayList<ArrayList<String>> atributos = (ArrayList<ArrayList<String>>) NEGOCIO_OBJETOS.getInstance().obtenerRegistros(nombresTabla, null, null, null);
          int columnas = atributos.get(0).size();
          String cabecera[] = new String[columnas];
          identificador = atributos.get(0).get(0);
          jLabelAtributoP.setText(identificador + ": ");
          for (int i = 0; i<columnas; i++){
            cabecera[i] = atributos.get(0).get(i);
            
          }
          //Crear un objeto DefaultListModel
          DefaultListModel listModel = new DefaultListModel();
          //Recorrer el contenido del ArrayList
          
            
          for(int i=0; i<cabecera.length; i++) {
              //Añadir cada elemento del ArrayList en el modelo de la lista
              if(cabecera[i].contains("ID_") || cabecera[i].contains("CEDULA") /*|| cabecera[i].contains("CLAVE")*/){
                  System.out.println("atributos omitidos "+cabecera[i]);// no vale el ! 
                  
              } else {
                  
                   listModel.add(cont, cabecera[i]);
                   cont++;
              }
           
          }
          //Asociar el modelo de lista al JList
          lista_atributos_tabla.setModel(listModel);
           
      }


      catch (Exception ex ) {
           System.out.println("lanzo la execption");
              JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);

      }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Update;
    private javax.swing.JButton boton_agregar_atributo;
    private javax.swing.JButton boton_agregar_condicion;
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_quitar_atributo;
    private javax.swing.JButton boton_quitar_condicion;
    private javax.swing.JComboBox<String> combo_atributos;
    private javax.swing.JComboBox<String> combo_tablas;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonGuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAtributoP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPaneTablas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCondicion;
    private javax.swing.JList<String> lista_atributos_selec;
    private javax.swing.JList<String> lista_atributos_tabla;
    private javax.swing.JList<String> lista_condiciones;
    private java.awt.Panel panel1;
    private javax.swing.JTextField text_valor_condicion;
    // End of variables declaration//GEN-END:variables
}
