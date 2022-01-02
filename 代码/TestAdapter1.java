public class TestAdapter1 { //类配适模式
    public static void main(String[] args){
        Client client = new Client();
        Adapter adapter = new Adapter();
        client.fun(adapter);
    }
}

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
