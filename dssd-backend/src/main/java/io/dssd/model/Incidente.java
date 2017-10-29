package io.dssd.model;

import io.dssd.model.incidente.IncidenteTipo;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "incidente")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="incidente_id")
    private Long id;

    @Column(name="incidente_tipo")
    private IncidenteTipo tipo;

    @ManyToOne
    @Column(name="cliente_id")
    private Cliente cliente;

    @OneToMany
    @JoinColumn(name="objeto_id")
    private List<Objeto> objetos;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="creado_en")
    private Date creadoEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IncidenteTipo getTipo() {
        return tipo;
    }

    public void setTipo(IncidenteTipo tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }
}
