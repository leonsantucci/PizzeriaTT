package pizzeriatt;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class AdministradorDeVariedades {

    public List<Variedad> obtener() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        SQLQuery query = session.createSQLQuery("select * from Variedad").addEntity(Variedad.class);
        List<Variedad> Listado = query.list();
        session.close();
        return Listado;
    }
}
