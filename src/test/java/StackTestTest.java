import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kirill on 04.06.2015.
 */
public class StackTestTest {
    @Test
    public void testStringStack() {
        Stack<String> queue = new Stack<String>();
        queue.push("Hello");
        queue.push("world");
        queue.push("!!!");
        queue.push("1");
        assertEquals("1", queue.get());
        assertEquals("!!!", queue.get());
        assertEquals("world", queue.get());
        assertEquals("Hello", queue.get());
        queue.push("Hello");
        queue.push("world");
        queue.push("!!!");
        assertEquals("!!!", queue.get());
        assertEquals("world", queue.get());
        assertEquals("Hello", queue.get());
        queue.push("Hello");
        assertEquals("Hello", queue.get());
        queue.push("Hello");
        queue.push("world");
        queue.push("!!!");
        assertEquals("!!!", queue.get());
        assertEquals("world", queue.get());
        assertEquals("Hello", queue.get());
    }
}