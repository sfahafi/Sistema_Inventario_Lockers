package locker.system.repositories.interfaces;
import locker.system.entities.Ubicacion;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public interface I_UbicacionRepository {
    void save(Ubicacion ubicacion);
    void remove(Ubicacion ubicacion);
    void update(Ubicacion ubicacion);
    List<Ubicacion>getAll();
    
    default Ubicacion getByIdUbicacion(int idUbicacion){
        return getAll()
                .stream()
                .filter(m -> m.getIdUbicacion()== idUbicacion)
                .findFirst()
                .orElse(new Ubicacion());
    }
    
    default List<Ubicacion> getLikeProvincia(String provincia){
        if(provincia == null) return new ArrayList<Ubicacion>();
        return getAll()
                .stream()
                .filter(m -> m.getProvincia().toLowerCase().contains(provincia.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Ubicacion> getLikeBarrio(String barrio){
        if(barrio == null) return new ArrayList<Ubicacion>();
        return getAll()
                .stream()
                .filter(m -> m.getBarrio().toLowerCase().contains(barrio.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Ubicacion> getLikeDireccion(String direccion){
        if(direccion == null) return new ArrayList<Ubicacion>();
        return getAll()
                .stream()
                .filter(m -> m.getDireccion().toLowerCase().contains(direccion.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    default List<Ubicacion> getLikeLocacion(String locacion){
        if(locacion == null) return new ArrayList<Ubicacion>();
        return getAll()
                .stream()
                .filter(m -> m.getLocacion().toLowerCase().contains(locacion.toLowerCase()))
                .collect(Collectors.toList());
    }
    
}
