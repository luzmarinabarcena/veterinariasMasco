
package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


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
    public String guardar(){
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);
        return "/registroMascota";
    }
    public ArrayList<Mascota>listar(){
        ArrayList<Mascota>milista=new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista=dao.listarMascotas();
        return milista;
    }
    public String actualizarMascota(){
        MascotaDao dao = new MascotaDao();
        dao.ActualizarMascota(mascota);
        limpiar();
        return "/RegistroMascota";
    }
    public String limpiar(){
        mascota = new Mascota();
        return "/registrarMascota";
    }
   public String eliminarMascota(){
         MascotaDao dao = new MascotaDao();
            boolean respuesta= dao.eliminarMascota(mascota);
            if(respuesta){
                
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto","Registro Borrado con exito"));
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error","No se pudo eliminar"));
            }
            return "/RegistroMascota.xhtml";
        
    }        
    }
    //investigar sobre printface

