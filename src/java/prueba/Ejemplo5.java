
package prueba;

import Utilitarios.HibernateUtil;
import entidades.Mascota;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.Session;
import dao.MascotaDao;
import java.util.ArrayList;

public class Ejemplo5 {

    public static void main(String[] args) {
            ArrayList<Mascota> lista = new ArrayList<>();

        MascotaDao mascotadao = new MascotaDao();

        Session sesion = HibernateUtil.getSessionFactory().openSession();

        lista = mascotadao.listSANDOR(sesion);
      
        for (Mascota mascota : lista) {

            System.out.println(mascota.getNombreMascota());
        }
        
        // TODO code application logic here
    }

    
}
