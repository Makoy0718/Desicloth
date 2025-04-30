package pe.edu.upc.desicloth.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;

    @Column(name = "nombreCategoria", length = 50,nullable = false)
    private int nombreCategoria;

    @Column(name = "descripcionCategoria", length = 50,nullable = false)
    private int descripcionCategoria;

    @ManyToOne
    @JoinColumn(name = "disenoId", referencedColumnName = "idDiseno") // La clave foránea 'disenoId' de Categoria
    private Diseno diseno;

    public Categoria() {
    }

    public Categoria(int idCategoria, int nombreCategoria, int descripcionCategoria, Diseno diseno) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.diseno = diseno;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(int nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(int descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public Diseno getDiseno() {
        return diseno;
    }

    public void setDiseno(Diseno diseno) {
        this.diseno = diseno;
    }
}
