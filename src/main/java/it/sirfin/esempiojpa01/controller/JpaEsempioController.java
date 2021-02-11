package it.sirfin.esempiojpa01.controller;

import it.sirfin.esempiojpa01.model.Alunno;
import it.sirfin.esempiojpa01.service.EsempioJpaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class JpaEsempioController {

    /**
     * Iniettiamo il service che useremo
     */
    @Autowired
    EsempioJpaService esempioJpaService;

    /**
     * Svuota la tabella alunni. Crea degli alunni e li salva su DB.
     * Li recupera. Ne cancella alcuni. Recupera da DB quelli rimasti
     */
    @RequestMapping("/init")
    public void init() {
        // svuotare la tabella alunni
        esempioJpaService.svuotaTabellaAlunni();

        // crea gli alunni
        Alunno a = new Alunno("Mario", "Rossi");
        esempioJpaService.inserisciAlunno(a);
        a = new Alunno("Giorgia", "Verdi");
        esempioJpaService.inserisciAlunno(a);
        a = new Alunno("Alberto", "Gialli");
        esempioJpaService.inserisciAlunno(a);
        a = new Alunno("Elena", "Bianchi");
        esempioJpaService.inserisciAlunno(a);

        // recupera tutti gli alunni
        List<Alunno> lista = esempioJpaService.trovatTuttiGliAlunni();
        for (Alunno alunno : lista) {
            System.out.println(alunno);
        }
        
        // Cancella alcuni alunni (id dispari)
        lista.stream()
                .filter(ax -> ax.getId() % 2 == 1)
                .forEach(alu -> {
                    System.out.println("Sto per cancellare " + alu);
                    esempioJpaService.cancellaAlunno(alu);
                });
        // recupera di nuovo tutti gli alunni
        System.out.println("Ora ci sono i seguenti alunni:");
        List<Alunno> listaAgg = esempioJpaService.trovatTuttiGliAlunni();
        for (Alunno alunno : listaAgg) {
            System.out.println(alunno);
        }
    }
}
