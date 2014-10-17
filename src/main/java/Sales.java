import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by joelcorrea on 16/10/14.
 */

public class Sales {

    List<Sale> sales = Arrays.asList(new Sale("salesman 1", "client 1", 200.0),
            new Sale("salesman 1", "client 2", 100.0),
            new Sale("salesman 2", "client 3", 300.0),
            new Sale("salesman 2", "client 4", 50.0),
            new Sale("salesman 3", "client 5", 10.0));

    public void run(){

        // java
        Map<String, Double> result = new HashMap<String, Double>();
        for(Sale sale : sales) {
            Double saleValue;
            if (result.containsKey(sale.getSalesman())) {
                saleValue = result.get(sale.getSalesman());
                saleValue += sale.getValue();
            } else {
                saleValue = sale.getValue();
            }
            result.put(sale.getSalesman(), saleValue);
        }

    }


}

class Sale{
    public Sale(String i, String i2, double i3){}
    public String getSalesman(){
        return "";
    }
    public double getValue(){
        return 0;
    }
}
