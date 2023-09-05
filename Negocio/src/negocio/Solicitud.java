/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author cetecom
 */
public class Solicitud {
    //numeroID , fecha, cliente,total,productos
    
    private int numeroID,total;
    private String fecha,productos;
    private Cliente cliente;

    public Solicitud() {
    }

    public Solicitud(int numeroID, String fecha, Cliente cliente) {
        this.numeroID = numeroID;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getNumeroID() {
        return numeroID;
    }

    public void setNumeroID(int numeroID) {
        this.numeroID = numeroID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //Metodos Customer
    //Agregar - Detalle - Descuento - ObtenerID
    //Agregar
    public void agregarProducto(Producto nuevo){
        //Sumar al total
        total += nuevo.getPrecio();
        //agregar producto a la lista de productos
        productos+= nuevo.getDescripcion() + " $" +nuevo.getPrecio()+
                    " "+nuevo.getCantidad()+" "+nuevo.getMedida()+" ;";
    }
    
    //Ver detalle 
    public String verDetalle(){
        //ID - Fecha - Total - Rut Cliente  - Nombre - productos 
        String detalle = "";
        
        detalle += "Detalle del Pedido \n";
        detalle += "ID del pedido: "+this.numeroID+"\n";
        detalle += "Fecha del pedido: "+this.fecha+"\n";
        detalle += "Total del pedido: $"+this.total+"\n";
        detalle += "Rut del cliente: "+this.cliente.getRut()+"-"+this.cliente.getDv()+"\n";
        detalle += "Nombre del cliente: "+this.cliente.getNombre()+"\n";
        detalle += "Lista de productos: "+this.productos;        
        
        return detalle;
    }
    
    //Descuento
    public void aplicarDescuento(double descuento){
        double porc = descuento/100;
        System.out.println("Se aplico un descuento de : $"+(total*porc));
        total -= (total*porc);
    }
    
    //Obtener Id del pedido
    public int obtenerID(){
        return this.numeroID;
    }
    
}
