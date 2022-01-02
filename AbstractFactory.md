## 抽象工厂模式
![image](https://user-images.githubusercontent.com/41529680/147865454-d33c1434-44c8-40bf-ba18-5a893b5cb663.png)

```java
interface AbstractProductA{ //可以认为是A 品牌的产品，为了可扩展性定义为抽象类

}

class ConcreteProductA1 implements AbstractProductA{

}

class ConcreteProductA2 implements AbstractProductA{

}

interface AbstractProductB{

}

class ConcreteProductB1 implements AbstractProductB{

}

class ConcreteProductB2 implements AbstractProductB{

}

interface AbstractFactory{ //抽象工厂类，可以造A品牌的产品，也可以造B品牌的产品
    public AbstractProductA createProductA();
    public AbstractProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA(){
        System.out.println("A品牌的1产品");
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("B品牌的1产品");
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        System.out.println("A品牌的2产品");
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        System.out.println("B品牌的2产品");
        return new ConcreteProductB2();
    }
}
```
测试代码  
```java
public class TestAbstractFactory {

    public static void main(String[] args){
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.createProductA();
        concreteFactory1.createProductB();

        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        concreteFactory2.createProductA();
        concreteFactory2.createProductB();
    }
}

```
