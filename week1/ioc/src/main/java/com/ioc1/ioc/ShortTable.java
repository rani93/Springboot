package com.ioc1.ioc;

public class ShortTable implements Table{
    double height;
    double length;
    ShortTable(){
        this.height = 15.5;
        this.length = 225;
    }
    @Override
    public String showDetails(){
        return "the table has height " + this.height +"and length"+this.length;
    }
    
}
