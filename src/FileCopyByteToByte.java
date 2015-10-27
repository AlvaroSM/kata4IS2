import java.io.*;

public class FileCopyByteToByte {
    public static void main(String[] args) throws IOException {
        String from = "C:\\Users\\alvar_000\\Desktop\\Escribo para desahogarme.docx";
        String to = "C:\\Users\\alvar_000\\Desktop\\Copia.docx";

        InputStream input = new BufferedInputStream(new FileInputStream(new File(from)));
        OutputStream output = new BufferedOutputStream(new FileOutputStream(new File(to)));

        long start = System.currentTimeMillis();
        copy(input, output);
        System.out.println(System.currentTimeMillis()-start);
    }

    private static void copy(InputStream input, OutputStream output) throws IOException {
        byte[] buffer = new byte[1024];
        while (true){
            int read = input.read(buffer);
            if (read < 0) break;
            output.write(read);
        }
        input.close();
        output.flush();
        output.close();
    }
}
