package katahistogram;

import java.util.List;

public class MailHistogramBuilder {

    private final List<String> mails;

    public MailHistogramBuilder(List<String> mails) {
        this.mails = mails;
    }

    public Histogram build(){
        Histogram<String> histogram = new Histogram<String>();
        for (String mail : mails) histogram.increment(new Mail(mail).getDomain());
        return histogram;
    }
}
