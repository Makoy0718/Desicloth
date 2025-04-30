package pe.edu.upc.desicloth.dtos;
import pe.edu.upc.desicloth.entities.Pedido;
import java.time.LocalDate;

public class PagoDTO {

    private int idPago;
    private String metodoPago;
    private Double montoPago;
    private String comprobantePago;
    private LocalDate fechaPago;

    private PedidoDTO pedidoId;

}
