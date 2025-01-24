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
        System.out.println();

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
        System.out.println();


        String complexity1 = "The fake is of far greater value. In its deliberate attempt to be real, it's more real than the real thing.";
        String complexity2 = "Because my time is limited, I don't have any time to waste hesitating. That is why I can walk straight ahead. That is why I never stop.";
        String complexity3 = "Poi!";
        String complexity4 = "It's alright to feel sad. When you're sad, you should experience that sorrow fully. It's not too late to move on after that.";
        String complexity5 = "Just Do It.";
        String complexity6 = "The longest word in the english dictionary is pneumonoultramicroscopicsilicovolcanoconiosis";
        String complexity7 = "I didn't even know we had a Coco at our school.";

        String[] complexity = {complexity1, complexity2, complexity3, complexity4, complexity5, complexity6, complexity7};
        count = 1;

        for(String s : complexity)
        {
            System.out.println("Quote " + count + " complexity valid: " + ValidateQuote.validateComplexity(s));
            count++;
        }
        System.out.println();

        String brainrot1 = "People die when they are killed.";
        String brainrot2 = "And the Skibidi said, let there be toilet!";
        String brainrot3 = "I play Pokemon Go, every day!";
        String brainrot4 = "Mass Vexbolts unfollowing December 31, 11:59 P.M.";
        String brainrot5 = "I am the Rizz master.";
        String brainrot6 = "The 17th state in the United States.";
        String brainrot7 = "Ohio!";

        String[] brainrot = {brainrot1, brainrot2, brainrot3, brainrot4, brainrot5, brainrot6, brainrot7};
        count = 1;

        for(String s : brainrot)
        {
            System.out.println("Quote " + count + " brain rot valid: " + ValidateQuote.validateBrainRot(s));
            count++;
        }
        System.out.println();


        String numbers1 = "Why was 6 afraid of 7?";
        String numbers2 = "Because seven ate nine!";
        String numbers3 = "Just Do It.";
        String numbers4 = "One Two, skip a few, a hundred!";
        String numbers5 = "28 stab wounds!";
        String numbers6 = "My favorite number is 3.14159265358979.";
        String numbers7 = "I have 0 idea what you're talking about.";

        String[] numbers = {numbers1, numbers2, numbers3, numbers4, numbers5, numbers6, numbers7};
        count = 1;

        for(String s : numbers)
        {
            System.out.println("Quote " + count + " numbers valid: " + ValidateQuote.validateNumbers(s));
            count++;
        }
        System.out.println();


        String boring1 = "k.";
        String boring2 = "people die when they are killed.";
        String boring3 = "Houston, we have a problem.";
        String boring4 = "do you ever feel like a plastic bag floating in the wind?";
        String boring5 = "oLD MCDONALD HAD A FARM.";
        String boring6 = "that last quote... wasn't that interesting.";
        String boring7 = "Playing a game by yourself is boring. You need a loser to crush so badly they can't recover.";

        String[] boring = {boring1, boring2, boring3, boring4, boring5, boring6, boring7};
        count = 1;

        for(String s : boring)
        {
            System.out.println("Quote " + count + " boring valid: " + ValidateQuote.validateBoring(s));
            count++;
        }
        System.out.println();


        String fb1 = "Back in my day, when I had to go to school and come back home, I had to walk uphill both ways.";
        String fb2 = "Hey Lois. Remember that time when I...";
        String fb3 = "Hey you, you're finally awake. You were trying to cross the border?";
        String fb4 = "I can't remember anything from last night!";
        String fb5 = "I remember when now happened!";
        String fb6 = "Way back when, I... forgot.";
        String fb7 = "I don't even like flashbacks. Why? Remember that time I...";

        String[] fb = {fb1, fb2, fb3, fb4, fb5, fb6, fb7};
        count = 1;

        for(String s : fb)
        {
            System.out.println("Quote " + count + " flashback valid: " + ValidateQuote.validateFlashback(s));
            count++;
        }
        System.out.println();


        String space1 = "Supercalifragilisticexpialidocious!";
        String space2 = "idontknowwhatquotetoputhere";
        String space3 = "Just Do It.";
        String space4 = "There's no more space in here!";
        String space5 = "NowThere'sReallyNoSpaceInhere!";
        String space6 = "I play Pokemon Go, everyday!";
        String space7 = "LETMEOUTLETMEOUTLETMEOUT";

        String[] space = {space1, space2, space3, space4, space5, space6, space7};
        count = 1;

        for(String s : space)
        {
            System.out.println("Quote " + count + " spaces valid: " + ValidateQuote.validateHasSpaces(s));
            count++;
        }
        System.out.println();


        String w1 = "What's up with airline food?";
        String w2 = "Why would I ever let you in here?";
        String w3 = "Who's Coco?";
        String w4 = "I didn't even know we had a Coco at our school.";
        String w5 = "Where's Coco? Let me see if they exist";
        String w6 = "Why is their name even Coco?";
        String w7 = "How is Coco even a real person?";

        String[] ws = {w1,w2,w3,w4,w5,w6,w7};
        count = 1;

        for(String s : ws)
        {
            System.out.println("Quote " + count + " five w's valid: " + ValidateQuote.validateFiveWs(s));
            count++;
        }
        System.out.println();


        String cliff1 = "The ending to One Piece is...";
        String cliff2 = "What is that cinematic device they use in shows and movies to leave people on the edge of their seat, waiting for more?";
        String cliff3 = "Oh yeah, it was cliffhan...";
        String cliff4 = "Just Do It.";
        String cliff5 = "The reason I keep using the Nike quote is because...";
        String cliff6 = "O Gang! Let's GOOOOO!";
        String cliff7 = "Red Light! Green Light! Skibidi Light!";

        String[] cliff = {cliff1, cliff2, cliff3, cliff4, cliff5, cliff6, cliff7};
        count = 1;

        for(String s : cliff)
        {
            System.out.println("Quote " + count + " cliffhanger valid: " + ValidateQuote.validateCliffhanger(s));
            count++;
        }

    }
}