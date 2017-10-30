package io.dssd.model;

import javax.persistence.*;

@Entity
@Table(name="fotografia")
public class Fotografia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="fotografia_id")
    private Long id;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="uri")
    private String uri;

    @ManyToOne
    @JoinColumn(name="expediente_id")
    private Expediente expediente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
}
