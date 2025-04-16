package com.rachelpzm.infnet.util;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorTest {
    private Validador validador = new Validador();

    @BeforeAll
    static void setUp(){

    }

    @DisplayName("Teste do validador: isBlank com string vazia")
    @Test
    void testaValidador() {
        boolean resultado = validador.isBlank("");

        assertTrue(resultado);
    }

    @DisplayName("Teste do validador: isBlank com string que não é vazia")
    @Test
    void testaValidadorPreenchida() {
        boolean resultado = validador.isBlank("oiii");

        assertFalse(resultado);
    }
}