package satisfish.com;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import satisfish.com.item.ModItems;

public class Satisfsh implements ModInitializer {
	public static final String MOD_ID = "satisfsh";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Satisfsh.LOGGER.info("Initializing mod: " + Satisfsh.MOD_ID);
		ModItems.registerModItems();
	}
}