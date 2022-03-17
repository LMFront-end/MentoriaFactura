package co.com.LinaDev.MentoriaFuncional.funcional;


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

        

    }
}
