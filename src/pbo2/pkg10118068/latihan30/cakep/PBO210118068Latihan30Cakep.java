/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Belajar kombinasi percabangan dengan pewarnaan pada
 * konsol program
 */
public class PBO210118068Latihan30Cakep {
    
    // ANSI Colors
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(RED + "Kamu" + GREEN + " ngerjain sendiri" 
                + YELLOW + " latihan 17 sampe" + BLUE + " latihan 30 ini?");
        System.out.print("Jawab " + RED + "(Yoi/Enggak) : ");
        
        String konfirmasi = scanner.next().toLowerCase();
        
        if(konfirmasi.equals("yoi"))
            System.out.println("\n" + RED + "Cakep Bener. " + MAGENTA 
                    + "Good Job" + RESET);
        else
            System.out.println("\n" + RED + "Tetep Cakep sih.\n" + CYAN 
                    + "Sing penting paham konsep nya yee.\n" + RESET 
                    + "Keep the code works dude");
    }
    
}
