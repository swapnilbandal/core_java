package que54;

public interface StudentFee {
	public static void getFee(int fee) throws Exception{
			if(fee<0) {
				throw new Exception();
			
		}
	}
}
