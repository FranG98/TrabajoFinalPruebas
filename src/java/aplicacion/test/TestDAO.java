/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IVentaDAO;
import aplicacion.hibernate.dao.imp.VentaDAOImp;
import aplicacion.modelo.constantes.EstadoVenta;
import aplicacion.modelo.dominio.Rol;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;

/**
 *
 * @author Windows
 */
public class TestDAO {
    public static void main(String[] args) {
        Venta nuevaVenta = new Venta();
        nuevaVenta.setCodigoVenta(1);
        nuevaVenta.setEstadoVenta(EstadoVenta.REALIZADA);
        nuevaVenta.setFechaHoraVenta(nuevaVenta.getFechaHoraVenta());
        nuevaVenta.setGanancia(500);
        nuevaVenta.setUsuarioComprador(new Usuario("Fran", "God", (byte)23, 41301352, "xd.com", "chucha", "Habilitada", new Rol()));
        IVentaDAO ventaDAO = new VentaDAOImp();
        ventaDAO.crear(nuevaVenta);
    }
}
