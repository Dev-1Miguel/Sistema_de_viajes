package capaPresentacion;

import capaNegocio.Controlador;
import entidades.Cliente;
import entidades.Reserva;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author MICHELLE
 */
public class JPModuloReserva extends javax.swing.JPanel {

    /**
     * Creates new form JPModuloReservaRegistro
     */
    public JPModuloReserva() {
        initComponents();
    }

    public void limpiar() {
        txtCantidad.setText("");
        txtCedula.setText("");
        txtDestino.setText("");
        txtNombreCliente.setText("");
        txtOrigen.setText("");
        txtPrecio.setText("");
        lblId.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fechaReserva = new javax.swing.JFormattedTextField();
        btnConsultar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fechaViaje = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboClase = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();
        btnConsultar1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(242, 223, 157));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel1.setText("RESERVA DE PASAJES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 230, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel3.setText("Origen:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));
        jPanel1.add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 100, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel4.setText("Precio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 100, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel5.setText("Cant, pasajeros");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de viaje:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));
        jPanel1.add(fechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 90, -1));

        btnConsultar.setBackground(new java.awt.Color(68, 171, 244));
        btnConsultar.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnConsultar.setText("Consultar Cliente");
        btnConsultar.setBorderPainted(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 170, 40));

        btnRegistrar.setBackground(new java.awt.Color(68, 171, 244));
        btnRegistrar.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 120, 40));

        btnModificar.setBackground(new java.awt.Color(77, 244, 68));
        btnModificar.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorderPainted(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 120, 40));

        btnEliminar.setBackground(new java.awt.Color(244, 95, 68));
        btnEliminar.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 120, 40));

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel7.setText("Cedula del cliente:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 20));

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel8.setText("Destino:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel1.add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, -1));

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel9.setText("Fecha de reserva:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel1.add(fechaViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 100, -1));

        jLabel10.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel10.setText("Clase:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        jLabel11.setText("Estado:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        comboClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Económica", "Ejecutiva", "Primera" }));
        jPanel1.add(comboClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, -1));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Confirmada", "Pendiente", "Cancelada" }));
        jPanel1.add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 100, -1));
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, 30));

        btnConsultar1.setBackground(new java.awt.Color(68, 171, 244));
        btnConsultar1.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        btnConsultar1.setText("Consultar");
        btnConsultar1.setBorderPainted(false);
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cedula = txtCedula.getText(); // Obtiene la cédula del campo de texto

        if (cedula.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la cédula del cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Controlador controlador = new Controlador();
        Cliente cliente = controlador.obtenerClientePorCedula(cedula);

        if (cliente != null) {
            txtNombreCliente.setText(cliente.getNombres_apellidos());

            JOptionPane.showMessageDialog(this, "Cliente encontrado: " + cliente.getNombres_apellidos(), "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombreCliente.getText();
        String destino = txtDestino.getText();
        String clase = comboClase.getSelectedItem().toString();
        String estado = comboEstado.getSelectedItem().toString();
        String origen = txtOrigen.getText();
        String fechareser = fechaReserva.getText();
        String fechavia = fechaViaje.getText();
        double cantidad = 0;
        double precio = 0;
        String mensajeError = "";
        Boolean hayErrores = false;

        if (nombre.equals("")) {
            mensajeError += "Ingrese su nombre\n";
            hayErrores = true;
        }

        if (destino.equals("")) {
            mensajeError += "Ingrese su destino\n";
            hayErrores = true;
        }
        if (origen.equals("")) {
            mensajeError += "Ingrese su origen\n";
            hayErrores = true;
        }
        try {
            cantidad = Double.parseDouble(txtCantidad.getText().trim());
            if (cantidad < 0) {
                mensajeError += "La cantidad no puede ser negativa\n";
                hayErrores = true;
            }
        } catch (NumberFormatException e) {
            mensajeError += "Ingrese una cantidad válida\n";
            hayErrores = true;
        }

        try {
            precio = Double.parseDouble(txtPrecio.getText().trim());
            if (precio < 0) {
                mensajeError += "El precio no puede ser negativo\n";
                hayErrores = true;
            }
        } catch (NumberFormatException e) {
            mensajeError += "Ingrese un precio válido\n";
            hayErrores = true;
        }

        if (fechareser.equals("") || fechareser.contains("_") && fechavia.equals("") || fechavia.contains("_")) {
            mensajeError += "Ingrese una fecha válida\n";
            hayErrores = true;
        }

        if (hayErrores) {
            JOptionPane.showMessageDialog(this, mensajeError);
            return;
        }
        comboClase.addItem("Económica");
        comboClase.addItem("Ejecutiva");
        comboClase.addItem("Primera");
        comboEstado.addItem("Confirmada");
        comboEstado.addItem("Pendiente");
        comboEstado.addItem("Cancelada");

        if (!estado.equals("Confirmada") && !estado.equals("Pendiente") && !estado.equals("Cancelada")) {
            JOptionPane.showMessageDialog(this, "La clase debe ser Económica, Ejecutiva o Primera.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!clase.equals("Económica") && !clase.equals("Ejecutiva") && !clase.equals("Primera")) {
            JOptionPane.showMessageDialog(this, "La clase debe ser Económica, Ejecutiva o Primera.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Buscar el cliente por nombre
        Controlador controlador = new Controlador();
        Cliente cliente = controlador.obtenerClientePorNombre(nombre);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        java.sql.Timestamp fechaRegistro = null;
        java.sql.Timestamp fechaRegistro1 = null;
        try {
            // Parsear el texto a un objeto java.util.Date
            java.util.Date fecha = sdf.parse(fechavia);
            java.util.Date fecha1 = sdf.parse(fechareser);

            // Convertir java.util.Date a java.sql.Timestamp
            fechaRegistro = new java.sql.Timestamp(fecha.getTime());
            fechaRegistro1 = new java.sql.Timestamp(fecha1.getTime());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Reserva c = new Reserva();

        c.setCliente_id(cliente.getId());
        c.setCantidad_pasajeros(cantidad);
        c.setDestino(destino);
        c.setOrigen(origen);
        c.setPrecio_total(precio);
        c.setFecha_reserva(fechaRegistro1);
        c.setFecha_viaje(fechaRegistro);
        c.setClase(clase);
        c.setEstado(estado);

        controlador.InsertarReserva(c);
        //JOptionPane.showMessageDialog(this, "Guardado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String idText = lblId.getText().trim(); // Elimina espacios en blanco
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El ID del cliente no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Termina el método
        }

        int idRegistro;
        try {
            idRegistro = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID del cliente debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nombre = txtNombreCliente.getText();
        String destino = txtDestino.getText();
        String clase = comboClase.getSelectedItem().toString();
        String estado = comboEstado.getSelectedItem().toString();
        String origen = txtOrigen.getText();
        String fechareser = fechaReserva.getText();
        String fechavia = fechaViaje.getText();
        double cantidad = 0;
        double precio = 0;

        try {
            cantidad = Double.parseDouble(txtCantidad.getText().trim());
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad de pasajeros debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para la cantidad de pasajeros.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            precio = Double.parseDouble(txtPrecio.getText().trim());
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad de pasajeros debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para la cantidad de pasajeros.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Controlador controlador = new Controlador();
        Cliente cliente = controlador.obtenerClientePorNombre(nombre);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        java.sql.Timestamp fechaRegistro = null;
        java.sql.Timestamp fechaRegistro1 = null;
        try {
            // Parsear el texto a un objeto java.util.Date
            java.util.Date fecha = sdf.parse(fechavia);
            java.util.Date fecha1 = sdf.parse(fechareser);

            // Convertir java.util.Date a java.sql.Timestamp
            fechaRegistro = new java.sql.Timestamp(fecha.getTime());
            fechaRegistro1 = new java.sql.Timestamp(fecha1.getTime());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Reserva c = new Reserva();
        c.setId(idRegistro);
        c.setCliente_id(cliente.getId());
        c.setCantidad_pasajeros(cantidad);
        c.setDestino(destino);
        c.setOrigen(origen);
        c.setPrecio_total(precio);
        c.setFecha_reserva(fechaRegistro1);
        c.setFecha_viaje(fechaRegistro);
        c.setClase(clase);
        c.setEstado(estado);

        controlador.ModificarReserva(c);
        limpiar();
        JOptionPane.showMessageDialog(this, "Modificado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        String cedula = txtCedula.getText(); // Obtiene la cédula del campo de texto

        if (cedula.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese la cédula del cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Controlador controlador = new Controlador();
        Reserva reserva = controlador.obtenerReservaPorCedula(cedula);

        if (reserva != null) {
            // Asigna los valores obtenidos a los campos correspondientes
            lblId.setText(String.valueOf(reserva.getId()));
            txtNombreCliente.setText(reserva.getNombres_apellidos()); // Nombre del cliente
            txtDestino.setText(reserva.getDestino());
            txtOrigen.setText(reserva.getOrigen());
            txtCantidad.setText(String.valueOf(reserva.getCantidad_pasajeros()));
            txtPrecio.setText(String.valueOf(reserva.getPrecio_total()));
            comboClase.setSelectedItem(reserva.getClase());
            comboEstado.setSelectedItem(reserva.getEstado());
            fechaReserva.setText(String.valueOf(reserva.getFecha_reserva()));
            fechaViaje.setText(String.valueOf(reserva.getFecha_viaje()));

            JOptionPane.showMessageDialog(this, "Reserva encontrada.", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron datos para la cédula ingresada.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Controlador controlador = new Controlador();
        String id = lblId.getText();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione un usuario para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este usuario?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {

            int userId = Integer.parseInt(id);
            controlador.EliminarReserva(userId);

            limpiar();
            JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El ID del usuario no es válido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboClase;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JFormattedTextField fechaReserva;
    private javax.swing.JFormattedTextField fechaViaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
