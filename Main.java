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

/*
Сдавать 23.10.17, она будет использоваться в следующих 
Написать лексический анализатор: 
- есть класс Lexer l = new Lexer() 
- Token[] tokens = l.tokenize(strings s) 
- есть метод register(IReadible) Readable  
 
l.register(new IntReader) 
l.register(new OperationReader) 
Tokern[] tok = l.tokenize("...") 
Пример: 2+3 -> [2, '+', 3] т.к. есть ридер интов и ридер операций 
 
Т.е. применяем ридер к строке, смотрим есть ли в строке ридер, если есть то берем и складываем в токен, если нет, то берем следующий 
(внешний цикл по строке, внутренний по ридерам) 
Если встретили символ, которого нет ридера => некорректное выражение (кидаем ошибку) 
 
В итоге: класс токен, класс лексер, интерфейс IReader (чтоб потом можно было применять лююбые ридеры) т.е. отделить алгоритм лексера от IReader 

Пока что добавить ридер чисел, ридер ключевых слов (boolean, switch, case и т.д.)
*/
