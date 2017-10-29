package io.dssd.model;

import javax.persistence.*;

@Entity
@Table(name="objeto")
public class Objeto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="objeto_id")
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="cantidad")
    private Long cantidad;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="precio")
    private Double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
