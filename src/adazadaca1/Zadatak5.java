/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adazadaca1;

import javax.swing.JOptionPane;

/**
 *
 * @author avukelic;
 */
public class Zadatak5 {

    //Write a method that returns the largest element in a array.
    public static void main(String[] args) {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Nisi unio broj, unesi broj");
            }
        }
        int niz[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj na mjesto " + (i + 1) + ". u nizu"));
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Nisi unio broj, unesi broj");
                }
            }
        }
        int max = niz[0];
        for (int i = 1; i < n; i++) {
            if (niz[i] > max) {
                max = niz[i];
            }
        }
        System.out.println("Najveći broj u nizu je: " + max);
    }

}
