
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class reparacionModel {
    public ArrayList<EquiposReparacion> ListaReparacion = new ArrayList<>();
    
    
    
    public void AgregarEquipoRep(String codigo, String descripcion, String tecnico, String fecha)
    {
        //Esto crea los usuarios usando la java clas usuarios
        EquiposReparacion NuevoEquipoRep = new EquiposReparacion(codigo,descripcion,tecnico,fecha);
        
        //Esto agrega los usuarios al array list para que lo muestre en la lista
        this.ListaReparacion.add(NuevoEquipoRep);    
    }
    
    //En vez de ser static o void tiene que ser arrray list para que devuelva la lista ya creada
    public ArrayList EquiposReparacion()
    {
        //Este bro enviara la lista al metodo que se esta llamando
        return ListaReparacion;
        
    }
    
}
