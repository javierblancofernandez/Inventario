/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author FRANCISCO
 */
public class CategoriaProd {
  private int idCategoriaProd;
private String nombreCategoriaProd;
private String descCategoriaProd;

    public CategoriaProd(int idCategoriaProd, String nombreCategoriaProd, String descCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
        this.nombreCategoriaProd = nombreCategoriaProd;
        this.descCategoriaProd = descCategoriaProd;
    }

    public int getIdCategoriaProd() {
        return idCategoriaProd;
    }

    public void setIdCategoriaProd(int idCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
    }

    public String getNombreCategoriaProd() {
        return nombreCategoriaProd;
    }

    public void setNombreCategoriaProd(String nombreCategoriaProd) {
        this.nombreCategoriaProd = nombreCategoriaProd;
    }

    public String getDescCategoriaProd() {
        return descCategoriaProd;
    }

    public void setDescCategoriaProd(String descCategoriaProd) {
        this.descCategoriaProd = descCategoriaProd;
    }

    @Override
    public String toString() {
        return  nombreCategoriaProd ;
    }
    

   

}
