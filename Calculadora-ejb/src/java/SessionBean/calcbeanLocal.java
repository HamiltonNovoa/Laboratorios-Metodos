/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;


import javax.ejb.Local;

/**
 *
 * @author Hamilton
 */
@Local
public interface calcbeanLocal {

    Integer addition(int a, int b);

    Integer subtraction(int a, int b);

    Integer multiplication(int a, int b);

    Integer split(int a, int b);

    

   

   

}
