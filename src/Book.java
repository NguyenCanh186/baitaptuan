public class Book  {
    private String name;
    private String author;
    private int price;
    private int number;
    private double weight;
    public Book(){
    }
    public Book(String name, String author, int price, int number, double weight){
        this.name = name;
        this.author = author;
        this.price = price;
        this.number = number;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double wight) {
        this.weight = weight;
    }
    public int getTotalPrice(){
        return price*number;
    }
    public double getTotalWeight(){
        return weight*number;
    }

}
