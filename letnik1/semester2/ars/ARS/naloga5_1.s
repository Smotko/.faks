; vaje 5 naloga 5.1

		.data
		.org 0x40001000
TAB:	.byte 17, 9, 20, 7, 1
VEC:	.byte 0
BIT:	.byte 0

		.code
		.org 0x0
		lhi r1, TAB
		addui r1, r1, TAB
		lb r2, 0(r1)
		lhi r1, TAB + 1
		addui r1, r1, TAB + 1
		lb r3, 0(r1)
		lhi r1, TAB + 2
		addui r1, r1, TAB + 2
		lb r4, 0(r1)
		lhi r1, TAB + 3
		addui r1, r1, TAB + 3
		lb r5, 0(r1)
		lhi r1, TAB + 4
		addui r1, r1, TAB + 4
		lb r6, 0(r1)

		sgti r7, r2, #10
		add r8, r0, r7
		sgti r7, r3, #10
		add r8, r8, r7
		sgti r7, r4, #10
		add r8, r8, r7
		sgti r7, r5, #10
		add r8, r8, r7
		sgti r7, r6, #10
		add r8, r8, r7
		lhi r1, VEC
		addui r1, r1, VEC
		sb 0(r1), r8

		andi r9, r2, #20
		sgti r10, r9, #0
		add r11, r0, r10
		andi r9, r3, #20
		sgti r10, r9, #0
		add r11, r11, r10
		andi r9, r4, #20
		sgti r10, r9, #0
		add r11, r11, r10
		andi r9, r5, #20
		sgti r10, r9, #0
		add r11, r11, r10
		andi r9, r6, #20
		sgti r10, r9, #0
		add r11, r11, r10
		lhi r1, BIT
		addui r1, r1, BIT
		sb 0(r1), r11


		halt