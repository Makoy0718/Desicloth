package pe.edu.upc.desicloth.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="Pedido")

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;

    @Column(name = "fechaPedido", nullable = false)
    private LocalDate fechaPedido;

    @Column(name = "estadoPedido", length = 20,nullable = false)
    private String estadoPedido;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;


    public Pedido(){
    }
    public Pedido(int idPedido, LocalDate fechaPedido, String estadoPedido, Usuario usuario) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.usuario = usuario;
    }

    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public LocalDate getFechaPedido() { return fechaPedido; }
    public void setFechaPedido(LocalDate fechaPedido) { this.fechaPedido = fechaPedido; }

    public String getEstadoPedido() { return estadoPedido; }
    public void setEstadoPedido(String estadoPedido) { this.estadoPedido = estadoPedido; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
