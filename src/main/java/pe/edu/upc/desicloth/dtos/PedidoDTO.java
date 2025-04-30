package pe.edu.upc.desicloth.dtos;

import pe.edu.upc.desicloth.entities.Usuario;

import java.time.LocalDate;

public class PedidoDTO {

    private int idPedido;
    private LocalDate fechaPedido;
    private Usuario usuario;

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }
    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
