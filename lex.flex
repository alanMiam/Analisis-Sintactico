package compiladores;
import static compiladores.Tokens.*;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
simbolo =[\°,\',\",\ñ]+
lugar= ([a-zA-Z]+\,)+(\s\d{1,3}\°\s\d{1,3}\'\s\d{1,3}\"(N|S|E|O|W){1}\,)+(\s\d{1,3}\°\s\d{1,3}\'\s\d{1,3}\"(N|S|E|O|W){1}\,)+(\s(true|false))
compa= ([a-zA-Z]+\,)+(\s[a-zA-Z]+\,)+(\s[a-zA-Z]+\,)+(\s\d{2}+\,)+(\s(femenino|masculino)\,)+(\s(true|false))
equipo=([a-zA-Z]+\,)+(\s\d{2}+\,)+(\s\d+\,)+(\s(true|false))
%{
    public String lexeme;
%}
%%
int|
if|
else|
while {lexeme=yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
{simbolo} {/*Ignore*/}
{lugar} {lexeme=yytext(); return Lugar;}
{compa} {lexeme=yytext(); return Compañero;}
{equipo} {lexeme=yytext(); return Liguilla_mx;}
. {return ERROR;}
