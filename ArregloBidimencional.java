import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) {
         char[][] arregloBid = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'}
        };

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(arregloBid[i][k] + " ");
            }
            System.out.println(); 
        }
    }
}