

public class OperatorTestClass {
	
	public int addition(int operand1,int operand2) {
		return operand1+operand2;
	}
	
	public int subtruction(int operand1,int operand2) {
		return operand1-operand2;
	}
	
	public int multiplication(int operand1,int operand2) {
		return operand1*operand2;
	}
	
	public int division(int operand1,int operand2) {
		return operand1/operand2;
	}
	
	public int modulus(int operand1,int operand2) {
		return operand1%operand2;
	}
	
	public int BitAnd(int operand1,int operand2) {
		return operand1 & operand2;
	}
	
	public int BitOr(int operand1,int operand2) {
		return operand1 | operand2;
	}
	
	public int LeftShift(int operand1) {
		int b;
		b = operand1 << 2;
		return b;
	}
	
	public int RightShift(int operand1) {
		int b;
		b = operand1 >> 2;
		return b;
	}
	
	
	

}
