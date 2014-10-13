package bowwars;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import bowwars.commands.MainCommand;
import bowwars.listeners.AreaListener;

public class Main extends JavaPlugin {

    private final AreaListener areaListener = new AreaListener(this);
    private final MainCommand mainCommand = new MainCommand(this);
    
    @Override
    public void onEnable() {
        this.getCommand("bowwars").setExecutor(mainCommand);
        this.getCommand("bowwars").setTabCompleter(mainCommand);
        this.getServer().getPluginManager().registerEvents(areaListener, this);
        
        
        ShapedRecipe grenadelauncher = new ShapedRecipe(makeItem(Material.BOW, 1, 0, ChatColor.GOLD + "Grenade launcher", "", ChatColor.GRAY + "Will be changed soon!"))
        .shape("GGG", "GBG", "GRG")
        .setIngredient('G', Material.SULPHUR)
        .setIngredient('B', Material.BOW)
        .setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(grenadelauncher);
        
        ShapedRecipe ak = new ShapedRecipe(makeItem(Material.BOW, 1, 0, ChatColor.GOLD + "AK 47", "", ChatColor.GRAY + "Will be changed soon!"))
        .shape("AAA", "ABA", "ARA")
        .setIngredient('A', Material.ARROW)
        .setIngredient('B', Material.BOW)
        .setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(ak);
        
        ShapedRecipe magnum = new ShapedRecipe(makeItem(Material.BOW, 1, 0, ChatColor.GOLD + "Magnum", "", ChatColor.GRAY +  "Will be changed soon!"))
        .shape("A A", " B ", "ARA")
        .setIngredient('A', Material.ARROW)
        .setIngredient('B', Material.BOW)
        .setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(magnum);
    }

    @Override
    public void onDisable() {
        
    }
    
    public ItemStack makeItem(Material m, int amount, int shrt, String name, String lore_1, String lore_2){
    	ItemStack stack = new ItemStack(m, amount, (short) shrt);
    	ItemMeta meta = stack.getItemMeta();
    	meta.setDisplayName(name);
    	List<String> lore = new ArrayList<String>();
    	lore.add(lore_1);
    	lore.add(lore_2);
    	meta.setLore(lore);
    	stack.setItemMeta(meta);
    	return stack;
    }
    
}
