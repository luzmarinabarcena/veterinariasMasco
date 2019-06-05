/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;



import entidades.Mascota;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class Ejemplo3 {

    public static void main(String[] args) {
       
         Mascota masco = new Mascota();
         masco.setNombreMascota("Merly");
         
         
         SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
         Session session =sessionFactory.openSession();
         session.beginTransaction();
         
         masco= (Mascota)session.get(Mascota.class,5);
         System.out.println("objeto mascota que tiene el nombre del mascota es:"+masco.getNombreMascota());
         masco.setNombreMascota("Jack");
         session.update(masco);
         session.getTransaction().commit();
         session.close();
    }
}
