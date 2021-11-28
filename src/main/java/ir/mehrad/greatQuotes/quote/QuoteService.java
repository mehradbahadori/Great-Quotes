package ir.mehrad.greatQuotes.quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuoteService {

    @Autowired
    QuoteRepository repository;

     public List<Quote> getAllQuotes(){
         Iterable<Quote> all = repository.findAll();
         return (List<Quote>) all;
     }
    public void saveNewQuote(Quote quote) {
        repository.save(quote);
    }



}
