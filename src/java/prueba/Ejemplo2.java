/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Interfaces.IMascota;
import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Session;

public class Ejemplo2 {

    public static void main(String[] args) {

        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        lista = mascotadao.listarMascotas();
        System.out.println("LISTA DE LAS MASCOTAS");
        
        for (Mascota mascota : lista) {

            System.out.println( mascota.getIdMascota()+"_"+mascota.getNombreMascota()+"_"+mascota.getRaza()+"_"+mascota.getNombreCliente());

        }
    }

}
