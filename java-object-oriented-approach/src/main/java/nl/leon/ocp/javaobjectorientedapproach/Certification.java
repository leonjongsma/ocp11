package nl.leon.ocp.javaobjectorientedapproach;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Certification extends CertificationParent {

//    protected Object getScore() {
//        return 50.0;
//    }

//    protected double getScore() {
//        return 50.0;
//    }
//
//    protected String getScore() {
//        return 50.0;
//    }
//
//    protected int getScore() {
//        return 50.0;
//    }
//
//    protected Object getScore() {
//        return 50.0;
//    }

    // allowed
//    protected AtomicLong getScore() {
//        return new AtomicLong(50);
//    }

    //allowed
    protected BigInteger getScore() {
        return new BigInteger(String.valueOf(50));
    }





    }
