package pokemon.model;

public class Pokemon
{
	private int attackPoints;
	private int healthPoints;
	private double speed;
	private String name;
	private int number;
	
	public Pokemon(int attackPoints, int healthPoints, double speed, String name, int number)
	{
		this.attackPoints = attackPoints;
		this.healthPoints = healthPoints;
		this.speed = speed;
		this.name = name;
		this.number = number;
	}
	
	public String getPokemonTypes()
	{
		String pokemonTypes = "This pokemon has the following type(s):\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++)
		{
			String temp = types[index].getCanonicalName();
						
		}
		
		return pokemonTypes;
	}
	
	public int getAttackPoints()
	{
		return attackPoints;
	}
	
	public int getHealthPoints()
	{
		return healthPoints;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumber()
	{
		return number;
	}
}
