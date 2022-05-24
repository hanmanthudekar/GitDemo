package logical;

import java.util.LinkedHashSet;

public class CoomonElements {

	int a[]= {1,2,3,1,4,5};
	//int b[]= {5,6,7,8,9,4};
	public void a1() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}			}
		}
	}
	public static void main(String [] args) {
		CoomonElements a= new CoomonElements();
		a.a1();
	}
}
