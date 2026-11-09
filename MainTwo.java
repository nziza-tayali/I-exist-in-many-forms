abstract class Objects{
    //acstract method declaration
    abstract void showShape();
    public void shape() {
        System.out.println("Im a form of abstract class");
    }
}

class Sphere extends Objects{
    /**this is indirectly an overridden showshape method by making use of abstract class */
    void showShape() {
        System.out.println("Object type is Sphere.");
    }
}

class Cuboid extends Objects{
    /*this is indirectly an overridden showshape method by making use of abstract class */
    void showShape() {
        
            System.out.println("Object type is Cuboid.");
        
    }

}

class Prism extends Objects {
    /*This is indirectly an overridden showshape method by making use of abstract class */
    void showShape() {
        System.out.println("Object type is Prism.");
    }
}

public class MainTwo {
    public static void main(String args[]) {
        Objects obj = new Sphere();//object of sphere
        obj.showShape();
        obj = new Cuboid();//cuboid
        obj.showShape();
        obj = new Prism();//prism
        obj.showShape();
        obj.shape();
    }
}
