package nl.leon.ocp.javaobjectorientedapproach;

import javax.naming.OperationNotSupportedException;

public class Question1 {


    // Vehicle3 does not correctly define an interface. Variables cannot be declared with the abstract
    // keyword, and methods cannot be declared with the final keyword or include a method body.
    /*
    interface Vehicle3 {
        abstract static int wheels;
        public final String move() {
            return moving;
        }
    }
     */


    /*
        Vehicle2 does not correctly define an interface. The move method cannot contain a body nor use the protected keyword.
        Als the final, static and abstract keywords are not required when declaring variables and methods in interface.

     */
    /*
    interface Vehicle2 {
        public final static int wheels = 4;
        protected abstract String move() {
            return "moving";
        }
    }
     */

    interface Vehicle4 {
        int wheels = 4;
        void move() throws OperationNotSupportedException;
    }

}
