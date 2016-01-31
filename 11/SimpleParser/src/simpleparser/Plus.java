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
public class Plus extends BinaryOperand {

	@Override
	public int exe() {
		return op1 + op2;
	}

    
}
