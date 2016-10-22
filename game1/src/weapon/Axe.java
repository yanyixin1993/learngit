package weapon;

import Role.role;

public class Axe implements weapon {

	@Override
	public void action(role enemy) {
		// TODO Auto-generated method stub
		System.out.println("斧头向【" + enemy.name + "】劈砍过去……");
	}

}
