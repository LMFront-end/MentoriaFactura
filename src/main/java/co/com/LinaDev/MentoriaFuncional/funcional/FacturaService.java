package co.com.LinaDev.MentoriaFuncional.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FacturaService {

    static Data data = new Data();
    static List<Factura> listaProducto = data.listaProducto;

    // mostrar todos los elementos de la lista
    public static void mostrarListaProductos(){
        System.out.println("Mostrar todos los elementos: ");
        new ArrayList<>(listaProducto)
                .forEach(System.out::println);
    }

    // mostrar elemento por id
    public static void mostrarPorId(){

        System.out.println("Mostrar elementos por id: ");
        listaProducto.stream()
                .filter(producto -> producto.getIdFactura() == 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // filtrar por nombre
    public static void filtrarPorNombre(){
        System.out.println("Filtrar por nombre: ");
        listaProducto.stream()
                .filter(producto -> producto.getNombreProducto() == "Aro de luz")
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // filtrar por fecha mayor al 2019
    public static void filtrarPorFecha(){

        System.out.println("Filtrar por fecha mayor al 2019: ");
        listaProducto.stream()
                .filter(producto -> producto.getFecha().isAfter(new MyDate("2019-12-31")))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // filtrar por fecha menor al 2018
    public static void filtrarFechaMenor(){

        System.out.println("Filtrar por fecha menor al 2018: ");
        listaProducto.stream()
                .filter(producto -> producto.getFecha().isBefore(new MyDate("2018-12-31")))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // multiplicar precio por 2
    public static void multiplicarPorDos(){

        System.out.println("Multiplicar precio por 2: ");
        listaProducto.stream()
                .map(producto -> producto.getPrecio() * 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    // filtrar por precio
    public static void filtrarPrecio(){

        System.out.println("Filtrar por precio: ");
        listaProducto.stream()
                .filter(producto -> producto.getPrecio() > 900)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }


    // mostrar el primer elemento mayor a $300
    public static void mostrarValor(){

        System.out.println("mostrar el primer elemento mayor a 300: ");
        Factura prod = listaProducto .stream()
                .filter(producto -> producto.getPrecio() > 300)
                .findFirst()
                .get();
        System.out.println(prod);
    }
}
