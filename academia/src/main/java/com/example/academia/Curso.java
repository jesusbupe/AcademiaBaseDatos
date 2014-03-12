package com.example.academia;

import java.util.Date;

/**
 * Created by Jesus on 27/01/14.
 */
public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean activo;
    private Date fecha_inicio;

    public Curso( String nombre, String descripcion, boolean activo, Date fecha_inicio) {
       this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
        this.fecha_inicio = fecha_inicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getActivo(){
        if(activo){
            return 1;
        }else{
            return 0;
        }


    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getFecha_inicioToString(){

        return fecha_inicio.toString();
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
}
