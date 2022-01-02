## 外观模式 Facade Pattern
太简单了不可能考这个。。。
![image](https://user-images.githubusercontent.com/41529680/147871560-5fc65db5-6000-493e-b162-ec1034f9d06c.png)

```java
class Facade{
    SubSystemA subSystemA = new SubSystemA();
    SubSystemB subSystemB = new SubSystemB();
    SubSystemC subSystemC = new SubSystemC();
    public void fun(){
        subSystemA.fun();
        subSystemB.fun();
        subSystemC.fun();
    }
}

class SubSystemA{
    public void fun(){
        System.out.println("第一步完成。");
    }
}

class SubSystemB{
    public void fun(){
        System.out.println("第二步完成。");
    }
}

class SubSystemC{
    public void fun(){
        System.out.println("第三步完成。");
    }
}
```
测试代码  
```java
public class TestFacade {
    public static void main(String[] args){
        new Facade().fun();
    }
}
```
