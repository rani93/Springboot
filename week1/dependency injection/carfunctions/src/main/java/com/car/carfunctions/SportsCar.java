package com.car.carfunctions;

public class SportsCar implements Car {
    private String Type ="sports car";
    private String owner ="";
    private Tyre tyre;
    public SportsCar(Tyre tyre){
          this.tyre = tyre;
    }
    @Override
    public void getInfo(){
     System.out.println(owner +" owns A "+ Type +" "+tyre.getTyreInfo());
    }
    @Override
   public void setOwnerName(String name){
        owner = name;
   }
   @Override
   public String getOwnerName(){
        return owner;

   }
}
