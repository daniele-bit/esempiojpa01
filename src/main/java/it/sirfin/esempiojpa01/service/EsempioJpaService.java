package it.sirfin.esempiojpa01.service;

import it.sirfin.esempiojpa01.model.Alunno;
import it.sirfin.esempiojpa01.model.Docente;
import java.util.List;

/**
 * Interfaccia del servizio.
 * Deve essere implementata in una classe impl
 *
 */
public interface EsempioJpaService {

    void inserisciAlunno(Alunno alu);

    void svuotaTabellaAlunni();

    List<Alunno> trovatTuttiGliAlunni();

    void cancellaAlunno(Alunno alu);
    
    
    void inserisciDocente(Docente dc);
    
}
