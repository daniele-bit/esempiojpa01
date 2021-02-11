package it.sirfin.esempiojpa01.service;

import it.sirfin.esempiojpa01.model.Alunno;
import java.util.List;

public interface EsempioJpaService {

    void inserisciAlunno(Alunno alu);
    
    void svuotaTabellaAlunni();
    
    List<Alunno> trovatTuttiGliAlunni();
    
    void cancellaAlunno(Alunno alu);
}
