package mx.iteso;

import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 10/28/2015.
 */
public class TestDish {

    private Dish plato;

    @Before
    public void setUp(){
        plato = mock((Dish.class));
    }

    @Test
    public void test_getName(){
        when(plato.getName()).thenReturn("Pato a la orange");
        assertEquals("Pato a la orange",  plato.getName());
    }

    @Test
    public void test_setName(){
        plato = new Dish();
        plato.setName("Pato a la orange");
        assertEquals("Pato a la orange", plato.getName());
    }

    @Test
    public void test_getDescription(){
        when(plato.getDescription()).thenReturn("Grande");
        assertEquals("Grande", plato.getDescription());
    }

    @Test
    public void test_setDescription(){
        plato = new Dish();
        plato.setDescription("amarillo");
        assertEquals("amarillo", plato.getDescription());
    }

    @Test
    public void test_getPrice(){
        when(plato.getPrice()).thenReturn(2f);
        assertEquals(2, plato.getPrice(), 0);
    }

    @Test
    public void test_setPrice(){
        plato = new Dish();
        plato.setPrice(2f);
        assertEquals(2f, plato.getPrice(), 0);
    }

    @Test
    public void test_getWaiter(){
        when(plato.getWaiter()).thenReturn("Villa");
        assertEquals("Villa", plato.getWaiter());
    }

    @Test
    public void test_setWaiter(){
        plato = new Dish();
        plato.setWaiter("Villa");
        assertEquals("Villa", plato.getWaiter());
    }

}
