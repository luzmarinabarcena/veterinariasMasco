
package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class MascotaBean {
    private Mascota mascota;
//creamos el contructor
    public MascotaBean() {
        mascota = new Mascota();
    }
//creamos su getter and setter
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    //creando metodo para que llame a dao
    public void guardar(){
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);
    }
    //investigar sobre printface
}
