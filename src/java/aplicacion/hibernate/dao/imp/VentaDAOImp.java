/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.hibernate.dao.imp; 

import aplicacion.hibernate.configuracion.HibernateUtil;
import aplicacion.hibernate.dao.IVentaDAO;
import aplicacion.modelo.dominio.Venta;
import java.io.Serializable;
import org.hibernate.Session;




/**
 *
 * @author Windows
 */
public class VentaDAOImp implements Serializable, IVentaDAO{

    @Override
    public void crear(Venta venta) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(venta);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Venta venta) {
       Session session = HibernateUtil.getSessionFactory().openSession();
       session.beginTransaction();
       session.update(venta);
       session.getTransaction().commit();
       session.close();
    }
    
}
