
package modelo;

/**
 *
 * @author Fabian
 */
public class Equipos {
    
 private String marca;
 private String modelo;
 private String tipoComputadora;
 private String problemaComputadora;

    public Equipos(String marca, String modelo, String tipoComputadora, String poblemaComputadora) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoComputadora = tipoComputadora;
        this.problemaComputadora = poblemaComputadora;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoComputadora() {
        return tipoComputadora;
    }

    public void setTipoComputadora(String tipoComputadora) {
        this.tipoComputadora = tipoComputadora;
    }

    public String getProblemaComputadora() {
        return problemaComputadora;
    }

    public void setProblemaComputadora(String problemaComputadora) {
        this.problemaComputadora = problemaComputadora;
    }
    
    
         



}
