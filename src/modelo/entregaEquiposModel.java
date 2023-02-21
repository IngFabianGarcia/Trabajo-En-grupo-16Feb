
package modelo;

import java.util.ArrayList;

/**
 *
 * @author huawei
 */
public class entregaEquiposModel {
    public ArrayList<entregarEquipo> ListaEntrega = new ArrayList<entregarEquipo>();
    
    public void AgregarEntrega(String codigoEquipo, String nombrePersona, String fechaEntrega, String descripcionSol){
        entregarEquipo NuevaEntrega = new entregarEquipo(codigoEquipo,nombrePersona,fechaEntrega,descripcionSol);
        
        this.ListaEntrega.add(NuevaEntrega);
    }
    
    public ArrayList ListarEntregas(){
        return ListaEntrega;
    }
}
