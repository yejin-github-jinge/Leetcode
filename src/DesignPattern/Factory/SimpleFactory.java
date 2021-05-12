package DesignPattern.Factory;

import javax.rmi.CORBA.PortableRemoteObjectDelegate;

public class SimpleFactory {

    public interface Products(){
        Products createProduct(){};
    }

    class ProductsA implements Products{

    }
}
