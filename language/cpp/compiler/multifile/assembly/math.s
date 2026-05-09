	.build_version macos, 26, 0	sdk_version 26, 4
	.section	__TEXT,__text,regular,pure_instructions
	.globl	__Z6tambahii                    ; -- Begin function _Z6tambahii
	.p2align	2
__Z6tambahii:                           ; @_Z6tambahii
	.cfi_startproc
; %bb.0:
	sub	sp, sp, #16
	.cfi_def_cfa_offset 16
	str	w0, [sp, #12]
	str	w1, [sp, #8]
	ldr	w8, [sp, #12]
	ldr	w9, [sp, #8]
	add	w0, w8, w9
	add	sp, sp, #16
	ret
	.cfi_endproc
                                        ; -- End function
.subsections_via_symbols
