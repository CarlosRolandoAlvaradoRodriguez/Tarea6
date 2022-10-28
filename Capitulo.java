package Tarea6;

public class Capitulo
{
    private String nombreCapitulo;
    private int contadorTema;
    private Tema tema[];

    public Capitulo()
    {
        this.tema= new Tema[3];
        this.contadorTema=0;
    }
    public Capitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;

    }

    public void agregarTema(Tema tema){this.tema[contadorTema++] = tema;}
    //GETTER AND SETTER
    public Tema[] getTema(){
        return this.tema;
    }

    public String getNombreCapitulo() {
        return nombreCapitulo;
    }

    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }

    public int getContadorAutor() {
        return contadorTema;
    }

    public void setContadorAutor(int contadorAutor) {
        this.contadorTema = contadorAutor;
    }
}
