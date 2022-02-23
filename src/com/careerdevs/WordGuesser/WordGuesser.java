package com.careerdevs.WordGuesser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordGuesser {


    //Rental service holds all MENUS as well as USER LOGIC
    public class Guesses {

        private static ArrayList<Guesses> guessStorage;

        public static void main(String[] args) {

            initializeGuessStorage();

//    carStorage.get(0).setRented(true);//FOR TESTING
//        carStorage.get(3).setRented(true);//FOR TESTING

            mainMenu();
            guessMenu();
            guessMenu();
        }

        public static void mainMenu (){
            System.out.println("-".repeat(15) + "\nMAIN MENU\n" + "-".repeat(15));
            int selection = UI.readInt("Would you like to:\n1)rent\n2)return\n3)exit",1,3);
            if (selection == 1){
                rentalMenu();
            }
            else if(selection == 2){
                returnMenu();
            }
            else {
                return;
            }
        }

        private static ArrayList<Guesses> filteredGuesses (boolean filterGuessed) {
            //Create Temp Array for just the available cars
            ArrayList<Guesses> filteredGuesses = new ArrayList<>();
            for (int i = 0; i < guessStorage.size(); i++) {
                boolean keepCar = guessStorage.get(i).isGuessed();
                //Flipping the value of a boolean with !keepCar = no, not available || keepCar = yes, get the vehicle
                if (filterGuessed) keepGuess = !keepGuess;
                if (keepCar) {
                    filteredGuesses.add(guessStorage.get(i));

                }
            }
            return filteredGuesses;
        }

        //This Approach is the shorter easier way to do the same code block as above.
        private static ArrayList<Guesses> getAvailableCars (){

            // Take Array List turning it to stream to modify / filter elements within array.
            return guessStorage.stream().filter(question -> !question.isTrue()).collect(Collectors.toCollection(ArrayList::new));

        }

        private static void rentalMenu() {
            ArrayList<Guesses> availableQuestions = getAvailableQuestions();

            //Display available cars
            System.out.println("\nQuestions\n");
            for (int i = 0; i < availableQuestions.size(); i++){
                System.out.println(i+1 + ") " + availableQuestions.get(i).getName());
            }

            //read User Input
            int userSelection = UI.readInt("Enter a number to select question", 1, availableQuestions.size());


            //inform the user of a successful rent
            System.out.println("You are correct" + " " + availableQuestions.get(userSelection-1).getQuestion());

//            System.out.println("You are returning" + " " + availableCars.get(userSelection-1).getName());

            //updating the car rental status
            availableQuestions.get(userSelection-1).setQuestion(true);
        }

        private static void feedbackMenu(){
            ArrayList<Question> availableQuestions = filteredQuestions(false);
            System.out.println("\nAVAILABLE Questions\n");
            int listNumber = 1;
            for (int i = 0; i < questionStorage.size(); i++){
                if (questionStorage.get(i).isGuessed()){
                    System.out.println(listNumber + ") " + questionStorage.get(i).getQuestion());
                    listNumber++;
                }
            }

        }

        private static void initializeGuessStorage(){
            guessStorage = new ArrayList<>();

            Question question1 = new Question("Honda", "Accord",false);

            Question question2 = new Question("Chevy", "Tahoe",false);

            Question question3 = new Question("Ford", "F150",false);

            guessStorage.addAll(List.of(new Question[]{question1, question2, question3}));

        }
    }

}
