import javax.swing.JOptionPane;
import java.util.Arrays;

/**
 * Esta clase representa el menú principal de una aplicación que permite realizar conversiones de divisas, temperaturas y kilómetros.
 */
public class MenuPrincipal {

    /**
     * Método principal que inicia la aplicación y muestra el menú principal.
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        int opcion;
        do {
            opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case Opcion.REALIZAR_CONVERSION:
                    ConversorDeDivisas.realizarConversorDivisas();
                    break;
                case Opcion.REALIZAR_CONVERSION_TEMPERATURA:
                    ConversorDeTemperatura.realizarConversorTemperatura();
                    break;
                case Opcion.REALIZAR_CONVERSION_KILOMETROS:
                    ConversorDeKilometros.realizarConversorKilometros();
                    break;
                case Opcion.SALIR:
                    int respuesta = JOptionPane.showConfirmDialog(
                        null, "¿Estás seguro de que deseas salir?", "Confirmar salida",
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
                    );
                    if (respuesta == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                        System.exit(0);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != Opcion.SALIR);
    }

    /**
     * Muestra el menú principal y permite al usuario seleccionar una opción.
     * @return El índice de la opción seleccionada por el usuario.
     */
    public static int mostrarMenuPrincipal() {
        String[] opciones = {
            "Realizar Conversión de Divisas",
            "Realizar Conversión de Temperatura",
            "Realizar Conversión de Kilómetros",
            "Salir"
        };

        // Mostrar cuadro de diálogo con opciones al usuario
        String seleccion = (String) JOptionPane.showInputDialog(
            null, "Seleccione una opción:", "Menú Principal",
            JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]
        );

        // Convertir la selección en un índice
        int opcionSeleccionada = Arrays.asList(opciones).indexOf(seleccion);

        return opcionSeleccionada;
    }

    /**
     * Clase interna que define las constantes para las opciones del menú.
     */
    private static class Opcion {
        public static final int REALIZAR_CONVERSION = 0;
        public static final int REALIZAR_CONVERSION_TEMPERATURA = 1;
        public static final int REALIZAR_CONVERSION_KILOMETROS = 2;
        public static final int SALIR = 3;
    }
}
