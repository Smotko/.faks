;Vaja03 primer load/store
	.data
	.org 0x400
A: 	.byte 96
B: 	.byte 0x05
	.align 4
C: 	.space 4
D: 	.word16 -16
	.code
	.org 0x0
	lb r1, 0x400(r0)
	sb 0x406(r0), r1
	sb C(r0), r1
	sb C+1(r0), r1
	lb r2, 0x401(r0)
	sb C(r2), r0
	lh r3, D(r0)
	sw A(r0), r3
	lbu r1, B(r0)
	sh C(r0), r1
	lw r3, C(r0)
	halt
