# Java Material de apoyo

## Material recomendado
- ### [Curso de apoyo Java](https://www.youtube.com/watch?v=2ZXiuh0rg3M&list=PLWtYZ2ejMVJkjOuTCzIk61j7XKfpIR74K)


# Revisar nuestra versión de JDK
Aveces puede pasar que tenemos instalada una versión de JDK diferente a la del proyecto que queremos ejecutar, en ese caso cabe mencionar que las JDK son retrocompatibles, osea, desde su misma versión para atrás tienen compatibilidad, pero no desde la versión que tenemos en adelante, esto quiere decir que si tenemos un proyecto con una versión más nueva de JDK que la que tenemos instalado en nuestro equipo, no podremos ejecutarlo a menos que actualicemos la JDK.
- Para obtener la versión instalada de JDK en nuestro sistema, debemos ir a nuestra consola y ejecutar el comando ```java --version``` :
![texto_alternativo](./materialAyudantias/Assets/javaVersion.svg)

# Instalar JDK
![Alt text](materialAyudantias/Assets/jdkSearch.png)
![Alt text](materialAyudantias/Assets/jdkLink.png)
- Instalar el archivo descargado.

# Convenciones de nombres
## 1. Clases:
 ```PascalCase```: El nombre de una clase comienza con una letra mayúscula y utiliza mayúsculas para cada palabra subsiguiente, sin espacios. 
    - Por ejemplo:
```Java
public class MiClase {
    //Contenido de la clase
} 
```

## 2. Variables:

 ```camelCase```: El nombre de una variable comienza con una letra minúscula y utiliza mayúsculas para cada palabra subsiguiente. 
    - Por ejemplo:
```Java
int edadUsuario;
String nombrePersona;
double salarioMensual;
```
## 3. Packages:

```cl.duoc.miproyecto```
- En este ejemplo:
    - ```cl``` representa la organización o compañía.
    - ```duoc``` es el nombre del dominio de la organización.
    - ```miproyecto``` es el nombre del proyecto o módulo.
    - Se recomienda utilizar siempre minúsculas para los nombres de los paquetes para mantener consistencia con las convenciones de nombres en Java.
## 4. Métodos:
```camelCase```: El nombre de un método comienza con una letra minúscula y utiliza mayúsculas para cada palabra subsiguiente. 
- Por ejemplo:
```Java
void calcularPrecioTotal(){
}
String obtenerNombreCompleto(){
}
int obtenerEdad(){
}
void establecerEdad(int nuevaEdad){
}
```

# Estructura de metodos
```Java
tipoRetorno nombreDelMetodo(tipoDatoParametro nombreParametro) {
    // Cuerpo del método

    // Sentencias o instrucciones
    // ...

    // Retorno (si el método tiene un valor de retorno, este puede retornar una variable, un valor etc)
    return valorDeRetorno;
}
```
- Parámetros (parámetros): Son variables que el método acepta como entrada. Pueden ser de cualquier tipo y cantidad, separados por comas. Si el método no toma ningún parámetro, los paréntesis estarán vacíos.
- Retorno (return): Si el método tiene un tipo de retorno distinto de void, se utiliza la palabra clave return para devolver un valor. El tipo del valor de retorno debe coincidir con el tipo de retorno del método.


# Estructura básica de un proyecto

    NombreProyecto
    └──📂 src
        └──📂main
            └──📂java
                └──📂cl.duoc
                    ├──📃Main.java
                    ├──📦models -> Carpeta con las clases
                    │   ├──📄Clase1.java
                    │   ├──📄Clase2.java
                    │   ├──📄Clase3.java
                    │   └──📄Clase4.java
                    ├──📦utils -> Carpeta con las utilidades(enums, validaciones, funciones reutilizables)
                    │   ├──📄Enum1.java
                    │   ├──📄Enum2.java
                    │   ├──📄Validacion1.java
                    │   └──📄Validacion2.java
                    ├──📦service -> Carpeta con las interface
                    │    ├──📄INombreService1.java
                    │    └──📄INombreService2.java
                    └──📦gui -> Carpeta donde principalmente van las clases con las interfaces graficas
                         ├──📄ClaseGui1.java
                         ├──📄ClaseGui2.java
                         └──📄ClaseGui3.java
# Estructura basica de una clase

```Java
public class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    // Constructor
    public Auto() {}
    public Auto(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    /* 
        Setters, desde aquí se establecerán los valores a nuestros atributos,
        por lo que es un buen lugar para establecer un filtro o regla de negocio
        antes de definir el valor a nuestro atributo.
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public double getPrecio() {
        return precio;
    }

    // Método simple
    public void mostrarInformacion() {
        System.out.println("Auto: " + marca + " " + modelo + " (" + año + ")");
        System.out.println("Precio: $" + precio);
    }
}

```

## Resumen de los principales modificadores de acceso:
1. Public: Una variable declarada con public es accesible desde cualquier parte del código, ya sea dentro de la misma clase, en clases del mismo paquete o en clases de cualquier paquete.
```Java
public class Ejemplo {
    public int variablePublica;
}
```

2. Private:
    Una variable declarada con private solo es accesible dentro de la misma clase. No se puede acceder directamente desde otras clases, incluso si están en el mismo paquete. Aquí es dónde necesitaremos crear un objeto de nuestra clase para accesar y mutar los distintos elementos de la clase.
```Java
public class Ejemplo {
    private int variablePrivada;
}
```
3. Protected:
    Una variable declarada con protected es accesible dentro de la misma clase, en clases del mismo paquete y en clases hijas (subclases) tanto dentro como fuera del paquete.
```Java
public class Padre {
    protected int variableProtegida;
    //Constructor
    public Padre(int valor) {
        this.variableProtegida = valor;
    }
}
//Clase hija extiende de su clase padre y hereda sus atributos y metodos
public class Hijo extends Padre {
    public Hijo(int valor) {
        super(valor); // Llamamos al constructor del padre y le pasamos un valor
    }
}

```
# Unidad 2

## Polimorfismo
- Definimos como clase padre o SuperClase a la clase Figura

> [!IMPORTANT]
> Esta es un uso de las clases en su forma más básica para explicar el polimorfismo y la herencia.
> Este es un ejemplo básico de polimorfismo en Java, que permite que un objeto se comporte de diferentes maneras dependiendo de su tipo en tiempo de ejecución.

```Java
class Figura {
    void dibujar() {
        System.out.println("Dibujando una figura.");
    }
}

class Circulo extends Figura {
    @Override //Sobreescritura del metodo dibujar
    void dibujar() {
        System.out.println("Dibujando un círculo.");
    }
}

class Cuadrado extends Figura {
    @Override
    void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }
}

public class EjemploPolimorfismo {

    public static void main(String[] args) {
        Figura figura1 = new Circulo();
        Figura figura2 = new Cuadrado();

        figura1.dibujar(); // Llama al método dibujar() de la clase Circulo
        figura2.dibujar(); // Llama al método dibujar() de la clase Cuadrado
    }
}
```
> [!NOTE]
> En este ejemplo, Figura es la clase padre, Circulo y Cuadrado son clases hijas que sobrescriben el método dibujar().
> Cuando creamos instancias de Circulo y Cuadrado y las referenciamos como instancias de la clase base Figura, podemos llamar al método dibujar(), y Java decidirá dinámicamente qué implementación ejecutar segun la referencia del objeto donde Figura es la instancia de la clase y new Circulo o new Cuadrado sirven para referenciar de que clase hija es el objeto o si es de la clase padre.

## Clases abstractas
si una clase es abstracta esta será ideal para ser clase padre o superClase ya que proporcionará la estructura para las clases hijas, pero la diferencia viene cuando nuestra clase es abstracta ya que, solo podremos definir los atributos o métodos pero no la definición del contenido de estos mismos, debido a que si una clase es abstracta no se pueden generar objetos de esta clase.

- Para definir una clase abstracta basta con anteponer la ```abstract``` a la palabra class para posteriormente nombrar a nuestra clase.
```Java
public abstract class Animal {
    abstract void hacerSonido();
}

public class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("Guau, guau"); //Aquí si podemos definir el contenido de hacerSonido(); sobreescribiendo el metodo usando @Override.
    }
}
```


## Extra - offtopic Programacion general
- Netbeans tema oscuro:
https://draculatheme.com/netbeans
- Youtubers recomendacion para asignaturas:
    - Programacion Web:
        - [MiduDev](https://www.youtube.com/@midudev)
    - Programacion movil
        - [Simon Grimm, el padre de ionic](https://www.youtube.com/@galaxies_dev)
    - Programacion general
        - [BettaTech](https://www.youtube.com/@BettaTech)
        - [BraisMoure](https://www.youtube.com/@mouredev)
        - [Guinxu](https://www.youtube.com/@Guinxu)
        - [S4vitar ciberseguridad](https://www.youtube.com/@s4vitar)



## Readme by [keaguirre](https://github.com/keaguirre)
