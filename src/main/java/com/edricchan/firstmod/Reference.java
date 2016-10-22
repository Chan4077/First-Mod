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
		ITEM_LETTER_A("item_letter_a", "ItemLetterA"),
		ITEM_LETTER_B("item_letter_b", "ItemLetterB"),
		ITEM_LETTER_C("item_letter_c", "ItemLetterC"),
		ITEM_LETTER_D("item_letter_d", "ItemLetterD"),
		ITEM_LETTER_E("item_letter_e", "ItemLetterE"),
		ITEM_LETTER_F("item_letter_f", "ItemLetterF"),
		ITEM_LETTER_G("item_letter_g", "ItemLetterG"),
		ITEM_LETTER_H("item_letter_h", "ItemLetterH"),
		ITEM_LETTER_I("item_letter_i", "ItemLetterI"),
		ITEM_LETTER_J("item_letter_j", "ItemLetterJ"),
		ITEM_LETTER_K("item_letter_k", "ItemLetterK"),
		ITEM_LETTER_L("item_letter_l", "ItemLetterL"),
		ITEM_LETTER_M("item_letter_m", "ItemLetterM"),
		ITEM_LETTER_N("item_letter_n", "ItemLetterN"),
		ITEM_LETTER_O("item_letter_o", "ItemLetterO"),
		ITEM_LETTER_P("item_letter_p", "ItemLetterP"),
		ITEM_LETTER_Q("item_letter_q", "ItemLetterQ"),
		ITEM_LETTER_R("item_letter_r", "ItemLetterR"),
		ITEM_LETTER_S("item_letter_s", "ItemLetterS"),
		ITEM_LETTER_T("item_letter_t", "ItemLetterT"),
		ITEM_LETTER_U("item_letter_u", "ItemLetterU"),
		ITEM_LETTER_V("item_letter_v", "ItemLetterV"),
		ITEM_LETTER_W("item_letter_w", "ItemLetterW"),
		ITEM_LETTER_X("item_letter_x", "ItemLetterX"),
		ITEM_LETTER_Y("item_letter_y", "ItemLetterY"),
		ITEM_LETTER_Z("item_letter_z", "ItemLetterZ");
		
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
	public static enum FirstLetterBlocks {
		// Letters
		LETTER_A_ORANGE("letter_a_orange", "LetterAOrange"),
		LETTER_B_ORANGE("letter_b_orange", "LetterBOrange"),
		LETTER_C_ORANGE("letter_c_orange", "LetterCOrange"),
		LETTER_D_ORANGE("letter_d_orange", "LetterDOrange"),
		LETTER_E_ORANGE("letter_e_orange", "LetterEOrange"),
		LETTER_F_ORANGE("letter_f_orange", "LetterFOrange"),
		LETTER_G_ORANGE("letter_g_orange", "LetterGOrange"),
		LETTER_H_ORANGE("letter_h_orange", "LetterHOrange"),
		LETTER_I_ORANGE("letter_i_orange", "LetterIOrange"),
		LETTER_J_ORANGE("letter_j_orange", "LetterJOrange"),
		LETTER_K_ORANGE("letter_k_orange", "LetterKOrange"),
		LETTER_L_ORANGE("letter_l_orange", "LetterLOrange"),
		LETTER_M_ORANGE("letter_m_orange", "LetterMOrange"),
		LETTER_N_ORANGE("letter_n_orange", "LetterNOrange"),
		LETTER_O_ORANGE("letter_o_orange", "LetterOOrange"),
		LETTER_P_ORANGE("letter_p_orange", "LetterPOrange"),
		LETTER_Q_ORANGE("letter_q_orange", "LetterQOrange"),
		LETTER_R_ORANGE("letter_r_orange", "LetterROrange"),
		LETTER_S_ORANGE("letter_s_orange", "LetterSOrange"),
		LETTER_T_ORANGE("letter_t_orange", "LetterTOrange"),
		LETTER_U_ORANGE("letter_u_orange", "LetterUOrange"),
		LETTER_V_ORANGE("letter_v_orange", "LetterVOrange"),
		LETTER_W_ORANGE("letter_w_orange", "LetterWOrange"),
		LETTER_X_ORANGE("letter_x_orange", "LetterXOrange"),
		LETTER_Y_ORANGE("letter_y_orange", "LetterYOrange"),
		LETTER_Z_ORANGE("letter_z_orange", "LetterZOrange");
		
		private String unlocalizedName;
		private String registryName;
		
		FirstLetterBlocks(String unlocalizedName, String registryName) {
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
	public static enum FirstLetterColourBlocks {
		BlOCK_LETTER("block_letter", "BlockLetter"),
		BLOCK_LETTER_ORANGE("block_letter_orange", "BlockLetterOrange");
		
		private String unlocalizedName;
		private String registryName;
		
		FirstLetterColourBlocks(String unlocalizedName, String registryName) {
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