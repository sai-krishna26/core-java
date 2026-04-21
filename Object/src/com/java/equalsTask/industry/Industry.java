package com.java.equalsTask.industry;

public class Industry {
    String industryName;
    String bestActor;
    int age;

    public Industry(String industryName,String bestActor, int age)
    {
        this.industryName=industryName;
        this.bestActor=bestActor;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Industry{" +
                "industryName='" + industryName + '\'' +
                ", bestActor='" + bestActor + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Industry edaBhaga=this;
        if(obj instanceof Industry)
        {
            Industry balaBhaga=(Industry) obj;
            if(edaBhaga.industryName==balaBhaga.industryName && edaBhaga.bestActor==balaBhaga.bestActor && edaBhaga.age==balaBhaga.age)
            {
                return true;
            }
        }
        return super.equals(obj);
    }
}
