; vaje 6

			.data
			.org 0x400
MIN:		.space 2
MAX:		.space 2
BIT:		.space 2
NEG:		.space 2
			.org 0x40002000
TAB:		.word16 29, -50, 60, 70, 150, 200, -36, -35, 22, 500, 45, 37, 11, 64, 55
		
			.code
			.org 0x0
			lhi r2, TAB
			addi r2, r2, TAB
			addi r1, r0, #30
			lh r5, 28(r2) ; v r5 je minimum
			lh r7, 28(r2) ; v r7 je maksimum
			addi r11, r0, #0 ; v r11 je stevec bitov
			addi r12, r0, #0 ; v r12 je stevec negativnih
FOR:		addi r1, r1, #-2
			add r4, r2, r1
			lh r3, 0(r4) ; r3 stevilo iz TAB
			sgt r6, r5, r3 ; r6 = 1, ce je r3 min
			beq r6, NAPREJ
			add r5, r0, r3
NAPREJ: 	sgt r8, r3, r7 ; r8 = 1, ce je r3 maks
			beq r8, NAPREJ2
			add r7, r0, r3
NAPREJ2:	andi r9, r3, #9
			seqi r10, r9, #9
			beq r10, NAPREJ3
			addi r11, r11, #1
NAPREJ3:	slti r13, r3, #0
			add r12, r12, r13
			bne r1, FOR
			sh MIN(r0), r5
			sh MAX(r0), r7
			sh BIT(r0), r11
			sh NEG(r0), r12
			halt