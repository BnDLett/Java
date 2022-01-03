package cryoTorture;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> cryoTorture = new ArrayList<>();
		cryoTorture.add("123123");
		cryoTorture.add("12");
		cryoTorture.add("asda!23");
		cryoTorture.add("12");
		cryoTorture.add("assda");
		cryoTorture.add("masda");
		cryoTorture.add("123da123");
		cryoTorture.add("1'!23asdsad1");
		cryoTorture.add("masda");
		cryoTorture.add("12");
		cryoTorture.add("masda");
		System.out.println(cryoTorture);
		int s = 1;
		int f = 1;
		boolean d = true;
		int c = cryoTorture.size();
			for (int e =1; e < c;) {
				if(d == true) {
					c = cryoTorture.size();
					if(s > c) {
						d = false;
					}
					if(s == c) {
						s = 1;
						e += 1;
						}
					if(s < c) {
						if(cryoTorture.get(s).equals(cryoTorture.get(e))) {
							cryoTorture.remove(e);
						}
					}
				s += 1;
			}
			if(d == false) {
				c = 0;
			}
		}
		System.out.println(cryoTorture);
	}

}
