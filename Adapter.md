## 配适器模式
### 类模式  
![image](https://user-images.githubusercontent.com/41529680/147865975-a8d3adf7-8b9a-4a9b-918d-56b08f0fa9d2.png)

```java
interface Target{
    public void request();
}

class Adaptee{
    public void specificRequest(){
        System.out.println("配适成功...");
    }
}

class Adapter extends Adaptee implements Target{
    public void request(){
        super.specificRequest();
    }
}

class Client{
    public void fun(Adapter adapter){ //通过配适器，实现调用不同adaptee中函数的功能
        adapter.request();
    }
}
```  
测试代码  
```java
public class TestAdapter1 { //类配适模式
    public static void main(String[] args){
        Client client = new Client();
        Adapter adapter = new Adapter();
        client.fun(adapter);
    }
}
```  

### 对象模式 （对象配适器） 
![image](https://user-images.githubusercontent.com/41529680/147865990-c8345453-3e5a-4e5d-8b6c-2f1fd44a7a7a.png)
  
```java
class Target{
    public void request(){}
}

class Adaptee{
    public void specificRequest(){
        System.out.println("配适成功...");
    }
}

class Adapter extends Target{
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void request(){
        adaptee.specificRequest();
    }
}

class Client{
    public void fun(Adapter adapter){
        adapter.request();
    }
}

```

测试代码

```java
public class TestAdapter2 {
    public static void main(String[] args){
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        client.fun(adapter);
    }
}

```










