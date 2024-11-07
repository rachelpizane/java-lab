package com.rachelpzm.avulso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassTestTest {

    ClassTest teste;

    @BeforeEach
    void setUp() {
        teste = new ClassTest();
    }

    @Test
    void test1(){
        int expected = 3;
        int actual = teste.subtracao(5,2); // 5 - 2

        assertEquals(expected,actual,"5 - 2 = 3");
    }

    @Test
    void test2(){
        int[] expected = {9,3};
        int[] actual = teste.vetores(9,3);

        assertArrayEquals(expected,actual,"Os vetores não são iguais.");
    }

    @Test
    void test3(){
        String actual = teste.getName();
        assertNotNull(actual, "Não pode ser nulo");
    }

    @Test
    void test4(){
        // ClassTest teste1 = teste.compareObjects();
        ClassTest teste1 = teste;

        assertNotSame(teste, teste1, "As variaveis apontam para o mesmo objeto.");
    }

    @Test
    void test5(){
        assertAll(
                () -> assertTrue(teste.ehPositivo(5.2), "5.2 deveria ser maior que 0."),
                () -> assertTrue(teste.ehPositivo(1), "1 deveria ser maior que 0."),
                () -> assertFalse(teste.ehPositivo(0), "0 não deveria ser positivo")
        );
    }

    @Test
    void test6(){
        assertThrows(
                IllegalArgumentException.class,
                () -> teste.setName("   "),
                "O nome não pode ser vazio."
        );

        assertThrows(
                NullPointerException.class,
                () -> teste.setName(null),
                "O nome não pode ser nulo."
        );
    }

}