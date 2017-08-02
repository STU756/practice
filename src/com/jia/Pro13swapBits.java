package com.jia;

public class Pro13swapBits {
	public static Byte swapBits(byte x) {
		return (byte)((x & 0xf0)>>4|(x&0x0f)<<4);
	}
	
}
