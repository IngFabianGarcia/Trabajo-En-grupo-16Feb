/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author umg
 */
public class registroPropietariosModel {
    public ArrayList<registroPropietarios> ListaPropietarios = new ArrayList<>();
    
    
    
    public void IngresarComputadoras(String Apellidos, String Nombre, String Telefono)
    {
        //Esto crea los usuarios usando la java clas usuarios
        registroPropietarios NuevoPropietario = new registroPropietarios(Apellidos,Nombre,Telefono);
        
        //Esto agrega los usuarios al array list para que lo muestre en la lista
        this.ListaPropietarios.add(NuevoPropietario);
    }
    
    //En vez de ser static o void tiene que ser arrray list para que devuelva la lista ya creada
    public ArrayList ListarPropietarios()
    {
        //Este bro enviara la lista al metodo que se esta llamando
        return ListaPropietarios;
        
    }
    
}
    

