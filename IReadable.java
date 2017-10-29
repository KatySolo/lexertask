package readers;

import jdk.nashorn.internal.parser.Token;

/**
 * Created by KatySolo on 15.10.17.
 */
public interface IReadable {
    Token tryReadToken (String s);
}
