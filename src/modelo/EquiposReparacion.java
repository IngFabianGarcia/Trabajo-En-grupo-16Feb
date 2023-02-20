
package modelo;

/**
 *
 * @author Fabian
 */
public class EquiposReparacion {
    
 private String codigo;
 private String descripcion;
 private String tecnico;
 private String fecha;

    public EquiposReparacion(String codigo, String descripcion, String tecnico, String fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tecnico = tecnico;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
 
    
}
