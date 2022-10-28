package Tarea6;

public class Autor
{
    private String nombreAutor;
    private String apellidoAutor;

    public Autor(String nombreAutor, String apellidoAutor) {
        this.nombreAutor = nombreAutor;
        this.apellidoAutor = apellidoAutor;
    }
    //GETTER AND SETTER

    public String getNombres() {
        return nombreAutor;
    }

    public void setNombres(String nombres) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellidos() {
        return apellidoAutor;
    }

    public void setApellidos(String apellidos) {
        this.apellidoAutor = apellidoAutor;
    }
    //FIN GETTER AND SETTER
}
