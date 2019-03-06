/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author r618b
 */
public class Pizza {
   private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private float grTomate;
    private float grQueso;
    private String tipoQueso;
    private float grPiña;

    public Pizza(float grHarina, float mlAgua, float grSal, float mlAceite, float grTomate, float grQueso, String tipoQueso, float grPiña) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPiña = grPiña;
    }

    public float getGrHarina() {
        return grHarina;
    }

    public void setGrHarina(float grHarina) {
        this.grHarina = grHarina;
    }

    public float getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(float mlAgua) {
        this.mlAgua = mlAgua;
    }

    public float getGrSal() {
        return grSal;
    }

    public void setGrSal(float grSal) {
        this.grSal = grSal;
    }

    public float getMlAceite() {
        return mlAceite;
    }

    public void setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
    }

    public float getGrTomate() {
        return grTomate;
    }

    public void setGrTomate(float grTomate) {
        this.grTomate = grTomate;
    }

    public float getGrQueso() {
        return grQueso;
    }

    public void setGrQueso(float grQueso) {
        this.grQueso = grQueso;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public float getGrPiña() {
        return grPiña;
    }

    public void setGrPiña(float grPiña) {
        this.grPiña = grPiña;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso + ", tipoQueso=" + tipoQueso + ", grPiña=" + grPiña + '}';
    }   
}
