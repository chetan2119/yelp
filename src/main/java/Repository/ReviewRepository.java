package Repository;

import org.springframework.data.repository.CrudRepository;

import models.Yelp_review;

public interface ReviewRepository extends CrudRepository<Yelp_review, String> {

}