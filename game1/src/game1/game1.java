package game1;

import weapon.Axe;
import weapon.sword;
import weapon.weapon;
import Role.King;
import Role.Knight;

public class game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		King Arthur =new King("亚瑟");
		weapon x=new Axe();
		weapon s=new sword();
		Arthur.addweapon(x);
		Knight Alex=new Knight("亚历山大");
		Alex.addweapon(s);
		Arthur.action(Alex);
		Alex.action(Arthur);
	}

}
