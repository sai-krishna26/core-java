package com.btmlayout.runner;

import com.btmlayout.area.BtmLayout;
import com.btmlayout.area.Temples.BalajiTemple;
import com.btmlayout.area.Temples.OmkareshwarTemple;
import com.btmlayout.visitorcount.Count;
import com.btmlayout.visitorcount.VisitorDetail;

public class runner {
    public static void main(String[] args){

    BalajiTemple ref=new BalajiTemple();
    ref.location();
    ref.aboutTemple();

    BtmLayout layout=new OmkareshwarTemple();
    layout.aboutTemple();

    Count count=new VisitorDetail();
    count.getCount();
    }
}
