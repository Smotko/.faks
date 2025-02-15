		.data
		.org 0x400
MIN:	.space 2
MAX:	.space 2
BIT:	.space 1
NEG:	.space 1
		.align 4

		.data
		.org 0x40002000
TAB:	.word16 29,-50,60,70,150,200,-36,-35,22,500,45,37,11,64,55

		.code
		.org 0
		
		; r3 -> stevec
		
		; r5 -> MIN
		; r6 -> MAX
		; r7 -> stevilo, ki ima bit 0 in bit 3 enak 1
		; r8 -> stevilo negativnih stevil
		
				
		lhi r1,TAB
		addui r1,r1,TAB
		lh r2, 0(r1)
		addui r3,r0,15		; stevilo elementov
			

		add r5,r0,r2		; nastavi MIN na prvi element
		add r6,r0,r2		; nastavi MAX na prvi element
		add r7,r0,r0		; nastavi stevilo bit0 = bit1 =1 na 0
		add r8,r0,r0		; nastavi stevilo neg na 0
		
ZANKA:	slt r4,r2,r0		; preveri ce je negativno
		beq r4,NOTNEG
		addui r8,r8,1

NOTNEG:	slt r4,r2,r5		; preveri ce je manjse od trenutno najmanjsega
		beq r4,NOTMIN
		add r5,r2,r0

NOTMIN:	sgt r4,r2,r6		; preveri ce je vecje od trenutno najvecjega
		beq r4,BITS
		add	r6,r2,r0

BITS:	andi r4,r2,9		; and z bitoma 0 in 3 (desetisko 9)
		seqi r4,r4,9		; ce dobimo 9, sta bila nastavljena, sicer ne
		beq r4,NEXT
		addui r7,r7,1
		
NEXT:	subi r3,r3,1
		beq	r3,END
		addui r1,r1,2
		lh r2,0(r1)
		j ZANKA(r0)				
		
END:	sh MIN(r0),r5
		sh MAX(r0),r6
		sb BIT(r0),r7
		sb NEG(r0),r8
		halt










		
		
		
