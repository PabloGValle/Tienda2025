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
public class ComparaArticulosPorPrecio implements Comparator <Articulo> {
    @Override
    public int compare(Articulo a1, Articulo a2) {
        return Double.compare(a1.getPvp(),a2.getPvp());
    }
}