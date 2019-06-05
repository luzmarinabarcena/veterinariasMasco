
package prueba;

import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import org.hibernate.Session;

public class Ejemplo6 {

    public static void main(String[] args) {
        // TODO code application logic here
        Integer contar;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        MascotaDao mascotadao = new MascotaDao();
        contar = mascotadao.listCount(sesion);

        System.out.println(contar);

    }

}
