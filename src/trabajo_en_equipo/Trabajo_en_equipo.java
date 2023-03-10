
package trabajo_en_equipo;

import controlador.entregarEquipoController;
import controlador.registroPropietariosController;
import controlador.equipoReparacionController;
import controlador.equiposController;
import modelo.entregaEquiposModel;
import modelo.registroPropietariosModel;
import modelo.equiposModel;
import modelo.reparacionModel;
import vista.FrmPrincipal;
import vista.frmEntregarEquipo;
import vista.frmEquipos;
import vista.frmRegistroPropietarios;
import vista.registRep;

/**
 *
 *
 * @author fabia
 */
public class Trabajo_en_equipo {

  
    public static void main(String[] args) {
        FrmPrincipal VistaPrincipal = new FrmPrincipal();
        frmEquipos VistaEquipos = new frmEquipos(VistaPrincipal, true);
        frmRegistroPropietarios vistaPcRepa = new frmRegistroPropietarios(VistaPrincipal, true);
        registRep VistaReparacionEquipo = new registRep(VistaPrincipal, true);
        frmEntregarEquipo VistaEntregas = new frmEntregarEquipo(VistaPrincipal, true);
        
        equiposModel ModeloUsuarios = new equiposModel();
        registroPropietariosModel ModeloPcRepa= new registroPropietariosModel();
        reparacionModel ModeloReparacionEquipos = new reparacionModel();
        entregaEquiposModel ModeloEntrega = new entregaEquiposModel();
        
        
        equiposController ControladorUsuarios = new equiposController(VistaPrincipal,VistaEquipos,ModeloUsuarios);
        registroPropietariosController ControladorPcRepa = new registroPropietariosController(VistaPrincipal, vistaPcRepa,ModeloPcRepa);
        equipoReparacionController ControladorReparacionEquipos = new equipoReparacionController(VistaPrincipal,
        VistaReparacionEquipo,ModeloReparacionEquipos);     
        entregarEquipoController ControladorEntregas = new entregarEquipoController(VistaPrincipal,
        VistaEntregas,ModeloEntrega);
    }
}
