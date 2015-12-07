package co.conversely.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.conversely.domain.Phrase;

@RepositoryRestResource
public interface PhraseRepository extends CrudRepository<Phrase, Long> {}
