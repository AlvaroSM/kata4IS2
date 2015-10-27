package katafiles;

import java.io.File;

public class FileRastreator  {
    public static void main(String[] args) {
        System.out.print(String.join
                ("\n", new File("C:\\Users\\alvar_000\\Desktop").list()));
    }
}
