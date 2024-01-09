package cl.duoc.verduleria.models;

import cl.duoc.verduleria.utils.Validaciones;

public class Producto {
    // código, subcategoría, descripción, 
    // precio, medida (unidad o gramos) y su cantidad
        
    private int codigo;
    private String subcategoria;
    private String descripcion;
    private int precio;
    private UnidadMedida medida; // 1: unidad, 2: gramos
    private float cantidad;

    public Producto(int codigo, String subcategoria, String descripcion, int precio, UnidadMedida medida, float cantidad) {
        this.codigo = codigo;
        this.subcategoria = subcategoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.medida = medida;
        this.cantidad = cantidad;
    }
    
    public Producto() {
        this.codigo = 0;
        this.subcategoria = "";
        this.descripcion = "";
        this.precio = 0;
        this.medida = UnidadMedida.Gramos;
        this.cantidad = 0f;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        boolean validacion = Validaciones.validaCodigo(codigo, 4);
        
        if(validacion){
            this.codigo = codigo;
        }
        else{
            System.out.println("Error, codigo tiene màs o menos de 4 caracteres.");
        }
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public UnidadMedida getMedida() {
        return medida;
    }

    public void setMedida(UnidadMedida medida) {
        this.medida = medida;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        // zanahoria $890 1 kilo
        String mensaje = descripcion + " $"+precio+" "+cantidad+" "+ medida.toString();
        return mensaje;
    }
    
    /*
    public void sdasdas(){
        UnidadMedida medida = UnidadMedida.Gramos;
        
        if(medida.equals(UnidadMedida.Gramos)){
            System.out.println("Es gramos.");
        }
        else{
            System.out.println("Es Unidad.");
        }
    }
    */
}
