package com.jcoadyschaebitz.neon.graphics;

import com.jcoadyschaebitz.neon.Game;

public class Sprite {

	private int x, y;
	private int width, height;
	public int[] pixels, alphas;
	protected Spritesheet sheet;

//	test sprites:
	public static Sprite dirt = new Sprite(16, 0, 0, Spritesheet.x16);
	public static Sprite grass = new Sprite(16, 0, 1, Spritesheet.x16);
	public static Sprite blueGrass = new Sprite(16, 0, 2, Spritesheet.x16);
	public static Sprite voidSprite = new Sprite(16, 0xff566543);
	public static Sprite nullSprite = new Sprite(16, 0xffff00ff);

	public static Sprite blackFade = new Sprite(Game.getWindowWidth(), Game.getWindowWidth(), 0xff000000);

//	floor sprites:
	public static Sprite tarmac = new Sprite(16, 6, 0, Spritesheet.x16);
	public static Sprite tarmac_1 = new Sprite(16, 6, 1, Spritesheet.x16);
	public static Sprite tarmac_2 = new Sprite(16, 6, 2, Spritesheet.x16);
	public static Sprite tarmac_3 = new Sprite(16, 6, 3, Spritesheet.x16);
	public static Sprite tarmac_4 = new Sprite(16, 6, 4, Spritesheet.x16);
	public static Sprite tarmac_5 = new Sprite(16, 6, 5, Spritesheet.x16);
	
	public static Sprite old_concrete = new Sprite(16, 11, 16, Spritesheet.x16);
	public static Sprite large_kitchen_tile = new Sprite(16, 11, 17, Spritesheet.x16);
	
	public static Sprite steps_arch = new Sprite(16, 6, 6, Spritesheet.x16);
	public static Sprite steps_base = new Sprite(16, 6, 7, Spritesheet.x16);
	public static Sprite steps_base_right = new Sprite(16, 6, 8, Spritesheet.x16);
	public static Sprite steps_base_left = new Sprite(16, 6, 9, Spritesheet.x16);
	
	public static Sprite stepsDown = new Sprite(16, 11, 0, Spritesheet.x16);
	public static Sprite stepsRightTop = new Sprite(16, 1, 6, Spritesheet.x16);
	public static Sprite stepsRight = new Sprite(16, 1, 7, Spritesheet.x16);
	public static Sprite stepsRightBottom = new Sprite(16, 1, 8, Spritesheet.x16);
	public static Sprite stepsLeftTop = Sprite.mirror(stepsRightTop);
	public static Sprite stepsLeft = Sprite.mirror(stepsRight);
	public static Sprite stepsLeftBottom = Sprite.mirror(stepsRightBottom);
	public static Sprite steps_up = new Sprite(16, 2, 3, Spritesheet.x16);

	public static Sprite insideStepsDown = new Sprite(16, 13, 0, Spritesheet.x16);
	public static Sprite insideStepsRightTop = new Sprite(16, 2, 6, Spritesheet.x16);
	public static Sprite insideStepsRight = new Sprite(16, 2, 7, Spritesheet.x16);
	public static Sprite insideStepsRightBottom = new Sprite(16, 2, 8, Spritesheet.x16);
	public static Sprite insideStepsLeftTop = Sprite.mirror(insideStepsRightTop);
	public static Sprite insideStepsLeft = Sprite.mirror(insideStepsRight);
	public static Sprite insideStepsLeftBottom = Sprite.mirror(insideStepsRightBottom);
	public static Sprite insideStepsRTPanel_1 = new Sprite(16, 7, 17, Spritesheet.x16);
	public static Sprite insideStepsRTPanel_2 = new Sprite(16, 7, 16, Spritesheet.x16);

	public static Sprite pavement = new Sprite(16, 7, 4, Spritesheet.x16);
	public static Sprite pavementEdge = new Sprite(16, 7, 5, Spritesheet.x16);
	public static Sprite barCarpet = new Sprite(16, 10, 1, Spritesheet.x16);
	public static Sprite barCarpetStepsTop = new Sprite(16, 10, 0, Spritesheet.x16);
	public static Sprite barCarpetStepsTopRight = new Sprite(16, 12, 1, Spritesheet.x16);
	public static Sprite barCarpetStepsRight = new Sprite(16, 13, 1, Spritesheet.x16);
	public static Sprite barCarpetStepsTopRight2 = new Sprite(16, 12, 0, Spritesheet.x16);
	public static Sprite woodPlanksSunset = new Sprite(16, 12, 1, Spritesheet.x16);
	public static Sprite insideTiles = new Sprite(16, 11, 1, Spritesheet.x16);

	public static Sprite whitePoolTiles = new Sprite(16, 14, 15, Spritesheet.x16);
	public static Sprite smallPoolFloorTiles = new Sprite(16, 14, 14, Spritesheet.x16);
	public static Sprite poolFloorTile = new Sprite(16, 14, 13, Spritesheet.x16);
	public static Sprite blackStoneTile = new Sprite(16, 14, 16, Spritesheet.x16);
	public static Sprite whiteStoneTile = new Sprite(16, 15, 16, Spritesheet.x16);

//	wall sprites: 
	public static Sprite wall = new Sprite(16, 5, 0, Spritesheet.x16);
	public static Sprite wallFrontBricks = new Sprite(16, 2, 5, Spritesheet.x16);
	public static Sprite wallPlain = new Sprite(16, 2, 15, Spritesheet.x16);
	public static Sprite wallFrontRightEdge = new Sprite(16, 1, 14, Spritesheet.x16);
	public static Sprite wallFrontLeftEdge = new Sprite(16, 2, 14, Spritesheet.x16);
	public static Sprite wallHorizEdge = new Sprite(16, 5, 13, Spritesheet.x16);
	public static Sprite wallDark = new Sprite(16, 2, 0, Spritesheet.x16);
	public static Sprite wallJoin1 = new Sprite(16, 2, 1, Spritesheet.x16);
	public static Sprite wallJoin2 = new Sprite(16, 2, 2, Spritesheet.x16);
	public static Sprite wallJoin3 = new Sprite(16, 2, 3, Spritesheet.x16);
	public static Sprite wallJoin4 = new Sprite(16, 2, 4, Spritesheet.x16);
	public static Sprite wallDiagTopLeft = new Sprite(16, 1, 12, Spritesheet.x16);
	public static Sprite wallDiagTopRight = new Sprite(16, 2, 12, Spritesheet.x16);
	public static Sprite wallDiagBottomLeft = new Sprite(16, 1, 13, Spritesheet.x16);
	public static Sprite wallDiagBottomRight = new Sprite(16, 2, 13, Spritesheet.x16);
	public static Sprite wallBaseDirt1 = new Sprite(16, 12, 12, Spritesheet.x16);
	public static Sprite wallBaseDirt2 = new Sprite(16, 13, 12, Spritesheet.x16);
	public static Sprite wallBaseDirt3 = new Sprite(16, 14, 12, Spritesheet.x16);
	public static Sprite wallBaseDirt4 = new Sprite(16, 15, 12, Spritesheet.x16);
	public static Sprite indoorPillar = new Sprite(16, 9, 9, Spritesheet.x16);
	public static Sprite indoorPillarBase = new Sprite(16, 9, 10, Spritesheet.x16);
	public static Sprite corrugatedIronHoriz1 = new Sprite(16, 1, 16, Spritesheet.x16);
	public static Sprite corrugatedIronHoriz2 = new Sprite(16, 0, 17, Spritesheet.x16);
	public static Sprite corrugatedIronHoriz3 = new Sprite(16, 1, 17, Spritesheet.x16);
	public static Sprite corrugatedIronHoriz4 = new Sprite(16, 2, 17, Spritesheet.x16);
	public static Sprite corrugatedIronVert = new Sprite(16, 4, 17, Spritesheet.x16);
	public static Sprite corrIronHorizEndLeft = new Sprite(16, 0, 16, Spritesheet.x16);
	public static Sprite corrIronHorizEndRight = new Sprite(16, 2, 16, Spritesheet.x16);
	public static Sprite corrIronVertEndBottom = new Sprite(16, 4, 18, Spritesheet.x16);
	public static Sprite corrIronVertEndTop = new Sprite(16, 4, 16, Spritesheet.x16);
	public static Sprite fakeWallTop = new Sprite(16, 5, 16, Spritesheet.x16);
	public static Sprite fakeWallBottom = Sprite.flipSpriteVert(fakeWallTop);
	public static Sprite fakeWallRight = Sprite.rotateSprite(fakeWallTop, Math.PI / 2, 16, 16);
	public static Sprite fakeWallLeft = Sprite.rotateSprite(fakeWallTop, -Math.PI / 2, 16, 16);
	public static Sprite fakeWallTopLeft = new Sprite(16, 5, 17, Spritesheet.x16);
	public static Sprite fakeWallTopRight = Sprite.rotateSprite(fakeWallTopLeft, Math.PI / 2, 16, 16);
	public static Sprite fakeWallBottomLeft = Sprite.rotateSprite(fakeWallTopLeft, -Math.PI / 2, 16, 16);
	public static Sprite fakeWallBottomRight = Sprite.rotateSprite(fakeWallTopLeft, Math.PI, 16, 16);

	public static Sprite barBottleShelf = new Sprite(16, 16, 3, Spritesheet.x16);
	public static Sprite interiorPanelling = new Sprite(16, 16, 4, Spritesheet.x16);

	public static Sprite japaneseNeonSign = new Sprite(16, 9, 7, Spritesheet.x16);
	public static Sprite wallGrate = new Sprite(16, 5, 1, Spritesheet.x16);
	public static Sprite pipes = new Sprite(16, 5, 2, Spritesheet.x16);
	public static Sprite wall3 = new Sprite(16, 5, 3, Spritesheet.x16);
	public static Sprite window1 = new Sprite(16, 0, 0, Spritesheet.x16);
	public static Sprite window2 = new Sprite(16, 1, 0, Spritesheet.x16);
	public static Sprite window3 = new Sprite(16, 0, 1, Spritesheet.x16);
	public static Sprite window4 = new Sprite(16, 1, 1, Spritesheet.x16);
	public static Sprite factoryWindow1 = new Sprite(16, 0, 2, Spritesheet.x16);
	public static Sprite factoryWindow2 = new Sprite(16, 1, 2, Spritesheet.x16);
	public static Sprite factoryWindow3 = new Sprite(16, 0, 3, Spritesheet.x16);
	public static Sprite factoryWindow4 = new Sprite(16, 1, 3, Spritesheet.x16);
	public static Sprite factoryWindow5 = new Sprite(16, 0, 4, Spritesheet.x16);
	public static Sprite factoryWindow6 = new Sprite(16, 1, 4, Spritesheet.x16);
	public static Sprite factoryWindowLit1 = new Sprite(16, 12, 5, Spritesheet.x16);
	public static Sprite factoryWindowLit2 = new Sprite(16, 13, 5, Spritesheet.x16);
	public static Sprite factoryWindowLit3 = new Sprite(16, 12, 6, Spritesheet.x16);
	public static Sprite factoryWindowLit4 = new Sprite(16, 13, 6, Spritesheet.x16);
	public static Sprite factoryWindowLit5 = new Sprite(16, 12, 7, Spritesheet.x16);
	public static Sprite factoryWindowLit6 = new Sprite(16, 13, 7, Spritesheet.x16);
	public static Sprite scaffold_left = new Sprite(16, 8, 5, Spritesheet.x16);
	public static Sprite scaffold_right = new Sprite(16, 9, 5, Spritesheet.x16);
	public static Sprite scaffold_right1 = new Sprite(16, 10, 5, Spritesheet.x16);
	public static Sprite scaffold_right2 = new Sprite(16, 11, 5, Spritesheet.x16);
	public static Sprite scaffold_right3 = new Sprite(16, 10, 6, Spritesheet.x16);
	public static Sprite scaffold_left_base = new Sprite(16, 8, 6, Spritesheet.x16);
	public static Sprite scaffold_right_base = new Sprite(16, 9, 6, Spritesheet.x16);
	public static Sprite wallPipesRightEnd = new Sprite(16, 5, 5, Spritesheet.x16);
	public static Sprite wallPipesLeftEnd = new Sprite(16, 5, 7, Spritesheet.x16);
	public static Sprite scaffold_top = new Sprite(16, 5, 6, Spritesheet.x16);
	public static Sprite wallPanel1 = new Sprite(16, 14, 5, Spritesheet.x16);
	public static Sprite wallPanel2 = new Sprite(16, 15, 5, Spritesheet.x16);
	public static Sprite wallPanel3 = new Sprite(16, 14, 6, Spritesheet.x16);
	public static Sprite wallPanel4 = new Sprite(16, 15, 6, Spritesheet.x16);
	public static Sprite green_neon_sign_1 = new Sprite(16, 11, 6, Spritesheet.x16);
	public static Sprite green_neon_sign_2 = new Sprite(16, 11, 7, Spritesheet.x16);
	public static Sprite green_neon_sign_3 = new Sprite(16, 11, 8, Spritesheet.x16);
	public static Sprite red_neon_sign_1 = new Sprite(16, 12, 8, Spritesheet.x16);
	public static Sprite red_neon_sign_2 = new Sprite(16, 12, 9, Spritesheet.x16);
	public static Sprite red_neon_sign_3 = new Sprite(16, 12, 10, Spritesheet.x16);
	public static Sprite orange_neon_sign_1 = new Sprite(16, 10, 7, Spritesheet.x16);
	public static Sprite orange_neon_sign_2 = new Sprite(16, 10, 8, Spritesheet.x16);
	public static Sprite air_con_unit_1 = new Sprite(16, 10, 9, Spritesheet.x16);
	public static Sprite air_con_unit_2 = new Sprite(16, 11, 9, Spritesheet.x16);
	public static Sprite air_con_unit_3 = new Sprite(16, 10, 10, Spritesheet.x16);
	public static Sprite air_con_unit_4 = new Sprite(16, 11, 10, Spritesheet.x16);
	public static Sprite wallPipes1 = new Sprite(16, 5, 8, Spritesheet.x16);
	public static Sprite wallPipes2 = new Sprite(16, 5, 9, Spritesheet.x16);
	public static Sprite bigVent1 = new Sprite(16, 14, 7, Spritesheet.x16);
	public static Sprite bigVent2 = new Sprite(16, 15, 7, Spritesheet.x16);
	public static Sprite bigVent3 = new Sprite(16, 14, 8, Spritesheet.x16);
	public static Sprite bigVent4 = new Sprite(16, 15, 8, Spritesheet.x16);
	public static Sprite biggerVent = new Sprite(48, 15, 6, Spritesheet.x24);
	public static Sprite bigVentBlades = new Sprite(48, 15, 7, Spritesheet.x24);
	public static Sprite bigVentCover = new Sprite(48, 15, 8, Spritesheet.x24);
	public static Sprite overheadFan = new Sprite(64, 7, 3, Spritesheet.x64);

	public static Sprite wireFenceVert = new Sprite(16, 48, 0, 3, Spritesheet.x16);
	public static Sprite wireFenceVertShadow = new Sprite(16, 32, 0, 6, Spritesheet.x16);
	public static Sprite wireFenceHozShadow = new Sprite(16, 32, 0, 7, Spritesheet.x16);

	public static Sprite tileBottomShadow1 = new Sprite(16, 14, 0, Spritesheet.x16);
	public static Sprite tileBottomShadow2 = new Sprite(16, 14, 1, Spritesheet.x16);
	public static Sprite tileLeftShadowTop = new Sprite(16, 15, 0, Spritesheet.x16);
	public static Sprite tileLeftShadowMiddle = new Sprite(16, 13, 8, Spritesheet.x16);
	public static Sprite tileLeftShadowBottom = new Sprite(16, 15, 1, Spritesheet.x16);
	public static Sprite tileLeftShadow5 = new Sprite(16, 1, 15, Spritesheet.x16);
	public static Sprite tileRightShadow5 = Sprite.mirror(tileLeftShadow5);
	public static Sprite tileRightShadowTop = Sprite.mirror(tileLeftShadowTop);
	public static Sprite tileRightShadowMiddle = Sprite.mirror(tileLeftShadowMiddle);
	public static Sprite tileRightShadowBottom = Sprite.mirror(tileLeftShadowBottom);
	public static Sprite stairRightShadowTop = new Sprite(16, 16, 1, 9, Spritesheet.x16);
	public static Sprite stairRightShadowMiddle = new Sprite(16, 16, 1, 10, Spritesheet.x16);
	public static Sprite stairRightShadowBottom = new Sprite(16, 16, 1, 11, Spritesheet.x16);
	public static Sprite stairLeftShadowTop = Sprite.mirror(stairRightShadowTop);
	public static Sprite stairLeftShadowMiddle = Sprite.mirror(stairRightShadowMiddle);
	public static Sprite stairLeftShadowBottom = Sprite.mirror(stairRightShadowBottom);
	public static Sprite doubleSideShadowTop = new Sprite(16, 16, 16, 0, Spritesheet.x16);
	public static Sprite doubleSideShadowMiddle = new Sprite(16, 16, 16, 1, Spritesheet.x16);
	public static Sprite doubleSideShadowBottom = new Sprite(16, 16, 16, 2, Spritesheet.x16);

	// Collision entities:
	public static Sprite down_facing_bin = new Sprite(48, 32, 5, 0, Spritesheet.x24);
	public static Sprite down_facing_bin_shadow = new Sprite(48, 24, 5, 2, Spritesheet.x24);
	public static Sprite left_facing_bin = new Sprite(24, 48, 12, 0, Spritesheet.x24);
	public static Sprite left_facing_bin_shadow = new Sprite(24, 48, 13, 0, Spritesheet.x24);
	public static Sprite right_facing_bin = Sprite.mirror(left_facing_bin);

	public static Sprite car_down = new Sprite(48, 72, 9, 0, Spritesheet.x24);
	public static Sprite car_down_shadow = new Sprite(48, 72, 9, 1, Spritesheet.x24);
	public static Sprite car_left = new Sprite(72, 48, 7, 0, Spritesheet.x24);
	public static Sprite car_left_shadow = new Sprite(72, 48, 7, 1, Spritesheet.x24);
	public static Sprite stall1_down = new Sprite(72, 48, 8, 0, Spritesheet.x24);
	public static Sprite stall1_left = new Sprite(72, 96, 7, 1, Spritesheet.x24);
	public static Sprite stall1_down_shadow = new Sprite(72, 24, 8, 2, Spritesheet.x24);
	public static Sprite canopyRight = new Sprite(24, 72, 28, 0, Spritesheet.x24);
	public static Sprite canopy2Right = new Sprite(48, 96, 14, 4, Spritesheet.x24);
	public static Sprite canopy2Left = Sprite.mirror(canopy2Right);
	public static Sprite silhouetteRight1 = new Sprite(24, 72, 28, 1, Spritesheet.x24);
	public static Sprite silhouetteRight2 = new Sprite(24, 72, 28, 2, Spritesheet.x24);
	public static Sprite signRight1 = new Sprite(48, 12, 3, Spritesheet.x24);
	public static Sprite signRight2 = new Sprite(48, 12, 4, Spritesheet.x24);
	public static Sprite signRight2Glow = new Sprite(48, 12, 5, Spritesheet.x24);
	public static Sprite silhouetteLeft1 = mirror(silhouetteRight1);
	public static Sprite signLeft1 = new Sprite(24, 72, 29, 1, Spritesheet.x24);
//	public static Sprite cablesOverlay = new Sprite(144, 320, 0, 0, Spritesheet.cables); //make obsolete
	public static Sprite cable1 = new Sprite(160, 32, 0, 0, Spritesheet.cables);
	public static Sprite cable2 = new Sprite(160, 32, 0, 1, Spritesheet.cables);
	public static Sprite cable3 = new Sprite(160, 32, 0, 2, Spritesheet.cables);
	public static Sprite cable4 = new Sprite(256, 32, 0, 3, Spritesheet.cables);
	public static Sprite largeHangingSign = new Sprite(128, 64, 0, 2, Spritesheet.cables);
	public static Sprite doorGlowLeft = new Sprite(48, 12, 2, Spritesheet.x24);
	public static Sprite barCounter = new Sprite(144, 72, 4, 4, Spritesheet.x24);
	public static Sprite barWall = new Sprite(128, 64, 4, 3, Spritesheet.x32);
	public static Sprite barStool = new Sprite(16, 14, 17, Spritesheet.x16);
	public static Sprite barStoolShadow = new Sprite(16, 15, 17, Spritesheet.x16);
	public static Sprite barTable = new Sprite(48, 15, 9, Spritesheet.x24);
	public static Sprite barTableShadow = new Sprite(48, 15, 10, Spritesheet.x24);
	public static Sprite barScreenSolid = new Sprite(72, 48, 8, 8, Spritesheet.x24);
	public static Sprite barScreenTranslucent = new Sprite(72, 48, 8, 9, Spritesheet.x24);
	public static Sprite bigShopfront1 = new Sprite(120, 72, 0, 8, Spritesheet.x24);
	public static Sprite bigShopfront2 = new Sprite(120, 72, 1, 8, Spritesheet.x24);
	public static Sprite crowdBarrierVert = new Sprite(24, 72, 14, 0, Spritesheet.x24);
	public static Sprite crowdBarrierVertShadow = new Sprite(24, 72, 15, 0, Spritesheet.x24);
	public static Sprite crowdBarrierHoriz = new Sprite(48, 24, 6, 2, Spritesheet.x24);
	public static Sprite crowdBarrierHorizShadow = new Sprite(48, 24, 6, 3, Spritesheet.x24);
	public static Sprite tallPlanter = new Sprite(32, 48, 8, 5, Spritesheet.x16);
	public static Sprite divider_1_v = new Sprite(16, 48, 0, 2, Spritesheet.x16);
	public static Sprite divider_1_h = new Sprite(48, 32, 6, 0, Spritesheet.x16);
	public static Sprite divider_2_h_base = new Sprite(16, 16, 17, 3, Spritesheet.x16);
	public static Sprite divider_2_h_window = new Sprite(16, 48, 17, 0, Spritesheet.x16);
			
	public static Sprite planter_1_h = new Sprite(64, 32, 9, 0, Spritesheet.x32);
	public static Sprite planter_1_v = new Sprite(32, 64, 20, 0, Spritesheet.x32);
	public static Sprite kitchen_unit_h = new Sprite(48, 14, 10, Spritesheet.x24);
	public static Sprite kitchen_unit_v = new Sprite(48, 48, 11, 10, Spritesheet.x24);
	public static Sprite door_h_open = new Sprite(48, 12, 10, Spritesheet.x24);
	public static Sprite door_h_closed = new Sprite(48, 13, 10, Spritesheet.x24);
	
//	player sprites:
	public static Sprite playerR = new Sprite(24, 0, 0, Spritesheet.x24);
	public static Sprite shadow = new Sprite(24, 27, 28, Spritesheet.x24);
	public static Sprite shadowX32 = new Sprite(24, 28, 28, Spritesheet.x24);
	public static Sprite player_dead_right = new Sprite(24, 11, 7, Spritesheet.x24);
	public static Sprite player_dead_left = new Sprite(24, 11, 9, Spritesheet.x24);

	public static Sprite helpfulMan = new Sprite(24, 6, 1, Spritesheet.x24);
	public static Sprite cart = new Sprite(72, 48, 3, 0, Spritesheet.x24);
	public static Sprite cartShadow = new Sprite(72, 24, 3, 2, Spritesheet.x24);

	public static Sprite shieldOutline = new Sprite(32, 6, 6, Spritesheet.x32);
	public static Sprite shieldOutlineGlow = new Sprite(32, 7, 6, Spritesheet.x32);

//	projectile sprites:
	public static Sprite pistolBullet = new Sprite(16, 8, 7, Spritesheet.x16);
	public static Sprite pistolBulletGlow = new Sprite(32, 12, 7, Spritesheet.x32);
	public static Sprite pistolFlash = new Sprite(32, 12, 1, Spritesheet.x32);
	public static Sprite pistolFlashGlow = new Sprite(32, 12, 2, Spritesheet.x32);
	public static Sprite assaultRifleBullet = new Sprite(16, 2, 10, Spritesheet.x16);
	public static Sprite enemy_bullet_1 = new Sprite(16, 3, 3, Spritesheet.x16);
	public static Sprite enemy_bullet_2 = new Sprite(16, 3, 4, Spritesheet.x16);
	public static Sprite enemy_bullet_glow_1 = new Sprite(32, 12, 4, Spritesheet.x32);
	public static Sprite enemy_bullet_glow_2 = new Sprite(32, 12, 6, Spritesheet.x32);
	public static Sprite bolt = new Sprite(16, 3, 1, Spritesheet.x16);
	public static Sprite boltTrail = new Sprite(16, 2, 11, Spritesheet.x16);
	public static Sprite shotgunPellet = new Sprite(16, 3, 2, Spritesheet.x16);
	public static Sprite shotgunPelletGlow = new Sprite(32, 12, 3, Spritesheet.x32);
	public static Sprite slowEnemyBullet = new Sprite(16, 3, 5, Spritesheet.x16);
	public static Sprite slowEnemyBulletGlow = new Sprite(32, 12, 5, Spritesheet.x32);
	public static Sprite fastBulletBlue = new Sprite(24, 8, 1, Spritesheet.x24);
	public static Sprite fastBulletBlueGlow = new Sprite(24, 8, 2, Spritesheet.x24);
	public static Sprite silverBullet = new Sprite(16, 3, 16, Spritesheet.x16);

//	particle sprites:
	public static Sprite particleBlue = new Sprite(2, 0xff96FFFF);
	public static Sprite particleOrange = new Sprite(2, 0xffFF8C00);
	public static Sprite particleCrimson = new Sprite(2, 0xffFF0037);
	public static Sprite particleYellow = new Sprite(2, 0xffB6FF00);
	public static Sprite smallRainParticle = new Sprite(1, 0xff9BAFFF);
	public static Sprite rainParticle = new Sprite(6, 4, 0, Spritesheet.bullets);
	public static Sprite rainSplashParticle = new Sprite(6, 5, 0, Spritesheet.bullets);
	public static Sprite glassParticle = new Sprite(1, 0x8883C2C4);

//	enemy sprites: 
	public static Sprite two_leg_robot = new Sprite(32, 6, 0, Spritesheet.x16);
	public static Sprite soldier_dead_right = new Sprite(24, 14, 6, Spritesheet.x24);
	public static Sprite soldier_dead_left = new Sprite(24, 14, 7, Spritesheet.x24);
	public static Sprite swordGuy_dead_right = new Sprite(24, 14, 8, Spritesheet.x24);
	public static Sprite swordGuy_dead_left = new Sprite(24, 14, 9, Spritesheet.x24);
	public static Sprite slowGuy_dead_right = new Sprite(24, 14, 10, Spritesheet.x24);
	public static Sprite slowGuy_dead_left = new Sprite(24, 14, 11, Spritesheet.x24);
	public static Sprite heavy_dead_right = new Sprite(24, 4, 3, Spritesheet.x24);
	public static Sprite heavy_dead_left = new Sprite(24, 5, 3, Spritesheet.x24);

//	npc sprites:
	public static Sprite barman = new Sprite(24, 0, 22, Spritesheet.x24);
	public static Sprite oldManEye = new Sprite(64, 3, 1, Spritesheet.x64);

//	item sprites:	
	public static Sprite shotgun_ammo = new Sprite(16, 4, 0, Spritesheet.x16);
	public static Sprite shotgun = new Sprite(32, 0, 0, Spritesheet.x32);
	public static Sprite pistol = new Sprite(32, 1, 0, Spritesheet.x32);
	public static Sprite enemyGun = new Sprite(32, 2, 0, Spritesheet.x32);
	public static Sprite slowEnemyGun = new Sprite(32, 7, 0, Spritesheet.x32);
	public static Sprite crossbow = new Sprite(32, 3, 0, Spritesheet.x32);
	public static Sprite assaultRifle = new Sprite(32, 4, 0, Spritesheet.x32);
	public static Sprite miniGun = new Sprite(32, 6, 0, Spritesheet.x32);
	public static Sprite laserSword = new Sprite(48, 8, 2, Spritesheet.x24);
	public static Sprite doublePistols = new Sprite(32, 6, 7, Spritesheet.x32);
	
	public static Sprite laserSwordGlow = new Sprite(48, 8, 3, Spritesheet.x24);
	public static Sprite laserSwordSlash = new Sprite(48, 8, 4, Spritesheet.x24);
	public static Sprite swordSlash2 = new Sprite(64, 0, 4, Spritesheet.x32);
	public static Sprite skillGlow = new Sprite(32, 2, 4, Spritesheet.x16);
	public static Sprite spotlight = new Sprite(16, 4, 7, Spritesheet.x16);
	public static Sprite xp = new Sprite(16, 0, 5, Spritesheet.x16);
	public static Sprite xpShadow = new Sprite(16, 7, 7, Spritesheet.x16);
	public static Sprite xpGlow = new Sprite(16, 1, 5, Spritesheet.x16);
	public static Sprite xpTube = new Sprite(16, 7, 6, Spritesheet.x16);
	public static Sprite xpTubeShadow = new Sprite(16, 3, 8, Spritesheet.x16);
	public static Sprite healthKit = new Sprite(16, 4, 8, Spritesheet.x16);
	public static Sprite healthKitShadow = new Sprite(16, 3, 9, Spritesheet.x16);
	public static Sprite wallFrontKit = new Sprite(16, 5, 11, Spritesheet.x16);
	public static Sprite emptyWallKitFront = new Sprite(16, 6, 11, Spritesheet.x16);
	public static Sprite WallKitFrontGlass = new Sprite(16, 9, 11, Spritesheet.x16);
	public static Sprite guardRail = new Sprite(16, 32, 3, 7, Spritesheet.x16);
	public static Sprite keyCard = new Sprite(16, 3, 17, Spritesheet.x16);

	// UI sprites:
	public static Sprite item_slot = new Sprite(16, 4, 1, Spritesheet.x16);
	public static Sprite item_slot_outline = new Sprite(16, 4, 2, Spritesheet.x16);
	public static Sprite item_slot_glow = new Sprite(16, 6, 10, Spritesheet.x16);
	public static Sprite healthIcon = new Sprite(16, 4, 3, Spritesheet.x16);
	public static Sprite pistolSlotSprite = new Sprite(16, 4, 4, Spritesheet.x16);
	public static Sprite assaultRifleSlotSprite = new Sprite(16, 2, 9, Spritesheet.x16);
	public static Sprite shotgunSlotSprite = new Sprite(16, 4, 5, Spritesheet.x16);
	public static Sprite crossbowSlotSprite = new Sprite(16, 4, 6, Spritesheet.x16);
	public static Sprite pistolIcon = new Sprite(16, 4, 11, Spritesheet.x16);
	public static Sprite shotgunIcon = new Sprite(16, 4, 12, Spritesheet.x16);
	public static Sprite crossbowIcon = new Sprite(16, 4, 13, Spritesheet.x16);
	public static Sprite assaultRifleIcon = new Sprite(16, 4, 14, Spritesheet.x16);
	public static Sprite skillOutline = new Sprite(16, 4, 9, Spritesheet.x16);
	public static Sprite skillOutlineSelected = new Sprite(16, 4, 10, Spritesheet.x16);
	public static Sprite skillOutlineHover = new Sprite(24, 8, 0, Spritesheet.x24);
	public static Sprite buttonOutline = new Sprite(64, 0, 0, Spritesheet.x64UI);
	public static Sprite buttonHighlighted = new Sprite(64, 1, 0, Spritesheet.x64UI);
	public static Sprite pauseMenuBackground = new Sprite(Spritesheet.pauseMenuBackground, 400, 250);
	public static Sprite menuOutline = new Sprite(Spritesheet.menuOutline, 400, 225);
	public static Sprite leftButton = new Sprite(16, 3, 10, Spritesheet.x16);
	public static Sprite rightButton = new Sprite(16, 3, 11, Spritesheet.x16);
	public static Sprite leftButtonHighlighted = new Sprite(16, 3, 12, Spritesheet.x16);
	public static Sprite rightButtonHighlighted = new Sprite(16, 3, 13, Spritesheet.x16);
	public static Sprite SkillTreeOutline = new Sprite(128, 0, 1, Spritesheet.x64UI);
	public static Sprite healthBarEnd = new Sprite(16, 11, 11, Spritesheet.x16);
	public static Sprite healthBarEnd2 = new Sprite(16, 11, 12, Spritesheet.x16);
	public static Sprite healthBarEnd3 = new Sprite(16, 4, 15, Spritesheet.x16);
	public static Sprite SpeakingIcon = new Sprite(16, 5, 18, Spritesheet.x16);

	// Effect sprites:
	public static Sprite wallBlur = new Sprite(32, 13, 3, Spritesheet.x32);
	public static Sprite largeWallBlur = new Sprite(64, 5, 3, Spritesheet.x64);

	protected Sprite(Spritesheet sheet, int width, int height) {
		this.sheet = sheet;
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		alphas = new int[width * height];
		load();
	}

	public Sprite(int size, int x, int y, Spritesheet sheet) {
		this(size, size, x, y, sheet);
	}

	public Sprite(int width, int height, int x, int y, Spritesheet sheet) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		alphas = new int[width * height];
		this.x = x * width;
		this.y = y * height;
		this.sheet = sheet;
		load();
	}

	public Sprite(int width, int height, int colour) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		alphas = new int[width * height];
		setColour(colour);
	}

	public Sprite(int size, int colour) {
		this(size, size, colour);
	}

	public Sprite(int[] spritePixels, int sprWidth, int sprHeight) {
		width = sprWidth;
		height = sprHeight;
		pixels = spritePixels;
		alphas = new int[width * height];
		loadAlphasFromPixels();
	}

	public static Sprite mirror(Sprite sprite) {
		int[] tempPixels = new int[sprite.width * sprite.height];
		for (int y = 0; y < sprite.height; y++) {
			for (int x = 0; x < sprite.width; x++) {
				tempPixels[x + y * sprite.width] = sprite.pixels[(sprite.width - 1) - x + y * sprite.width];
			}
		}
		return new Sprite(tempPixels, sprite.width, sprite.height);
	}

	public static Sprite flipSpriteVert(Sprite sprite) {
		int[] tempPixels = new int[sprite.width * sprite.height];
		for (int y = 0; y < sprite.height; y++) {
			for (int x = 0; x < sprite.width; x++) {
				tempPixels[x + y * sprite.width] = sprite.pixels[x + (sprite.height - y - 1) * sprite.width];
			}
		}
		return new Sprite(tempPixels, sprite.width, sprite.height);
	}

	public static Sprite rotateSprite(Sprite sprite, double angle, int width, int height) {
		int result[] = new int[width * height];
		Sprite rotatedSprite;

		double nx_x = rotX(-angle, 1.0, 0.0);
		double nx_y = rotY(-angle, 1.0, 0.0);
		double ny_x = rotX(-angle, 0.0, 1.0);
		double ny_y = rotY(-angle, 0.0, 1.0);

		double x0 = rotX(-angle, -width / 2, -height / 2) + width / 2;
		double y0 = rotY(-angle, -width / 2, -height / 2) + height / 2;

		for (int y = 0; y < height; y++) {
			double x1 = x0;
			double y1 = y0;
			for (int x = 0; x < width; x++) {
				int xx = (int) x1;
				int yy = (int) y1;
				int col = 0;
				if (xx < 0 || xx >= width || yy < 0 || yy >= height) col = 0xffff00ff;
				else col = sprite.pixels[xx + yy * width];
				result[x + y * width] = col;
				x1 += nx_x;
				y1 += nx_y;
			}
			x0 += ny_x;
			y0 += ny_y;

		}
		rotatedSprite = new Sprite(result, width, height);
		return rotatedSprite;
	}

	public Sprite mask(Sprite mask, int col, int dx, int dy) {
		int out[] = new int[width * height];
		for (int yy = dy; yy < height + dy; yy++) {
			for (int xx = dx; xx < width + dx; xx++) {
				if (xx < 0 || xx >= width || yy < 0 || yy >= height) continue;
				if (mask.pixels[xx + yy * width] == col) out[(xx - dx) + (yy - dy) * width] = this.pixels[(xx - dx) + (yy - dy) * width];
				else out[(xx - dx) + (yy - dy) * width] = Screen.ALPHA_COLOUR;
			}
		}
		return new Sprite(out, width, height);
	}

	public Sprite translucentMask(Sprite mask, int dx, int dy) {												// ---------------------QUITE LAGGY------------------------
		int out[] = pixels.clone();
		for (int yy = dy; yy < height + dy; yy++) {
			for (int xx = dx; xx < width + dx; xx++) {
				if (xx < 0 || xx >= mask.width || yy < 0 || yy >= mask.height) continue;
				int alpha = (mask.pixels[xx + yy * mask.width] >> 24 & 0xff) << 24;
				int oldAlpha = (pixels[(xx - dx) + (yy - dy) * width] >> 24 & 0xff) << 24;
				if (unsignedConvert(oldAlpha >> 24) >= unsignedConvert(alpha >> 24)) out[(xx - dx) + (yy - dy) * width] = out[(xx - dx) + (yy - dy) * width] - oldAlpha + alpha;
			}
		}
		return new Sprite(out, width, height);
	}
	
	public long unsignedConvert(int v) {
	return (Long.parseLong(Integer.toHexString(v), 16));
	}

	public Sprite overlay(Sprite overlay, int offX, int offY) {
		int[] out = pixels.clone();
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				if (x + offX < 0 || y + offY < 0 || x + offX >= overlay.width || y + offY >= overlay.height) continue;
				if (overlay.pixels[(x + offX) + (y + offY) * overlay.width] == Screen.ALPHA_COLOUR) continue;
				else out[x + y * width] = overlay.pixels[(x + offX) + (y + offY) * overlay.width];
			}
		}
		return new Sprite(out, width, height);
	}

	private static double rotX(double angle, double x, double y) {
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		return x * cos + y * -sin;
	}

	private static double rotY(double angle, double x, double y) {
		double cos = Math.cos(angle);
		double sin = Math.sin(angle);
		return x * sin + y * cos;
	}

	public static Sprite extendSprite(Sprite sprite, int dLeft, int dRight, int dUp, int dDown, int colour) {
		int newW = sprite.getWidth() + dLeft + dRight;
		int newH = sprite.getHeight() + dUp + dDown;
		int pixelsExtended[] = new int[newW * newH];
		for (int yi = 0; yi < newH; yi++) {
			for (int xi = 0; xi < newW; xi++) {
				if (yi - dUp < sprite.getHeight() && yi - dUp >= 0 && xi - dLeft < sprite.getWidth() && xi - dLeft >= 0) {
					pixelsExtended[xi + yi * newW] = sprite.pixels[(xi - dLeft) + (yi - dUp) * sprite.getWidth()];
				} else {
					pixelsExtended[xi + yi * newW] = colour;
				}
			}
		}
		return new Sprite(pixelsExtended, newW, newH);
	}

	private void setColour(int colour) {
		for (int i = 0; i < width * height; i++) {
			pixels[i] = colour;
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	private void load() {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[x + y * width] = sheet.pixels[(this.x + x) + (this.y + y) * sheet.WIDTH];
				alphas[x + y * width] = sheet.alphas[(this.x + x) + (this.y + y) * sheet.WIDTH];
			}
		}
	}

	private void loadAlphasFromPixels() {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				alphas[x + y * width] = pixels[x + y * width] >> 24 & 0xff;
			}
		}
	}
}
