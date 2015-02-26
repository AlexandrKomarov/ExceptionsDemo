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
    public void testAdd() throws MyExsception {
        list.add(1);
        assertThat(1, is(list.getDataAt(0)));
    }

    @Test(expected = MyExsception.class)
    public void testDelete() throws MyExsception {
        list.delete();
        fail();
    }

    @Test
    public void testSize() throws MyExsception {
        list.add(2);
        list.add(4);
        list.add(5);
        list.delete();
        assertEquals(list.size(), 2);
    }

    @Test(expected = MyExsception.class)
    public void testGetDataAt() throws MyExsception {
        list.add(1);
        list.add(2);
        list.getDataAt(3);
    }

    @Test
    public void testIndexOf() throws MyExsception {
        list.add(1);
        list.add(2);
        list.add(3);
        assertThat(2,is(list.indexOf(1)));
    }

    @Test
    public void test1() throws MyExsception{
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.delete();
        assertThat(2,is(list.indexOf(5)));
    }

    public void test2() throws MyExsception{
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.delete();
        assertThat(3,is(list.getDataAt(3)));
    }

    public void test3() throws MyExsception{
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.delete();
        assertThat(6,is(list.size()));
    }
}
