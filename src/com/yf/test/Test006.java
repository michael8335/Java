package com.yf.test;

public class Test006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte a[] = new byte[4];
		a[0] = 'a';
		a[3] = 'b';
		int keep = 0;
		int byteLength = a.length;
		for (keep = 0; keep < byteLength && a[keep] == 0; keep++);
		System.out.println("test");
		 int intLength = ((byteLength - keep) + 3) >>> 2;
			int[] result = new int[intLength];
		        int b = byteLength - 1;
		        for (int i = intLength-1; i >= 0; i--) {
		            result[i] = a[b--] & 0xff;
		            int bytesRemaining = b - keep + 1;
		            int bytesToTransfer = Math.min(3, bytesRemaining);
		            for (int j=8; j <= (bytesToTransfer << 3); j += 8)
		                result[i] |= ((a[b--] & 0xff) << j);
		        }
		        int capacity = 1;
		        System.out.println(capacity<<=1);

	}

}
