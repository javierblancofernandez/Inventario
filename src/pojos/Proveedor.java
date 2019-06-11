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
public class Proveedor {
  private int id_proveedor;
private String nom_proveedor;
private String dir_proveedor;
private String telef_proveedor;
private String email_proveedor;
private String contacto_proveedor;

    public Proveedor(int id_proveedor, String nom_proveedor, String dir_proveedor, String telef_proveedor, String email_proveedor, String contacto_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nom_proveedor = nom_proveedor;
        this.dir_proveedor = dir_proveedor;
        this.telef_proveedor = telef_proveedor;
        this.email_proveedor = email_proveedor;
        this.contacto_proveedor = contacto_proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNom_proveedor() {
        return nom_proveedor;
    }

    public void setNom_proveedor(String nom_proveedor) {
        this.nom_proveedor = nom_proveedor;
    }

    public String getDir_proveedor() {
        return dir_proveedor;
    }

    public void setDir_proveedor(String dir_proveedor) {
        this.dir_proveedor = dir_proveedor;
    }

    public String getTelef_proveedor() {
        return telef_proveedor;
    }

    public void setTelef_proveedor(String telef_proveedor) {
        this.telef_proveedor = telef_proveedor;
    }

    public String getEmail_proveedor() {
        return email_proveedor;
    }

    public void setEmail_proveedor(String email_proveedor) {
        this.email_proveedor = email_proveedor;
    }

    public String getContacto_proveedor() {
        return contacto_proveedor;
    }

    public void setContacto_proveedor(String contacto_proveedor) {
        this.contacto_proveedor = contacto_proveedor;
    }

    @Override
    public String toString() {
        return  nom_proveedor + ", telef_proveedor=" + telef_proveedor  + '}';
    }

   


}
