package jv.curse;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created with IntelliJ IDEA.
 * User: komarov.as
 */
public class DemoListTest {

    DemoList<Integer> list = new DemoList<Integer>();

    @Test
    public void testAdd()  {
        list.add(1);
        assertThat(1, is(list.getDataAt(0)));
    }

    @Test(expected = RuntimeException.class)
    public void testDelete()  {
        list.delete();
        fail();
    }

    @Test
    public void testSize()  {
        list.add(2);
        list.add(4);
        list.add(5);
        list.delete();
        assertEquals(list.size(), 2);
    }

    @Test(expected = RuntimeException.class)
    public void testGetDataAt()  {
        list.add(1);
        list.add(2);
        list.getDataAt(3);
    }

    @Test
    public void testIndexOf() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        assertThat(2,is(list.indexOf(1)));
    }
}
