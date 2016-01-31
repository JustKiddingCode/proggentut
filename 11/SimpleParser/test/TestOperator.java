
import org.junit.Test;
import simpleparser.Operator;
import static org.junit.Assert.*;



public class TestOperator {

	//Punkt vor Strich
	@Test
	public void TestOrder() {
		assertTrue(Operator.PLUS.getOrder() == Operator.MINUS.getOrder());
		assertTrue(Operator.DIV.getOrder() == Operator.MULT.getOrder());
		assertTrue(Operator.DIV.getOrder() < Operator.MINUS.getOrder());
	}

}
