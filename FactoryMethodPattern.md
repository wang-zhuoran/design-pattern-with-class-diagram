## 工厂方法模式  
![image](https://user-images.githubusercontent.com/41529680/147865029-f8696f2a-0492-4767-8dcd-177ca69146ba.png)

```java
interface Product{ //抽象产品

}

class ProductA implements Product{

}

class ProductB implements Product{

}

interface Factory{ //抽象工厂
    Product fun();
}

class FactoryA implements Factory{
    public ProductA fun(){
        System.out.println("Making Product A");
        return new ProductA();
    }
}

class FactoryB implements Factory{

    public ProductB fun(){
        ProductB productB = new ProductB();
        System.out.println("Making Product B");
        return productB;
    }
}


```
测试文件  
```java
public class TestFactory {
    public static void main(String[] args){
        FactoryA factoryA = new FactoryA();
        factoryA.fun();
        FactoryB factoryB = new FactoryB();
        factoryB.fun();
    }
}
```
