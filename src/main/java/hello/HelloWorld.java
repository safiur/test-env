package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
        public static void main(String[] args) {
                LocalTime currentTime = new LocalTime();
                System.out.println("Pramod safiur rehman khan and abdul hameed again again and Again and Again My develop Machine current local time is: " + currentTime);
                Greeter greeter = new Greeter();
                System.out.println(greeter.sayHello());
        }
}

