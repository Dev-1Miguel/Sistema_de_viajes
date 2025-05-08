package capaNegocio;

import static capaDatos.Conexion.getConexion;
import entidades.Cliente;
import entidades.Factura;
import entidades.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MICHELLE
 */
public class Controlador {

    public boolean Login(String usuario, String clave) {
        String query = "SELECT * FROM vendedor WHERE usuario = ? AND contrasenia = ?";

        try (Connection con = getConexion(); PreparedStatement pst = con.prepareStatement(query)) {

            // Establecer los parámetros de la consulta
            pst.setString(1, usuario);
            pst.setString(2, clave);

            // Ejecutar la consulta
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "BIENVENIDOS A SU SISTEMA", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void InsertarCliente(Cliente cli) {
        try {
            Connection cone = getConexion();
            PreparedStatement pst = cone.prepareStatement("INSERT INTO cliente (nombres_apellidos, correoelectronico, direccion, telefono, cedula, fecha_registro) VALUES(?,?,?,?,?,?)");
            pst.setString(1, cli.getNombres_apellidos());
            pst.setString(2, cli.getCorreoelectronico());
            pst.setString(3, cli.getDireccion());
            pst.setString(4, cli.getTelefono());
            pst.setString(5, cli.getCedula());
            pst.setTimestamp(6, cli.getFecha_registro());
            pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Guardado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en los datos");
        }
    }

    public void ModificarCliente(Cliente cli) {
        try {
            Connection cone = getConexion();

            String sql = "UPDATE cliente SET nombres_apellidos=?, correoelectronico=?, direccion=?, telefono=?, cedula=? WHERE id=?";
            PreparedStatement pst = cone.prepareStatement(sql);
            pst.setString(1, cli.getNombres_apellidos());
            pst.setString(2, cli.getCorreoelectronico());
            pst.setString(3, cli.getDireccion());
            pst.setString(4, cli.getTelefono());
            pst.setString(5, cli.getCedula());
            pst.setInt(6, cli.getId());

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                        JOptionPane.showMessageDialog(null, "Modificado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

                System.out.println("cliente modificado correctamente");
            } else {
                System.out.println("No se encontró el registro para modificar");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al modificar los datos");
        }
    }

    public void EliminarCliente(int id) {
        try {
            Connection cone = getConexion();
            String sql = "DELETE FROM cliente WHERE id=?";
            PreparedStatement pst = cone.prepareStatement(sql);
            pst.setInt(1, id);

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
             JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);

                System.out.println("Registro eliminado correctamente");
            } else {
                System.out.println("No se encontró el registro para eliminar");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar los datos");
        }
    }

    public void InsertarReserva(Reserva re) {
        try {
            Connection cone = getConexion();
            PreparedStatement pst = cone.prepareStatement("INSERT INTO reserva (cliente_id, destino, origen, fecha_reserva, fecha_viaje, cantidad_pasajeros, clase, precio_total, estado) VALUES(?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, re.getCliente_id());
            pst.setString(2, re.getDestino());
            pst.setString(3, re.getOrigen());
            pst.setTimestamp(4, re.getFecha_reserva());
            pst.setTimestamp(5, re.getFecha_viaje());
            pst.setDouble(6, re.getCantidad_pasajeros());
            pst.setString(7, re.getClase());
            pst.setDouble(8, re.getPrecio_total());
            pst.setString(9, re.getEstado());

            pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Reserva generada correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en los datos");
        }
    }

    public void ModificarReserva(Reserva res) {
        try {
            Connection cone = getConexion();

            String sql = "UPDATE reserva SET cliente_id=?, destino=?, origen=?, fecha_reserva=?, fecha_viaje=?, cantidad_pasajeros=?, clase=?, precio_total=?, estado=? WHERE id=?";
            PreparedStatement pst = cone.prepareStatement(sql);
            pst.setInt(1, res.getCliente_id());
            pst.setString(2, res.getDestino());
            pst.setString(3, res.getOrigen());
            pst.setTimestamp(4, res.getFecha_reserva());
            pst.setTimestamp(5, res.getFecha_viaje());
            pst.setDouble(6, res.getCantidad_pasajeros());
            pst.setString(7, res.getClase());
            pst.setDouble(8, res.getPrecio_total());
            pst.setString(9, res.getEstado());
            pst.setInt(10, res.getId());

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("cliente modificado correctamente");
            } else {
                System.out.println("No se encontró el registro para modificar");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al modificar los datos");
        }
    }

    public void EliminarReserva(int id) {
        try {
            Connection cone = getConexion();
            String sql = "DELETE FROM reserva WHERE id=?";
            PreparedStatement pst = cone.prepareStatement(sql);
            pst.setInt(1, id);

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Registro eliminado correctamente");
            } else {
                System.out.println("No se encontró el registro para eliminar");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al eliminar los datos");
        }
    }
    public void EmitirFactura(Factura fa) {
        try {
            Connection cone = getConexion();
            PreparedStatement pst = cone.prepareStatement("INSERT INTO factura (reserva_id, fecha_emision, metodo_pago, subtotal, iva, total, estado) VALUES(?,?,?,?,?,?,?)");
            pst.setInt(1, fa.getReserva_id()); // reserva_id
            pst.setTimestamp(2, fa.getFecha_emision()); // fecha_emision
            pst.setString(3, fa.getMetodo()); // metodo_pago
            pst.setDouble(4, fa.getSubTotal()); // subtotal
            pst.setDouble(5, fa.getIva()); // iva
            pst.setDouble(6, fa.getTotal()); // total
            pst.setString(7, fa.getEstado()); // estado

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Factura emitida correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en los datos");
        }
    }

    public void ModificarFactura(Factura fa) {
        try {
            Connection cone = getConexion();

            String sql = "UPDATE factura SET reserva_id=?, fecha_emision=?, metodo_pago=?, subtotal=?, iva=?, total=?, estado=? WHERE id=?";
            PreparedStatement pst = cone.prepareStatement(sql);
            pst.setInt(1, fa.getReserva_id()); // reserva_id
            pst.setTimestamp(2, fa.getFecha_emision()); // fecha_emision
            pst.setString(3, fa.getMetodo()); // metodo_pago
            pst.setDouble(4, fa.getSubTotal()); // subtotal
            pst.setDouble(5, fa.getIva()); // iva
            pst.setDouble(6, fa.getTotal()); // total
            pst.setString(7, fa.getEstado()); // estado
            pst.setInt(8, fa.getId());

            int affectedRows = pst.executeUpdate();
            if (affectedRows > 0) {
                
                System.out.println("factura modificada correctamente");
            } else {
                System.out.println("No se encontró el registro para modificar");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al modificar los datos");
        }
    }

    public void AnularFactura(int facturaId) {
    try {
        // Obtener la conexión a la base de datos
        Connection cone = getConexion();

        // Preparar la consulta SQL para actualizar el estado de la factura
        PreparedStatement pst = cone.prepareStatement("UPDATE factura SET estado = ? WHERE id = ?");
        
        // Establecer los valores en los parámetros
        pst.setString(1, "ANULADO"); // Cambiar el estado a "anulado"
        pst.setInt(2, facturaId);    // ID de la factura a anular

        // Ejecutar la consulta
        int rowsAffected = pst.executeUpdate();

        // Verificar si la actualización fue exitosa
        if (rowsAffected > 0) {
            System.out.println("Factura anulada correctamente.");
        } else {
            System.out.println("No se encontró una factura con el ID proporcionado.");
        }

    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        System.out.println("Error al intentar anular la factura.");
    }
}

    public Cliente obtenerClientePorCedula(String cedula) {
        Cliente cliente = null;

        try (Connection conn = getConexion()) {
            String query = "SELECT * FROM cliente WHERE cedula = ?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, cedula);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombres_apellidos"),
                        rs.getString("correoelectronico"),
                        rs.getString("direccion"),
                        rs.getString("telefono"),
                        rs.getString("cedula"),
                        rs.getTimestamp("fecha_registro")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar cliente: " + e.getMessage());
        }

        return cliente;
    }

    public Cliente obtenerClientePorNombre(String nombre) {
        Cliente cliente = null;
        try {
            Connection cone = getConexion();
            String query = "SELECT * FROM cliente WHERE nombres_apellidos = ?";
            PreparedStatement pst = cone.prepareStatement(query);
            pst.setString(1, nombre);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setId(rs.getInt("id")); // ID del cliente
                cliente.setNombres_apellidos(rs.getString("nombres_apellidos"));
                cliente.setCedula(rs.getString("cedula"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar cliente: " + ex.getMessage());
        }
        return cliente;
    }

    public Reserva obtenerReservaPorCedula(String cedula) {
        Reserva reserva = null;
        String sql = "SELECT r.id, r.cliente_id, r.destino, r.origen, r.fecha_reserva, r.fecha_viaje, "
                + "r.cantidad_pasajeros, r.clase, r.precio_total, r.estado, c.nombres_apellidos "
                + "FROM Reserva r "
                + "JOIN Cliente c ON r.cliente_id = c.id "
                + "WHERE c.cedula = ?";

        try (Connection con = getConexion(); PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, cedula);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                reserva = new Reserva();
                reserva.setId(rs.getInt("id"));
                reserva.setCliente_id(rs.getInt("cliente_id"));
                reserva.setDestino(rs.getString("destino"));
                reserva.setOrigen(rs.getString("origen"));
                reserva.setFecha_reserva(rs.getTimestamp("fecha_reserva"));
                reserva.setFecha_viaje(rs.getTimestamp("fecha_viaje"));
                reserva.setCantidad_pasajeros(rs.getDouble("cantidad_pasajeros"));
                reserva.setClase(rs.getString("clase"));
                reserva.setPrecio_total(rs.getDouble("precio_total"));
                reserva.setEstado(rs.getString("estado"));
                reserva.setNombres_apellidos(rs.getString("nombres_apellidos")); // Agregar nombre cliente
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar reserva: " + ex.getMessage());
        }
        return reserva;
    }

    public Factura obtenerFacturaPorReserva(int reservaId) {
        Factura factura = null;
        try (Connection cone = getConexion()) {
            String sql = "SELECT * FROM factura WHERE reserva_id = ?";
            PreparedStatement pst = cone.prepareStatement(sql);
            pst.setInt(1, reservaId);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                factura = new Factura();
                factura.setId(rs.getInt("id"));
                factura.setReserva_id(rs.getInt("reserva_id"));
                factura.setFecha_emision(rs.getTimestamp("fecha_emision"));
                factura.setMetodo(rs.getString("metodo_pago"));
                factura.setSubTotal(rs.getDouble("subtotal"));
                factura.setIva(rs.getDouble("iva"));
                factura.setTotal(rs.getDouble("total"));
                factura.setEstado(rs.getString("estado"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener la factura: " + ex.getMessage());
        }
        return factura;
    }

    public ArrayList<Cliente> ListaCliente() {
        ArrayList<Cliente> client = new ArrayList();
        try {
            //conectamos
            Connection cone = getConexion();
            Statement st = cone.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet resul = st.executeQuery("  SELECT id,nombres_apellidos,correoelectronico,direccion,telefono,cedula,fecha_registro"
                    + "    FROM cliente ORDER BY 1  ");
            while (resul.next()) {
                Cliente c = new Cliente();
                c.setId(resul.getInt("id"));
                c.setNombres_apellidos(resul.getString("nombres_apellidos"));
                c.setCorreoelectronico(resul.getString("correoelectronico"));
                c.setDireccion(resul.getString("direccion"));
                c.setTelefono(resul.getString("telefono"));
                c.setCedula(resul.getString("cedula"));
                c.setFecha_registro(resul.getTimestamp("fecha_registro"));

                client.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("HA OCURRIDO UN ERROR");
        }
        return client;
    }

    public ArrayList<Reserva> ListaReserva() {
        ArrayList<Reserva> client = new ArrayList();
        try {
            //conectamos
            Connection cone = getConexion();
            Statement st = cone.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet resul = st.executeQuery("  SELECT id,cliente_id, destino, origen, fecha_reserva, fecha_viaje, cantidad_pasajeros, clase, precio_total, estado"
                    + "    FROM reserva ORDER BY 1  ");
            while (resul.next()) {
                Reserva c = new Reserva();
                c.setId(resul.getInt("id"));
                //c.setCliente_id(resul.getInt("cliente_id"));
                c.setNombres_apellidos(resul.getString("cliente_id"));
                c.setDestino(resul.getString("destino"));
                c.setOrigen(resul.getString("origen"));
                c.setFecha_reserva(resul.getTimestamp("fecha_reserva"));
                c.setFecha_viaje(resul.getTimestamp("fecha_viaje"));
                c.setCantidad_pasajeros(resul.getDouble("cantidad_pasajeros"));
                c.setClase(resul.getString("clase"));
                c.setPrecio_total(resul.getDouble("precio_total"));
                c.setEstado(resul.getString("estado"));

                client.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("HA OCURRIDO UN ERROR");
        }
        return client;
    }

    public ArrayList<Factura> ListaFactura() {
        ArrayList<Factura> client = new ArrayList();
        try {
            //conectamos
            Connection cone = getConexion();
            Statement st = cone.createStatement();
            //se indica los campos y la tabla para mostrar
            ResultSet resul = st.executeQuery("  SELECT id,reserva_id, fecha_emision, metodo_pago, subtotal, iva, total, estado"
                    + "    FROM factura ORDER BY 1  ");
            while (resul.next()) {
                Factura c = new Factura();
                c.setId(resul.getInt("id"));
                c.setReserva_id(resul.getInt("reserva_id"));
                c.setFecha_emision(resul.getTimestamp("fecha_emision"));
                c.setMetodo(resul.getString("metodo_pago"));
                c.setSubTotal(resul.getDouble("subtotal"));
                c.setIva(resul.getDouble("iva"));
                c.setTotal(resul.getDouble("total"));
                c.setEstado(resul.getString("estado"));

                client.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("HA OCURRIDO UN ERROR");
        }
        return client;
    }

}


