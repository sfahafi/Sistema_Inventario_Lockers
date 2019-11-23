package locker.system.repositories.interfaces;
import locker.system.entities.Modulo;
import locker.system.entities.Terminal;
import locker.system.entities.Ubicacion;
import locker.system.enumerados.Modelo;
import locker.system.enumerados.Ploteo;
import locker.system.enumerados.Tipo;
import locker.system.enumerados.TnBoxes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public interface I_TerminalRepository {
    void save(Terminal terminal);
    void remove(Terminal terminal);
    void update(Terminal terminal);
    List<Terminal>getAll();
    
    default Terminal getByIdTerminal(int idTerminal){
        return getAll()
                .stream()
                .filter(m -> m.getIdTerminal() == idTerminal)
                .findFirst()
                .orElse(new Terminal());
    }
            
    default List<Terminal> getByUbicacion(Ubicacion ubicacion){
        if(ubicacion == null) return new ArrayList<Terminal>();
        return getAll()
                .stream()
                .filter(m -> m.getIdUbicacion() == ubicacion.getIdUbicacion())
                .collect(Collectors.toList());
    }
    
    default List<Terminal> getLikeNombrePc(String nombrePc){
        if(nombrePc == null) return new ArrayList<Terminal>();
        return getAll()
                .stream()
                .filter(m -> m.getNombrePc().toLowerCase().contains(nombrePc.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Terminal> getLikeTipo(Tipo tipo){
        if(tipo == null) return new ArrayList<Terminal>();
        return getAll()
                .stream()
                .filter(m -> m.getTipo() == tipo)
                .collect(Collectors.toList());
    }
    
    default List<Terminal> getLikeModelo(Modelo modelo){
        if(modelo == null) return new ArrayList<Terminal>();
        return getAll()
                .stream()
                .filter(m -> m.getModelo() == modelo)
                .collect(Collectors.toList());
    }
    
    default List<Terminal> getLikeTnBoxes(TnBoxes nBoxes){
        if(nBoxes == null) return new ArrayList<Terminal>();
        return getAll()
                .stream()
                .filter(m -> m.getTnBoxes() == nBoxes)
                .collect(Collectors.toList());
    }
    
    default List<Terminal> getLikePloteo(Ploteo ploteo){
        if(ploteo == null) return new ArrayList<Terminal>();
        return getAll()
                .stream()
                .filter(m -> m.getPloteo()== ploteo)
                .collect(Collectors.toList());
    }
}
