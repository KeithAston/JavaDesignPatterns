package singletonpattern;

public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject obj = SingleObject.getInstance();
        obj.showMessage();
    }
}
