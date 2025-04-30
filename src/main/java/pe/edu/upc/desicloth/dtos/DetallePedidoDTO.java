package pe.edu.upc.desicloth.dtos;

import pe.edu.upc.desicloth.entities.Pedido;
import pe.edu.upc.desicloth.entities.Producto;

public class DetallePedidoDTO {
    private int idDetallePedido;
    private Producto producto;
    private Pedido pedido;

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }
}
