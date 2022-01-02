## 组合模式 Composite Pattern

![image](https://user-images.githubusercontent.com/41529680/147871096-ff0b18b0-8780-4399-bba3-c5005685986a.png)
  
```java
abstract class Component{
    abstract public void operation();
    abstract public void add(Component c);
    abstract public void remove(Component c);
    abstract public Component getChild(int i);
}

class Leaf extends Component{
    public void operation(){
        System.out.println("Leaf Operating");
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }
}

class Composite extends Component{
    private List<Component> componentList = new ArrayList<>();

    public void operation(){
        for (Component component : componentList){
            component.operation();
        }
    }

    public void add(Component c){
        componentList.add(c);
    }

    public void remove(Component c){
        componentList.remove(c);
    }

    public Component getChild(int i){
        return componentList.get(i);
    }

}

```
测试代码
```java

import java.util.ArrayList;
import java.util.List;

public class TestComposite {
    public static void main(String[] args){
        Composite composite = new Composite();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.operation();
    }

}

```


### 一个小例子
```java
package DesignPattern.CompositePattern;

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






```
