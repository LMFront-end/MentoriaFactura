package co.com.LinaDev.MentoriaFuncional.funcional;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FormaFuncional {

    public static void main(String[] args) {

        // Registro de la data
        Factura f1 = new Factura(1, "Pantalla", 1000, new MyDate("2021-05-05"), DescuentoValue.NO_APLICA);
        Factura f2 = new Factura(2, "Teclado", 700, new MyDate("2022-10-11"), DescuentoValue.NO_APLICA);
        Factura f3 = new Factura(3, "Mouse", 800, new MyDate("2019-05-06"), DescuentoValue.NO_APLICA);
        Factura f4 = new Factura(4, "Audifonos", 500, new MyDate("2022-07-10"), DescuentoValue.NO_APLICA);
        Factura f5 = new Factura(5, "CPU Gamer", 1000, new MyDate("2021-05-10"), DescuentoValue.NO_APLICA);
        Factura f6 = new Factura(6, "Espejo", 750, new MyDate("2018-05-05"), DescuentoValue.NO_APLICA);
        Factura f7 = new Factura(7, "Aro de luz", 200, new MyDate("2018-05-05"), DescuentoValue.NO_APLICA);

        // generar una lista
        List<Factura> listaProducto = new ArrayList<>();

        // agregar los productos de la factura
        listaProducto.add(f1);
        listaProducto.add(f2);
        listaProducto.add(f3);
        listaProducto.add(f4);
        listaProducto.add(f5);
        listaProducto.add(f6);
        listaProducto.add(f7);

        // mostrar todos los elementos de la lista
        System.out.println("Mostrar todos los elementos");
        listaProducto.stream()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // mostrar elemento por id
        System.out.println("Mostrar elementos por id");
        listaProducto.stream()
                .filter(producto -> producto.getIdFactura() == 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // filtrar por nombre
        System.out.println("Filtrar por nombre");
        listaProducto.stream()
                .filter(producto -> producto.getNombreProducto() == "Aro de luz")
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // filtrar por fecha mayor al 2019
        System.out.println("Filtrar por fecha mayor al 2019");
        listaProducto.stream()
                .filter(producto -> producto.getFecha().isAfter(new MyDate("2019-12-31")))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // filtrar por fecha menor al 2018
        System.out.println("Filtrar por fecha menor al 2018");

        // filtrar por id

        // multiplicar precio por 2

        // filtrar por precio

        // filtrar por descuento

        // mostrar el primer elemento mayor a $300

        //

    }
}
