import java.net.URI;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Divisa divisa;
        int opcion = 0;
        Double cantidad = 0.0;
        Scanner lectura = new Scanner(System.in);
        ConsultaDivisa cambioDivisa = new ConsultaDivisa();

        while(opcion != 7) {
            System.out.println("********************************************");
            System.out.println("Les doy la bienvenida al conversor de monedas");
            System.out.println("""
                    1. Convertir Pesos Mexicanos a Dolares Estado Unidenses.
                    2. Convertir Dolares Estado Unidenses a Pesos Mexicanos.
                    3. Convertir Pesos Mexicanos a Pesos Colombianos.
                    4. Convetir Pesos Colombianos a Pesos Mexicanos.
                    5. Convertir Pesos Mexicanos a Pesos Argentinos.
                    6. Convertir Pesos Argentinos a Pesos Mexicanos.
                    7. Salir.""");
            System.out.println("********************************************");
            System.out.println("Ingrese la opción deseada:");

            try {
                opcion=Integer.parseInt(lectura.nextLine());

                switch (opcion){
                    case 1:
                        System.out.println("Usted selecciono convertir Pesos Mexicanos a Dolares Estado Unidenses.");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        divisa = cambioDivisa.convierteDivisa("MXN","USD",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+divisa.conversion_rate());
                        System.out.println(cantidad+" [MXN]"+ " son "+ divisa.conversion_result()+" [USD]" );
                        break;
                    case 2:
                        System.out.println("Usted selecciono convertir Dolares Estado Unidenses a Pesos Mexicanos.");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        divisa = cambioDivisa.convierteDivisa("USD","MXN",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+divisa.conversion_rate());
                        System.out.println(cantidad+" [USD]"+ " son "+ divisa.conversion_result()+" [MXN]" );
                        break;
                    case 3:
                        System.out.println("Usted selecciono convertir Pesos Mexicanos a Pesos Colombianos.");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        divisa = cambioDivisa.convierteDivisa("MXN","COP",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+divisa.conversion_rate());
                        System.out.println(cantidad+" [MXN]"+ " son "+ divisa.conversion_result()+" [COP]" );
                        break;
                    case 4:
                        System.out.println("Usted selecciono convertir Pesos Colombianos a Pesos Mexicanos");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        divisa = cambioDivisa.convierteDivisa("COP","MXN",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+divisa.conversion_rate());
                        System.out.println(cantidad+" [COP]"+ " son "+ divisa.conversion_result()+" [MXN]" );
                        break;
                    case 5:
                        System.out.println("Usted selecciono convertir Pesos Mexicanos a Pesos Argentinos");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        divisa = cambioDivisa.convierteDivisa("MXN","ARS",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+divisa.conversion_rate());
                        System.out.println(cantidad+" [MXN]"+ " son "+ divisa.conversion_result()+" [ARS]" );
                        break;
                    case 6:
                        System.out.println("Usted selecciono convertir Pesos Argentinos a Pesos Mexicanos");
                        System.out.println("Cantidad a convertir:");
                        cantidad = Double.parseDouble(lectura.nextLine());
                        divisa = cambioDivisa.convierteDivisa("ARS","MXN",cantidad);
                        System.out.println("La tasa de conversión actual es de: "+divisa.conversion_rate());
                        System.out.println(cantidad+" [ARS]"+ " son "+ divisa.conversion_result()+" [MXN]" );
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
