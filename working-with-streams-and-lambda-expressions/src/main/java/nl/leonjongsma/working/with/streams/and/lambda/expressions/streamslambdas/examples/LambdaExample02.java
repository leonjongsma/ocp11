package nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.examples;

import java.math.BigDecimal;
import java.util.List;

import nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.ExampleData;
import nl.leonjongsma.working.with.streams.and.lambda.expressions.streamslambdas.Product;

public class LambdaExample02 {

    // Print the products that cost less than the price limit.
    static void printProducts(List<Product> products, BigDecimal priceLimit) {
        for (Product product : products) {
            if (product.getPrice().compareTo(priceLimit) < 0) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        List<Product> products = ExampleData.getProducts();

        BigDecimal priceLimit = new BigDecimal("5.00");

        printProducts(products, priceLimit);
    }
}
