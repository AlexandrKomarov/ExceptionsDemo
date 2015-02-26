package jv.curse;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: komarov.as
 */
public class DemoListTest {

    DemoList<Integer> list = new DemoList<Integer>();

    @Test
    public void testAdd() {
        list.add(1);
        assertThat(1, is(list.getDataAt(0)));
    }

    @Test(expected = IllegalStateException.class)
    public void testDelete() throws NullPointer {
        list.delete();
        fail();
    }

    @Test
    public void testSize() {
        list.add(2);
        list.add(4);
        list.add(5);
        list.delete();
        assertEquals(list.size(), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDataAt() throws IllegalArgumentException {
        list.add(1);
        list.add(2);
        list.getDataAt(3);
    }

    @Test
    public void testIndexOf() throws ElementNotFound {
        list.add(1);
        list.add(2);
        list.add(3);
        assertThat(2, is(list.indexOf(1)));
    }

    @Test
    public void test1() throws ElementNotFound {
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.delete();
        assertThat(2, is(list.indexOf(5)));
    }

    @Test
    public void test2() {
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.delete();
        assertThat(3, is(list.getDataAt(3)));
    }

    @Test
    public void test3() {
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.delete();
        assertThat(6, is(list.size()));
    }

    RuntimeException e = new RuntimeException();

    @Test
    public void test33() throws Throwable {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("i = " + i);
                foo();
            }catch (Throwable e){
                System.out.println("oops");
                throw e;
            }
        }


    }


    void foo() {
        throw e;
    }
}
