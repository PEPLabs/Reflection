import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Reflection is a tool in Java that allows Java to obtain information about its own classes while the program
 * is running (during runtime).
 *
 * It's a technique that is creatively used in several of your labs' tests, and it is used in Java tools such as
 * Spring, Hibernate, or Jackson-Databind.
 *
 * You can find Oracle's documentation for reflection here, which will help you solve the provided problems.
 * https://www.oracle.com/technical-resources/articles/java/javareflection.html
 */
public class Lab {
    public int field1;
    public int field2;
    /**
     * TODO: Use reflection to return a ClassReflection class (the class - not an object!)
     * @return the ClassReflection class.
     */
    public Class getMyClass(){
        return null;
    }

    /**
     * TODO: Use Reflection to retrieve the methods of this class
     * @return this method will end up returning itself!
     */
    public Method[] getMyMethods(){
        return null;
    }

    /**
     * TODO: Use reflection to retrieve the fields of this class
     * @return an array of Fields containing field1 and field2.
     * This is how an ORM gets information about your model classes.
     */
    public Field[] getMyFields(){
        return null;
    }
}
