import java.util.ArrayList;
import java.util.List;

public class main{

    public static void main(String[] args){
        Car car0 = new Car(10, "BMV","X2",2020,"silver",145000.20,4523);
        Car car1 = new Car(11, "BMV","X5",2019,"white",156000.40,3289);
        Car car2 = new Car(12, "Audi","A3",2017,"black",132000.60,8526);
        Car car3 = new Car(13, "Ford","GT350",2015,"white",130000.30,1575);
        Car car4 = new Car(14, "Honda","Civic 220",2020,"white",162000.20,5487);

        List<Car> list = new ArrayList<>();
        list.add(car0);
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);


        CarChoose result = new CarChoose();
        List<Car> resultList1 = result.getCarByCompany(list);
        System.out.println("---------\n");
        List<Car> resultList2 = result.getCarByYear(list);
        System.out.println("---------\n");
        List<Car> resultList3 = result.getCarByPrice(list);
    }
}
