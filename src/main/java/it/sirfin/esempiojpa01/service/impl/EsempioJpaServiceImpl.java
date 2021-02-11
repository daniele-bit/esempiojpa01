package it.sirfin.esempiojpa01.service.impl;

import it.sirfin.esempiojpa01.model.Alunno;
import it.sirfin.esempiojpa01.repository.AlunnoRepository;
import it.sirfin.esempiojpa01.service.EsempioJpaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EsempioJpaServiceImpl implements EsempioJpaService{

    @Autowired
    AlunnoRepository alunnoRepository;
    
    @Override
    public void inserisciAlunno(Alunno alu) {
        alunnoRepository.save(alu);
    }

    @Override
    public void svuotaTabellaAlunni() {
//        alunnoRepository.deleteAll();
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
