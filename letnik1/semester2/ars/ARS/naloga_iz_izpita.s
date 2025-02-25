		.data
		.org 0x600
		.align 1
A: 		.byte 0x99, 0xEE, 0xCC
		.align 2
X: 		.word16 0xCA00
Y: 		.word16 0x00FE 
Z: 		.space 2
		.align 4
STEV1:	.word STEV1
C: 		.word 0xFFFF1111
D: 		.word 0x1111FFFF
		.org 0x40001234
TAB:	.word16 99, 100, 101, 102
		.text
		.org 0x0
		lb r1, A+1(r0)
		sh Z(r0), r1
		lh r2, X(r0)
		lh r3, Y(r0)
		addu r2,r2,r3
		xori r2,r2,0xCAFE 	;takojšnji operand se razširi
							;kot predznačeno število
		sw X(r0), r2
		lw r4,STEV1(r0)
		addui r4, r4, 4
		lw r5, 0(r4)
		lw r6, 4(r4)
		slt r7, r5, r6

		lhi r8, TAB+4
		addui r8, r8, TAB+4
		sh 0(r8), r7
		halt