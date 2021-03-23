/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

/**
 *
 * @author HP
 */
public class Contact {

    /**
     * @param criteria
     * @param information
     * @return 
     */
    public boolean VerifyContactExistence(String criteria, String information) {
        boolean verified = false;

        if (criteria.equals(information)) {

            verified = true;
        } else {
            verified = false;
        }
        return verified;
    }
}
