package buffs;

import classes.Characters;

public class StunBuff extends Buff
{
	public StunBuff(String n, String dsc, Characters c, int d)
	{
		super(n, dsc, c, d);
		
		System.out.println(this.CHARACTER + " was stunned for " + duration + " turn(s).");
	}
}