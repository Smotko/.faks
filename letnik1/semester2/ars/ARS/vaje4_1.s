; vaje 4 naloga 1

		.data
		.org 0x400
STEV1:	.word16 2323
STEV2:	.word16 4343
STEV3:	.byte -127
STEV4:	.byte 6
		.align 4
STEV5:	.word 23456
STEV6:	.word 43210
SUM16:	.space 4
MUL:	.space 4
DIV:	.space 4
SUM:	.space 4
DIF:	.space 4

		.code
		.org 0x0

		lh r1, STEV1(r0)
		lh r2, STEV2(r0)
		addu r3, r1, r2
		sw SUM16(r0), r3
		
		lb r4, STEV3(r0)
		lb r5, STEV4(r0)
		sll r6, r4, r5
		sw MUL(r0), r3

		srai r7, r4, #5
		sw DIV(r0), r7

		lw r8, STEV5(r0)
		lw r9, STEV6(r0)
		add r10, r8, r9
		sw SUM(r0), r10

		sub r11, r9, r8
		sw DIF(r0), r11
		halt
