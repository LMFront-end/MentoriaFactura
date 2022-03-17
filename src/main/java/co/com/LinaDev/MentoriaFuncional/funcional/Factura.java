package co.com.LinaDev.MentoriaFuncional.funcional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    private String description;
    private Integer idFactura;
    private Integer precio;
    private Date fecha;
    private String descuento;

}
