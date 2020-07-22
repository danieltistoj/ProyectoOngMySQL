/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ongproyecto;

import javax.swing.JOptionPane;
import rojeru_san.RSPanelsSlider;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class VentanaInternaInsumo extends javax.swing.JInternalFrame {

    private String[] titulos = {"ID","Nombre","Descripcion"};
    public VentanaInternaInsumo() {
        initComponents();
        CargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        rSMTextFull2 = new rojeru_san.RSMTextFull();
        rSMTextFull3 = new rojeru_san.RSMTextFull();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        botonCancelar = new rojeru_san.RSButtonRiple();

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
                .addContainerGap(388, Short.MAX_VALUE))
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
                .addGroup(pnlTablaInsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlSlider.add(pnlTablaInsumos, "card2");

        pnlNuevoInsumo.setBackground(new java.awt.Color(255, 255, 255));
        pnlNuevoInsumo.setName("pnlNuevoInsumo"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 112, 192));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nuevo Insumo");

        rSMTextFull2.setPlaceholder("Nombre");

        rSMTextFull3.setPlaceholder("Descripcion");

        rSButtonRiple3.setText("Aceptar");
        rSButtonRiple3.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N

        botonCancelar.setText("Cancelar");
        botonCancelar.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
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
                            .addComponent(rSMTextFull3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                            .addComponent(rSMTextFull2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlNuevoInsumoLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(rSButtonRiple3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlNuevoInsumoLayout.setVerticalGroup(
            pnlNuevoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoInsumoLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(rSMTextFull2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(rSMTextFull3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(pnlNuevoInsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonRiple3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        pnlSlider.add(pnlNuevoInsumo, "card3");

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

    public void CargarTabla(){
        String consulta = "select * from insumo "; //Consulta basica
        int id;
        if(!"".equals(txtBuscar.getText())){ //Se ve si la caja de texto esta vacia. 
            try {
               id = Integer.parseInt(txtBuscar.getText());//Se pasa de String a Int 
               consulta = consulta + "where idinsumo = "+id;//Si no hay error al pasar el String a Int se agrega a la condicion la sentencia de ID
            } catch (Exception e) {//Si hay error al pasar de String a Int se agrega a la condicion la sentencia de nombre
                consulta = consulta + "where nombre = '"+txtBuscar.getText()+"'";
            }
        }
        VariablesGlobales.conexion.llenarTabla(titulos,tablaInsumos,consulta);//Clase que hereda de conexionMySQL y conexionMySQL hereda de ConexionBD
    }
    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        if(!this.botonNuevo.isSelected()){
            this.botonNuevo.setSelected(true);
            this.botonCancelar.setSelected(false);
            this.pnlSlider.setPanelSlider(20,pnlNuevoInsumo,RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
       if(!this.botonCancelar.isSelected()){
            this.botonNuevo.setSelected(false);
            this.botonCancelar.setSelected(true);
            this.pnlSlider.setPanelSlider(20,pnlTablaInsumos,RSPanelsSlider.DIRECT.RIGHT);
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        CargarTabla();
    }//GEN-LAST:event_botonCargarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
      if(txtBuscar.getText().length() == 0){
          CargarTabla();
      }
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButtonRiple botonCancelar;
    private rojeru_san.RSButton botonCargar;
    private rojeru_san.RSButtonRiple botonNuevo;
    private rojeru_san.RSButtonRiple botonReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlNuevoInsumo;
    private rojeru_san.RSPanelsSlider pnlSlider;
    private javax.swing.JPanel pnlTablaInsumos;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSMTextFull rSMTextFull2;
    private rojeru_san.RSMTextFull rSMTextFull3;
    private rojeru_san.RSPanelShadow rSPanelShadow1;
    private rojeru_san.RSPanelShadow rSPanelShadow2;
    private rojerusan.RSTableMetro tablaInsumos;
    private rojeru_san.RSMTextFull txtBuscar;
    // End of variables declaration//GEN-END:variables
}
