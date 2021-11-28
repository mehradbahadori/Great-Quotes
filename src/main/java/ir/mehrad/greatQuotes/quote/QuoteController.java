package ir.mehrad.greatQuotes.quote;

import ir.mehrad.greatQuotes.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuoteController {
    @Autowired
    QuoteService quoteService;

    @GetMapping("quotes")
    public List<Quote> getAllQuotes(){
        return quoteService.getAllQuotes();
    }
    @PostMapping("quotes/creat")
    public Response createQuote(@RequestBody Quote quote){
        quoteService.saveNewQuote(quote);
        return new Response("Quote created");
    }
}
