package cl.duoc.dinodinos.models;

/**
 *
 * @author Cetecom
 */
public class Estegosaurio extends Dinosaurio {
    private int cantEspinas;

    public Estegosaurio(int cantEspinas, int id, String nombre, String periodo, int cantPatas) {
        super(id, nombre, periodo, cantPatas);
        this.cantEspinas = cantEspinas;
    }

    public Estegosaurio(int cantEspinas) {
        super();
        this.cantEspinas = cantEspinas;
    }
    
    public Estegosaurio(){
        super();
        this.cantEspinas = 0;
    }

    public int getCantEspinas() {
        return cantEspinas;
    }

    public void setCantEspinas(int cantEspinas) {
        this.cantEspinas = cantEspinas;
    }

    @Override
    public String toString() {
        return "Estegosaurio{" + "id=" + super.getId() + ", nombre=" + super.getNombre() + ", periodo=" + super.getPeriodo() + ", cantPatas=" + super.getCantPatas() + ",cantEspinas="+ this.cantEspinas + '}';
    }

    @Override
    public void Rugir() {
        System.out.println(this.getNombre() + ": bla bla bla");
    }
    
    
    
}
