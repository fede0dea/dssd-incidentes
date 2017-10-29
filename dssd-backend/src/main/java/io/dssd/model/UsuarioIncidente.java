package io.dssd.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="usuario_incidente")
public class UsuarioIncidente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="usuario_incidente_id")
    private Long id;

    @Column(name="usuario_id")
    private Usuario usuario;

    @Column(name="incidente_id")
    private Incidente incidente;

    @Column(name="creado_en")
    private Date creadoEn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Incidente getIncidente() {
        return incidente;
    }

    public void setIncidente(Incidente incidente) {
        this.incidente = incidente;
    }

    public Date getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }
}
