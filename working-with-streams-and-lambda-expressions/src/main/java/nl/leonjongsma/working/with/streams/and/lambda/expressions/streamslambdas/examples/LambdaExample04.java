package nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.examples;

import java.math.BigDecimal;
import java.util.List;

import nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.ExampleData;
import nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.Product;

public class LambdaExample04 {
    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        int numberOfCheapProducts = 0;

        // Check if there are cheap products.
        for (Product product : products) {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                numberOfCheapProducts++;
            }
        }

        // Because local variables are effectively final, you cannot modify them inside a lambda expression.
//        products.forEach(product -> {
//            if (product.getPrice().compareTo(priceLimit) < 0) {
//                numberOfCheapProducts++; // Error: Variable must be effectively final
//            }
//        });

        System.out.println("There are " + numberOfCheapProducts + " cheap products");
    }
}
