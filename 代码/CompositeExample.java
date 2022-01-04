import java.util.ArrayList;
import java.util.List;

public class CompositeExample {
    public static void main(String[] args){
        Composite china = new Composite();
        City Beijing = new City(1000);
        City Shanghai = new City(2000);
        china.add(Beijing);
        china.add(Shanghai);

        Composite Shandong = new Composite();
        City Jinan = new City(500);
        City Qingdao = new City(700);
        Shandong.add(Jinan);
        Shandong.add(Qingdao);

        china.add(Shandong);

        System.out.println("中国总人口是：" + china.count());
    }
}

abstract class Counter {
    abstract int count();
}

class City extends Counter{
    private int sum = 0;

    public City(int sum){
        this.sum = sum;
    }

    @Override
    public int count(){
        return sum;
    }
}

class Composite extends Counter{
    private List<Counter> counterList = new ArrayList<>();

    public void add(Counter counter){
        counterList.add(counter);
    }

    public void delete(Counter counter){
        counterList.remove(counter);
    }

    public List<Counter> getChild(){
        return counterList;
    }

    @Override
    public int count() {
        int sum = 0;
        for (Counter counter : counterList){
            sum += counter.count();
        }
        return sum;
    }
}
