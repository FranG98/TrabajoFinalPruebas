/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.hibernate.dao.IVentaDAO;
import aplicacion.hibernate.dao.imp.VentaDAOImp;
import aplicacion.modelo.dominio.Rol;
import aplicacion.modelo.dominio.Usuario;
import aplicacion.modelo.dominio.Venta;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Windows
 */
public class TestDAO {
    public static void main(String[] args) {
         DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
    System.out.println("Hora actual: " + dateFormat.format(date));
        Rol rol = new Rol();
        Usuario usuario=new Usuario("test", "aptest", Byte.valueOf("20"), 39200693, "test@test", "test123", "ok", rol);
        Venta nuevaVenta = new Venta("ok",date, 500, 2, usuario );
        
//        nuevaVenta.setUsuarioComprador(new Usuario("Fran", "God", Byte.parseByte("23"), 41301352, "xd.com", "chucha", "Habilitada", new Rol()));
        IVentaDAO ventaDAO = new VentaDAOImp();
        ventaDAO.crear(nuevaVenta);
    }
}
