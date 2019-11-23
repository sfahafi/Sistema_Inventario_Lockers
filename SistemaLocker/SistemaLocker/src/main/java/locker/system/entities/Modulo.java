package locker.system.entities;
import locker.system.enumerados.Apertura;
import locker.system.enumerados.NBoxes;
public class Modulo {
    private int idModulo;
    private int idTerminal;
    private String modelo;
    private String nSerie;
    private NBoxes nBoxes;
    private Apertura apertura;

    public Modulo() {}

    public Modulo(int idTerminal, String modelo, String nSerie, NBoxes nBoxes, Apertura apertura) {
        this.idTerminal = idTerminal;
        this.modelo = modelo;
        this.nSerie = nSerie;
        this.nBoxes = nBoxes;
        this.apertura = apertura;
    }

    public Modulo(int idModulo, int idTerminal, String modelo, String nSerie, NBoxes nBoxes, Apertura apertura) {
        this.idModulo = idModulo;
        this.idTerminal = idTerminal;
        this.modelo = modelo;
        this.nSerie = nSerie;
        this.nBoxes = nBoxes;
        this.apertura = apertura;
    }

    @Override
    public String toString() {
        return idModulo + ", " + idTerminal + ", " + 
                modelo + ", " + nSerie + ", " + nBoxes + ", " + apertura;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public int getIdTerminal() {
        return idTerminal;
    }

    public void setIdTerminal(int idTerminal) {
        this.idTerminal = idTerminal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNSerie() {
        return nSerie;
    }

    public void setNSerie(String nSerie) {
        this.nSerie = nSerie;
    }

    public NBoxes getNBoxes() {
        return nBoxes;
    }

    public void setNBoxes(NBoxes nBoxes) {
        this.nBoxes = nBoxes;
    }

    public Apertura getApertura() {
        return apertura;
    }

    public void setApertura(Apertura apertura) {
        this.apertura = apertura;
    }
        
} // end class
