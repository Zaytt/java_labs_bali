package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

public class Exercise_09{

    public static void main(String[] args) {
        varArgMethod("Hello ", "this ", "is ", "a ", "string ", "made ", "with ", "a ", "vararg ", "method");
        varArgMethod("I'm ", "currently ", "learning ", "Java ", "in ", "Bali");
        varArgMethod("It's ", "awesome");
    }

    public static void varArgMethod(String ... varargs){
        StringBuilder builder = new StringBuilder();
        for (String x: varargs) {
            builder.append(x);
        }

        System.out.println(builder.toString());

    }
}


