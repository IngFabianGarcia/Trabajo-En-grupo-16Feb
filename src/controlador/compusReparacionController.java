package controlador;


import vista.FrmPrincipal;
import vista.frmCompusReparacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.compusReparacionModel;
import vista.frmCompusReparacion;

/**
 *
 * @author Fabian
 */
public class compusReparacionController implements ActionListener {
    FrmPrincipal VistaPrincipal;
    frmCompusReparacion VistaPcs;
    compusReparacionModel ModeloCompusPcs;
    DefaultTableModel TablaPCs = new DefaultTableModel();

    public compusReparacionController(FrmPrincipal VistaPrincipal, frmCompusReparacion VistaPcs, compusReparacionModel ModeloCompusPcs) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPcs = VistaPcs;
        this.ModeloCompusPcs = ModeloCompusPcs;
        
        //Se crea la tabla en tiempo ejecucion y este modelo se enviara al formulario 
         this.TablaPCs.addColumn("MARCA");
         this.TablaPCs.addColumn("MODELO");
         this.TablaPCs.addColumn("TIPO");
         this.TablaPCs.addColumn("PROBLEMA");
         this.VistaPcs.jtTablaReparacion.setModel(TablaPCs);
         
         
         //Activacion de escucha de botones
        this.VistaPrincipal.btnEnviar.addActionListener(this);
         
         //Levantar la vista principal
        this.VistaPrincipal.setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaPrincipal.btnEnviar)
        {
            //Poner a la escucha los botones de la Compus reparacion
            this.VistaPcs.btnIngresarPc.addActionListener(this);
            
   
            //Levantar la vista Equipos
            this.VistaPcs.setLocationRelativeTo(null);
            this.VistaPcs.setVisible(true);         
        }
        
        if(e.getSource() == this.VistaPcs.btnIngresarPc)
        {
         //Esto agrega los valores al array list asi es
            this.ModeloCompusPcs.IngresarComputadoras(this.VistaPcs.txtMarca.getText(),
                    this.VistaPcs.txtModelo.getText(),
                    this.VistaPcs.txtTipoPc.getText(),
                    this.VistaPcs.txtProblemaPresenta.getText());
                 
         
            
            this.TablaPCs.addRow(new Object[]{this.ModeloCompusPcs.ListaPc.get(0).getMarca(), 
                this.ModeloCompusPcs.ListaPc.get(0).getModelo(),
                this.ModeloCompusPcs.ListaPc.get(0).getTipoPc(),
                this.ModeloCompusPcs.ListaPc.get(0).getProblemaPr()});
         
         
    
        }
    } 
}
