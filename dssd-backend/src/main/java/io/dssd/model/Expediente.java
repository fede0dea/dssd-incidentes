package io.dssd.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="expediente")
public class Expediente {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="expediente_id")
    private Long id;

    @Column(name="external_id")
    private String externalId;

    @ManyToOne
    @JoinColumn(name="incidente_id")
    private Incidente incidente;

    @ManyToOne
    @JoinColumn(name="presupuesto_id")
    private Presupuesto presupuesto;

    @OneToMany
    @JoinColumn(name="fotografia_id")
    private List<Fotografia> fotografias;

    @ManyToOne
    @JoinColumn(name="empleado_id")
    private Usuario empleado;

    @Column(name="autorizado")
    private boolean autorizado;

    public Expediente() {
        this.fotografias = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Fotografia> getFotografias() {
        return fotografias;
    }

    public void setFotografias(List<Fotografia> fotografias) {
        this.fotografias = fotografias;
    }

    public void addFotografia(Fotografia fotografia) {
        this.fotografias.add(fotografia);
    }

    public void removeFotografia(Fotografia fotografia) {
        this.fotografias.remove(fotografia);
    }

    public Usuario getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Usuario empleado) {
        this.empleado = empleado;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }
}
