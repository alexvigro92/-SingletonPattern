package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 10/28/2015.
 */
public class TestDrink {

    private Drink bebida;

    @Before
    public void setUp(){
        bebida = mock((Drink.class));
    }

    @Test
    public void test_getName(){
        when(bebida.getName()).thenReturn("daikiri");
        assertEquals("daikiri",  bebida.getName());
    }

    @Test
    public void test_setName(){
        bebida = new Drink();
        bebida.setName("daikiri");
        assertEquals("daikiri", bebida.getName());
    }

    @Test
    public void test_getDescription(){
        when(bebida.getDescription()).thenReturn("Grande");
        assertEquals("Grande", bebida.getDescription());
    }

    @Test
    public void test_setDescription(){
        bebida = new Drink();
        bebida.setDescription("amarillo");
        assertEquals("amarillo", bebida.getDescription());
    }

    @Test
    public void test_getPrice(){
        when(bebida.getPrice()).thenReturn(6f);
        assertEquals(6, bebida.getPrice(), 0);
    }

    @Test
    public void test_setPrice(){
        bebida = new Drink();
        bebida.setPrice(6f);
        assertEquals(6f, bebida.getPrice(), 0);
    }

    @Test
    public void test_getWaiter(){
        when(bebida.getWaiter()).thenReturn("Villa");
        assertEquals("Villa", bebida.getWaiter());
    }

    @Test
    public void test_setWaiter(){
        bebida = new Drink();
        bebida.setWaiter("Villa");
        assertEquals("Villa", bebida.getWaiter());
    }


}
