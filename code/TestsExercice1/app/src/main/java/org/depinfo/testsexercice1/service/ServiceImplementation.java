package org.depinfo.testsexercice1.service;

import org.depinfo.testsexercice1.bd.BD;
import org.depinfo.testsexercice1.modele.Personne;

public class ServiceImplementation {

    private static ServiceImplementation single_instance = null;
    private BD maBD;

    private ServiceImplementation(BD maBD) {
        this.maBD = maBD;
    }

    public static ServiceImplementation getInstance(BD maBD) {
        if (single_instance == null) single_instance = new ServiceImplementation(maBD);

        return single_instance;
    }


    public void ajouterPersonne(Personne personne) {
        // Ajout
        personne.idPersonne = maBD.monDao().insertPersonne(personne);
    }
}
