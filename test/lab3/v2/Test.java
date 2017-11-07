package lab3.v2;

import com.lab111.labwork3.v2.*;

/**
 * Created by alex323glo on 26.10.17.
 */
public class Test {

    public static void main(String[] args) {
        Element composite = createCompositeExpression();
        System.out.println(" * com.lab111.labwork3.v3.Expression: " + composite.show());
    }

    public static Element createCompositeExpression() {
        // Create Leaf elements (Variable, Constant, Operation_sign):
        Element variable = new Variable("varA");
        Element constant = new Constant(123);
        Element operationSign = new OperationSign("=");

        // Create Simple expressions (com.lab111.labwork3.v3.Expression = Variable | Constant)
        Element simpleExpression1 = new Expression();
        simpleExpression1.add(variable);

        Element simpleExpression2 = new Expression();
        simpleExpression2.add(constant);

        // Create Composite expression (Composite_expression = com.lab111.labwork3.v3.Expression Operation_sign com.lab111.labwork3.v3.Expression):
        Element compositeExpression = new Expression();
        compositeExpression.add(simpleExpression1);
        compositeExpression.add(operationSign);
        compositeExpression.add(simpleExpression2);

        return compositeExpression;
    }

}
