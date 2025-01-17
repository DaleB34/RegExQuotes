public class Main {
    public static void main(String[] args)
    {
        String syntax1 = "Just Do It.";
        String syntax2 = "Live, Laugh, Love";
        String syntax3 = "And the Skibidi said. Let There Be Toilet.";
        String syntax4 = "just do it?";
        String syntax5 = "If idiots could fly, this place would be an airport.";
        String syntax6 = "this is a not quote!";
        String syntax7 = "This might be a quote.";

        String[] syntax = {syntax1,syntax2,syntax3,syntax4,syntax5,syntax6,syntax7};

        int count = 1;
        for(String s : syntax)
        {
            System.out.println("Quote " + count + " valid: " + ValidateQuote.validateComplexity(s));
            count++;
        }


    }
}