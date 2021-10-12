package flowctrl.java.exam11.finalize_11_3_5;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "¹ø °´Ã¼ÀÇ finalize()°¡ ½ÇÇàµÊ");
	}
}
