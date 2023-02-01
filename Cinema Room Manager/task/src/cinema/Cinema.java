package cinema;
import java.util.Scanner;

public class Cinema {
    public static Scanner scanner = new Scanner(System.in);
    public static int seatRows, numberOfSeats, rowNumber, seatNumber, totalSeats, frontRows,
            frontHalf, rearHalf, ticketPrice, ticketsPurchased, totalIncome, currentIncome;
    public static boolean wrongSeat = false;
    public static double percentagePurchased;
    public static final double hundred = 100.00;
    public static final int standardPrice = 10;
    public static final int cheapPrice = 8;
    public static boolean exitProgram = false;
    public static String cinemaMenu = """
            1. Show the seats
            2. Buy a ticket
            3. Statistics
            0. Exit
            """;

    public static void main(String[] args) {
        // Write your code here
        getCinemaRows();
        getCinemaSeatsPerRow();
        char[][] seatingMap = new char[seatRows + 1][numberOfSeats + 1];
        populateSeatingMap(seatRows,numberOfSeats, seatingMap);
        calculatePotentialIncome();

        do {
            showMenu();
            menuActions(seatingMap);
        }while (!exitProgram);

    }

    public static int getCinemaRows() {
        System.out.println("Enter the number of rows: ");
        return seatRows = scanner.nextInt();
    }

    public static int getCinemaSeatsPerRow() {
        System.out.println("Enter the number of seats in each row: ");
        return numberOfSeats = scanner.nextInt();
    }

    //got rid of my hardcoded seating map that i had used since they told us it wouldnt be more than 9x9,
    //the following is a better method.
    public static void populateSeatingMap(int rows, int seats, char[][] cinema) {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= seats; j++) {
                if (i == 0 && j == 0) {
                    cinema[i][j] = ' ';
                } else if (i == 0) {
                    cinema[i][j] = (char) ('0' + j); //iterate string numbers on map edge
                } else if (j == 0) {
                    cinema[i][j] = (char) ('0' + i); //iterate string numbers on map edge
                } else {
                    cinema[i][j] = 'S';
                }
            }
        }
    }
    public static void showTheSeats(char[][] cinema) {
        System.out.println("\nCinema:");
        for (int i = 0; i < seatRows + 1; i++) {
            for (int j = 0; j < numberOfSeats + 1; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showMenu() {
        System.out.println();
        System.out.print(cinemaMenu);
    }

    public static int getRowNumber() {
        System.out.println("\nEnter a row number: ");
        return rowNumber = scanner.nextInt();
    }

    public static int getSeatNumber() {
        System.out.println("Enter a seat number in that row: ");
        return seatNumber = scanner.nextInt();
    }
    public static void buyATicket (char[][] cinema) {
        getRowNumber();
        getSeatNumber();

        if (totalSeats > 0) {
            if (rowNumber < 0 || rowNumber > seatRows || seatNumber < 0 || seatNumber > numberOfSeats) {
                wrongSeat = true;
                System.out.println("Wrong input!");
            } else {
                char seatStatus = cinema[rowNumber][seatNumber];
                switch (seatStatus) {
                    case 'S': {
                        wrongSeat = false;
                        if (totalSeats <= 60 || rowNumber <= frontRows) {
                            ticketPrice = standardPrice;
                        } else {
                            ticketPrice = cheapPrice;
                        }
                        ticketsPurchased++;
                        currentIncome += ticketPrice;
                        System.out.println("Ticket price: $" + ticketPrice + "\n");
                        break;
                    }
                    case 'B': {
                        wrongSeat = true;
                        System.out.println("That ticket has already been purchased!");
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }
        }
    }

    public static int calculatePotentialIncome () {
        totalSeats = seatRows * numberOfSeats;
        frontRows = seatRows / 2;
        frontHalf = frontRows * numberOfSeats;
        rearHalf = totalSeats - frontHalf;

        if (totalSeats > 0) {
            if (totalSeats <= 60) {
                totalIncome = totalSeats * standardPrice;
            } else {
                totalIncome = (frontRows * numberOfSeats * standardPrice) + (rearHalf * cheapPrice);
            }
        }
        return totalIncome;
    }

    public static void showStatistics () {
        char pct = '%';
        if (totalSeats == 0) {
            percentagePurchased = 0;
        } else {
            percentagePurchased = (ticketsPurchased * hundred / totalSeats);
        }
        calculatePotentialIncome();
        System.out.printf("""
                Number of purchased tickets: %d
                Percentage: %.2f%c
                Current income: $%d
                Total income: $%d
                """, ticketsPurchased, percentagePurchased, pct, currentIncome, totalIncome);
    }

        public static void bookSeatOnMap (char[][] cinema) {
        if (!wrongSeat) {
            cinema[rowNumber][seatNumber] = 'B';
        }
    }

    public static void menuActions(char[][] cinema) {
        int optionChosen = scanner.nextInt();
        if (optionChosen != 0) {
            switch(optionChosen) {
                case 1: {
                    showTheSeats(cinema);
                    break;
                }
                case 2: {
                    do {
                        buyATicket(cinema);
                        bookSeatOnMap(cinema);
                    } while(wrongSeat);
                    break;
                }
                case 3: {
                    showStatistics();
                }
            }

        } else {
            exitProgram = true;
            return;
        }
    }

}