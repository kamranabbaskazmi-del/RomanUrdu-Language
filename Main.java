import org.antlr.v4.runtime.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.out.println("Usage: java Main <file.urdu>");
            return;
        }
        
        CharStream input = CharStreams.fromFileName(args[0]);
        RomanUrduLexer lexer = new RomanUrduLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RomanUrduParser parser = new RomanUrduParser(tokens);
        
        System.out.println("\n🚀 Roman Urdu Compiler\n");
        RomanUrduInterpreter interpreter = new RomanUrduInterpreter();
        interpreter.runProgram(parser.program().statement());
        System.out.println("\n✅ Done!\n");
    }
}
