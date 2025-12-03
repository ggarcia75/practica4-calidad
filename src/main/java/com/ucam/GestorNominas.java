package com.ucam;

public class GestorNominas {

    private static final int HORAS_JORNADA_COMPLETA = 40;
    private static final double PRECIO_HORA_EXTRA = 1.5;

    /**
     * Calcula el salario semanal de un empleado.
     * @param tipoEmpleado 'J' para Junior, 'S' para Senior, 'M' para Manager
     * @param horasTrabajadas Número de horas trabajadas en la semana
     * @return El salario calculado
     * @throws IllegalArgumentException si los datos son inválidos
     */
    public double calcularSalarioSemanal(char tipoEmpleado, int horasTrabajadas) {
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas no pueden ser negativas");
        }
        if (horasTrabajadas > 80) {
            throw new IllegalArgumentException("Exceso de horas: es inhumano trabajar más de 80h");
        }

        double tarifaBase;
        switch (Character.toUpperCase(tipoEmpleado)) {
            case 'J': // Junior
                tarifaBase = 10.0;
                break;
            case 'S': // Senior
                tarifaBase = 15.0;
                break;
            case 'M': // Manager
                tarifaBase = 25.0;
                break;
            default:
                throw new IllegalArgumentException("Tipo de empleado desconocido: " + tipoEmpleado);
        }

        double salario;
        if (horasTrabajadas <= HORAS_JORNADA_COMPLETA) {
            salario = horasTrabajadas * tarifaBase;
        } else {
            int horasExtras = horasTrabajadas - HORAS_JORNADA_COMPLETA;
            salario = (HORAS_JORNADA_COMPLETA * tarifaBase) + (horasExtras * tarifaBase * PRECIO_HORA_EXTRA);
        }

        return salario;
    }
}
