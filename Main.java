package main;

import jdk.nashorn.internal.parser.Lexer;
import jdk.nashorn.internal.parser.Token;
import readers.IntReader;
import readers.OperationReader;

/**
 * Created by KatySolo on 15.10.17.
 */
public class Main {
    Lexer l = new Lexer();
    l.register(new IntReader());
    l.register(new OperationReader());
    Token[] tok = l.tokenize("2+3");



}
/*
примерно 6 ноября (13 если нет пары
Lexer l = new Lexer()
Token[] tokens = tokenize()
1+2i+(i,i,i)+(1,1,1)+2i+1 = 2+4i+(1+i,1+i,1+i)
написать калькулятор векторов
любые скобки одного типа поддерживаются (отсылка к задачке про скобки)
отсутствие пробелов(заменить пробелы если есть на упстые скобки)
все операции возведения в степень
2 ридера: комплексный и векторный

 */