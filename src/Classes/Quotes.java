package Classes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quotes {


    private ArrayList<Quote> quotes;

    public Quotes() {
        quotes = new ArrayList<>();
    }


    public Quotes(ArrayList<Quote> quotes) {
        this.quotes = quotes;
    }

    public ArrayList<Quote> getList() {
        return quotes;
    }

    public ArrayList<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<Quote> quotes) {
        this.quotes = quotes;
    }

    public void add(Quote quote) {
        this.quotes.add(quote);
    }

    @Override
    public String toString() {

        String result = "Quotes (" + (new Date()).toLocaleString() + ") " + System.lineSeparator();
        for (Quote quote : quotes) {
            result += quote + System.lineSeparator();
        }
        return result;
    }

}
