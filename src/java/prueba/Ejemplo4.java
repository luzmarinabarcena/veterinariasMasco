
package prueba;

import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class Ejemplo4 {

    public static void main(String[] args) throws Exception {
      ArrayList<Mascota> lista = new ArrayList<>();

        MascotaDao mascotadao = new MascotaDao();

        Session sesion = HibernateUtil.getSessionFactory().openSession();

        lista = mascotadao.listPastor(sesion);
      
        for (Mascota mascota : lista) {

            System.out.println(mascota.getRaza());
        }
    }
    
}
