package Tarea6;
import java.util.Scanner;

public class Libro
{
    private String titulo;
    private String anioPublicacion;
    private int contadorAutor;
    private int contadorCapitulo;
    private Autor autor[];
    private Capitulo capitulo[];

    private int busqueda;


    public Libro()
    {
        this.autor = new Autor[2];
        this.contadorAutor=0;
        this.capitulo = new Capitulo[2];
        this.contadorCapitulo=0;
    }

    public Libro(String titulo, String anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }


    public void agregarAutor(Autor autor){this.autor[contadorAutor++] = autor;}
    public void agregarCapitulo(Capitulo capitulo){this.capitulo[contadorCapitulo++] = capitulo;}

    //GETTER AND SETTER
    public String getTitulo()
    {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getContadorAutor() {
        return contadorAutor;
    }
    public void setContadorAutor(int contadorAutor) {
        this.contadorAutor = contadorAutor;
    }
    public int getContadorCapitulo() {
        return contadorCapitulo;
    }
    public void setContadorCapitulo(int contadorCapitulo) {
        this.contadorCapitulo = contadorCapitulo;
    }
    public Capitulo[] getCapitulo(){
        return this.capitulo;
    }
    public int getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(int busqueda) {
        this.busqueda = busqueda;
    }
    public void buscarCapitulo(){
        int i;
        int band=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Buscar: Capitulo N° ");int encontrar= sc.nextInt();

        for(i=1;i<contadorCapitulo+1;i++) {
            if(i == busqueda)
                band=1;
        }
        if(band == 1)
            System.out.println("Encontrado: Capitulo "+ encontrar);
        else
            System.out.println("No se encontro: Capitulo "+ encontrar);
    }

}
