import java.io.File;

public class Kata4V1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\alvar_000\\Desktop");
        String [] names = file.list();
        for (String name : names) System.out.println(name);
    }
}
