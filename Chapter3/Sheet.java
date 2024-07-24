package Chapter3;

import Chapter3.Sheet;

/*
Mexico, and the United States) follow the ISO 216 standard for paper sizes. An A0 sheet has dimensions 841 × 1189 millimeters. An A1 sheet is obtained by cutting an A0 sheet in half along the larger dimension, yielding a 594 × 841 sheet. An A2 sheet is obtained by cutting it in half again, yielding a 420 × 594 sheet, and so on. Implement a class Sheet whose constructor makes an A0 sheet. Provide a method cutInHalf that yields a Sheet object of half the size. Also provide methods width, height, and name, returning the width and height in millimeters, as well as the name (such as "A2").
*/

public class Sheet {

	private static final int A0_PAPER_INIT = 0;
	private static final int A0_PAPER_HEIGHT = 1189;
	private static final int A0_PAPER_WIDTH = 841;

	private int name;
	private int width;
	private int height;


	public Sheet() {
		name = A0_PAPER_INIT;
		height = A0_PAPER_HEIGHT;
		width = A0_PAPER_WIDTH;
	}
	
	public void cutInHalf() {
		int cutSwap = Math.min(height, width);
		width = Math.max(height, width) / 2;
		height = cutSwap;
		name++;
		
		System.out.println("CUT HALF");
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
	  return width;
	}
	
	public String getName() {
	  return "A" + name;
	}
	
	public void print() {
		String text = "Name: "+ getName() +", Dimension: "+ getWidth() +" x "+ getHeight();
		
		System.out.println(text);
	}

  public static void main(String[] args) {
		Sheet sh = new Sheet();
		sh.print();
		
		sh.cutInHalf();
		sh.print();
		
		sh.cutInHalf();
		sh.print();
		
		sh.cutInHalf();
		sh.print();
		
		sh.cutInHalf();
		sh.print();
		
  }

}

















