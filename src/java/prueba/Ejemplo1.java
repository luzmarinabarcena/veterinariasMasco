
package prueba;

import dao.MascotaDao;
import entidades.Mascota;

public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MascotaDao mascotadao= new MascotaDao();
        Mascota mimascota = new Mascota(1, "Koki", "Gabriel", "Pastor Aleman");
        
        
        
        mascotadao.ActualizarMascota(mimascota);
    }
    
}
