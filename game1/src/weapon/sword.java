package weapon;

import Role.role;

public class sword implements weapon {

	@Override
	public void action(role enemy) {
		// TODO Auto-generated method stub
		System.out.println("����" + enemy.name + "����ȥ����");
	}

}
