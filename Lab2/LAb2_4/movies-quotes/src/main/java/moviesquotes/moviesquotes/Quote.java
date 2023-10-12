package moviesquotes.moviesquotes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Quote {
    private final int show;
    private final String quote;
    
    public Quote() {
        ArrayList<Quote> quotes = getAllQuotes("./quotes.txt");
        Random rand = new Random();
        Quote randomQuote = quotes.get(rand.nextInt(quotes.size()));
        this.show = randomQuote.show;
        this.quote = randomQuote.quote;
    }

    public Quote(int show) {
        ArrayList<Quote> quotes = getAllQuotes("./quotes.txt");
        ArrayList<Quote> quotesFromShow = new ArrayList<>();
        for (Quote quote : quotes) {
            if (quote.getShow() == show) {
                quotesFromShow.add(quote);
            }
        }
        
        if (!quotesFromShow.isEmpty()) {
            Random rand = new Random();
            Quote randomQuote = quotesFromShow.get(rand.nextInt(quotesFromShow.size()));
            this.show = randomQuote.show;
            this.quote = randomQuote.quote;
        } else {
            // Handle the case where no quotes for the specified show were found.
            this.show = 0;
            this.quote = "No quotes found for this show.";
        }
    }

    public Quote(String quote, int show) {
        this.quote = quote;
        this.show = show;
    }

    public int getShow() {
        return show;
    }

    public String getQuote() {
        return quote;
    }

    public static ArrayList<Quote> getAllQuotes(String filename) {
        ArrayList<Quote> quotes = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int showId = 1; // Inicializa o ID aleatório para os shows.

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" - ");
                if (parts.length == 2) {
                    String onlyQuote = parts[0];
                    quotes.add(new Quote(onlyQuote, showId));
                    showId++;
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quotes;
    }
}
