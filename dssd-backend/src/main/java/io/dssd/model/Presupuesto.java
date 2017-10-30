package io.dssd.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="presupuesto")
public class Presupuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="presupuesto_id")
    private Long id;

    @OneToMany
    @JoinColumn(name="objeto_id")
    private List<Objeto> objetos;

    @ManyToOne
    @JoinColumn(name="proveedor_id")
    private Proveedor proveedor;

    @Column(name="precio")
    private Double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(List<Objeto> objetos) {
        this.objetos = objetos;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
