package cl.duoc.verduleria.utils;

public class Validaciones {
    
    /*    
♦	El precio debe ser mayor a 0
♦	El código del producto debe tener largo 4
♦	La subcategoría debe ser Fruta o Verdura
♦	El teléfono debe tener largo 8
♦	El mail debe tener largo mínimo de 6
♦	El run debe ser válido
♦	La fecha de la solicitud debe ser menor o igual a la actual

    */
    
    public static boolean validaPrecio(float precio){
        return (precio > 0);
    }
    
    public static boolean validaCodigo(int codigo, int largo){
        // alternativo: ((codigo + "").length() == 4);
        //return (codigo > 999 && codigo < largo);
        return ((codigo + "").length() == largo);
    }
}
