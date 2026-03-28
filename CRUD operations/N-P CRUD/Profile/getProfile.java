class getProfile
{
	Profile[] profiles;
	int currentIndex=0;
	
	getProfile(Profile[] profiles)
	{
		this.profiles=profiles;
	}
	
	void storedProfiles(Profile detail)
	{
		System.out.println("---------------------------------------------------");
		System.out.println("executing the storedProfiles in getProfile");
		int arraySize=this.profiles.length;
		if(this.profiles!=null && detail!=null)
		{
			if(detail.type!=null && detail.name!=null && detail.color!=null)
			{
				if(this.currentIndex<arraySize)
				{
					this.profiles[currentIndex]=detail;
					detail.showProfile();
					System.out.println("profile details store in index: "+this.currentIndex);
					this.currentIndex++;
				}
				else
				{
					System.out.println("Sorry type: "+detail.type+" can't be stored bcz array is full!!");
				}
			}
			else
			{
				System.out.println("null found at type/name/color in index "+currentIndex+" so, change it");
			}
		}
		else
		{
			System.out.println("profiles array and profile detail should not be null!!");
		}
	}
}