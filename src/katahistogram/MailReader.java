package katahistogram;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MailReader {

    private final File file;

    public MailReader(File file) {
        this.file = file;
    }

    public List<String> read() throws IOException {
        ArrayList<String> mails = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        extractMails(mails, reader);
        return mails;
    }

    private void extractMails(ArrayList<String> mails, BufferedReader reader) throws IOException {
        String mail;
        while ((mail = reader.readLine() )!= null) {
            if (!mail.contains("@")) continue;
            mails.add(mail);
        }
    }
}
