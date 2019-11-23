package locker.system.entities;
public class Ubicacion {
    private int idUbicacion;
    private String provincia;
    private String barrio;
    private String  direccion;
    private String locacion;

    public Ubicacion() {}

    public Ubicacion(String provincia, String barrio, String direccion, String locacion) {
        this.provincia = provincia;
        this.barrio = barrio;
        this.direccion = direccion;
        this.locacion = locacion;
    }

    public Ubicacion(int idUbicacion, String provincia, String barrio, String direccion, String locacion) {
        this.idUbicacion = idUbicacion;
        this.provincia = provincia;
        this.barrio = barrio;
        this.direccion = direccion;
        this.locacion = locacion;
    }

    @Override
    public String toString() {
        return idUbicacion + ", " + provincia + ", " + barrio + ", " + direccion + ", " + locacion;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }
        
}// end class
