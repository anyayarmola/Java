public class Car {

    private int id;
    private String company;
    private String model;
    private int year;
    private String color;
    private double price;
    private int register;

    public Car (int id, String company,String model,int year,String color,double price, int register) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.register = register;
    }

    public int getId(){
        return id;
    }
    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public int getRegister(){
        return register;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setRegister(int register){
        this.register = register;
    }

    public String toString() {
        return "Car: " +
                "id=" + id +
                "company=" + company + '\'' +
                "model=" + model + '\'' +
                "year=" + year +'\'' +
                "color=" + color + '\'' +
                "price=" + price + '\'' +
                "register" + register +'\'';
    }
}

