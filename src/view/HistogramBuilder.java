/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.List;
import kata6.Attribute;
import model.Histogram;
import model.Mail;

public class HistogramBuilder<T> {
    private final List<T> items;
    
    public HistogramBuilder (List<T> items){
        this.items=items;
    }
    
    public <A>Histogram<A> build(Attribute<T, A> attribute){
        Histogram<A> histo = new Histogram<>();
        for (T item : items) {
            A value = attribute.get(item);
            histo.increment(value);
        }
        return histo;
    }
}