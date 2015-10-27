import java.io.File;

public class RecursiveFileRastreator {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\alvar_000\\Desktop");
        lookIntoDirectory(file.listFiles(), "");
    }


    private static void lookIntoDirectory(File[] files, String indent) {
        for (File file : files) {
            System.out.println(indent + (file.isDirectory()? "+" : "(FILE)") + file.getName());
            if (!file.isDirectory() || file.isHidden())continue;
            if (file.isDirectory()) lookIntoDirectory(file.listFiles(), file.getName()+ "\\");
        }
    }

}
