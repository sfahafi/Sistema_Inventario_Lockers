package locker.system.repositories.interfaces;
import locker.system.entities.Modulo;
import locker.system.entities.Terminal;
import locker.system.enumerados.Apertura;
import locker.system.enumerados.NBoxes;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public interface I_ModuloRepository {
    void save(Modulo modulo);
    void remove(Modulo modulo);
    void update(Modulo modulo);
    List<Modulo>getAll();
    
    default Modulo getByIdModulo(int idModulo){
        return getAll()
                .stream()
                .filter(m -> m.getIdModulo() == idModulo)
                .findFirst()
                .orElse(new Modulo());
    }
    
    default List<Modulo> getByTerminal(Terminal terminal){
        if(terminal == null) return new ArrayList<Modulo>();
        return getAll()
                .stream()
                .filter(m -> m.getIdTerminal() == terminal.getIdTerminal())
                .collect(Collectors.toList());
    }
    
    default List<Modulo> getLikeModelo(String modelo){
        if(modelo == null) return new ArrayList<Modulo>();
        return getAll()
                .stream()
                .filter(m -> m.getModelo().toLowerCase().contains(modelo.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Modulo> getLikeNSerie(String nSerie){
        if(nSerie == null) return new ArrayList<Modulo>();
        return getAll()
                .stream()
                .filter(m -> m.getNSerie().toLowerCase().contains(nSerie.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Modulo> getLikeNBoxes(NBoxes nBoxes){
        if(nBoxes == null) return new ArrayList<Modulo>();
        return getAll()
                .stream()
                .filter(m -> m.getNBoxes() == nBoxes)
                .collect(Collectors.toList());
    }
    
    default List<Modulo> getLikeApertura(Apertura apertura){
        if(apertura == null) return new ArrayList<Modulo>();
        return getAll()
                .stream()
                .filter(m -> m.getApertura() == apertura)
                .collect(Collectors.toList());
    }
      
}
    
