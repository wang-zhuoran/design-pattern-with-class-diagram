public class TestFacade {
    public static void main(String[] args){
        new Facade().fun();
    }
}

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
