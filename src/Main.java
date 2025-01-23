public class Main {
    public static void main(String[] args)
    {
        String syntax1 = "Just Do It.";
        String syntax2 = "Live, Laugh, Love";
        String syntax3 = "And the Skibidi said. Let There Be Toilet.";
        String syntax4 = "just do it?";
        String syntax5 = "If idiots could fly, this place would be an airport.";
        String syntax6 = "this is a not quote!";
        String syntax7 = "This might be a quote?";

        String[] syntax = {syntax1,syntax2,syntax3,syntax4,syntax5,syntax6,syntax7};

        int count = 1;
        for(String s : syntax)
        {
            System.out.println("Quote " + count + " syntax valid: " + ValidateQuote.validateSyntax(s));
            count++;
        }

        String excitement1 = "Just Do It!";
        String excitement2 = "Just Do It.";
        String excitement3 = "Why are we even here?";
        String excitement4 = "LET ME OUT LET ME OUT LET ME OUT!";
        String excitement5 = "Bonsai!";
        String excitement6 = "Power isn't determined by your size, but the size of your heart and dreams!";
        String excitement7 = "What's better than 24? 25!";

        String[] excitement = {excitement1, excitement2, excitement3, excitement4, excitement5, excitement6, excitement7};
        count = 1;

        for(String s : excitement)
        {
            System.out.println("Quote " + count + " excitement valid: " + ValidateQuote.validateExcitement(s));
            count++;
        }





    }
}