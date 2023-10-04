import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Products p1 = new Products("3128874119", "Banana", "2023-01-24", 124,"$0.55");
        Products p2 = new Products("2927458265", "Apple", "2022-12-09", 18,"$1.09");
        Products p3 = new Products("9189927460", "Carrot", "2023-03-31", 89,"$2.99");

        System.out.println("Print JSON");
        System.out.println("{productId:"+p1.getProductId()+", " +"name:"+ p1.getName()+", " + "dateSupplied:"+p1.getDateSupplied()+", " + "quantityInStock:"+p1.getQuantityInStock()+", " + "unitPrice:"+p1.getUnitPrice()+"}");
        System.out.println("{productId:"+p2.getProductId()+", " +"name:"+ p2.getName()+", " + "dateSupplied:"+p2.getDateSupplied()+", " + "quantityInStock:"+p2.getQuantityInStock()+", " + "unitPrice:"+p2.getUnitPrice()+"}");
        System.out.println("{productId:"+p3.getProductId()+", " +"name:"+ p3.getName()+", " + "dateSupplied:"+p3.getDateSupplied()+", " + "quantityInStock:"+p3.getQuantityInStock()+", " + "unitPrice:"+p3.getUnitPrice()+"}");

        System.out.println("\nPrint XML");
        System.out.println("<Product productId="+p1.getProductId()+" name="+p1.getName()+" dateSupplied="+p1.getDateSupplied()+" quantityInStock="+p1.getQuantityInStock()+" unitPrice="+p1.getUnitPrice()+"/>");
        System.out.println("<Product productId="+p2.getProductId()+" name="+p2.getName()+" dateSupplied="+p2.getDateSupplied()+" quantityInStock="+p2.getQuantityInStock()+" unitPrice="+p2.getUnitPrice()+"/>");
        System.out.println("<Product productId="+p3.getProductId()+" name="+p3.getName()+" dateSupplied="+p3.getDateSupplied()+" quantityInStock="+p3.getQuantityInStock()+" unitPrice="+p3.getUnitPrice()+"/>");

        System.out.println("\nPrint CSV");
        System.out.println(p1.getProductId()+", "+p1.getName()+", "+p1.getDateSupplied()+", "+p1.getQuantityInStock()+", "+p1.getUnitPrice());
        System.out.println(p2.getProductId()+", "+p2.getName()+", "+p2.getDateSupplied()+", "+p2.getQuantityInStock()+", "+p2.getUnitPrice());
        System.out.println(p3.getProductId()+", "+p3.getName()+", "+p3.getDateSupplied()+", "+p3.getQuantityInStock()+", "+p3.getUnitPrice());
    }


}
