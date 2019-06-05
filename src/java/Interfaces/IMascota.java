/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import entidades.Mascota;
import org.hibernate.Session;
import java.util.ArrayList;




public interface IMascota {
    public abstract void guardarMascota(Mascota masco);
    
    public abstract ArrayList<Mascota> listarMascotas(Session sesion);
   public abstract void ActualizarMascota(Mascota masco); 
   
   
   
   
 public abstract ArrayList<Mascota> listPastor(Session sesion);
    public abstract ArrayList<Mascota> listSANDOR(Session sesion);
    public abstract Integer listCount(Session sesion);
    
}
