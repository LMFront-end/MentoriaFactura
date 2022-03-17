package co.com.LinaDev.MentoriaFuncional.funcional;


public class FormaFuncional {

    public static void main(String[] args) {

        // mostrar todos los elementos de la lista
        FacturaService.mostrarListaProductos();

        // mostrar elemento por id
        FacturaService.mostrarPorId();

        // filtrar por nombre
        FacturaService.filtrarPorNombre();

        // filtrar por fecha mayor al 2019
        FacturaService.filtrarPorFecha();

        // filtrar por fecha menor al 2018
        FacturaService.filtrarFechaMenor();

        // multiplicar precio por 2
        FacturaService.multiplicarPorDos();

        // filtrar por precio
        FacturaService.filtrarPrecio();

        // mostrar el primer elemento mayor a $300
        FacturaService.mostrarValor();



    }
}
