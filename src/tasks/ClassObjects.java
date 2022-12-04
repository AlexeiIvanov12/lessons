package tasks;

public class ClassObjects {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setModel("X5");
        bmw.setColor("blue");
        bmw.setYear(2015);
        System.out.println(bmw.getModel());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getYear());
    }
}

        class Car {

           private String model;
            private String color;
            private int year;

            public void setModel(String model) {
                this.model = model;
            }

            public String getModel() {
                return model;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getColor() {
                return color;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public int getYear() {
                return year;
            }
        }



