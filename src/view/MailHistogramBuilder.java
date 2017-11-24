/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.List;
import model.Histogram;
import model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram<>();
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
}