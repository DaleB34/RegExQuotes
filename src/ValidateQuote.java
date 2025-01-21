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
        //quote has letters in it and ends with an exclamation mark
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

}
