public class ValidateQuote
{
    public static boolean validateSyntax(String quote)
    {
        return quote.matches("[A-Z](.*)((\\.|\\?|!)$)");
        //quote starts with a capital letter and ends with some form of punctuation (. ? !)
    }

    public static boolean validateExcitement(String quote)
    {
        return quote.matches("[A-Z](.*)(!$)");
        //quote starts with a capital letter and ends with an exclamation mark
    }

    public static boolean validateComplexity(String quote)
    {
        return quote.matches("[A-Z].*\\.+.*((\\.|\\?|!)$)");
        //quote has a period somewhere in the middle of it, and some type of punctuation at the end
    }

    public static boolean validateBrainRot(String quote)
    {
        return quote.matches("(skibidi|fortnite|vexbolts|tiktok|sigma|rizz|fanum|ohio)+");
        //quote contains a word from the brain rot culture
    }

    public static boolean validateNumbers(String quote)
    {
        return quote.matches("[0-9]+");
        //quote contains a number
    }

    public static boolean validateBoring(String quote)
    {
        return quote.matches("[A-Z]{0}\\.$");
        //quote is all lowercase and contains a period at the end
    }

    public static boolean validateFlashback(String quote)
    {
        return quote.matches("(Back in my day|I remember when|Remember that time)+");
        //quote is some sort of flashback, or is recalling an action/event
    }

    public static boolean validateNoSpaces(String quote)
    {
        return quote.matches("(\\s){0}");
        //quote contains no spaces
    }

    public static boolean validateFiveWs(String quote)
    {
        return quote.matches(".*(Who|What|Where|When|Why).*");
        //quote contains any of the 5 w's (Who, What, Where, When, Why)
    }

    public static boolean validateCliffhanger(String quote)
    {
        return quote.matches("(\\.\\.\\.)$");
        //quote ends with a ...
    }
}

