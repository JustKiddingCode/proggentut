/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleparser;

/**
 *
 * @author justkidding
 */
public abstract class BinaryOperand {
    int op1 = Integer.MIN_VALUE;
    int op2 = Integer.MIN_VALUE;
    int order;
    
	public int getOrder() {
		return order;
	}

	public void setFirstOp(int op) {
	    op1 = op;
	}


    public void setSecondOp(int op) {
        op2 = op;
    }
	
	public void setOp(int op) {
		if (op1 > Integer.MIN_VALUE) {
			if (op2 == Integer.MIN_VALUE) {
				op2 = op;
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			op1 = op;
		}
	}
	abstract public int exe();
    
}
