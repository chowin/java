package encoding.io;

import java.io.UnsupportedEncodingException;

public class encodingdemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String str="我爱慕课网abc";
		System.out.println("utf-8:");
		byte [] bytes=str.getBytes();
		for(byte b:bytes)
		{
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		System.out.println("gbk:");
		byte [] bytes1=str.getBytes("gbk");
		for(byte b:bytes1)
		{
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		byte [] bytes2=str.getBytes("utf-16be");
		System.out.println();
		System.out.println("utf-16be:");
		for(byte b:bytes2)
		{
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		String str1=new String(bytes2,"utf-16be");
		System.out.println(str1);
	}

}
