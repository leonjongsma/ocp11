package nl.leonjongsma.working.with.streams.and.lambda.expressions;

import java.util.Comparator;
import java.util.List;

public class Question4 {

    public static void main(String[] args) {
        List<Users> users = List.of(new Users(), new Users());

        Comparator<Users> userID = (u1, u2) -> Integer.compare(u1.getUserID(), u2.getUserID());
        users.stream().sorted(userID)
                .forEach(e -> System.out.println(e.getUserID()));

    }


}
