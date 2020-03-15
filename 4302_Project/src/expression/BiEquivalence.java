package expression;

import visitor.Visitor;

public class BiEquivalence extends BinaryOperation {

	public BiEquivalence(Expression left, Expression right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitEquivalence(this);
	}

}
