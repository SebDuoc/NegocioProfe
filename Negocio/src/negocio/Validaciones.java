/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author cetecom
 */
public class Validaciones {

    //Precio
    public boolean validarPrecio(int precio) {

        return precio > 0;
    }

    //codigo Largo 4
    public boolean validarCodigo(int codigo) {
        //&& == and
        //|| == or
        
        return codigo > 999 && codigo <= 9999;
    }

    //subcategoria
    public boolean validarCategoria(String categoria) {

        return categoria.equalsIgnoreCase("Fruta")
                || categoria.equalsIgnoreCase("Verdura");
    }
    //Telefono
    public boolean validarTelefono(int telefono){
        String fono = ""+telefono;
        //Forma 2
        return fono.length()==8;
    }
    //Mail
    public boolean validarCorreo(String correo){        
        return correo.length()>=6;
    }

}
