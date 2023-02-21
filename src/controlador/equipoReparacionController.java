package controlador;

import vista.FrmPrincipal;
import vista.frmEquipos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.reparacionModel;
import vista.registRep;

/**
 *
 * @author Fabian
 */

// Implementes acticon listener agrega la escucha de acciones a la clase
public class equipoReparacionController implements ActionListener{
    FrmPrincipal VistaPrincipal;
    registRep VistaRegistrosReparacion;
    reparacionModel ModeloEquiposReparacion;
    DefaultTableModel TablaEquiposReparados = new DefaultTableModel();


    public equipoReparacionController(FrmPrincipal VistaPrincipal, registRep VistaRegistrosReparacion, reparacionModel ModeloEquiposReparacion) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaRegistrosReparacion = VistaRegistrosReparacion;
        this.ModeloEquiposReparacion = ModeloEquiposReparacion;
        
        //Se crea la tabla en tiempo ejecucion y este modelo se enviara al formulario 
         this.TablaEquiposReparados.addColumn("CODIGO");
         this.TablaEquiposReparados.addColumn("PERSONA");
         this.TablaEquiposReparados.addColumn("FECHA");
         this.TablaEquiposReparados.addColumn("DESCRIPCION");
         this.VistaRegistrosReparacion.jtIngresoReparaciones.setModel(TablaEquiposReparados);
               
        
         this.VistaPrincipal.btnEnviar.addActionListener(this);
                
                
        //Levantar la vista principal
        this.VistaPrincipal.setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnEnviar)
        {
            //Poner a la escucha los botones de la vista usuarios
            this.VistaRegistrosReparacion.btnRegistrar.addActionListener(this);
   
            //Levantar la vista Equipos
            this.VistaRegistrosReparacion.setLocationRelativeTo(null);
            this.VistaRegistrosReparacion.setVisible(true);         
        }
        
        if(e.getSource() == this.VistaRegistrosReparacion.btnRegistrar)
        {
         //Esto agrega los valores al array list asi es
            this.ModeloEquiposReparacion.AgregarEquipoRep(this.VistaRegistrosReparacion.txtCodigoEquipo.getText(), 
                 this.VistaRegistrosReparacion.txtDescripReparacion.getText(),
                 this.VistaRegistrosReparacion.txtFechaIngreso.getText(),
                 this.VistaRegistrosReparacion.txtTecnicoAsig.getText());
         
            
            this.TablaEquiposReparados.addRow(new Object[]{this.ModeloEquiposReparacion.ListaReparacion.get(0).getCodigo(), 
                this.ModeloEquiposReparacion.ListaReparacion.get(0).getDescripcion(),
                this.ModeloEquiposReparacion.ListaReparacion.get(0).getFecha(),
                this.ModeloEquiposReparacion.ListaReparacion.get(0).getTecnico()});
        }
    } 
}
