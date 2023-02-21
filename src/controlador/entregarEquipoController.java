
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.entregaEquiposModel;

import vista.FrmPrincipal;
import vista.frmEntregarEquipo;


/**
 *
 * @author huawei
 */
public class entregarEquipoController implements ActionListener{
    FrmPrincipal VistaPrincipal;
    frmEntregarEquipo VistaEntregas;
    entregaEquiposModel ModeloEntrega;
    DefaultTableModel TablaEntregas = new DefaultTableModel();

    /**
     *
     * @param VistaPrincipal
     * @param VistaEntregas
     * @param ModeloEntrega
     */
    public entregarEquipoController(FrmPrincipal VistaPrincipal, frmEntregarEquipo VistaEntregas, entregaEquiposModel ModeloEntrega) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaEntregas = VistaEntregas;
        this.ModeloEntrega = ModeloEntrega;
        
        this.TablaEntregas.addColumn("CODIGO");
        this.TablaEntregas.addColumn("PERSONA");
        this.TablaEntregas.addColumn("FECHA");
        this.TablaEntregas.addColumn("DESCRIPCION");
        this.VistaEntregas.jtEntregarEquipos.setModel(TablaEntregas);
        
        this.VistaPrincipal.btnEntregar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(FrmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnEntregar){
            this.VistaEntregas.btnEntregarEquipo.addActionListener(this);
            
            this.VistaEntregas.setLocationRelativeTo(null);
            this.VistaEntregas.setVisible(true);
        }
        
        if(e.getSource()== this.VistaEntregas.btnEntregarEquipo){
            this.ModeloEntrega.AgregarEntrega(this.VistaEntregas.txtCodigoEquipo.getText(),
                    this.VistaEntregas.txtNombrePersona.getText(),
                    this.VistaEntregas.txtFechaEntrega.getText(),
                    this.VistaEntregas.txtDescripcionSol.getText());
            
            this.TablaEntregas.addRow(new Object[]{this.ModeloEntrega.ListaEntrega.get(0).getCodigoEquipo(),
            this.ModeloEntrega.ListaEntrega.get(0).getNombrePersona(),
            this.ModeloEntrega.ListaEntrega.get(0).getFechaEntrega(),
            this.ModeloEntrega.ListaEntrega.get(0).getDescripcionSol()});
        }
    }
    
    
}
