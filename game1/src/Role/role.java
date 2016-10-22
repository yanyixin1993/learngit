package Role;

import weapon.weapon;

public class role {
	public String name;
	public weapon wp;

	public role(String name) {
		this.name = name;
	}
	public void addweapon(weapon wp){
		this.wp=wp;
	}
	public void action(role role){
		System.out.print("¡¾"+this.name+"¡¿");
		wp.action(role);
	}
}
