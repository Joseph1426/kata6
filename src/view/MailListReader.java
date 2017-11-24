/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

public class MailListReader {
    public static List<Mail> read(String name) throws FileNotFoundException, IOException{
        List<Mail> mailList = new ArrayList<>();
        BufferedReader reader = new BufferedReader (new FileReader
                (new File(name)));
        String mail;
        while((mail=reader.readLine()) != null){
            if (!mail.contains("@")) continue;
            mailList.add(new Mail(mail));
            
        }
        reader.close();
        return mailList;
    }
}
