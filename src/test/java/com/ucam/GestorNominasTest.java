package com.ucam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorNominasTest {

    GestorNominas gestor = new GestorNominas();

    @Test
    void testSalarioJuniorJornadaNormal() {
        // 40 horas a 10€ = 400€
        assertEquals(400.0, gestor.calcularSalarioSemanal('J', 40), 0.01);
    }

    @Test
    void testSalarioSeniorConHorasExtra() {
        // Senior (15€/h). 45 horas trabajadas.
        // 40 * 15 = 600
        // 5 extras * (15 * 1.5) = 5 * 22.5 = 112.5
        // Total = 712.5
        assertEquals(712.5, gestor.calcularSalarioSemanal('S', 45), 0.01);
    }

    @Test
    void testErrorHorasNegativas() {
        // Debe lanzar excepción si las horas son negativas
        assertThrows(IllegalArgumentException.class, () -> {
            gestor.calcularSalarioSemanal('J', -5);
        });
    }

    @Test
    void testErrorTipoEmpleadoIncorrecto() {
        // Debe lanzar excepción si el tipo es 'X'
        assertThrows(IllegalArgumentException.class, () -> {
            gestor.calcularSalarioSemanal('X', 40);
        });
    }
}
