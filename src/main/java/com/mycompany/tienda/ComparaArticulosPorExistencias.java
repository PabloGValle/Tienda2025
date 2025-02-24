/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import java.util.Comparator;

/**
 *
 * @author alu01d
 */
public class ComparaArticulosPorExistencias implements Comparator <Articulo> {

    @Override
    public int compare(Articulo a1, Articulo a2) {
        return Integer.compare(a1.getExistencias(),a2.getExistencias());
    }
}
