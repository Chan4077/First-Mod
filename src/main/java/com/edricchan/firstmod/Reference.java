package com.edricchan.firstmod;

public class Reference {

	// Mod ID
	public static final String MOD_ID = "first";
	// Name of mod
	public static final String NAME = "Edric's First Mod";
	// Version of mod
	public static final String VERSION = "1.1";
	// Accepted Minecraft Versions
	public static final String ACCEPTED_VERSIONS = "[1.10, 1.10.2]";
	// Proxies
	public static final String CLIENT_PROXY_CLASS = "com.edricchan.firstmod.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.edricchan.firstmod.proxy.ServerProxy";
	
	public static enum FirstItems {
		RUBY("ruby", "ItemRuby");
		
		private String unlocalizedName;
		private String registryName;
		
		FirstItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum FirstBlocks {
		CHEESE_BLOCK("cheese_block", "BlockCheese"),
		RUBY_BLOCK("ruby_block", "BlockRuby"),
		CHAIR("chair", "BlockChair");
		// GREENSTONE_BLOCK("greenstone_block", "BlockGreenstone");
		// STORAGE_BLOCK("storage_block", "BlockStorageChest");
		
		private String unlocalizedName;
		private String registryName;
		
		FirstBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	public static enum FirstLetters {
		// Letters
		LETTER_A("letter_a", "LetterA"),
		LETTER_B("letter_b", "LetterB"),
		LETTER_C("letter_c", "LetterC"),
		LETTER_D("letter_d", "LetterD"),
		LETTER_E("letter_e", "LetterE"),
		LETTER_F("letter_f", "LetterF"),
		LETTER_G("letter_g", "LetterG"),
		LETTER_T("letter_t", "LetterT");
		
		private String unlocalizedName;
		private String registryName;
		
		FirstLetters(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	public static enum FirstFoods {
		// Foods
		CHEESE("cheese", "FoodCheese"),
		CHEESE_AND_COOKIE("cheese_and_cookie", "FoodCheeseCookie"),
		CRACKER("cracker", "FoodCracker");
		
		
		private String unlocalizedName;
		private String registryName;
		
		FirstFoods(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
