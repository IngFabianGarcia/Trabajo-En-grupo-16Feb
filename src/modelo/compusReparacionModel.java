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
public class compusReparacionModel {
    public ArrayList<compusReparacion> ListaPc = new ArrayList<>();
    
    
    
    public void IngresarComputadoras(String marca, String modelo, String tipoPc, String problemaPresenta)
    {
        //Esto crea los usuarios usando la java clas usuarios
        compusReparacion NuevaPc = new compusReparacion(marca,modelo,tipoPc,problemaPresenta);
        
        //Esto agrega los usuarios al array list para que lo muestre en la lista
        this.ListaPc.add(NuevaPc);
    }
    
    //En vez de ser static o void tiene que ser arrray list para que devuelva la lista ya creada
    public ArrayList ListarUsuarios()
    {
        //Este bro enviara la lista al metodo que se esta llamando
        return ListaPc;
        
    }
    
}
    

