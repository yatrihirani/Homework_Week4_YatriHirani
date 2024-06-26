package homework_week_4.programme_17;
/**
 *
 * Carpet Cost Calculator
 *  * The Carpet Company has asked you to write an application that calculates the price of carpeting for
 *  * rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
 *  * the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
 *  * meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter
 *  * would cost $960.
 *
 *
 * Write the following methods (instance methods):
 *  * ● Method named getCost without any parameters, it needs to return the value of cost field
 *  * 3. Write a class with the name Calculator. The class needs two fields (instance variables) with name
 *  * floor of type Floor and carpet of type Carpet.
 *  * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet
 *  * and it needs to initialize the fields.
 *  * Write the following methods (instance methods):
 *  * ● Method named getTotalCost without any parameters, it needs to return the calculated total
 *  * cost to cover the floor with a carpet.
 *
 */
public class Calculator {

         Floor floor;
         Carpet carpet;

        public Calculator(Floor floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return floor.getArea() * carpet.getCost();
        }
}
