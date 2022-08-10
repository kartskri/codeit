package junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitTestCase {

    BaseClass obj = new BaseClass();

    @Test
    public void testAdd() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        obj.add("Paul");
        assertEquals("Adding 4 student to list", 4, obj.sizeOfStudent());
    }

    @Test
    public void testSize() {
        obj.add("Emma");
        obj.add("Ronan");
        obj.add("Antonio");
        assertEquals("Checking size of List", 3, obj.sizeOfStudent());
    }

    @Test
    public void testRemove() {
        obj.add("Antonio");
        obj.add("Paul");
        obj.remove("Paul");
        assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());
    }

    @Test
    public void removeAll() {
        obj.removeAll();
    }
}
