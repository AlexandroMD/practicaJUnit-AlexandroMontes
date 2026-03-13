/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.dam.practicajunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author perri
 */
public class CirculoTest {
    
    @Test
    public void testConstructorVacio() {
        Circulo circulo = new Circulo();
        assertEquals(0.0, circulo.getRadio(), 0.0);
    }
    
    @Test
    public void testSetRadio() {
        Circulo circulo = new Circulo(3.0);
        circulo.setRadio(7.0);
        assertEquals(7.0, circulo.getRadio(), 0.0);
    }
    
    @Test
    public void testGetRadio() {
        Circulo circulo = new Circulo(5.0);
        assertEquals(5.0, circulo.getRadio(), 0.0);
    }
}
