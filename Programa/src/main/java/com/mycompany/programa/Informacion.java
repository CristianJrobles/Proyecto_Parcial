
package com.mycompany.programa;


public class Informacion {
    private int Codigo;
    private String Nombre;
    private String Nombre2;
    private String Entrenador;
    private String Goles;
    private String Goles2;
    private String Fecha;
    private String Dia;
    private String Mes;
    private String Año;

    public Informacion() {
    }

    public Informacion(int Codigo, String Nombre, String Nombre2, String Entrenador, String Goles, String Goles2, String Fecha, String Dia, String Mes, String Año) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Nombre2 = Nombre2;
        this.Entrenador = Entrenador;
        this.Goles = Goles;
        this.Goles2 = Goles2;
        this.Fecha = Fecha;
        this.Dia = Dia;
        this.Mes = Mes;
        this.Año = Año;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
    public String getGoles2() {
        return Goles2;
    }

    public void setGoles2(String Goles2) {
        this.Goles2 = Goles2;
    }
    

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }
    
    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEntrenador() {
        return Entrenador;
    }

    public void setEntrenador(String Entrenador) {
        this.Entrenador = Entrenador;
    }

    public String getGoles() {
        return Goles;
    }

    public void setGoles(String Goles) {
        this.Goles = Goles;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
    
}
