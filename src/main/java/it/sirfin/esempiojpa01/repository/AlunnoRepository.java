package it.sirfin.esempiojpa01.repository;

import it.sirfin.esempiojpa01.model.Alunno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Prima modalità di generazione automatica dell'accesso al DB:
 * estendo JpaRespository.
 * Il primo parametro è l'entità, il secondo è il tipo della chiave primaria
 */
@Repository
public interface AlunnoRepository extends JpaRepository<Alunno, Long>{

}
