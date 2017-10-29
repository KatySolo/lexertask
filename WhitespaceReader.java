package readers;
import jdk.nashorn.internal.parser.Token;

/**
 * Created by KatySolo on 29.10.17.
 */
public class WhitespaceReader implements IReadable {

    public Token tryReadToken(String input)
    {
        int i = 0;
        int len = input.length();
        while (i < len && Character.isWhitespace(input.charAt(i)))
            i++;
        //return new Token("ws", input.substring(0, i));
    }
}
