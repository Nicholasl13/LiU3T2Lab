public class Calculator {

    public Calculator () {}

    public double Calculate(String expression) {
        double firstNum;
        double secondNum;
        if (expression.indexOf("^") >= 0) {
            firstNum = Double.parseDouble(expression.substring(0, expression.indexOf("^")));
            secondNum = Double.parseDouble(expression.substring(expression.indexOf("^") + 1));
            return Math.pow(firstNum, secondNum);
        } else if (expression.indexOf("*") >= 0) {
            firstNum = Double.parseDouble(expression.substring(0, expression.indexOf("*")));
            secondNum = Double.parseDouble(expression.substring(expression.indexOf("*") + 1));
            return firstNum * secondNum;
        } else if (expression.indexOf("/") >= 0) {
            firstNum = Double.parseDouble(expression.substring(0, expression.indexOf("/")));
            secondNum = Double.parseDouble(expression.substring(expression.indexOf("/") + 1));
            return firstNum / secondNum;
        } else if (expression.indexOf("-") >= 0) {
            firstNum = Double.parseDouble(expression.substring(0, expression.indexOf("-")));
            secondNum = Double.parseDouble(expression.substring(expression.indexOf("-") + 1));
            return firstNum - secondNum;
        } else if (expression.indexOf("+") >= 0) {
            firstNum = Double.parseDouble(expression.substring(0, expression.indexOf("+")));
            secondNum = Double.parseDouble(expression.substring(expression.indexOf("+") + 1));
            return firstNum + secondNum;
        } else {
            firstNum = Double.parseDouble(expression.substring(0, expression.indexOf("%")));
            secondNum = Double.parseDouble(expression.substring(expression.indexOf("%") + 1));
            return firstNum % secondNum;
        }
    }

}
