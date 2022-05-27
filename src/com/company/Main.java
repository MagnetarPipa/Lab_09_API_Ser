package com.company;

import Classes.JSONGetter;
import Classes.Quote;
import Classes.Quotes;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {


        JSONGetter jsonGetter = new JSONGetter();
        JSONGetter.url = "https://the-dune-api.herokuapp.com/quotes/5";
        jsonGetter.run();

        ObjectMapper mapper = new ObjectMapper();
        ArrayList<Quote> quotes = mapper.reader().forType(new TypeReference< ArrayList<Quote>>() {}).readValue(jsonGetter.jsonIn);

        Quotes quotes1=new Quotes(quotes);

        System.out.println("Quotes for ID:\n"+quotes1);


        System.out.println("\n-------------------Sorting----------------------\n");

        quotes1.getQuotes().sort(Quote.byIDValueAsc);
        System.out.println("After sorting by ID ascending:\n" + quotes1);
        quotes1.getQuotes().sort(Quote.byIDValueDesc);
        System.out.println("After sorting by ID descending:\n" + quotes1);

        quotes1.getQuotes().sort(Quote.byTextLengthAsc);
        System.out.println("After sorting by Text Length ascending:\n" + quotes1);

        quotes1.getQuotes().sort(Quote.byTextLengthDesc);
        System.out.println("After sorting by Text Length descending:\n" + quotes1);

        quotes1.getQuotes().sort(Quote.byTextAsc);
        System.out.println("After sorting by first letter ascending:\n" + quotes1);

        quotes1.getQuotes().sort(Quote.byTextDesc);
        System.out.println("After sorting by first letter descending:\n" + quotes1);


    }

}
