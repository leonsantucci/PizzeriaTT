/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriatt;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class AdministradorDePedidos {
    
    public Pedido guardar(Pedido p) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        p = (Pedido) session.merge(p);
        session.getTransaction().commit();
        
        return p;
    }
    
    public List<Pedido> obtener() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        SQLQuery query = session.createSQLQuery("select * from Pedido").addEntity(Pedido.class);
        List<Pedido> Listado = query.list();
        session.close();
        return Listado;
    }
    
    public void borrar(Pedido p) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.delete(p);
        session.getTransaction().commit();
    }

}
