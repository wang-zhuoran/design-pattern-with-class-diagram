public class TestAdapter2 {
    public static void main(String[] args){
        Client client = new Client();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        client.fun(adapter);
    }
}

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
