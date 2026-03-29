class GenderRunner
{
	public static void main(String[] args)
	{
		//String[] genderTypes={"male","female","trans"};
		Gender gender=new Gender(3);
		gender.storeGenders("male");
		gender.storeGenders("female");
		gender.storeGenders("trans");
	}
}