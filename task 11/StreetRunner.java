class StreetRunner {

    public static void main(String[] args) {

        String streets[] = {
            "rama nagara","jaya nagara","krishna nagara","lakshmi nagara",
            "shivaji nagara","basava nagara","indira nagara","vijaya nagara",
            "rajaji nagara","mahesh nagara","ganesh nagara","sai nagara",
            "vinayaka nagara","parvathi nagara","saraswathi nagara","maruthi nagara",
            "ashoka nagara","nehru nagara","ambedkar nagara","kaveri nagara",
            "ganga nagara","yamuna nagara","tungabhadra nagara","sarjapura nagara",
            "hebbal nagara","whitefield nagara","electronic city","banashankari nagara",
            "malleshwara nagara","btm nagara","koramangala nagara","hsr nagara",
            "ulsoor nagara","magadi nagara","mysore nagara","tumkur nagara",
            "davanagere nagara","hubli nagara","belgaum nagara","gulbarga nagara",
            "bidar nagara","raichur nagara","hassan nagara","mandya nagara",
            "chitradurga nagara","karwar nagara","udupi nagara","mangalore nagara",
            "bellary nagara","kolar nagara","chikkamagaluru nagara","bagalkot nagara",
            "gadag nagara","haveri nagara","kodagu nagara","yadgir nagara",
            "kalaburagi nagara"
        };

        for(int i = 0; i < streets.length; i++)
        {
            int length = Street.getStreetName(streets[i]);
            System.out.println("Length of " + streets[i] + " : " + length);
        }
    }
}
