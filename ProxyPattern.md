## 代理模式 Proxy Pattern
  
![image](https://user-images.githubusercontent.com/41529680/147871916-baabefe0-432a-4320-b032-d3c481f6039e.png)


```java
abstract class Subject{
    abstract public void request();
}

class RealSubject extends Subject{
    public void request(){
        System.out.println("响应请求...");
    }
}

class Proxy extends Subject{
    private RealSubject realSubject = new RealSubject();
    public void preRequest(){
        System.out.println("建立连接");
    }

    public void request(){
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest(){
        System.out.println("日志记录");
    }
}
```


测试代码  

```java
public class TestProxy {
    public static void main(String[] args){
        new Proxy().request();
    }
}

```
