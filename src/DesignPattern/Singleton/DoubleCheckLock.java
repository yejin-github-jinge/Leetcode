package DesignPattern.Singleton;

public class DoubleCheckLock {

    //volatile  1.线程可见性  2.禁止指令重排序
    private static volatile DoubleCheckLock doubleCheckLock;

    private DoubleCheckLock(){

    }

    public  static  DoubleCheckLock getDoubleCheckLock(){
        if (doubleCheckLock == null){
            synchronized(DoubleCheckLock.class){
                if(doubleCheckLock ==  null){
                    doubleCheckLock = new DoubleCheckLock();
                }
            }
        }
        return  doubleCheckLock;
    }

    public static void main(String[] args) {
        System.out.println(DoubleCheckLock.getDoubleCheckLock());
        System.out.println(DoubleCheckLock.getDoubleCheckLock() == DoubleCheckLock.getDoubleCheckLock());
    }

}
