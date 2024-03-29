package com.jcoadyschaebitz.neon.graphics;

import java.util.HashMap;

public class Font {
	
	public static final int SIZE_16x16 = 1;
	public static final int SIZE_8x8 = 2;
	public static final int SIZE_5x5 = 3;
	public static final int SIZE_12x12 = 4;
	public int fontSize, fontColour;
	private double alpha;
	
	private Sprite[] characters;
	private static String charIndex = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+-.,\"'()?!%�$#:/";
	private static int[] spacing5x5 = new int[] {
			4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 
			4, 4, 4, 4, 4, 4, 4, 4, 2, 3, 4, 2, 4, 4, 4, 4, 4, 3, 4, 4, 4, 4, 4, 4, 4, 4,
			4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 2, 3, 4, 2, 3, 3, 4, 2, 4, 4, 4, 4, 2, 4
	};
	private static int[] spacing8x8 = new int[] {
			6, 6, 6, 6, 6, 6, 6, 6, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5,
			6, 6, 6, 6, 6, 5, 6, 6, 3, 5, 5, 3, 6, 6, 6, 6, 6, 6, 6, 5, 5, 6, 6, 5, 5, 5,
			6, 4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 3, 3, 6, 3, 3, 3, 6, 2, 6, 6, 6, 6, 3, 4
	};
	private static int[] spacing16x16 = new int[] {
			12, 12, 12, 12, 12, 12, 12, 12, 8, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 10, 12, 12, 12, 12, 12, 12,
			12, 12, 12, 12, 12, 10, 12, 11, 8, 8, 10, 8, 12, 11, 12, 12, 12, 11, 10, 10, 12, 12, 12, 11, 10, 11,
			13, 10, 13, 13, 13, 13, 13, 13, 13, 13, 10, 10, 5, 5, 8, 5, 8, 8, 12, 5, 13, 12, 10, 13, 5, 10
	};
	private static int[] spacing12x12 = new int[] {
			5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 5, 5, 7, 5, 5, 5, 4, 5, 5, 4, 5, 5, 7, 5, 5, 5,
			5, 5, 4, 5, 5, 4, 5, 5, 3, 3, 5, 3, 6, 4, 4, 5, 5, 3, 4, 4, 4, 4, 6, 5, 5, 5,
			5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
	};
	private HashMap<Character, Integer> charSpacing = new HashMap<>();
	
	public Font(int font, int fontColour, double alpha) {
		if (font == Font.SIZE_16x16) {
			characters = Spritesheet.font1Characters.getSprites();
			fontSize = 12;
			for (int i = 0; i < spacing16x16.length; i++) {
				charSpacing.put(charIndex.charAt(i), spacing16x16[i]);
			}
		}
		if (font == Font.SIZE_8x8) {
			characters = Spritesheet.font2Characters.getSprites(); 	
			fontSize = 6;
			for (int i = 0; i < spacing8x8.length; i++) {
				charSpacing.put(charIndex.charAt(i), spacing8x8[i]);
			}
		}
		if (font == Font.SIZE_5x5) {
			characters = Spritesheet.font3Characters.getSprites();
			fontSize = 5;
			for (int i = 0; i < spacing5x5.length; i++) {
				charSpacing.put(charIndex.charAt(i), spacing5x5[i]);
			}
		}
		if (font == Font.SIZE_12x12) {
			characters = Spritesheet.font4Characters.getSprites();
			fontSize = 9;
			for (int i = 0; i < spacing12x12.length; i ++) {
				charSpacing.put(charIndex.charAt(i), spacing12x12[i]);
			}
		}
		this.fontColour = fontColour;
		this.alpha = alpha;
	}
	
	public void render(int x, int y, int spacing, String text, Screen screen, boolean fixed, double alpha) {
		int xOffset = 0;
		int yOffset = 0;
		int lineOffset = 0;
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == 'g' || c == 'y' || c == 'p' || c == 'q' || c == 'j') yOffset = fontSize / 3;
			else yOffset = 0;
			if (c == 'Q' && fontSize == 9) yOffset = 2;
			if (c == ',') yOffset = fontSize / 6;
			if (c == '\n') {
				lineOffset += fontSize * 1.5;
				xOffset = 0;
			}
			int index = charIndex.indexOf(c);
			if (index >= 0) screen.renderChar(x + xOffset, y + yOffset + lineOffset, characters[index], fixed, fontColour, alpha);
			if (c == ' ' && fontSize == 9) xOffset += 5;
			else if (c == ' ') xOffset += fontSize;
			else if (c != '\n') xOffset += charSpacing.get(c) + spacing;
		}
	}
	
	public void render(int x, int y, String text, Screen screen, boolean fixed, double alpha) {
		render(x, y, 0, text, screen, fixed, alpha);
	}
	
	public void render(int x, int y, int spacing, String text, Screen screen, boolean fixed) {
		render(x, y, spacing, text, screen, fixed, alpha);
	}
	
	public void render(int x, int y, String text, Screen screen, boolean fixed) {
		render(x, y, text, screen, fixed, alpha);
	}
	
}
