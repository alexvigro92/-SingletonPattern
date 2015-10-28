package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table2;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/28/2015.
 */
public class TestTable2 {
    TableOrder order;

    @Before
    public void SetUp(){
        order = Table2.getInstance();
    }

    @Test
    public void TestTableName(){
        assertEquals(order.tableName, "Table 2");
    }

    @Test
    public void TestDrink(){
        order.addDrink(new Drink());
        order.addDrink(new Drink());
        assertEquals(2, order.drinks.size());
    }

    @Test
    public void TestCleanDrink(){
        order.clearDrinks();
        assertEquals(0, order.drinks.size());
    }

    @Test
    public void TestDish(){
        order.addDish(new Dish());
        order.addDish(new Dish());
        assertEquals(2, order.dishes.size());
    }

    @Test
    public void TestCleanDish(){
        order.clearDishes();
        assertEquals(0, order.dishes.size());
    }


    @Test
    public void testCheck(){
        order.printCheck();
    }

    @Test
    public void testClearOrder(){
        Table2.clearOrder();
    }
}
