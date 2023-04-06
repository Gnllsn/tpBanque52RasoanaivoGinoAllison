/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gnllsn.tpbanque52rasoanaivoginoallison.ejb;

/**
 *
 * @author Grasoanaivo
 */
import com.gnllsn.tpbanque52rasoanaivoginoallison.entities.CompteBancaire;
import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;

@DataSourceDefinition(
        className = "com.mysql.cj.jdbc.MysqlDataSource",
        name = "java:app/jdbc/banque",
        serverName = "localhost",
        portNumber = 3306,
        user = "root", // nom et
        password = "root", // mot de passe que vous avez donnés lors de la création de la base de données
        databaseName = "banque",
        properties = {
            "useSSL=false",
            "allowPublicKeyRetrieval=true"
        }
)
@Stateless
public class GestionnaireCompte {

    @PersistenceContext(unitName = "banquePU")
    private EntityManager entityManager;

    public void creerCompte(CompteBancaire compte) {
        entityManager.persist(compte);
    }

    public List<CompteBancaire> getAllCustomers() {
       TypedQuery<CompteBancaire> query = entityManager.createNamedQuery("CompteBancaire.findAll",CompteBancaire.class);
       return query.getResultList();
    }

}
