package movquot.movquot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movquot.movquot.Entity.Movie;
import movquot.movquot.Entity.Quote;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Long> {
    List<Quote> findByMovie(Movie m);
}