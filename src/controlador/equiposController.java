package controlador;

import vista.FrmPrincipal;
import vista.frmEquipos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.equiposModel;

/**
 *
 * @author Fabian
 */

// Implementes acticon listener agrega la escucha de acciones a la clase
public class equiposController implements ActionListener{
    FrmPrincipal VistaPrincipal;
    frmEquipos VistaEquipos;
    equiposModel ModeloEquipos;
    DefaultTableModel TablaUsuarios = new DefaultTableModel();


    public equiposController(FrmPrincipal VistaPrincipal, frmEquipos VistaEquipos, equiposModel ModeloEquipos) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEquipos = VistaEquipos;
        this.ModeloEquipos = ModeloEquipos;
        
        //Se crea la tabla en tiempo ejecucion y este modelo se enviara al formulario 
         this.TablaUsuarios.addColumn("MARCA");
         this.TablaUsuarios.addColumn("MODELO");
         this.TablaUsuarios.addColumn("TIPO");
         this.TablaUsuarios.addColumn("PROBLEMA");
         this.VistaEquipos.jtUsuarios.setModel(TablaUsuarios);
               
        
         this.VistaPrincipal.btnIngresar.addActionListener(this);
                
                
        //Levantar la vista principal
        this.VistaPrincipal.setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnIngresar)
        {
            //Poner a la escucha los botones de la vista usuarios
            this.VistaEquipos.btnInsertar.addActionListener(this);
   
            //Levantar la vista Equipos
            this.VistaEquipos.setLocationRelativeTo(null);
            this.VistaEquipos.setVisible(true);         
        }
        
        if(e.getSource() == this.VistaEquipos.btnInsertar)
        {
         //Esto agrega los valores al array list asi es
            this.ModeloEquipos.AgregarUsuarios(this.VistaEquipos.txtMarca.getText(), 
                 this.VistaEquipos.txtModelo.getText(), this.VistaEquipos.txtTipo.getText(),
                 this.VistaEquipos.txtProblema.getText());
         
            
            this.TablaUsuarios.addRow(new Object[]{this.ModeloEquipos.ListaUsuarios.get(0).getMarca(), 
                this.ModeloEquipos.ListaUsuarios.get(0).getModelo(),
                this.ModeloEquipos.ListaUsuarios.get(0).getTipoComputadora(),
                this.ModeloEquipos.ListaUsuarios.get(0).getProblemaComputadora()});
        }
    } 
}
