package Repository;

import org.springframework.data.repository.CrudRepository;

import models.Yelp_text;

public interface TextRepository extends CrudRepository<Yelp_text, String> {

}