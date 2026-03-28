class getProfileRunner
{
	public static void main(String[] args)
	{
		Profile[] profiles=new Profile[10];
		getProfile getprofile=new getProfile(profiles);
		
		Profile profile0=new Profile("AI","instagram",10,"pink",false);
		getprofile.storedProfiles(profile0);
		
		Profile profile1=new Profile("design","youtube",13,"black",false);
		getprofile.storedProfiles(profile1);
		
		Profile profile2 = new Profile("gaming","twitch",18,"purple",true);
		getprofile.storedProfiles(profile2);

		Profile profile3 = new Profile("education","linkedin",25,"blue",false);
		getprofile.storedProfiles(profile3);

		Profile profile4 = new Profile("fitness","instagram",30,"green",true);
		getprofile.storedProfiles(profile4);

		Profile profile5 = new Profile("travel","youtube",22,"skyblue",false);
		getprofile.storedProfiles(profile5);

		Profile profile6 = new Profile("food","facebook",28,"orange",false);
		getprofile.storedProfiles(profile6);

		Profile profile7 = new Profile("music","spotify",35,"black",true);
		getprofile.storedProfiles(profile7);

		Profile profile8 = new Profile("photography","pinterest",15,"brown",false);
		getprofile.storedProfiles(profile8);

		Profile profile9 = new Profile("technology","twitter",40,"grey",true);
		getprofile.storedProfiles(profile9);
		
		Profile profile10 = new Profile("technology","twitter",40,"grey",true);
		getprofile.storedProfiles(profile10);
		
	}
}