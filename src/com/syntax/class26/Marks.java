package com.syntax.class26;

//We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by
// student B. Create class 'Marks' with an abstract method 'getAverage' that will be returning the average
// of marks. Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A
// takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for
// student B. Test your code
    // abstract class with abstract method
    abstract class Marks{
        abstract double getAverage();
    }

    //class A
    class A extends Marks{
        private float subj1, subj2, subj3;

        public A(float s1, float s2, float s3) {
            subj1 = s1;
            subj2 = s2;
            subj3 = s3;
        }
        double getAverage() {
            return (subj1 + subj2 + subj3)/300.0 * 100;
        }
    }

    //class B
    class B extends Marks{
        private float subj1, subj2, subj3, subj4;

        public B(float s1, float s2, float s3, float s4) {
            subj1 = s1;
            subj2 = s2;
            subj3 = s3;
            subj4 = s4;
        }
        double getAverage() {
            return (subj1 + subj2 + subj3 +subj4)/400.0 * 100;
        }
    }

    //class with main method
    class abstract0{
        public static void main(String[] args){

            A a = new A(25, 74, 33);      //creating object of class A
            B b = new B(16, 19, 38, 46);  //creating object of class B

            double p1 = a.getAverage();  //object of class A calling its getPercentage() function
            double p2 = b.getAverage();  //object of class B calling its getPercentage() function

            System.out.println("Percentage of student A : " + p1);
            System.out.println("Percentage of student B : " + p2);
        }
    }

