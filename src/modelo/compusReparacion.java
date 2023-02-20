/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author umg
 */
public class compusReparacion {
 private String Marca;
 private String Modelo;
 private String TipoPc;
 private String ProblemaPr;

    public compusReparacion(String Marca, String Modelo, String TipoPc, String ProblemaPr) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.TipoPc = TipoPc;
        this.ProblemaPr = ProblemaPr;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipoPc() {
        return TipoPc;
    }

    public void setTipoPc(String TipoPc) {
        this.TipoPc = TipoPc;
    }

    public String getProblemaPr() {
        return ProblemaPr;
    }

    public void setProblemaPr(String ProblemaPr) {
        this.ProblemaPr = ProblemaPr;
    }
 

     
 
 
    
}

