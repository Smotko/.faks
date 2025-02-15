; vaje 6

		.data
		.org 0x400
TAB:	.byte 12, 10, -60, 122, 11
	
		.code
		.org 0x0
		addi r1, r0, #0	; r1 je stevec
FOR:	seqi r2, r1, #5
		bne r2, KONEC
		lb r3, TAB(r1)
		addi r3, r3, #3
		sb TAB(r1), r3
		addi r1, r1, #1
		j FOR(r0)

KONEC:	halt