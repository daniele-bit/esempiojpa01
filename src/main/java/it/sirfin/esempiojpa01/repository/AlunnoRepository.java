package it.sirfin.esempiojpa01.repository;

import it.sirfin.esempiojpa01.model.Alunno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunnoRepository extends JpaRepository<Alunno, Long>{

}
