/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infos;

import java.io.Serializable;
import javax.ejb.Local;

/**
 *
 * @author noahd
 */
@Local
public interface AccuserReceptionBeanLocal {
        public void sendOrder(Object obj);
}
