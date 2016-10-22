package game1;

import weapon.Axe;
import weapon.weapon;
import Role.King;

public class game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		King Arthur =new King("亚瑟");
		weapon x=new Axe();
		Arthur.addweapon(x);
		King Alex=new King("亚历山大");
		Arthur.action(Alex);
	}

}
