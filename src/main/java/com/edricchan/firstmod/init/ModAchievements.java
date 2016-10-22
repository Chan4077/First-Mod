package com.edricchan.firstmod.init;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

// Achievements


public class ModAchievements {
	public static Achievement obtainCheese;
	public static AchievementPage page;
	
	public static void loadAchievements() {
		obtainCheese = new Achievement("achievement.first_obtainCheese", "first_obtainCheese", 0, 0, ModFoods.CHEESE, null);
	}
}