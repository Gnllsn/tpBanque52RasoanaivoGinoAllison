/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gnllsn.tpbanque52rasoanaivoginoallison.ejb;

import com.gnllsn.tpbanque52rasoanaivoginoallison.entities.CompteBancaire;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

/**
 *
 * @author Grasoanaivo
 */
@Singleton
@Startup
public class InitCompte {

    @EJB
    private GestionnaireCompte gestionnaireCompte ; 
     
    
    @PostConstruct
    public void creerCompte() {     
        gestionnaireCompte.creerCompte(new CompteBancaire("John Lennon", 150000));
        gestionnaireCompte.creerCompte(new CompteBancaire("Paul McCartney", 950000));
        gestionnaireCompte.creerCompte(new CompteBancaire("Ringo Starr", 20000));
        gestionnaireCompte.creerCompte(new CompteBancaire("Georges Harrisson", 100000));
    }

}
