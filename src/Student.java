import java.util.Random;

public class Student {

        private String name;
        private int age;

        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void guessingAge(){
            Random number = new Random();
            int randomNumber = number.nextInt(35);

            System.out.println("I generated the random number " + randomNumber + " for "+ name);

            if(randomNumber > this.age){

                System.out.printf( "%d is greater than the %s's age",randomNumber,name );


            }else if(randomNumber < this.age){

                System.out.printf( "%d is lower than the %s's age",randomNumber, name);

            }else{
                System.out.printf(  "%d is equal to the %s's age", randomNumber,name);
            }
        }
}
