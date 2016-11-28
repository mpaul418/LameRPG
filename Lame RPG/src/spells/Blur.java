package spells;

import buffs.AttackedBuff;
import classes.Character;

public class Blur extends PassiveSpell
{

	public Blur(Character c)
	{
		super("Blur", "Passively gain a 50% chance to evade physical attacks.", 0, 1, -1, c);
	}
	
	@Override
	public void addToSpellbook(Character c)
	{
		super.addToSpellbook(c);
		this.CHARACTER.buffs.add(new AttackedBuff(this.NAME, this.NAME + " evasion bonus.",
				this.CHARACTER, -1, 50));
	}

}
