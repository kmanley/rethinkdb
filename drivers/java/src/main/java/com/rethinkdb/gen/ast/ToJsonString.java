// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.exc.ReqlDriverError;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class ToJsonString extends ReqlExpr {


    public ToJsonString(Object arg) {
        this(new Arguments(arg), null);
    }
    public ToJsonString(Arguments args){
        this(args, null);
    }
    public ToJsonString(Arguments args, OptArgs optargs) {
        this(TermType.TO_JSON_STRING, args, optargs);
    }
    protected ToJsonString(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}