package pe.edu.upc.desicloth.dtos;

import java.time.LocalDate;

public class PedidoDTO {

    private int idPedido;
    private LocalDate fechaPedido;
    private UsuarioDTO usuarioId;

    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public UsuarioDTO getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(UsuarioDTO usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }
    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
