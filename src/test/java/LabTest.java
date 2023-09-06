import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LabTest {
    Lab lab = new Lab();
    @Test
    public void getClassTest1(){
        Class cl = lab.getMyClass();
        Assert.assertEquals(cl, Lab.class);
    }
    @Test
    public void MethodReflectionTest1(){
        Method[] actual = lab.getMyMethods();
        boolean methodFoundFlag = false;
        for(Method m : actual){
            if(m.getName().equals("getMyMethods")){
                methodFoundFlag = true;
            }
        }
        if(!methodFoundFlag){
            Assert.fail("method getMyMethods was not found");
        }
    }
    @Test
    public void FieldReflectionTest1() throws NoSuchFieldException {
        Field[] actual = lab.getMyFields();
        boolean fieldFoundFlag = false;
        for(Field f : actual){
            if(f.getName().equals("field1")){
                fieldFoundFlag = true;
            }
        }
        if(!fieldFoundFlag){
            Assert.fail("field field1 was not found");
        }
    }

}
