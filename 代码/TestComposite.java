import java.util.ArrayList;
import java.util.List;

public class TestComposite {
    public static void main(String[] args){
        Composite composite = new Composite();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        composite.add(leaf1);
        composite.add(leaf2);
        composite.operation();
    }

}

abstract class Component{
    abstract public void operation();
    abstract public void add(Component c);
    abstract public void remove(Component c);
    abstract public Component getChild(int i);
}

class Leaf extends Component{
    public void operation(){
        System.out.println("Leaf Operating");
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }
}

class Composite extends Component{
    private List<Component> componentList = new ArrayList<>();

    public void operation(){
        for (Component component : componentList){
            component.operation();
        }
    }

    public void add(Component c){
        componentList.add(c);
    }

    public void remove(Component c){
        componentList.remove(c);
    }

    public Component getChild(int i){
        return componentList.get(i);
    }

}
