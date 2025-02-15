; vaje 4 naloga 2

	.data
	.org 0x400
A:	.word16 3215
B:	.word16 27189

	.code
	.org 0x0
	lh r1, A(r0)
	lh r2, B(r0)
	slli r3, r2, #1
	slli r4, r3, #1
	add r5, r2, r3
	add r6, r5, r4
	add r7, r6, r1
	srai r8, r7, #3
	sw A(r0), r8
	halt