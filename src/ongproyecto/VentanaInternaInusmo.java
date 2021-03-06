/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ongproyecto;

import javax.swing.JOptionPane;
import rojeru_san.RSPanelsSlider;
import rojerusan.RSAnimation;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaInternaInusmo extends javax.swing.JInternalFrame {

    private String[] titulos = {"ID","Nombre","Descripcion"};
    private String variableAux;
    private VariablesGlobales varGlobal;
    public VentanaInternaInusmo() {
        initComponents();
        VariablesGlobales.conexion.CargarTabla("insumo",txtBuscar.getText(), titulos, tablaInsumos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItemEliminar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemModificar = new javax.swing.JMenuItem();
        rSPanelShadow1 = new rojeru_san.RSPanelShadow();
        jPanel1 = new javax.swing.JPanel();
        rSPanelShadow2 = new rojeru_san.RSPanelShadow();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonNuevo = new rojeru_san.RSButtonRiple();
        botonReporte = new rojeru_san.RSButtonRiple();
        pnlSlider = new rojeru_san.RSPanelsSlider();
        pnlTablaInsumos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new rojeru_san.RSMTextFull();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInsumos = new rojerusan.RSTableMetro();
        botonCargar = new rojeru_san.RSButton();
        pnlNuevoInsumo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreNuevo = new rojeru_san.RSMTextFull();
        txtDescripNuevo = new rojeru_san.RSMTextFull();
        btnAceptarNuevo = new rojeru_san.RSButtonRiple();
        btnCancelarNuevo = new rojeru_san.RSButtonRiple();
        pnlModificarInsumo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreModificar = new rojeru_san.RSMTextFull();
        txtDescripModificar = new rojeru_san.RSMTextFull();
        btnAceptarModificar = new rojeru_san.RSButtonRiple();
        btnCancelarModificar = new rojeru_san.RSButtonRiple();

        menuItemEliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItemEliminar.setText("Eliminar");
        menuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItemEliminar);
        jPopupMenu1.add(jSeparator1);

        menuItemModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        menuItemModificar.setText("Modificar");
        menuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItemModificar);

        setClosable(true);
        setIconifiable(true);

        rSPanelShadow1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelShadow2.setBackground(new java.awt.Color(0, 0, 204));

        jPanel3.setBackground(new java.awt.Color(0, 112, 192));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/options256_24863.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );

        rSPanelShadow2.add(jPanel3, java.awt.BorderLayout.CENTER);

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonReporte.setText("Reporte");

        pnlTablaInsumos.setBackground(new java.awt.Color(255, 255, 255));
        pnlTablaInsumos.setName("pnlTablaInsumos"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 112, 192));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insumos");

        txtBuscar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        txtBuscar.setPlaceholder("Buscar por ID o por Nombre...");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        tablaInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaInsumos.setAlignmentX(0.6F);
        tablaInsumos.setAlignmentY(0.6F);
        tablaInsumos.setColorSelBackgound(new java.awt.Color(51, 51, 51));
        tablaInsumos.setComponentPopupMenu(jPopupMenu1);
        tablaInsumos.setFuenteFilas(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tablaInsumos.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(tablaInsumos);

        botonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seo-social-web-network-internet_340_icon-icons.com_61497.png"))); // NOI18N
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTablaInsumosLayout = new javax.swing.GroupLayout(pnlTablaInsumos);
        pnlTablaInsumos.setLayout(pnlTablaInsumosLayout);
        pnlTablaInsumosLayout.setHorizontalGroup(
            pnlTablaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlTablaInsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTablaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addGroup(pnlTablaInsumosLayout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTablaInsumosLayout.setVerticalGroup(
            pnlTablaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaInsumosLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlTablaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlSlider.add(pnlTablaInsumos, "card2");

        pnlNuevoInsumo.setBackground(new java.awt.Color(255, 255, 255));
        pnlNuevoInsumo.setName("pnlNuevoInsumo"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo Insumo");

        txtNombreNuevo.setPlaceholder("Nombre");

        txtDescripNuevo.setPlaceholder("Descripcion");

        btnAceptarNuevo.setText("Aceptar");
        btnAceptarNuevo.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnAceptarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarNuevoActionPerformed(evt);
            }
        });

        btnCancelarNuevo.setText("Cancelar");
        btnCancelarNuevo.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCancelarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNuevoInsumoLayout = new javax.swing.GroupLayout(pnlNuevoInsumo);
        pnlNuevoInsumo.setLayout(pnlNuevoInsumoLayout);
        pnlNuevoInsumoLayout.setHorizontalGroup(
            pnlNuevoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlNuevoInsumoLayout.createSequentialGroup()
                .addGroup(pnlNuevoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevoInsumoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(pnlNuevoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                            .addComponent(txtNombreNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlNuevoInsumoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnAceptarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlNuevoInsumoLayout.setVerticalGroup(
            pnlNuevoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoInsumoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(txtNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtDescripNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(pnlNuevoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        pnlSlider.add(pnlNuevoInsumo, "card3");

        pnlModificarInsumo.setName("pnlModificarInsumo"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 112, 192));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Modificar Insumo");

        txtNombreModificar.setPlaceholder("Nombre");

        txtDescripModificar.setPlaceholder("Descripcion");

        btnAceptarModificar.setText("Aceptar");
        btnAceptarModificar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnAceptarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModificarActionPerformed(evt);
            }
        });

        btnCancelarModificar.setText("Cancelar");
        btnCancelarModificar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        btnCancelarModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModificarInsumoLayout = new javax.swing.GroupLayout(pnlModificarInsumo);
        pnlModificarInsumo.setLayout(pnlModificarInsumoLayout);
        pnlModificarInsumoLayout.setHorizontalGroup(
            pnlModificarInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarInsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarInsumoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlModificarInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModificarInsumoLayout.createSequentialGroup()
                        .addComponent(btnAceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModificarInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDescripModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        pnlModificarInsumoLayout.setVerticalGroup(
            pnlModificarInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarInsumoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(txtDescripModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(pnlModificarInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        pnlSlider.add(pnlModificarInsumo, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelShadow2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(botonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(botonReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSPanelShadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        rSPanelShadow1.add(jPanel1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void regresarPanelTabla(){
            this.botonNuevo.setSelected(false);
            this.btnCancelarNuevo.setSelected(true);
            this.pnlSlider.setPanelSlider(20,pnlTablaInsumos,RSPanelsSlider.DIRECT.RIGHT);
            
            txtDescripNuevo.setText("");
            txtNombreNuevo.setText("");
}

public void regresarPanelTablaM(){
    this.menuItemModificar.setSelected(false);
    this.btnCancelarModificar.setSelected(true);
    this.pnlSlider.setPanelSlider(20, pnlTablaInsumos,RSPanelsSlider.DIRECT.RIGHT);
}
public void panelNuevoInsumo(){
     if(!this.botonNuevo.isSelected()){
            this.botonNuevo.setSelected(true);
            this.btnCancelarNuevo.setSelected(false);
            this.pnlSlider.setPanelSlider(20,pnlNuevoInsumo,RSPanelsSlider.DIRECT.RIGHT);
        }
}
public void panelModificarInsumon(){
    if(!this.menuItemModificar.isSelected()){
        this.menuItemModificar.setSelected(true);
        this.btnCancelarModificar.setSelected(false);
        this.pnlSlider.setPanelSlider(20,pnlModificarInsumo,RSPanelsSlider.DIRECT.RIGHT);
    }
}
    
    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        panelNuevoInsumo();
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void btnCancelarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoActionPerformed
       if(!this.btnCancelarNuevo.isSelected()){
           regresarPanelTabla();
        }
    }//GEN-LAST:event_btnCancelarNuevoActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
       VariablesGlobales.conexion.CargarTabla("insumo",txtBuscar.getText(), titulos, tablaInsumos);
    }//GEN-LAST:event_botonCargarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
      if(txtBuscar.getText().length() == 0){
        VariablesGlobales.conexion.CargarTabla("insumo",txtBuscar.getText(), titulos, tablaInsumos);
      }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void menuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarActionPerformed
          int fila = tablaInsumos.getSelectedRow(),respuesta;
          if(fila>=0){
              respuesta = JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar el insumo: "+tablaInsumos.getValueAt(fila,1)+"?"
                      ,"Advertencia",JOptionPane.WARNING_MESSAGE);
              if(respuesta == 0){
              VariablesGlobales.conexion.EjecutarInstruccion("delete from insumo where idinsumo = "+tablaInsumos.getValueAt(fila,0));//se elimina el insumo
              JOptionPane.showMessageDialog(null,"Insumo eliminado correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
              VariablesGlobales.conexion.CargarTabla("insumo",txtBuscar.getText(), titulos, tablaInsumos);//se carga nuevamente la tabla
              }   
          }
          else{
              JOptionPane.showMessageDialog(null,"Seleccione un insumo","Advertencia",JOptionPane.WARNING_MESSAGE);
          }
    }//GEN-LAST:event_menuItemEliminarActionPerformed

    private void menuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemModificarActionPerformed
        int fila = tablaInsumos.getSelectedRow();
        if(fila>=0){
            panelModificarInsumon();
            variableAux = (String) tablaInsumos.getValueAt(fila,1);
            txtNombreModificar.setText((String) tablaInsumos.getValueAt(fila,1));
            txtDescripModificar.setText((String) tablaInsumos.getValueAt(fila,2));
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione un insumo","Adverntencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_menuItemModificarActionPerformed

    private void btnCancelarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModificarActionPerformed
        if(!this.btnCancelarModificar.isSelected()){
            regresarPanelTablaM();
        }
    }//GEN-LAST:event_btnCancelarModificarActionPerformed

    private void btnAceptarModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModificarActionPerformed
        if(txtNombreModificar.getText().length()>0 && txtDescripModificar.getText().length()>0){
           if(txtNombreModificar.getText() == variableAux){     
           }
           else{
               if(VariablesGlobales.conexion.consultaVacia("select * from insumo where nombre = '"+txtNombreModificar.getText()+"'")){
                   VariablesGlobales.conexion.anteSalaModificar("set nombre = '"+txtNombreModificar.getText()+"', descipcion = '"+txtDescripModificar.getText()+"'"
                           ,"insumo","nombre","'"+variableAux+"'");
                   JOptionPane.showMessageDialog(null,"Registro modificado","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                   //Regresar al panel de la tabla insumos 
                    regresarPanelTabla();
                    VariablesGlobales.conexion.CargarTabla("insumo","", titulos, tablaInsumos);//Volver a cargar la tabla.
               }
               else{
                   JOptionPane.showMessageDialog(null,"El nombre del insumo ya existe","Advertencia",JOptionPane.WARNING_MESSAGE);
               }
           }
       }
       else{
           JOptionPane.showMessageDialog(null,"Llene todos los campos","Advertencia",JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_btnAceptarModificarActionPerformed

    private void btnAceptarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarNuevoActionPerformed
        if(txtNombreNuevo.getText().length() != 0 && txtDescripNuevo.getText().length()!=0){
            if(VariablesGlobales.conexion.consultaVacia("select * from insumo where nombre = '"+txtNombreNuevo.getText()+"'")){
                VariablesGlobales.conexion.anteSalaNuevo("insumo", "nombre, descipcion","'"+txtNombreNuevo.getText()+"' , "+"'"+txtDescripNuevo.getText()+"'");
                
                JOptionPane.showMessageDialog(null,"Se ingreso el insumo","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                //regresa al panel de la tabla insumo 
                    regresarPanelTabla();
                    VariablesGlobales.conexion.CargarTabla("insumo","", titulos, tablaInsumos);//Volver a cargar la tabla.
                
            }
            else{
                JOptionPane.showMessageDialog(null,"El nombre del insumo ya existe","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Llene todos los campos","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAceptarNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton botonCargar;
    private rojeru_san.RSButtonRiple botonNuevo;
    private rojeru_san.RSButtonRiple botonReporte;
    private rojeru_san.RSButtonRiple btnAceptarModificar;
    private rojeru_san.RSButtonRiple btnAceptarNuevo;
    private rojeru_san.RSButtonRiple btnCancelarModificar;
    private rojeru_san.RSButtonRiple btnCancelarNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemModificar;
    private javax.swing.JPanel pnlModificarInsumo;
    private javax.swing.JPanel pnlNuevoInsumo;
    private rojeru_san.RSPanelsSlider pnlSlider;
    private javax.swing.JPanel pnlTablaInsumos;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private rojerusan.RSTableMetro tablaInsumos;
    private rojeru_san.RSMTextFull txtBuscar;
    private rojeru_san.RSMTextFull txtDescripModificar;
    private rojeru_san.RSMTextFull txtDescripNuevo;
    private rojeru_san.RSMTextFull txtNombreModificar;
    private rojeru_san.RSMTextFull txtNombreNuevo;
    // End of variables declaration//GEN-END:variables
}
