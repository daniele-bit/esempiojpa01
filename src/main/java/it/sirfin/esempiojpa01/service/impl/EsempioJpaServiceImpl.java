package it.sirfin.esempiojpa01.service.impl;

import it.sirfin.esempiojpa01.model.Alunno;
import it.sirfin.esempiojpa01.repository.AlunnoRepository;
import it.sirfin.esempiojpa01.service.EsempioJpaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Classe di implementazione del servizio.
 * Contiene il codice vero e proprio del servizio.
 * Deve implementare l'interfaccia del servizio
 */
@Service
public class EsempioJpaServiceImpl implements EsempioJpaService{

    // per accedere al DB si inietta un repository
    @Autowired
    AlunnoRepository alunnoRepository;
    
    @Override
    public void inserisciAlunno(Alunno alu) {
        alunnoRepository.save(alu);
    }

    @Override
    public void svuotaTabellaAlunni() {
        // deleteAll cancella i record uno alla volta
        // significa 1.000 record -> 1.000 query delete e una select
        // per ottenere la lista di quelli da cancellare, cioé 1.001 query
//        alunnoRepository.deleteAll();
        // deleteAllInBatch esegue una sola delete from Alunno e
        // quindi una sola query e molto veloce (in molti DB tronca la tabella)
        alunnoRepository.deleteAllInBatch();
    }

    @Override
    public List<Alunno> trovatTuttiGliAlunni() {
        List<Alunno> elle = alunnoRepository.findAll();
        return elle;
    }

    @Override
    public void cancellaAlunno(Alunno alu) {
        alunnoRepository.delete(alu);
    }

}
