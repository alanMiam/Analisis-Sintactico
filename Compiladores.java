package compiladores;

public class Compiladores {

    public static void main(String[] args) throws Exception {
       try{
           generarLexer();
       }catch(Exception e){
           throw new Exception("Error al generar Lexer");
       }
    }
    
    public static void generarLexer() throws Exception{
        String[] ruta = {"C:\\Users\\PC\\Documents\\NetBeansProjects\\compiladores\\src\\compiladores\\lex.flex"};
        try{
            jflex.Main.generate(ruta);
        }catch(Exception e){
            throw new Exception("Error al crear archivo Lexer.java");
        }
    
    }
}    
