package cl.duoc.miservicio.service;

import cl.duoc.miservicio.models.Persona;

public interface IPersonaService {
    public static final int IVA = 19;
    public static final int descuentoCarga = 3;
    public static final int descuentoPasajeros = 7;
    
    public void Guardar(Persona p);
    public void Borrar(int i);
    public void ImprimirListado();
}
