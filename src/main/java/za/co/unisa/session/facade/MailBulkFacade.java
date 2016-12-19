/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.unisa.session.facade;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.co.unisa.entity.MailBulk;

/**
 *
 * @author motale
 */
@Stateless
public class MailBulkFacade extends AbstractFacade<MailBulk> {

    @PersistenceContext(unitName = "za.co.unisa_tsugiJava_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MailBulkFacade() {
        super(MailBulk.class);
    }
    
}
