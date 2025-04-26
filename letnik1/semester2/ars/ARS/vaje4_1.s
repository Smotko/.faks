.data # 0x400
TAB:    .byte 17, 11, 20, 7, 8
MAX:    .byte 0
DEC:    .byte 0
BIT:    .byte 0

        .text
        addi x4, x0, 5    # dolzina polja
        addi x2, x0, 0    # max
        addi x10, x0, 10
        addi x5, x0, 0    # koliko st. je vecjih od 10
        addi x7, x0, 0    # koliko jih ima  b3=0 in b1=0
        addi x3, x0, TAB
LOOP:   lb x1, 0(x3)
        blt x1, x2, MANJSI  # x1 < max
        add x2, x0, x1      # max <- x1
MANJSI: bge x10, x1, LE_10    # if (x1 < 10) -> LE_10
        addi x5, x5, 1    
LE_10:  andi x6, x1, 0x00a    # 0000 0000 1010 (maska)
        addi x8, x0, 0x00a
        beq x6, x8, b3_b1_1
        addi x7, x7, 1
b3_b1_1:addi x3, x3, 1
        addi x4, x4, -1
        blt x0, x4, LOOP
        sb x2, MAX(x30)
        sb x5, DEC(x30)
        sb x7, BIT(x30)

 