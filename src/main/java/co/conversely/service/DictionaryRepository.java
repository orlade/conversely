package co.conversely.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.conversely.domain.Dictionary;

@RepositoryRestResource
//public interface DictionaryRepository extends PagingAndSortingRepository<Dictionary, Long> {
public interface DictionaryRepository extends CrudRepository<Dictionary, Long> {

//  Page<Dictionary> findByName(@Param("name") String name, Pageable pageable);
  List<Dictionary> findByName(@Param("name") String name);

}
