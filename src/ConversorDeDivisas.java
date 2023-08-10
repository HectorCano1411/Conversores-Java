import javax.swing.JOptionPane;

/**
 * Esta clase representa un conversor de divisas que permite realizar conversiones entre distintas monedas.
 */
public class ConversorDeDivisas {

    /**
     * Realiza el proceso de conversión de divisas, mostrando un menú de opciones al usuario.
     */
    public static void realizarConversorDivisas() {
        // Definir las opciones de conversión disponibles
        String[] opciones = {
            "Peso Chileno a Dólar",
            "Peso Chileno a Euros",
            "Peso Chileno a Libras Esterlinas",
            "Peso Chileno a Yen Japonés",
            "Peso Chileno a Won sul-coreano",
            "Dólar a Peso Chileno",
            "Euros a Peso Chileno",
            "Libras Esterlinas a Peso Chileno",
            "Yen Japonés a Peso Chileno",
            "Won sul-coreano a Peso Chileno",
            "Volver al Menú Principal"
        };

        // Mostrar cuadro de diálogo con opciones al usuario
        String seleccion = (String) JOptionPane.showInputDialog(
            null, "Seleccione una opción:", "Conversor de Divisas",
            JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]
        );

        // Realizar acción correspondiente a la opción seleccionada
        if (seleccion != null) {
            switch (seleccion) {
                case "Peso Chileno a Dólar":
                    convertirAMoneda("Peso Chileno", "Dólar", 1.0 / 861.8);
                    break;
                case "Peso Chileno a Euros":
                    convertirAMoneda("Peso Chileno", "Euro", 1.0 / 946.3);
                    break;
                case "Peso Chileno a Libras Esterlinas":
                    convertirAMoneda("Peso Chileno", "Libra Esterlina", 1.0 / 1096.9);
                    break;
                case "Peso Chileno a Yen Japonés":
                    convertirAMoneda("Peso Chileno", "Yen Japonés", 1.0 / 5.99);
                    break;
                case "Peso Chileno a Won sul-coreano":
                    convertirAMoneda("Peso Chileno", "Won sul-coreano", 1.0 / 0.671);
                    break;
                case "Dólar a Peso Chileno":
                    convertirAMoneda("Dólar", "Peso Chileno", 861.8);
                    break;
                case "Euros a Peso Chileno":
                    convertirAMoneda("Euro", "Peso Chileno", 946.6);
                    break;
                case "Libras Esterlinas a Peso Chileno":
                    convertirAMoneda("Libra Esterlina", "Peso Chileno", 1096.9);
                    break;
                case "Yen Japonés a Peso Chileno":
                    convertirAMoneda("Yen Japonés", "Peso Chileno", 5.99);
                    break;
                case "Won sul-coreano a Peso Chileno":
                    convertirAMoneda("Won sul-coreano", "Peso Chileno", 0.671);
                    break;
                case "Volver al Menú Principal":
                    // No hacer nada, simplemente volver al menú principal
                    break;
                default:
                    break;
            }
            preguntarContinuar(); // Preguntar si el usuario desea continuar
        }
    }

    /**
     * Convierte una cantidad de una moneda a otra utilizando un factor de conversión.
     *
     * @param monedaOrigen   Moneda de origen.
     * @param monedaDestino  Moneda de destino.
     * @param factorConversion  Factor de conversión entre las monedas.
     */
    public static void convertirAMoneda(String monedaOrigen, String monedaDestino, double factorConversion) {
        String entrada = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas convertir en " + monedaOrigen + ":");
        if (entrada != null && !entrada.isEmpty()) {
            try {
                double monto = Double.parseDouble(entrada);
                double resultado = monto * factorConversion;

                JOptionPane.showMessageDialog(null,
                        monto + " " + monedaOrigen + " equivale a " + resultado + " en " + monedaDestino + ".");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número válido. Solo Números");
            }
        }
    }

    /**
     * Pregunta al usuario si desea continuar en la aplicación.
     * Si el usuario elige "No", se muestra un mensaje de despedida y se cierra la aplicación.
     */
    public static void preguntarContinuar() {
        int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas continuar en la aplicación?", "Continuar",
                JOptionPane.YES_NO_CANCEL_OPTION);  // Cambiado a CANCEL_OPTION
        if (opcion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "¡Hasta luego!");
            System.exit(0);
        }
    }
}
