/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import base_datos.BaseDatos;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import pojos.CategoriaProd;
import pojos.Producto;
import pojos.Proveedor;

/**
 *
 * @author FRANCISCO
 */
public class ProductoFrame extends javax.swing.JDialog {

    /**
     * Creates new form ArticuloFrame
     */
    DefaultComboBoxModel<CategoriaProd> modeloCategorias;
    DefaultComboBoxModel<Proveedor> modeloProveedor;
    BaseDatos base;
    boolean estaActualizando;
    String informacion = "";

    public ProductoFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
    }

    public ProductoFrame(java.awt.Frame parent, boolean modal, Producto producto, ImageIcon icon, String titulo, boolean actualizando) {
        super(parent, modal);
        modeloCategorias = new DefaultComboBoxModel<CategoriaProd>();
        modeloProveedor = new DefaultComboBoxModel<Proveedor>();
        base = new BaseDatos();
        cargarModeloCat();
        cargarModeloProveedores();
        initComponents();
        this.estaActualizando = actualizando;
        this.setTitle(titulo);
        if (producto != null) {
            cargarProducto(producto, icon);
        }
    }

    private void cargarProducto(Producto producto, ImageIcon icon) {
        // Redimension de imagen para ajustarla al tamano del JLabel 
        Image imgProd = icon.getImage();
        int anchoEtiqueta = jLabelImagenArticulo.getWidth();//Obtiene el ancho del a imagen
        int altoEtiqueta = jLabelImagenArticulo.getHeight();//Obtiene el alto de la imagen

        //Se crea un nuevo objeto Image con la imagen redimensionada
        Image imgRedimensionada = imgProd.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_DEFAULT);

        // se crea un nuevo objeto ImageIcon a partir de la imagen redimensionada 
        ImageIcon iconRedimensionado = new ImageIcon(imgRedimensionada);

        jLabelImagenArticulo.setIcon(iconRedimensionado);
        String clave = producto.getIdProducto();
        String nombre = producto.getNombProducto();
        String descripcion = producto.getDescProducto();
        double stock = producto.getStockProducto();
        String unidad = producto.getUnidadProducto();
        double precioCompra = producto.getPrecioCompraProducto();
        double precioVenta = producto.getPrecioVentaProducto();

        campoClave.setText(clave);
        campoNombreProducto.setText(nombre);
        campoDescProducto.setText(descripcion);
        campoStock.setText(String.valueOf(stock));
        comboUnidades.setSelectedItem(unidad);
        campoPrecioCompraProducto.setText(String.valueOf(precioCompra));
        campoPrecioVentaProducto.setText(String.valueOf(precioVenta));

        campoClave.setEnabled(false);
        campoNombreProducto.setEnabled(false);
    }

    private void cargarModeloCat() {
        ArrayList<CategoriaProd> listaCategorias;
        listaCategorias = base.obtenerCategorias();
        for (CategoriaProd categoria : listaCategorias) {
            modeloCategorias.addElement(categoria);

        }
    }

    private void cargarModeloProveedores() {
        ArrayList<Proveedor> listaProveedor;
        listaProveedor = base.obtenerProveedores();
        for (Proveedor proveedor : listaProveedor) {
            modeloProveedor.addElement(proveedor);
        }

    }

    public String getInformacion() {
        return informacion;
    }

    public JButton getjButton2() {
        return guardarProducto;
    }

    public JButton getjButton3() {
        return BotonCancelarProducto;
    }

    public JComboBox getjComboBox1() {
        return jComboBoxCategoriaArticuloFrame;
    }

    public JComboBox getjComboBox2() {
        return comboUnidades;
    }

    public JLabel getjLabelImagenArticulo() {
        return jLabelImagenArticulo;
    }

    public JPanel getjPanelimagen() {
        return jPanelimagen;
    }

    public JTextArea getjTextArea1() {
        return campoDescProducto;
    }

    public JTextField getjTextField1() {
        return campoClave;
    }

    public JTextField getjTextField2() {
        return campoStock;
    }

    public JTextField getjTextField3() {
        return campoPrecioCompraProducto;
    }

    public JTextField getjTextField4() {
        return campoPrecioVentaProducto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescProducto = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        campoStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCategoriaArticuloFrame = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboUnidades = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        campoPrecioCompraProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoPrecioVentaProducto = new javax.swing.JTextField();
        guardarProducto = new javax.swing.JButton();
        BotonCancelarProducto = new javax.swing.JButton();
        jPanelimagen = new javax.swing.JPanel();
        jLabelImagenArticulo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxProveedorArticuloFrame = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        campoNombreProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Clave");

        jLabel2.setText("Descripcion");

        campoDescProducto.setColumns(20);
        campoDescProducto.setRows(5);
        jScrollPane1.setViewportView(campoDescProducto);

        jLabel3.setText("Stock");

        jLabel4.setText("Categoria");

        jComboBoxCategoriaArticuloFrame.setModel(modeloCategorias);

        jButton1.setText("new category");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueva_Categoria(evt);
            }
        });

        jLabel5.setText("unidad de medida");

        comboUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "pieza", "litro" }));

        jLabel6.setText("Precio Compra");

        jLabel7.setText("Precio venta");

        guardarProducto.setText("Guardar");
        guardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProductoActionPerformed(evt);
            }
        });

        BotonCancelarProducto.setText("Cancelar");
        BotonCancelarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformancedCancelarProducto(evt);
            }
        });

        jPanelimagen.setBackground(new java.awt.Color(153, 153, 153));
        jPanelimagen.setRequestFocusEnabled(false);
        jPanelimagen.setVerifyInputWhenFocusTarget(false);

        jLabelImagenArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelImagenArticuloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelimagenLayout = new javax.swing.GroupLayout(jPanelimagen);
        jPanelimagen.setLayout(jPanelimagenLayout);
        jPanelimagenLayout.setHorizontalGroup(
            jPanelimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelimagenLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabelImagenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelimagenLayout.setVerticalGroup(
            jPanelimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelimagenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagenArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Proveedor");

        jComboBoxProveedorArticuloFrame.setModel(modeloProveedor);

        jLabel9.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(campoClave, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(campoNombreProducto)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxCategoriaArticuloFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(campoPrecioCompraProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(campoPrecioVentaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7)))
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel8)
                                    .addComponent(jComboBoxProveedorArticuloFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guardarProducto)
                        .addGap(27, 27, 27)
                        .addComponent(BotonCancelarProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategoriaArticuloFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPrecioCompraProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecioVentaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProveedorArticuloFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardarProducto)
                            .addComponent(BotonCancelarProducto))))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 //es nulo siempre si entre con el evento mouse y elige un foto entonces ya no es nulo
    File imgArticleFile;
    private void jLabelImagenArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagenArticuloMousePressed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Archivos de imagen jpg,gif o png", "jpg", "gif", "png"
        );
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            int anchoImagen = jLabelImagenArticulo.getWidth();
            int altoImagen = jLabelImagenArticulo.getHeight();

            imgArticleFile = chooser.getSelectedFile();
            ImageIcon icono = new ImageIcon(imgArticleFile.getAbsolutePath());
            Image imagen = icono.getImage();
            Image imagenRedimensionada = imagen.getScaledInstance(anchoImagen, altoImagen, Image.SCALE_DEFAULT);

            ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);

            jLabelImagenArticulo.setIcon(iconoRedimensionado);

        }
    }//GEN-LAST:event_jLabelImagenArticuloMousePressed

    private void guardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProductoActionPerformed
        // TODO add your handling code here:
        String codigo = campoClave.getText().toLowerCase();
        String nombre = campoNombreProducto.getText().toLowerCase();
        String descripcion = campoDescProducto.getText().toLowerCase();
        double stock = Double.parseDouble(campoStock.getText());
        double precioCompra = Double.parseDouble(campoPrecioCompraProducto.getText());
        double precioVenta = Double.parseDouble(campoPrecioVentaProducto.getText());
        String unidadMedida = (String) comboUnidades.getSelectedItem();
        CategoriaProd categoria = (CategoriaProd) jComboBoxCategoriaArticuloFrame.getSelectedItem();
        Proveedor proveedor = (Proveedor) jComboBoxProveedorArticuloFrame.getSelectedItem();
        if (estaActualizando) {
            if (imgArticleFile == null) {
                Producto producto = new Producto(codigo, nombre, descripcion,
                        stock, null, unidadMedida, precioCompra, precioVenta, 0.0, categoria.getIdCategoriaProd(), proveedor.getId_proveedor());

                base.actualizarProducto(producto, false);

            } else {
                Producto producto = new Producto(codigo, nombre, descripcion,
                        stock, imgArticleFile, unidadMedida, precioCompra, precioVenta, 0.0, categoria.getIdCategoriaProd(), proveedor.getId_proveedor());

                base.actualizarProducto(producto, true);
            }

            JOptionPane.showMessageDialog(this, "se ha guardado el producto");
            this.dispose();
            informacion = "1";//variable global si el usuario ya ejecuto el evento guardar

//            if (imgArticleFile == null) {
//                JOptionPane.showMessageDialog(this, "No ha elegido fotografia");
//            } else {
//                Producto producto = new Producto(codigo, nombre, descripcion,
//                        stock, imgArticleFile, unidadMedida, precioCompra, precioVenta, 0.0, categoria.getIdCategoriaProd(), proveedor.getId_proveedor());
//                base.insertarProducto(producto);
//                JOptionPane.showMessageDialog(this, "SE ha guardado el producto");
//                this.dispose();
//            }
        } else {
            if (imgArticleFile == null) {
                JOptionPane.showMessageDialog(this, "No ha elegido fotografia");
            } else {
                Producto producto = new Producto(codigo, nombre, descripcion,
                        stock, imgArticleFile, unidadMedida, precioCompra, precioVenta, 0.0, categoria.getIdCategoriaProd(), proveedor.getId_proveedor());

                base.insertarProducto(producto);

                JOptionPane.showMessageDialog(this, "SE ha guardado el producto");
                this.dispose();
            }
        }


    }//GEN-LAST:event_guardarProductoActionPerformed

    private void actionPerformancedCancelarProducto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformancedCancelarProducto
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_actionPerformancedCancelarProducto

    private void nueva_Categoria(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueva_Categoria
        // TODO add your handling code here:
        CategoriaFrame categoria = new CategoriaFrame(null, true);
        categoria.setVisible(true);
        categoria.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        categoria.setLocation(600, 150);
        categoria.setAlwaysOnTop(true);
    }//GEN-LAST:event_nueva_Categoria

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
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProductoFrame dialog = new ProductoFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelarProducto;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextArea campoDescProducto;
    private javax.swing.JTextField campoNombreProducto;
    private javax.swing.JTextField campoPrecioCompraProducto;
    private javax.swing.JTextField campoPrecioVentaProducto;
    private javax.swing.JTextField campoStock;
    private javax.swing.JComboBox<String> comboUnidades;
    private javax.swing.JButton guardarProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<CategoriaProd> jComboBoxCategoriaArticuloFrame;
    private javax.swing.JComboBox<Proveedor> jComboBoxProveedorArticuloFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImagenArticulo;
    private javax.swing.JPanel jPanelimagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
