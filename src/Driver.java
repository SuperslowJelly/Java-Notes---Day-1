/*

    ### Variables
    A variable is 'a way to store information', stored in memory and therefore faster to retrieve, but is wiped on ram shutdown.
    Java variables are 'strictly typed', therefore having a specific category that it can be put into.
    Other languages have generic variables like 'var', whereas java does not have this, and variables must belong to a type.
    Each variable type requires more or less memory. E.g. a bool stores one bit, whereas an integer takes a lot more.

    ### Primitives vs Objects
    Two types of variables: primitives and objects.
    Primitives are 'simple', representing numbers, characters, or symbols.
    They are very efficient and don't use much in terms of resources.
    E.g. integers, doubles, floats, booleans, etc.
    Objects represent complex ideas, and are bigger/bulkier. However, they can portray more complicated concepts.
    For example, a person has many attributes, like height in a number, weight in a number, a list of things they like to eat like an array of strings.
    These objects can contain other objects, which is called an 'aggregate', similar to a nesting doll.

    ### Characters
    A character represents a single character in unicode, which is a standard that bases characters across multiple characters.
    It represents all the languages in the world, plus special characters, plus emojis, as numbers. E.g. A = 65, and division symbol = '\u00F7'.

    ### Strings
    Strings represent blocks of text data, and have a large size.
    They're technically classified as 'objects', not primitives.
    In this context, a string is an array of characters which is handled by the compiler.
    This means that strings have methods, such as comparisons, capitalisation, replacements, etc.
    A string is 'null' by default. This means that they have no value. However, they are not 'empty', but are not 0.

    ### Casting
    Variables can re-assigned at any time, however they must be the same type.
    If we'd like to put a different type of data in a variable, we can use the concept of 'casting'.
    This is the process of transforming data into a different type. However, it can only be done with a few combinations of variables.
    Different variables have different sizes, so a small variable can be cast to a larger variable (widening cast), but larger variables must be cropped when cast to a smaller variable (narrowing cast).
    When widen-casting, java will round the value down automatically if there's a decimal place.
    Certain variables cannot be casted. Such as a string to an integer, or a boolean to an integer, since it doesn't make sense.
    Some variables do not need to be changed, these are called 'constants'. The keyword for a constant is 'final'.
    The 'final' keyword means that the variable cannot be edited ever by anyone. If you have a constant, it should be named in all caps.

    ### Naming Conventions
    The standard convention is called 'camelCase'. E.g. 'exampleOfACamelCase'.
    Each successive word is capitalised, but the first letter is not.

    ### Strings
    Some characters within strings are 'special'. These are referred to as 'escape characters'.
    "" and '' cannot usually be ignored. An escape character: '\', is used to tell the compiler to 'ignore' the following character.
    When \ is used before certain characters, it can result in a special instruction. For example, '\n' results in a newline, '\t' results in a tab forwards, '\b' sends the pointer to the back by 1 in the text.
    When outputting text to the console, the difference between 'println', and 'print' is that 'println' will add a new line to the text, whereas 'print' will not.

    ### Resources
    Java data types: https://www.w3schools.com/java/java_data_types.asp (ctrl+click to open link from within IntelliJ)

 */

public class Driver {

    public static void main(String[] args) {
        // byte dumbass = 128; // Note that this line will be underlined in red, as 128 is over the max value of a byte.
        byte myByte = 10;
        System.out.println(myByte);

        // short smallVariable = 34000; // Note that this line will be underlined in red, as 34000 is over the max value of a byte.
        short myShort = 32_000; // Note that there's an underscore, underscores are ignored in java, which is incredibly helpful when working with long numbers.
        System.out.println(myShort);

        // long longVariable = 34000000000; // Note that this line will be underlined in red, as 34000 is read as an int, as there is no L at the end.
        long myLong = 32_000_000L; // The L identifies the number as a long, not an integer.
        System.out.println(myLong);

        // float decimal = 10.056; // Note that this is errored, by default all decimals in java are doubles. This means it needs an F to tell java it's a float.
        float myFloat = 10.056F; // The F identifies the number as a float. Because of this, doubles are more often used.
        System.out.println(myFloat);

        double myDouble = 10.056; // Doubles are generally used more commonly than the above floats, and do not require a special connotation.
        System.out.println(myDouble);

        boolean myBool = false;
        System.out.println(myBool);

        char myChar1 = 'A'; // Char takes an input of a single quote, not a double quote.
        char myChar2 = 65; // Char can also take the unicode for the character as input. However, 65 is also the same in unicode as ASCII, meaning many characters are cross-compatible.
        char myChar3 = '\u1708'; // Char takes an input of a unicode code too.
        System.out.println(myChar1);
        System.out.println(myChar2);
        System.out.println(myChar3);

        int myInt2; // Variables can also be declared without an initial value, however they will not have been 'initialised'. Meaning they cannot be used until they have been given a value.

        // Note that this document is annotated by blocks of text labelled with '//'. These are comments, which are not recognised by the compiler, but can be useful for adding context to your code.
        /*

            Block comments can also be used, so that a //
            is not necessary.

         */

        final int MY_CONSTANT_INT = 10; // Example usage of a constant, note that the name is in all caps.
        System.out.println(MY_CONSTANT_INT);

        String myString1 = "Hello, world!"; // Note that the beginning of 'String' is capitalised. This is because string is an object, not a primitive. Objects have a variety of methods, which add extra functionalities to work with strings.
        String myString2 = new String("This is an alternate method of defining a string.");
        String myString3 = "Line 1\nLine 2\bA"; // Note that 'Line 2' is replaced with 'Line A' because of the '\b' before 'A'.
        String myString4 = "This is a quote: \"FTB Master Race.\""; // Note that the "" are printed due to the backslash.
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString3);
        System.out.println(myString4);

        String greeting = "Hello, ";
        String myName = "Chae";
        System.out.println(greeting + myName); // Note that strings can be combined when used.

        String placeholder = "We have the number, ";
        System.out.println(placeholder + 10 + 20 + 30); // Note that strings can also be combined with integers.
        System.out.println(10 + 20 + 30 + placeholder + 10 + 20 + 30); // However, note that java will treat numbers mathematically when included first, until a string is included, at which point it's a string thereon after.

        String first = "first";
        String second = "second";
        String third = "third";
        System.out.print(first);
        System.out.print(second + "\n");
        System.out.print(third);
        // Note that the above prints do not add a new line, this demonstrates the difference between println and print. However, an escape character can be used to force print to recognise a new line, shown on the second line.
        System.out.print(first + "\n" + second + "\n" + third); // Note that this is a much easy method for doing the above.
    }

}
