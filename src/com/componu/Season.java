package com.componu;

public enum Season {

    WINTER, // public static final Seosan WINER = Season ();
    SUMMER("yssyk"),
    SPRING("jakshy"),
    AUTUMN("jakshy");
    private String pogoda;




   private Season() {
   }

       Season(String pogoda) {
           this.pogoda = pogoda;
       }


    public String getPogoda() {
        return pogoda;
    }
    public void setPogoda(String pogoda) {
        this.pogoda = pogoda;
    }
    @Override
    public String toString(){
       return "Season{" + "pogoda=" + pogoda + '/'+ '}';




    }























}
