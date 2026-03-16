class TreeRunner
{
	public static void main(String...names)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] treeNames=new String[8];
		Tree tree=new Tree(treeNames);
		
		tree.getTreeName(null);
		tree.getTreeName("Neem");
		tree.getTreeName("Mango");
		tree.getTreeName("Banyan");
		tree.getTreeName("Peepal");
		tree.getTreeName("Coconut");
		tree.getTreeName("Teak");
		tree.getTreeName("Sandalwood");
		tree.getTreeName("Ashoka");
		tree.getTreeName("Palm");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");

		tree.getSearchName("Neem");
		tree.getSearchName("Mango");
		tree.getSearchName("Banyan");
		tree.getSearchName("Peepal");
		tree.getSearchName("Coconut");
		tree.getSearchName("Teak");
		tree.getSearchName("Sandalwood");
		tree.getSearchName("Ashoka");
		tree.getSearchName("Neem");
	}
}