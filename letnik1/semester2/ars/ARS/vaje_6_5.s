; vaje 6

			.data
			.org 0x400
A:			.byte 15
B:			.byte 6
P:			.space 2
		
			.code
			.org 0x0
			lbu r1, A(r0)
			lbu r2, B(r0) ; B bo stevec
			sgt r5, r2, r1
			bne r5, BVECJI
			add r6, r0, r2
			add r7, r0, r1
			add r1, r0, r6
			add r2, r0, r7
BVECJI:		addi r4, r0, #0 ; v r4 sestevamo

FOR:		seqi r3, r2, #0
			bne r3, KONEC
			add r4, r4, r1
			addi r2, r2, #-1
			j FOR(r0)
	
KONEC:		sh P(r0), r4
			halt