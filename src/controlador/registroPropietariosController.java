package controlador;


import vista.FrmPrincipal;
import vista.frmRegistroPropietarios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.registroPropietariosModel;
import vista.frmRegistroPropietarios;

/**
 *
 * @author Fabian
 */
public class registroPropietariosController implements ActionListener {
    FrmPrincipal VistaPrincipal;
    frmRegistroPropietarios VistaPropietarios;
    registroPropietariosModel ModeloRegistroPropietarios;
    DefaultTableModel TablaPropietarios = new DefaultTableModel();

    public registroPropietariosController(FrmPrincipal VistaPrincipal, frmRegistroPropietarios VistaPropietarios, registroPropietariosModel ModeloRegistroPropietarios) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPropietarios = VistaPropietarios;
        this.ModeloRegistroPropietarios = ModeloRegistroPropietarios;
        
        //Se crea la tabla en tiempo ejecucion y este modelo se enviara al formulario 
         this.TablaPropietarios.addColumn("APELLIDOS");
         this.TablaPropietarios.addColumn("NOMBRE");
         this.TablaPropietarios.addColumn("TELEFONO");
         this.VistaPropietarios.jtTablaReparacion.setModel(TablaPropietarios);
         
         
         //Activacion de escucha de botones
        this.VistaPrincipal.btnRegistrar.addActionListener(this);
         
         //Levantar la vista principal
        this.VistaPrincipal.setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnRegistrar)
        {
            //Poner a la escucha los botones de la Compus reparacion
            this.VistaPropietarios.btnIngresarPc.addActionListener(this);
            
   
            //Levantar la vista Equipos
            this.VistaPropietarios.setLocationRelativeTo(null);
            this.VistaPropietarios.setVisible(true);         
        }
        
        if(e.getSource() == this.VistaPropietarios.btnIngresarPc)
        {
         //Esto agrega los valores al array list asi es
            this.ModeloRegistroPropietarios.IngresarComputadoras(this.VistaPropietarios.txtMarca.getText(),
                    this.VistaPropietarios.txtModelo.getText(),
                    this.VistaPropietarios.txtTipoPc.getText());
                 
         
            
            this.TablaPropietarios.addRow(new Object[]{this.ModeloRegistroPropietarios.ListaPropietarios.get(0).getApellidos(), 
                this.ModeloRegistroPropietarios.ListaPropietarios.get(0).getNombre(),
                this.ModeloRegistroPropietarios.ListaPropietarios.get(0).getTelefono()});
         
         
    
        }
    } 
}
