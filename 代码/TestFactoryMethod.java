public class TestFactoryMethod {
    public static void main(String[] args){
        FactoryA factoryA = new FactoryA();
        factoryA.fun();
        FactoryB factoryB = new FactoryB();
        factoryB.fun();
    }
}

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
