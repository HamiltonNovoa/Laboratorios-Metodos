/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author Hamilton
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return null;
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer subtraction(int a, int b) {
        return null;
    }

    @Override
    public Integer multiplication(int a, int b) {
        return null;
    }

    @Override
    public Integer split(int a, int b) {
        return null;
    }
    
    
}
