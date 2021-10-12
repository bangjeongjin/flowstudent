package flowctrl.java.exam11.arrary_11_11_1;

public class Member implements Comparable<Member> {
	String name;
	Member(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
