public class TestME4 {


    public static void main(String[] args) {
        System.out.println(evaluate("5*2+3*7+10"));
    }

    public static int evaluate(String expression) {

         expression = expression.trim();

        if (expression.contains("+")) {
            return evaluate(expression.substring(0, expression.indexOf("+"))) + evaluate(expression.substring(expression.indexOf("+") + 1));
        }
        if (expression.contains("-")) {
            return evaluate(expression.substring(0, expression.indexOf("-"))) - evaluate(expression.substring(expression.indexOf("-") + 1));
        }

        if (expression.contains("*")) {
            return evaluate(expression.substring(0, expression.indexOf("*"))) * evaluate(expression.substring(expression.indexOf("*") + 1));
        }

        if (expression.contains("/")) {
            return evaluate(expression.substring(0, expression.indexOf("/"))) / evaluate(expression.substring(expression.indexOf("/") + 1));
        }


        return Integer.parseInt(expression);
    }
}
