/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infos;

import java.io.Serializable;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jms.Destination;
import javax.jms.JMSContext;

/**
 *
 * @author noahd
 */
@Stateless
public class AccuserReceptionBean implements AccuserReceptionBeanLocal{
    @Inject
    JMSContext context;
    
    @Resource(lookup = "jms/RecepFactureQueue")
    Destination RecepQueue;
    
    @Override
    public void sendOrder(Serializable facture) {
        context.createProducer().send(RecepQueue, facture);
    }
}
