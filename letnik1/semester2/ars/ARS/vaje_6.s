; vaje 6

		.data
		.org 0x400
	
		.code
		.org 0x0
		addi r1, r0, #4
		seqi r2, r1, #5
		beq r2, ELSE
IF:		addi r1, r1, #1
		j NAPREJ(r0)
ELSE:	addi r1, r1, #-1
NAPREJ: halt