package ma.achraf.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ma.achraf.cinema.entities.Categorie;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Categorie, Long> {

}
