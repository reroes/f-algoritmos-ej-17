# f-algoritmos-ej-17

## Clase 2

### Clases en Java

```java
public class Computadora {
    double velocidad_procesador;
   
}
```

```java
public class Computadora {
    private double velocidad_procesador;
   
}
```
```java
public class Computadora {
    private double velocidad_procesador; // variable global
    
    public void agregar_velocidad_procesador(double velocidad){
        velocidad_procesador = velocidad;
    }
    
    public double obtener_velocidad_procesador(){
        return velocidad_procesador;
    }
}
```
```java
public class Computadora {
    private double velocidad_procesador; // variable global
    
    public void agregar_velocidad_procesador(double velocidad){
        velocidad_procesador = velocidad;
    }
    
    public double obtener_velocidad_procesador(){
        return velocidad_procesador;
    }
    
    public String toString(){
        String cadena = String.format("La computadora tiene una velocidad de "
                + "%.2f", obtener_velocidad_procesador());
        return cadena;
    }
}
```

```java
public class Computadora {
    private double velocidad_procesador; // variable global
    
    public Computadora(){
        velocidad_procesador = 3.0;
    }
    
    public Computadora(double velocidad){
        velocidad_procesador = velocidad;
    }
    
    public void agregar_velocidad_procesador(double velocidad){
        velocidad_procesador = velocidad;
    }
    
    public double obtener_velocidad_procesador(){
        return velocidad_procesador;
    }
    
    public String toString(){
        String cadena = String.format("La computadora tiene una velocidad de "
                + "%.2f", obtener_velocidad_procesador());
        return cadena;
    }
}
```
