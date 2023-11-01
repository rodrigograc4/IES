package movquot.movquot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movquot.movquot.Entity.*;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Movie findByTitle(String title);
}