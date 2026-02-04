class President
{
		static void govern(){
			System.out.println("I will govern ");
			callState();
		}
		
		static void callState(){
			System.out.println("I will call a state protocols");
			rules();
		}
		
		static void rules(){
			System.out.println("I rule states");
			check();
		}
		
		static void check(){
			System.out.println("I check nation security");
			callAdmin();
		}
		
		static void callAdmin(){
			System.out.println("I will call admin to take decisions");
			collect();
		}
		
		static void collect(){
			System.out.println("I will collect news from all over nation");
			apply();
		}
		
		static void apply(){
			System.out.println("I will apply rules for nation security");
			chain();
		}
		
		static void chain(){
			System.out.println("I can manage chain of process parallelly");
			citizen();
		}
		
		static void citizen(){
			System.out.println("I am the first citizen of country");
			follow();
		}
		
		static void follow(){
			System.out.println("I will stictly follow the constitution");
		}
}