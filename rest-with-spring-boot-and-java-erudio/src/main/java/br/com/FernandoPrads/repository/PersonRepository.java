package br.com.FernandoPrads.repository;

import br.com.FernandoPrads.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person, Long> {}
