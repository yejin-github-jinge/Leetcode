package DesignPattern.Singleton;

public class SingletonHungry {

    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){
    }


    public static void main(String[] args) {

        SingletonHungry singleton = new SingletonHungry();
        SingletonHungry singleton1 = new SingletonHungry();
        System.out.println("singleton1" +  singleton.singletonHungry);
        System.out.println("singleton1" + singleton1.singletonHungry);

        System.out.println(singleton.singletonHungry == singleton1.singletonHungry);
    }
}
