package src;

public class StunBuff extends Buff
{
	public StunBuff(String n, String dsc, Character c, int d)
	{
		super(n, dsc, c, d);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyAttackEffect(Character target, int mana_burn, double burn_multiplier, int crit_chance, double crit_modifier)
	{
		//does not do anything on attack
	}

	@Override
	public void applyAttackedEffect(Character c)
	{
		//no effect on attacked
	}

	@Override
	public void applyEffectOnTurnStart()
	{
		//no effect on turn start
	}

}
