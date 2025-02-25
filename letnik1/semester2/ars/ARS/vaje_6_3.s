; vaje 6

		.data
		.org 0x400
TAB:	.byte 12, 10, -60, 122, 11
	
		.code
		.org 0x0
		addi r1, r0, #5	; r1 je stevec
FOR:	addi r1, r1, #-1
		lb r3, TAB(r1)
		addi r3, r3, #3
		sb TAB(r1), r3
		bne r1, FOR

		halt