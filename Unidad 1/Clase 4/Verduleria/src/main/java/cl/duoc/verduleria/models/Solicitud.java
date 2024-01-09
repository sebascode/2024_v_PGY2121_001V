package cl.duoc.verduleria.models;

import java.time.LocalDate;

public class Solicitud {
    // número de solicitud, una fecha, un cliente,
    // un total y varios productos
    
    private static int idGlobal = 100;
    
    private int numeroSolicitud;
    private LocalDate fecha;
    private Cliente cliente;
    private float total;
    private String productos;

    public Solicitud(LocalDate fecha, Cliente cliente, float total, String productos) {
        this.numeroSolicitud = idGlobal;
        idGlobal = idGlobal+10;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
        this.productos = productos;
    }
    
    public Solicitud() {
        this.numeroSolicitud = idGlobal;
        idGlobal = idGlobal+10;
        this.fecha = LocalDate.now();
        this.cliente = new Cliente();
        this.total = 0f;
        this.productos = "";
    }

    public int getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
    public void AgregarProducto(String detalleProducto){
        this.productos += detalleProducto+"; ";
    }
    
    public String ObtenerDetallePedido(){
        String mensaje = "************";
        mensaje += "\nPedido nro.: "+ this.numeroSolicitud;
        mensaje += "\nFecha: "+ this.fecha.toString();
        mensaje += "\nProductos: "+ this.productos;
        mensaje += "\nNombre cliente:"+ this.cliente.getNombre();
        mensaje += "\n************";
        
        return mensaje;
    }
    
    public float CalcularDescuento(float descuento){
        float totalDescuento = total * descuento / 100;
        return totalDescuento;
    }
}
