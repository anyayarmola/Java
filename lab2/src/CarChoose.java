import java.util.*;

public class CarChoose{

    private static void printList(List<Car> cars){
        for(Car car: cars){
            System.out.println(car);
        }
    }


    public static List<Car> getCarByCompany(List<Car> car){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark of the car you want to get");
        String company = scanner.nextLine();
        List<Car> carList = new ArrayList<>();
        for (Car c : car){
            if(c.getCompany().toLowerCase().equals(company.toLowerCase())){
                carList.add(c);
            }
        }
        if(carList.isEmpty()) System.out.println("not found");
        printList(carList);
        return carList;
    }

    public static List<Car> getCarByYear(List<Car> car){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the model");
        String model = scanner.nextLine();
        System.out.println("Enter number of car`s year");
        Integer n = scanner.nextInt();
        List<Car> carList = new ArrayList<>();
        for (Car c : car){
            if(2020 - c.getYear() > n && c.getModel().toLowerCase().equals(model.toLowerCase())){
                carList.add(c);
            }
        }
        if(carList.isEmpty()) System.out.println("not found");
        printList(carList);
        return carList;
    }

    public static List<Car> getCarByPrice(List<Car> car){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of manufacture");
        Integer year = scanner.nextInt();
        System.out.println("Enter the price of car");
        Float t = scanner.nextFloat();
        List<Car> carList = new ArrayList<>();
        for (Car c : car){
            if(year == c.getYear() && t < c.getPrice()){
                carList.add(c);
            }
        }
        if(carList.isEmpty()) System.out.println("not found");
        printList(carList);
        return carList;
    }
}