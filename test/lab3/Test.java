package lab3;

import com.lab111.labwork3.CompositeExpression;
import com.lab111.labwork3.Constant;
import com.lab111.labwork3.OperationSign;
import com.lab111.labwork3.Variable;

/**
 * Created by alex323glo on 26.10.17.
 */
public class Test {

    public static void main(String[] args) {
        CompositeExpression compositeExpression1 = new CompositeExpression();
        compositeExpression1.setExpression1(new Variable("variable"));
        compositeExpression1.setExpression2(new Constant(123));
        compositeExpression1.setOperationSign(OperationSign.PLUS);

        CompositeExpression compositeExpression2 = new CompositeExpression();
        compositeExpression2.setExpression1(new Variable("var1"));
        compositeExpression2.setExpression2(new Variable("var2"));
        compositeExpression2.setOperationSign(OperationSign.DIV);

        CompositeExpression compositeExpressionMain = new CompositeExpression();
        compositeExpressionMain.setExpression1(compositeExpression1);
        compositeExpressionMain.setExpression2(compositeExpression2);
        compositeExpressionMain.setOperationSign(OperationSign.MUL);

        CompositeExpression compositeExpressionMainMain = new CompositeExpression();
        compositeExpressionMainMain.setExpression1(compositeExpressionMain);
        compositeExpressionMainMain.setExpression2(new Constant(567));
        compositeExpressionMainMain.setOperationSign(OperationSign.MINUS);

        System.out.println("Expression: " + compositeExpressionMainMain.show());
    }

}
