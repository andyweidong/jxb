package wd.calc.jxb;

public class CoreCalc {
	
	// five axis design
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arm arm = new Arm(1, "bi01", 20, 0, 0, 0);
		for (double a0 = 0; a0 <= 360; a0 += 10) {
			arm.changeAngle(a0);
			System.out.println(arm);
		}
	}

}
