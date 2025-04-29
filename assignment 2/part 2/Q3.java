import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car implements Comparable<Car>{
    private int modelNo, stock;
    private String name;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Model Number: "+getModelNo()+" Name: "+getName()+" Stock: "+getStock();
    }
    public int compareTo(Car c){
        return Integer.compare(this.getStock(), c.getStock());
    }

}
class sortByStocks implements Comparator<Car>{
    
    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.getStock(), o2.getStock());
    }
}
public class Q3 {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(2013,"Creta",10));
        carList.add(new Car(2020,"MG",13));
        carList.add(new Car(2018,"Kia",20));
        carList.add(new Car(2017,"Audi",45));
        carList.add(new Car(2015,"BMW",55));

        Collections.sort(carList, new sortByStocks());
        System.out.println("Sorted Car List based on Stock:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
