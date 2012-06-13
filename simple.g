grammar simple;

options{
	backtrack=true;
	output=AST;
	ASTLabelType=CommonTree;
}

tokens{
	ABCS;
}

simple: abc*->^(ABCS<AbcNode> abc*);
abc: A B C->^(B<BNode> A  C);
A:'a';
B:'b';
C:'c';
N:'\n';
