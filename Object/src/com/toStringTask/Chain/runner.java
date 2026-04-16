package com.toStringTask.Chain;

public class runner {
    public static void main(String[] args) {
        String[] materials = {"Gold","Silver"};
        Chain chain = new Chain();
        chain.material = materials;
        chain.type = ChainType.GOLD;
        chain.wear();
        chain.remove();
        System.out.println(chain);

        System.out.println("---------------------------------");
        Company company = new Company("Tanishq",50000);
        System.out.println("---------------------------------");

        GoldChain goldChain = new GoldChain();
        goldChain.price = 150000;
        goldChain.wear();
        goldChain.remove();
        System.out.println(goldChain);
    }
}
