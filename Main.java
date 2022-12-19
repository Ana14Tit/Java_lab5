package lab05;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException 
    {
        SomeBean somebean = (new Injector<SomeBean>("src/config/inj.properties").inject(new SomeBean()));
        somebean.start();
    }
}