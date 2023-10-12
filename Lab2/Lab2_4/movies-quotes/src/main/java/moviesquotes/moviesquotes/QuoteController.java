package moviesquotes.moviesquotes;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
    
    @GetMapping("/api/quote")
    public Quote getQuote() {
        return new Quote();
    }

    @GetMapping("/api/quotes")
    public Quote getQuote(@RequestParam(value="show", required = true) int show) {
        return new Quote(show);
    }

    @GetMapping("/api/shows")
    public ArrayList<Show> getShow() {
        return Show.getAllShows("./quotes.txt");
    }

}