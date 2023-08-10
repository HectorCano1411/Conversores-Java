import javax.swing.JOptionPane;

/**
 * Esta clase representa un conversor de Kilómetros que permite realizar conversiones entre diferentes unidades de distancia.
 */
public class ConversorDeKilometros {

    /**
     * Realiza el proceso de conversión de Kilómetros, mostrando un menú de opciones al usuario.
     */
    public static void realizarConversorKilometros() {
        // Definir las opciones de conversión disponibles
        String[] opciones = {
            "Kilómetros a Millas",
            "Millas a Kilómetros"
        };

        // Mostrar cuadro de diálogo con opciones al usuario
        int opcionSeleccionada = JOptionPane.showOptionDialog(
            null, "Seleccione una opción de conversión:", "Conversión de Kilómetros",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]
        );

        // Realizar acción correspondiente a la opción seleccionada
        switch (opcionSeleccionada) {
            case 0:
                kilometrosAMillas();
                break;
            case 1:
                millasAKilometros();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida.");
        }
    }

    /**
     * Convierte una distancia de Kilómetros a Millas y muestra el resultado en un cuadro de diálogo.
     */
    private static void kilometrosAMillas() {
        String kilometrosStr = JOptionPane.showInputDialog("Ingrese la distancia en Kilómetros:");
        try {
            double kilometros = Double.parseDouble(kilometrosStr);
            double millas = kilometros * 0.621371;
            JOptionPane.showMessageDialog(null, kilometros + " Kilómetros equivale a " + millas + " Millas");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número válido.");
        }
    }

    /**
     * Convierte una distancia de Millas a Kilómetros y muestra el resultado en un cuadro de diálogo.
     */
    private static void millasAKilometros() {
        String millasStr = JOptionPane.showInputDialog("Ingrese la distancia en Millas:");
        try {
            double millas = Double.parseDouble(millasStr);
            double kilometros = millas / 0.621371;
            JOptionPane.showMessageDialog(null, millas + " Millas equivale a " + kilometros + " Kilómetros");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número válido.");
        }
    }
}
