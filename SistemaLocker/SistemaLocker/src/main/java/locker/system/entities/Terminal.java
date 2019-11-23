package locker.system.entities;
import locker.system.enumerados.Modelo;
import locker.system.enumerados.Ploteo;
import locker.system.enumerados.Tipo;
import locker.system.enumerados.TnBoxes;
public class Terminal {
    private int idTerminal;
    private int idUbicacion;
    private String nombrePc;
    private Tipo tipo;
    private Modelo modelo;
    private TnBoxes tnBoxes;
    private Ploteo ploteo;

    public Terminal() {}

    public Terminal(int idUbicacion, String nombrePc, Tipo tipo, Modelo modelo, TnBoxes nBoxes, Ploteo ploteo) {
        this.idUbicacion = idUbicacion;
        this.nombrePc = nombrePc;
        this.tipo = tipo;
        this.modelo = modelo;
        this.tnBoxes = nBoxes;
        this.ploteo = ploteo;
    }

    public Terminal(int idTerminal, int idUbicacion, String nombrePc, Tipo tipo, Modelo modelo, TnBoxes nBoxes, Ploteo ploteo) {
        this.idTerminal = idTerminal;
        this.idUbicacion = idUbicacion;
        this.nombrePc = nombrePc;
        this.tipo = tipo;
        this.modelo = modelo;
        this.tnBoxes = nBoxes;
        this.ploteo = ploteo;
    }

    @Override
    public String toString() {
        return idTerminal + ", " + idUbicacion + ", " + nombrePc + ", " + 
                tipo + ", " + modelo + ", " + tnBoxes + ", " + ploteo;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombrePc() {
        return nombrePc;
    }

    public void setNombrePc(String nombrePc) {
        this.nombrePc = nombrePc;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public TnBoxes getTnBoxes() {
        return tnBoxes;
    }

    public void setTnBoxes(TnBoxes tnBoxes) {
        this.tnBoxes = tnBoxes;
    }

    public Ploteo getPloteo() {
        return ploteo;
    }

    public void setPloteo(Ploteo ploteo) {
        this.ploteo = ploteo;
    }
        
}// end class
