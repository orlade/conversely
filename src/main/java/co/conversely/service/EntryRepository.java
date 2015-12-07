package co.conversely.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.conversely.domain.Entry;

@RepositoryRestResource
public interface EntryRepository extends CrudRepository<Entry, Long> {}
