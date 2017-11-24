/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    
    public String getDomain(){
        return mail.split("@")[1];
    }
}
