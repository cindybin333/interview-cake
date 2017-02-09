package io.github.cindybin333;

//check to see if code contains valid parentheses/brackets

import java.util.Stack;

public class CodeValidator {

    public static boolean isValidCode(String code) {
        int braces = 0;
        int brackets = 0;
        int parens = 0;
        Stack<String> expectedNext = new Stack<>();

        if (code.length() <= 0) return true;

        String[] codeAry = code.split("");
        for (String aCodeAry : codeAry) {
            switch (aCodeAry) {
                case "{":
                    braces++;
                    expectedNext.push("}");
                    break;
                case "}":
                    if (expectedNext.pop().equals("}"))
                        braces--;
                    else return false;
                    break;
                case "[":
                    brackets++;
                    expectedNext.push("]");
                    break;
                case "]":
                    if (expectedNext.pop().equals("]"))
                        brackets--;
                    else return false;
                    break;
                case "(":
                    parens++;
                    expectedNext.push(")");
                    break;
                case ")":
                    if (expectedNext.pop().equals(")"))
                        parens--;
                    else return false;
                    break;
            }
        }

        return braces + brackets + parens == 0;
    }
}
