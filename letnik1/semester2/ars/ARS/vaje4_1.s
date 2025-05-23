.data
i:.byte 0x01, 0x02, 0x03, 0x04
j:.word 0x01020304
p:.word 0x400
.text
    li x10, 4
Zanka:
    addi x10, x10, -1
    lb x11, i(x10)
    lb x12, j(x10)
    bne x10, x0, Zanka

