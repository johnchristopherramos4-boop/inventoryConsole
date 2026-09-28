
import java.util.Scanner;
class product{
    private int id;
    private String name;
    private int quantity;
    public product(int id, String name, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    public int getId(){return id;}
    public String getname(){return name;}
    public int getQuantity(){return quantity;}
    
    @Override 
    public String toString(){ return "ID: " + id + " | Name: " + name + " | Stock: " + quantity;}
}

class index {
    public static void main(String[] args) {
        
    }
}
