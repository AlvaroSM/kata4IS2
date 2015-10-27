package katahistogram;

import java.io.File;
import java.io.IOException;
import java.lang.String;

public class Main {

    public static void main(String[] args) throws IOException {
        Histogram histogram =
                new MailHistogramBuilder
                        (new MailReader
                                (new File("C:\\Users\\alvar_000\\Desktop\\emails.txt")).
                                read()).
                        build();

        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);

        histogramDisplay.execute();
    }

}
