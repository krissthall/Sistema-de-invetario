package modelo;

public class Usuarios {
    private int id;
    private String username;
    private String contrasena;
    private String nombre;
    private String rol;

    public Usuarios() {}

    public Usuarios(int id, String username, String contrasena, String nombre, String rol) {
        this.id = id;
        this.username = username;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.rol = rol;
    }

}
