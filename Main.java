public class Main {
    public static void main(String[] args) {
        String titleOne = "harry pot";
        String authorOne = "roger B";
        int numberPagesOne = 1;
        int publicationYearOne = 1999;
        boolean isReadedOne = true;

        System.out.println("Hello world!");

        System.out.println(titleOne + " write by " + authorOne + " in " + publicationYearOne +
                " and contains " + numberPagesOne + " pages , is readed ? " + isReadedOne);

        String titletTwo = "lord roger";
        String authorTwo = "harry bat";
        int numberPagesTwo = 2;
        int publicationYearTwo = 1997;
        boolean isReadedTwo = false;

        System.out.println(titletTwo + " write by " + authorTwo + " in " + publicationYearTwo +
                " and contains " + numberPagesTwo + " pages , is readed ? " + isReadedTwo);

        String titleThree = "GAMES OF K";
        String authorThree = "ERICK G";
        int numberPagesThree = 3;
        int publicationYearThree = 1995;


        boolean isReadedThree = true;

        System.out.println(titleThree + " write by " + authorThree + " in " + publicationYearThree +
                " and contains " + numberPagesThree + " pages , is readed ? " + isReadedThree);

        int total = numberPagesThree + numberPagesTwo + numberPagesOne;
        int NUMBER_OF_BOOKS = 3;
        int totalYear = publicationYearOne + publicationYearTwo + publicationYearThree;
        System.out.println("total pages : " +  total  );
        System.out.println("average year : " +  totalYear/NUMBER_OF_BOOKS  );

    }
}
