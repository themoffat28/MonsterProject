package monster.model;

public class MarshmallowMonster
{
	
	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	
	public MarshmallowMonster()
	{
		this.name = "Terrence";
		this.antennaCount = 0;
		this.eyeCount = -53425;
		this.hasBellyButton = false;
		this.armCount = -34;
		this.noseCount = -563635;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, boolean hasBellyButton, int armCount, int noseCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
	}
	
	public String toString()
	{
		String description = "His name is " + this.name;                       
		
		return description;
	}
	
				public double getAntennaCount()
	{
				return antennaCount;
	}
	
						public int getEyeCount()
	{
						return eyeCount;
	}
	
							public boolean getHasBellyButton()
	{
							return hasBellyButton;
	}
	
								public int getArmCount()
	{
								return armCount;
	}
	
									public int getNoseCount()
	{
									return noseCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
			public void setAntennaCount(int antennaCount)
	{
			this.antennaCount = antennaCount;
	}
	
					public void setEyeCount(int eyeCount)
	{
					this.eyeCount = eyeCount;
	}
	
							public void setHasBellyButton(boolean hasBellyButton)
	{
							this.hasBellyButton = hasBellyButton;
	}
	
									public void setArmCount(int armCount)
	{
									this.armCount = armCount;
	}
	
											public void setNoseCount(int noseCount)
	{
											this.noseCount = noseCount;
	}
}

