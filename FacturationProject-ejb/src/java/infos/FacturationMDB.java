/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infos;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author noahd
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/FacturationQueue")
})
public class FacturationMDB implements MessageListener {
    @EJB(name="AccuserReceptionBean")
    private AccuserReceptionBeanLocal accuserRecep;
    
    @Resource
    private MessageDrivenContext context;
    
    @Override
    public void onMessage(Message message) {
        try {
            String test = message.getBody(String.class);
            processFacturation(test);
        } catch (JMSException jmse) {
            jmse.printStackTrace();
            context.setRollbackOnly();
        }
    }
    
    public void processFacturation(String object) {
        accuserRecep.sendOrder(object);
    }
}
