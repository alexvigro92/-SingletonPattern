package mx.iteso.tables;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 10/28/2015.
 */
public class TestTable1 {
    TableOrder order;

    @Before
    public void SetUp(){
        order = Table1.getInstance();
    }

    @Test
    public void TestTableName(){
        assertEquals(order.tableName, "Table 1");
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
        Table1.clearOrder();
    }
}
