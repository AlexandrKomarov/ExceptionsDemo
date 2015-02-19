package jv.curse;

import jv.curse.DemoList;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: komarov.as
 */
public class DemoListTest {
    DemoList list = new DemoList();
    @Test
    public void testAdd() throws Exception {
        list.add(1);
        assertEquals(list.getDataAt(0), 1);
    }

    @Test (expected = RuntimeException.class)

    public void testDelete() throws Exception {
       // DemoList list = new DemoList();
        list.delete();
        assertEquals(list.size(),0);

    }

    @Test
    public void testSize() throws Exception {
        list.add(2);
        list.add(4);
        list.add(5);
        list.delete();
        assertEquals(list.size(), 2);
    }

    @Test(expected = RuntimeException.class)
    public void testGetDataAt() throws Exception {
        list.add(1);
        list.add(2);
        assertEquals(list.getDataAt(3),2);
    }

 //   @Test  (expected =  Exception.class)
  //  public void testIndexOf() throws Exception {
    //    list.indexOf(5);
  //  }

    @Test
    public void testIndexOf2() throws Exception{
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.indexOf (1), 2);
    }
}
