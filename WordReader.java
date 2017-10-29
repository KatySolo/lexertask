package readers;

import jdk.nashorn.internal.parser.Token;

/**
 * Created by KatySolo on 29.10.17.
 */
public class WordReader implements IReadable {

    private final String word;

    public WordReader(String word)
    {
        this.word = word;
    }

    public Token tryReadToken(String input)
    {
        if (input.startsWith(word))
            return new Token("kw", word);
        return null;
    }
}
