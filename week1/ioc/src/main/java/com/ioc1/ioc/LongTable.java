package com.ioc1.ioc;

public class LongTable implements Table{
    double height;
    double length;
    LongTable(){
        this.height = 56.3;
        this.length = 74.4;

    }
    @Override
    public String showDetails(){
        return "the table has length "+this.length+" and height" + this.height;
    }
    
}
 