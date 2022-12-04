package tasks;
import tasks.ClassObjects2.Motorcircle;

public class ClassObjects2 {
    public static void main(String[] args) {

        Motorcircle honda = new Motorcircle("cbr", "red", 2011);

        }

        static class Motorcircle {



            private String model;
            private String color;
            private int year;

            public Motorcircle(String model, String color, int year) {


                this.model = model;
                this.color = color;
                this.year = year;
                System.out.println(model +" "+ color +" "+ year);




//                public void setModel (String model){
//                    this.model = model;
//                }
//
//                public void setColor (String color){
//                    this.color = color;
//                }
//
//                public void setYear ( int year){
//                    this.year = year;
//                }
            }
        }
    }

