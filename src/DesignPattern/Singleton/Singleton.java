package DesignPattern.Singleton;

public class Singleton {

    private static Singleton singleton ;

    private Singleton(){

    }

    //懒汉式 线程不安全
//    public static synchronized Singleton getSingleton(){
//        if (singleton == null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    public static  Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println("singleton1" +  singleton.singleton);
        System.out.println("singleton1" + singleton1.singleton);

        System.out.println(singleton.singleton == singleton1.singleton);

    }
}
