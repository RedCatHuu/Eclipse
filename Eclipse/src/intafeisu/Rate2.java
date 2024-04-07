package intafeisu;

public class Rate2 implements RateIntf {
	
	@Override
	public double taxRate(double gaku) {
		return gaku > 80 ? 0.12 : 0.04; // 新しい税額計算
	}

}
