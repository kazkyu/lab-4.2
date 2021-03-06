//Author: Trinh Ky Nam
public class MyApp {
 public static void main(String[] args) {
 Product product = new Product("Edam", 3.3, 120, 200,150);
 System.out.println("Product value is " + product.countValue());
 product.printProduct();
 }
}
class Product {
private String name;
private double price;
private int amount; //Amount in storage
private int newValue;
private double newPrice;
public Product(String name, double price, int amount, int newValue, double newPrice) {
this.name = name;
this.price = price;
this.amount = amount;
this.newValue = newValue;
this.newPrice = newPrice;
}
public double countValue() {
return(amount * price);
}
public void printProduct() {
System.out.printf("Product %s, price %4.1f and balance %d pcs",
name,price,amount);
}
public int changeBalance(int newvalue){
 return this.newValue = newvalue * amount;  
}
public double changePrice(double newprice){
 return this.newPrice = newprice * amount;  
}

}
