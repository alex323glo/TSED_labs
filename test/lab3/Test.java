package lab3;

import com.lab111.labwork3.v1.*;

/**
 * Created by alex323glo on 23.10.17.
 */
public class Test {

    public static void main(String[] args) {

        Element[] elements = {
                createCompositeExpressionExample(),
                createSimpleExpressionExample(),
                createVariableExample(),
                createConstantExample(),
                createOperationSignExample()
        };

        for (Element element: elements) {
            System.out.println(element.show());
        }

    }

    public static Element createCompositeExpressionExample() {
        return new CompositeExpression(
                new SimpleExpression(
                        new Variable("name")
                ),
                new SimpleExpression(
                        new Constant(20)
                ),
                new OperationSign(
                        Sign.MUL
                )
        );
    }

    public static Element createSimpleExpressionExample() {
        return new SimpleExpression(
                new Variable("name")
        );
    }

    public static Element createConstantExample() {
        return new Constant(-10);
    }

    public static Element createVariableExample() {
        return new Variable("var");
    }

    public static Element createOperationSignExample() {
        return new OperationSign(Sign.DIV);
    }

}
