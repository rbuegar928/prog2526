package ejerciciosProgUD4.ejercicio1;

public class Ciudad {
    public static void main(String[] args){
        // Creamos las primeras personas
        Persona Paco = new Persona("Paco", 23, 1.92);
        Persona Manolo = new Persona("Manolo", 33, 1.75); 
        Persona Paula = new Persona("Paula", 21, 1.68);
        
        // Imprimir referencia
        //Imprimir: Hola soy x y tengo x anyos
        System.out.println(Paco);
        System.out.println("Hola soy " + Paco.nombre + " y tengo " + Paco.edad + " anyos");
        System.out.println(Manolo);
        System.out.println("Hola soy " + Manolo.nombre + " y tengo " + Manolo.edad + " anyos");
        System.out.println(Paula);
        System.out.println("Hola soy " + Paula.nombre + " y tengo " + Paula.edad + " anyos");
        
        //Ejercicio 1 parte 4
        Persona Pepe = new Persona();
        System.out.println(Pepe);
        System.out.println("Hola soy " + Pepe.nombre + " y tengo " + Pepe.edad + " anyos");
        Persona Adolfo = new Persona();
        System.out.println(Adolfo);
        System.out.println("Hola soy " + Adolfo.nombre + " y tengo " + Adolfo.edad + " anyos");
        // Cuando creamos un constructor nuevo con parámetros lo que pasa es que el constructor
        // por defecto que es el sin parámetros se sustituye por ese, y lo tenemos que crear de
        // nuevo si queremos tenerlo
        
        // Creamos dos personas con los parámetros
        Persona Juan = new Persona( "Juan", 63, 1.73);
        System.out.println("Hola soy " + Juan.nombre + " y tengo " + Juan.edad + " anyos");
        Persona Isabel = new Persona( "Isabel", 71, 1.66);
        System.out.println("Hola soy " + Isabel.nombre + " y tengo " + Isabel.edad + " anyos");
        
        // Creamos otra persona usando this()
        Persona Andrés = new Persona("Andrés ", "Torres", 23, 1.81);
        System.out.println("Hola soy " + Andrés.nombre + " y tengo " + Andrés.edad + " anyos");
        
        Persona juan = new Persona("Juan", "Pérez", 20, 1.8, DiaDeLaSemana.LUNES, Persona.Sexo.MASCULINO);
        //p.sexo = Sexo.MASCULINO;
        System.out.println(juan.nombre);
        System.out.println(juan.apellido);
        System.out.println(juan.edad);
        System.out.println(juan.estatura);
        System.out.println(juan.sexo);
    }
}