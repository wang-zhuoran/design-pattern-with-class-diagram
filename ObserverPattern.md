## 观察者模式 observer pattern
![image](https://user-images.githubusercontent.com/41529680/147875341-55848316-4b12-4a5b-bded-b4924a4b8826.png)


```java
interface Observer{ //相当于债权人
    void update();
}

class ConcreteObserver implements Observer{
    private int observerState = 0;


    public void update(){
        ConcreteSubject subject = new ConcreteSubject();
        observerState = subject.getSubjectState();
    }

    public int getObserverState(){
        return observerState;
    }
}

class Subject{ //相当于债务人
    private List<Observer> observerList = new ArrayList<>();

    public void attach(Observer observer){
        observerList.add(observer);
    }

    public void detach(Observer observer){
        observerList.remove(observer);
    }

    public void notifY(){
        for (Observer observer : observerList){
            observer.update();
        }
    }

}

class ConcreteSubject extends Subject{
    private int subjectState = 1;

    public int getSubjectState(){
        return subjectState;
    }

    public void setSubjectState(int state){
        this.subjectState = state;
    }
}
```

```java
import java.util.ArrayList;
import java.util.List;

public class TestObserver {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver concreteObserver = new ConcreteObserver();

        subject.attach(concreteObserver);

        subject.notifY();

        System.out.println(concreteObserver.getObserverState());
    }
}

```
