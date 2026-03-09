class Sound
{
	double frequency;
	Sound(double frequency)
	{
		this.frequency=frequency;
		System.out.println("created frequency using Sound");
	}
	void getSound()
	{
		System.out.println("Sound Frequency: "+this.frequency);
	}
}