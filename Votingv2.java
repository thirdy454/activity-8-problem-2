package group3;

import java.util.Scanner;

public class Votingv2 {

  public static Scanner thirdyGayares = new Scanner(System.in);
  public static int leni = 0;
  public static int marcos = 0;
  public static int villar = 0;
  public static String vote;

  public static void main(String[] args) {

    //System.out.println("first line");
    //he choose vote
    presedentialCandidates();
  }

  public static void presedentialCandidates() {
    System.out.println("");
    System.out.println("Presidential elections \n candidates");
    System.out.println(" A. Robredo \n B. Marcos \n C. Villar");
    System.out.println("[Type 'V'-vote, 'R'-result, 'Q'-quit]");
    System.out.print("Enter your choice: ");
    char choose = thirdyGayares.next().charAt(0);
    switch (choose) {
      case 'V':
      case 'v':
        candidatesList();
        break;
      case 'R':
      case 'r':
        viewresult();
        break;
      case 'q':
      case 'Q':
        return;
      default:
        System.out.println("Invalid Choices");
    }
  }

  public static void candidatesList() {
    char candidates = ' ';

    while (candidates != 'q') {
      System.out.print("Enter your vote: ");
      candidates = thirdyGayares.next().charAt(0);

      switch (candidates) {
      case 'A':
        case 'a':
          ++leni;
          break;
        case 'B':
        case 'b':
          ++marcos;
          break;
        case 'c':
        case 'C':
          ++villar;
          break;
        case 'q':
        case 'Q':
        	  presedentialCandidates();
            break;
          default:
        	  invalidCandidates();
      }
    }
    presedentialCandidates();
  }

  public static void viewresult() {
    double totalofvotes = leni + marcos + villar;
    double lenipercentage = leni / totalofvotes * 100;
    double lenipercentages = Math.round(lenipercentage * 100.0) / 100.0;
    double marcospercentage = marcos / totalofvotes * 100;
    double marcospercentages = Math.round(marcospercentage * 100.0) / 100.0;
    double villarpercentage = villar / totalofvotes * 100;
    double villarpercentages = Math.round(villarpercentage * 100.0) / 100.0;
    String winner = " ";
    System.out.println("\n\t\tPRESEDENTIAL ELECTIONS\n\n");
    System.out.println("CANDIDATES\t\tResults\t\t% of Total Votes");
    System.out.println(
      "ROBREDO\t\t\t  " + leni + "\t\t      " + lenipercentages
    );
    System.out.println(
      "MARCOS\t\t\t  " + marcos + "\t\t      " + marcospercentages
    );
    System.out.println(
      "VILLAR\t\t\t  " + villar + "\t\t      " + villarpercentages
    );
    int totalofvotess = (int) totalofvotes;
    System.out.println("\nTOTAL VOTES: " + totalofvotess);

    if (leni > marcos && leni > villar) {
      winner = "ROBREDO";
    } else if (marcos > leni && marcos > villar) {
      winner = "MARCOS";
    } else if (villar > leni && villar > marcos) {
      winner = "VILLAR";
    }

    System.out.println("\nAnd the winner is : " + winner);
    System.exit(0);
  }


  public static void invalidCandidates() {
	  System.out.println(" \n\t\t\tYou have Invalid keyword\n\t\t\t Do you want to continue to vote?[Y/N]");
	  char invalidvote = ' ';
	   invalidvote = thirdyGayares.next().charAt(0);

	   switch(invalidvote) {
	   case 'y':
	   case 'Y':
		   candidatesList();
		   break;
	   case 'n':
	   case 'N':
		   System.out.println("\n\t\t\tthe voting system was terminated");
		   System.exit(0);
	   default:
		   System.out.println("Please Choose Y or N only");
		   invalidCandidates();

	   }


  }

}
