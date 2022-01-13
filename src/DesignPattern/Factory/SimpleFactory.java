package DesignPattern.Factory;

import javax.rmi.CORBA.PortableRemoteObjectDelegate;

public class SimpleFactory {

     interface Products{
        public Products createProduct();
    }

    static class ProductsA implements Products{

        @Override
        public Products createProduct() {
            return new ProductsA();
        }
    }
    class ProductB implements Products{

        @Override
        public Products createProduct() {
            return new ProductB();
        }
    }

    public static void main(String[] args) {
        //Products products = new SimpleFactory();
        SimpleFactory simpleFactory = new SimpleFactory();

    }
}
