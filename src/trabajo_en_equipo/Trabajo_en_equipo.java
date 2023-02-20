
package trabajo_en_equipo;

import controlador.compusReparacionController;
import controlador.equiposController;
import modelo.compusReparacionModel;
import modelo.equiposModel;
import vista.FrmPrincipal;
import vista.frmEquipos;
import vista.frmCompusReparacion;

/**
 *
 *
 * @author fabia
 */
public class Trabajo_en_equipo {

  
    public static void main(String[] args) {
        FrmPrincipal VistaPrincipal = new FrmPrincipal();
        frmEquipos VistaEquipos = new frmEquipos(VistaPrincipal, true);
        frmCompusReparacion vistaPcRepa = new frmCompusReparacion(VistaPrincipal, true);
        
        equiposModel ModeloUsuarios = new equiposModel();
        compusReparacionModel ModeloPcRepa= new compusReparacionModel();
        
        
        equiposController ControladorUsuarios = new equiposController(VistaPrincipal,VistaEquipos,ModeloUsuarios);
        compusReparacionController ControladorPcRepa = new compusReparacionController(VistaPrincipal, vistaPcRepa,ModeloPcRepa);
        
        
  
       
    }
    
}
