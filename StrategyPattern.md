## 策略模式 Strategy Pattern
![image](https://user-images.githubusercontent.com/41529680/147875808-1c6a3fc6-1f6c-49cb-bfde-bf790ddca8f7.png)


```java
abstract class Strategy{
    abstract public void algorithm();
}

class ConcreteStrategyA extends Strategy{
    public void algorithm(){
        System.out.println("执行了策略(算法) A");
    }
}

class ConcreteStrategyB extends Strategy{
    public void algorithm(){
        System.out.println("执行了策略(算法) B");
    }
}

class Context{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void algorithm(){
        strategy.algorithm();
    }
}

```

测试代码
```java
public class TestStrategy {
    public static void main(String[] args){
        Context contextA = new Context(new ConcreteStrategyA());
        contextA.algorithm();
        Context contextB = new Context(new ConcreteStrategyB());
        contextB.algorithm();
    }

}
```
