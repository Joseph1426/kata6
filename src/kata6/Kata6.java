/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class Kata6 {
    private List<Mail> mailList;
    private Histogram<String> histogram;    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Kata6 kata4 = new Kata6();
        kata4.execute();
    }

    public void execute() throws IOException{
      input();
      process();
      output();
    }
    
    public void input() throws IOException{
        String filename = new String("C:\\Users\\usuario\\Desktop\\Kata6\\src\\emails.txt");
        mailList = MailListReader.read(filename);
    }
    
    public void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    public void output(){
        HistogramDisplay histodisplay = new HistogramDisplay(histogram);
        histodisplay.execute();
    }
}
