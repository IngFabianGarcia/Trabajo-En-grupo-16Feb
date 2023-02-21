
package modelo;

/**
 *
 * @author huawei
 */
public class entregarEquipo {
    private String codigoEquipo;
    private String nombrePersona;
    private String fechaEntrega;
    private String descripcionSol;

    public entregarEquipo(String codigoEquipo, String nombrePersona, String fechaEntrega, String descripcionSol) {
        this.codigoEquipo = codigoEquipo;
        this.nombrePersona = nombrePersona;
        this.fechaEntrega = fechaEntrega;
        this.descripcionSol = descripcionSol;
    }

    public String getDescripcionSol() {
        return descripcionSol;
    }

    public void setDescripcionSol(String descripcionSol) {
        this.descripcionSol = descripcionSol;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
}
