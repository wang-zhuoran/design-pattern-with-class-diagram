import java.util.ArrayList;
import java.util.List;

public class CompositeExample2 {

}

abstract class MyElement{
    abstract public void eat();
}

class Plate extends MyElement{
    private List<MyElement> list = new ArrayList<>();


    public void eat() {

    }

    public void add(MyElement element){

    }

    public void remove(MyElement element){

    }
}

class Apple extends MyElement{

    public void eat() {

    }
}

class Banana extends MyElement{

    public void eat() {

    }
}

class Pear extends MyElement{

    public void eat() {

    }
}
