class Carpenter
{
    String[] roles;
    Wood[] woods;
    
    Carpenter(String[] roles, Wood[] woods)
    {
        this.roles = roles;
        this.woods = woods;
    }
    
    void printCarpenter()
    {
        System.out.println("executing printCarpenter in Carpenter");

        if(this.roles != null)
        {
            System.out.println("size of roles array: " + this.roles.length);
            for(String role : roles)
            {
                System.out.println("roles: " + role);
            }
        }

        System.out.println("------------------------------------------------");
        System.out.println("executing printCarpenter in Carpenter for woods");

        if(this.woods != null)
        {
            System.out.println("size of woods array: " + this.woods.length);
            for(Wood wood : woods)
            {
                wood.displayWood();
            }
        }
    }
}