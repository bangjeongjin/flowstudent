package flowctrl.java.exam13.genericExtendsImplements_13_7;

public class ChildProduct<T, M, C> extends Product<T, M> {
	   private C company;
	   public C getCompany() { return this.company; }
	   public void setCompany(C company) { this.company = company; }
}

