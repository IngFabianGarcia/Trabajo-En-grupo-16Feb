
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class equiposModel {
    public ArrayList<Equipos> ListaUsuarios = new ArrayList<Equipos>();
    
    
    
    public void AgregarUsuarios(String marca, String modelo, String tipoComputadora, String problemaComputadora)
    {
        //Esto crea los usuarios usando la java clas usuarios
        Equipos NuevoUsuario = new Equipos(marca,modelo,tipoComputadora,problemaComputadora);
        
        //Esto agrega los usuarios al array list para que lo muestre en la lista
        this.ListaUsuarios.add(NuevoUsuario);    
    }
    
    //En vez de ser static o void tiene que ser arrray list para que devuelva la lista ya creada
    public ArrayList ListarUsuarios()
    {
        //Este bro enviara la lista al metodo que se esta llamando
        return ListaUsuarios;
        
    }
    
}
