package meetproblems;

import org.apache.poi.poifs.property.Child;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.bouncycastle.util.test.Test;

public class Parent {

	static int childPolpulation = 0;

	Parent(String mom, String dad) {
		childPolpulation++;
	}

	public static void main(String a[]) {
		Parent c1 = new Parent("m1", "f1");
		System.out.println(childPolpulation);
		Parent c2 = new Parent("m2", "f2");
		System.out.println(childPolpulation);
	}

}
