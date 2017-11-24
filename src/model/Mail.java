/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
public class Mail {
    private final String mail;
    private final Integer id;

    public Mail(String mail, Integer id) {
        this.mail = mail;
        this.id = id;
    }

    public String getMail() {
        return mail;
    }
    
}
