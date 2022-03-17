package co.com.LinaDev.MentoriaFuncional.funcional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    private String description;
    private Integer idFactura;
    private Integer precio;

}
