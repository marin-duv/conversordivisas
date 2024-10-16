
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ListaMonedas orden = new ListaMonedas(); //imprime la abreviación de cada divisa de la api

        ConsultaMoneda consulta = new ConsultaMoneda(); //consulta api

        DecimalFormat df = new DecimalFormat("#.00"); //limita numero de decimales

        System.out.println("***************************************************************************************************************************\n");
        System.out.println("Lista de Abreviaciones de Divisas Internacionales:\n");
        orden.ordenListaMonedas(); //imprime la abreviación de cada divisa de la apibrl
        System.out.println("***************************************************************************************************************************\n");
        System.out.println("Bienvenid-o/a   al conversor de Monedas Internacional \n");

        while (true) {
            try {
                System.out.println("#################  NUEVA CONSULTA #################");
                System.out.println("Por favor, observa la lista de abreviaciones de las Divisas");
                System.out.println("###################################################\n");
                System.out.println("Escribe la abreviacion de la divisa a consultar, por favor:");
                var tipoMoneda = lectura.nextLine().toUpperCase(); //se cambia a mayuscula el string

                Moneda moneda = consulta.buscaMoneda(tipoMoneda); //consulta a la api
                //System.out.println("Primer consulta Api "+ moneda); //imprime en pantalla la consulta a la api - desactivado

                System.out.println("Escribe la abreviación de la DIVISA que deseas hacer la conversion, por favor:");
                var conversor = lectura.nextLine().toUpperCase(); //se cambia a mayuscula el string

                System.out.println("TASA DE CONVERSION PARA LA UNIDAD DE: 1 "+tipoMoneda+" es igual a "+ moneda.conversion_rates().get(conversor)
                        + " " + conversor + "\n");

                System.out.println("Cantidad de: " + conversor + " que vas a convertir:");
                double valorDivisa =  moneda.conversion_rates().get(conversor);
                var unidades = lectura.nextLine();
                double cantidad = Double.parseDouble(unidades); //so convierte en double a unidades
                double formulaDivisas = (cantidad) / (valorDivisa); //formula calcula conversion
                //imprime en pantalla resultado de formula divisas
                System.out.println("La cantidad de " + cantidad + " " + conversor + " equivalen a " + df.format(formulaDivisas) + " " + tipoMoneda+"\n");

                //Continuar o Salir
                System.out.println("Escribe 'SALIR' para terminar, o presiona enter para otra consulta");
                var busqueda = lectura.nextLine();
                if (busqueda.equalsIgnoreCase("salir")) {
                    break;
                }

                orden.ordenListaMonedas(); //imprime la abreviación de cada divisa de la api
                System.out.println("*********************************************");

            } catch (NumberFormatException e){
                System.out.println("Error en el formato de la moneda");
            } catch (RuntimeException e ){
                System.out.println(e.getMessage());
                System.out.println("Intenta de Nuevo.\n");
            }
        }
    }
}