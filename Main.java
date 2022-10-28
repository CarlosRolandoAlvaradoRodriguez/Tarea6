package Tarea6;

public class Main
{
    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.setTitulo("Cronicas");

        libro.setAnioPublicacion("1998");

        libro.agregarAutor(new Autor("Eduardo","Puerta"));
        libro.agregarAutor(new Autor("Pedro","Arnold"));
        libro.agregarCapitulo(new Capitulo("cap 1"));
        libro.agregarCapitulo(new Capitulo("cap 2"));

        Capitulo capitulo1 = new Capitulo();

        capitulo1.agregarTema(new Tema("tema1"));
        capitulo1.agregarTema(new Tema("tema2"));
        capitulo1.agregarTema(new Tema("tema3"));


        Capitulo capitulo2 = new Capitulo();
        capitulo2.agregarTema(new Tema("tema4"));
        capitulo2.agregarTema(new Tema("tema5"));
        capitulo2.agregarTema(new Tema("tema6"));


        System.out.println("Nombre del libro: " + libro.getTitulo() + ", año de publicacion: " + libro.getAnioPublicacion());
        System.out.println("El libro tiene: " + libro.getContadorCapitulo()+" capitulos: ");
        System.out.println("los temas que se encuentran en el capitulo 1 son");
        for(Tema tem: capitulo1.getTema()){
            System.out.println(tem.getNombreTema());
        }
        System.out.println("los temas que se encuentran en el capitulo 2 son");
        for(Tema tem: capitulo2.getTema()){
            System.out.println(tem.getNombreTema());
        }
        libro.buscarCapitulo();
    }
}
