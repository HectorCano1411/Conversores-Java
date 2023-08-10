import javax.swing.JOptionPane;

/**
 * Esta clase representa un conversor de temperatura que permite realizar conversiones entre Celsius y Fahrenheit.
 */
public class ConversorDeTemperatura {

    /**
     * Realiza el proceso de conversión de temperatura, mostrando un menú de opciones al usuario.
     */
    public static void realizarConversorTemperatura() {
        // Definir las opciones de conversión disponibles
        String[] opciones = {
            "Celsius a Fahrenheit",
            "Fahrenheit a Celsius"
        };

        // Mostrar cuadro de diálogo con opciones al usuario
        int opcionSeleccionada = JOptionPane.showOptionDialog(
            null, "Seleccione una opción de conversión:", "Conversión de Temperatura",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]
        );

        // Realizar acción correspondiente a la opción seleccionada
        switch (opcionSeleccionada) {
            case 0:
                celsiusAFahrenheit();
                break;
            case 1:
                fahrenheitACelsius();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, selecciona una opción válida.");
        }
    }

    /**
     * Convierte una temperatura de Celsius a Fahrenheit y muestra el resultado en un cuadro de diálogo.
     */
    private static void celsiusAFahrenheit() {
        String celsiusStr = JOptionPane.showInputDialog("Ingrese la temperatura en grados Celsius:");
        try {
            double celsius = Double.parseDouble(celsiusStr);
            double fahrenheit = (celsius * 9/5) + 32;
            JOptionPane.showMessageDialog(null, celsius + " °C equivale a " + fahrenheit + " °F");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número válido.");
        }
    }

    /**
     * Convierte una temperatura de Fahrenheit a Celsius y muestra el resultado en un cuadro de diálogo.
     */
    private static void fahrenheitACelsius() {
        String fahrenheitStr = JOptionPane.showInputDialog("Ingrese la temperatura en grados Fahrenheit:");
        try {
            double fahrenheit = Double.parseDouble(fahrenheitStr);
            double celsius = (fahrenheit - 32) * 5/9;
            JOptionPane.showMessageDialog(null, fahrenheit + " °F equivale a " + celsius + " °C");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Ingrese un número válido.");
        }
    }
}
