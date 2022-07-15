package nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.examples;

import java.math.BigDecimal;
import java.util.List;

import nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.Category;
import nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.ExampleData;
import nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.Product;

public class LambdaExample07 {

    interface ProductFactory {
        Product create(Category category, String name, BigDecimal price);
    }

    static boolean isExpensive(Product product) {
        return product.getPrice().compareTo(new BigDecimal("5.00")) >= 0;
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        // Instead of a lambda expression, you can use a method reference to refer to a method
        // that implements the relevant functional interface.
//        products.forEach(product -> System.out.println(product));
        products.forEach(System.out::println);

        // A method reference can refer to a static method, an instance method or a constructor.

        // Method reference to a static method.
        products.removeIf(LambdaExample07::isExpensive);

        // There are two types of method references that refer to an instance method:
        // - Product::getName refers to an instance method of class Product, but not for any particular Product object
        //   map() calls the getName() method on the Product object it receives
        // - System.out::println refers to an instance method of class PrintStream, for a particular PrintStream object;
        //   the one that the variable System.out refers to. forEach() calls the println() method on that PrintStream
        products.stream().map(Product::getName).forEach(System.out::println);

        // A method reference with 'new' after the double colon refers to a constructor.
        ProductFactory factory = Product::new;
        Product blueberries = factory.create(Category.FOOD, "Blueberries", new BigDecimal("6.95"));
        System.out.println(blueberries);
    }
}
