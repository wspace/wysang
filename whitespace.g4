grammar whitespace;
file 	: func+ ;

func	: push|copy|pop|copynth|swicth|slide
		|add|sub|mult|div|mod
		|mark|call|jump|jumpz|jumpn|ends|endp
		|outchar|outnum|readchar|readnum
		;
		
push:stack ' ' parameter;
copy:stack '\n' ' ';
pop:stack '\n' '\n';
copynth:stack '\t' ' ' parameter;
swicth:stack '\n' '\t';
slide:stack '\t' '\n' parameter;

add:arithm ' ' ' ';
sub:arithm ' ' '\t';
mult:arithm ' ' '\n';
div:arithm '\t' ' ';
mod:arithm ' ' ' ';

mark:flow ' ' ' ' parameter;
call:flow ' ' '\t' parameter;
jump:flow ' ' '\n' parameter;
jumpz:flow '\t' ' ' parameter;
jumpn:flow '\t' '\t' parameter;
ends:flow '\t' '\n';
endp:flow '\n' '\n';

outchar:io ' ' ' ';
outnum:io ' ' '\t';
readchar:io '\t' ' ';
readnum:io '\t' '\t';

stack:' ';
arithm:'\t' ' ';
flow:'\n';
io:'\t' '\n';

parameter:(' '|'\t')*'\n';

ENTER: ~[' '\n\t] -> skip;