package Persona;

public class Prueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Osskar",25);
        System.out.println("Su edad es de : "+persona.edad);

        System.out.println("El nombre de la persona es : "+persona.getNombre());
        persona.setNombre("Carlos");
        System.out.println("El nuevo nombre de la persona es : "+ persona.getNombre());

    }
}
