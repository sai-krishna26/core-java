class OrganRunner
{
	public static void main(String... value)
	{
		Organ o1 = new Organ("Heart","Circulatory","Pumps blood","Chest","Cone","Red","Muscle","Coronary Artery","Cardiac Nerves","Lungs",300,12,2000000000,1628,true,7.4,"William Harvey","Cardiology","Heart Attack",true);
		o1.show();
		System.out.println("------------------------------------------------");

		Organ o2 = new Organ("Brain","Nervous","Controls body","Head","Oval","Pink","Neural","Carotid Artery","Cranial Nerves","Spinal Cord",1400,15,86000000000,1664,true,7.2,"Thomas Willis","Neurology","Stroke",false);
		o2.show();
		System.out.println("------------------------------------------------");

		Organ o3 = new Organ("Liver","Digestive","Detoxification","Abdomen","Triangular","Brown","Epithelial","Hepatic Artery","Vagus Nerve","Gall Bladder",1500,20,1000000000,1654,true,7.4,"Andreas Vesalius","Hepatology","Cirrhosis",true);
		o3.show();
		System.out.println("------------------------------------------------");

		Organ o4 = new Organ("Kidney","Excretory","Filters blood","Lower Back","Bean","Dark Red","Nephron","Renal Artery","Renal Nerve","Bladder",150,11,1000000,1564,true,6.8,"Marcello Malpighi","Nephrology","Kidney Stone",true);
		o4.show();
		System.out.println("------------------------------------------------");

		Organ o5 = new Organ("Lungs","Respiratory","Breathing","Chest","Spongy","Pink","Elastic","Pulmonary Artery","Phrenic Nerve","Heart",1000,25,300000000,1615,true,7.4,"Galen","Pulmonology","Asthma",true);
		o5.show();
		System.out.println("------------------------------------------------");

		Organ o6 = new Organ("Stomach","Digestive","Digests food","Abdomen","J-shaped","Pink","Muscle","Gastric Artery","Vagus Nerve","Intestine",500,30,500000000,1543,false,2.0,"Hippocrates","Gastroenterology","Ulcer",true);
		o6.show();
		System.out.println("------------------------------------------------");

		Organ o7 = new Organ("Pancreas","Digestive","Produces insulin","Abdomen","Leaf","Yellow","Glandular","Splenic Artery","Vagus Nerve","Liver",90,15,100000000,1642,true,7.1,"Paul Langerhans","Endocrinology","Diabetes",true);
		o7.show();
		System.out.println("------------------------------------------------");

		Organ o8 = new Organ("Skin","Integumentary","Protects body","Outer Body","Flat","Brown","Epithelial","Dermal Capillaries","Sensory Nerves","Hair",5000,180,1000000000,1571,false,5.5,"Anatomy Scholars","Dermatology","Eczema",true);
		o8.show();
		System.out.println("------------------------------------------------");

		Organ o9 = new Organ("Eye","Sensory","Vision","Face","Spherical","White","Retinal","Ophthalmic Artery","Optic Nerve","Brain",8,2,7000000,1604,false,7.0,"Alhazen","Ophthalmology","Cataract",true);
		o9.show();
		System.out.println("------------------------------------------------");

		Organ o10 = new Organ("Ear","Sensory","Hearing","Head","Spiral","Pink","Cartilage","Auricular Artery","Auditory Nerve","Brain",5,6,2000000,1583,false,7.0,"Bartolomeo Eustachi","Otolaryngology","Hearing Loss",true);
		o10.show();
		System.out.println("------------------------------------------------");
	}
}