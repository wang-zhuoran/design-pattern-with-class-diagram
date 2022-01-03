public class TestBuilder {
    public static void main(String[] args){
        House house = new House.Builder().setDoor(new Door()).setWindow(new Window()).setWall(new Wall()).build();
    }
}

class House{
    private Window window;
    private Door door;
    private Wall wall;

    public House(Builder builder){
        this.window = builder.window;
        this.door = builder.door;
        this.wall = builder.wall;
    }

    static final class Builder{ //静态类
        private Window window;
        private Door door;
        private Wall wall;

        public Builder setWindow(Window window){
            this.window = window;
            return this;
        }

        public Builder setDoor(Door door) {
            this.door = door;
            return this;
        }

        public Builder setWall(Wall wall) {
            this.wall = wall;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}

class Window{}
class Door{}
class Wall{}
