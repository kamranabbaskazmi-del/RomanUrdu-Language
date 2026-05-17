import java.util.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class RomanUrduInterpreter {
    private Map<String, Integer> vars = new HashMap<>();
    private Map<String, String> strVars = new HashMap<>();
    
    public void runProgram(List<RomanUrduParser.StatementContext> statements) {
        for (RomanUrduParser.StatementContext stmt : statements) {
            runStatement(stmt);
        }
    }
    
    private void runStatement(RomanUrduParser.StatementContext stmt) {
        if (stmt.varDecl() != null) {
            String name = stmt.varDecl().ID().getText();
            Object val = evalObj(stmt.varDecl().expr());
            if (val instanceof Integer) {
                vars.put(name, (Integer) val);
                System.out.println("✓ " + name + " = " + val);
            } else {
                strVars.put(name, (String) val);
                System.out.println("✓ " + name + " = \"" + val + "\"");
            }
        }
        else if (stmt.printStmt() != null) {
            Object val = evalObj(stmt.printStmt().expr());
            System.out.println("> " + val);
        }
        else if (stmt.whileStmt() != null) {
            while (eval(stmt.whileStmt().expr()) == 1) {
                runStatementList(stmt.whileStmt().block().statement());
            }
        }
        else if (stmt.forStmt() != null) {
            String varName = stmt.forStmt().ID().getText();
            int start = eval(stmt.forStmt().expr(0));
            int end = eval(stmt.forStmt().expr(1));
            for (int i = start; i <= end; i++) {
                vars.put(varName, i);
                runStatementList(stmt.forStmt().block().statement());
            }
        }
        else if (stmt.ifStmt() != null) {
            int cond = eval(stmt.ifStmt().expr());
            if (cond == 1) {
                runStatementList(stmt.ifStmt().block(0).statement());
            } else if (stmt.ifStmt().block().size() > 1) {
                runStatementList(stmt.ifStmt().block(1).statement());
            }
        }
    }
    
    private void runStatementList(List<RomanUrduParser.StatementContext> statements) {
        for (RomanUrduParser.StatementContext stmt : statements) {
            runStatement(stmt);
        }
    }
    
    private Object evalObj(RomanUrduParser.ExprContext ctx) {
        if (ctx.STRING() != null) {
            String s = ctx.STRING().getText();
            return s.substring(1, s.length() - 1);
        }
        if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        }
        if (ctx.ID() != null) {
            String name = ctx.ID().getText();
            if (strVars.containsKey(name)) return strVars.get(name);
            return vars.getOrDefault(name, 0);
        }
        if (ctx.getChildCount() == 3) {
            int left = eval(ctx.expr(0));
            int right = eval(ctx.expr(1));
            String op = ctx.getChild(1).getText();
            switch(op) {
                case "+": return left + right;
                case "-": return left - right;
                case "*": return left * right;
                case "/": return left / right;
                case ">": return left > right ? 1 : 0;
                case "<": return left < right ? 1 : 0;
                case ">=": return left >= right ? 1 : 0;
                case "<=": return left <= right ? 1 : 0;
                case "==": return left == right ? 1 : 0;
                case "!=": return left != right ? 1 : 0;
                default: return 0;
            }
        }
        return 0;
    }
    
    private int eval(RomanUrduParser.ExprContext ctx) {
        Object val = evalObj(ctx);
        return (val instanceof Integer) ? (Integer) val : 0;
    }
}
