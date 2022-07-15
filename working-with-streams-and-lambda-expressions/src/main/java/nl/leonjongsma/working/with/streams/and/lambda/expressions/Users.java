package nl.leonjongsma.working.with.streams.and.lambda.expressions;

import java.util.concurrent.ThreadLocalRandom;

public class Users {
    private Integer userID;

    public Users() {
        this.userID = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
    }

    public Integer getUserID() {
        return userID;
    }
}
