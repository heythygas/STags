package me.shady.tags;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(("§e"));
		Bukkit.getConsoleSender().sendMessage(("§ePLUGIN §6STAGS §eINICIADO"));
		Bukkit.getConsoleSender().sendMessage(("§e"));
	}
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(("§e"));
		Bukkit.getConsoleSender().sendMessage(("§cPLUGIN §STAGS §cDESLIGADO"));
		Bukkit.getConsoleSender().sendMessage(("§e"));
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(sender instanceof Player) {
			Player p = (Player)sender;
			if(command.getName().equalsIgnoreCase("tag")) {
				if(args.length == 0) {
					p.sendMessage(("§cVocê precisa digitar alguma tag."));
					p.sendMessage("§cSua tag atual: " + p.getDisplayName());
					p.sendMessage("§cLista de tags: §b§lDEV§c, §4§lDONO§c, §C§lGERENTE§c, §C§lADMIN§c, §2§lMOD§c, §E§lAJUDANTE§c, §C§lYT§3§L+§c, §C§lYT§c, §6§lMVP§B§L+§c, §6§lMVP§c, §A§lVIP§B§L+§c, §A§lVIP§c, §7§LNORMAL§c.");
					p.playSound(p.getLocation() ,Sound.VILLAGER_NO, 1, 1);
					return true;
				}
				if(args[0].equalsIgnoreCase(("dev"))) {
					if(!p.hasPermission("stags.dev")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §bDEVELOPER§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§B§lDEVELOPER §7" + p.getName() + "§f");
					p.setPlayerListName("§B§lDEVELOPER §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("dono"))) {
					if(!p.hasPermission("stags.dono")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §4DONO§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§4§lDONO §7" + p.getName() + "§f");
					p.setPlayerListName("§4§lDONO §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("gerente"))) {
					if(!p.hasPermission("stags.gerente")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §cGERENTE§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§c§lGERENTE §7" + p.getName() + "§f");
					p.setPlayerListName("§c§lGERENTE §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("admin"))) {
					if(!p.hasPermission("stags.admin")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §cADMIN§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§c§lADMIN §7" + p.getName() + "§f");
					p.setPlayerListName("§c§lADMIN §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("mod"))) {
					if(!p.hasPermission("stags.mod")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §2MODERADOR§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§2§lMOD §7" + p.getName() + "§f");
					p.setPlayerListName("§2§lMOD §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("yt+"))) {
					if(!p.hasPermission("stags.ytplus")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §cYT§3+§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§c§lYT§3§l+ §7" + p.getName() + "§f");
					p.setPlayerListName("§c§lYT§3§l+ §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("yt"))) {
					if(!p.hasPermission("stags.yt")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §cYT§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§C§lYT §7" + p.getName() + "§f");
					p.setPlayerListName("§C§lYT §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("ajudante"))) {
					if(!p.hasPermission("stags.ajudante")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §eAJUDANTE§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§E§lAJUDANTE §7" + p.getName() + "§f");
					p.setPlayerListName("§E§lAJUDANTE §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("mvp+"))) {
					if(!p.hasPermission("stags.mvpplus")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §6MVP§B+§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§6§lMVP§B§L+ §7" + p.getName() + "§f");
					p.setPlayerListName("§6§lMVP§B§L+ §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("mvp"))) {
					if(!p.hasPermission("stags.mvp")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §6MVP§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§6§lMVP §7" + p.getName() + "§f");
					p.setPlayerListName("§6§lMVP §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("vip+"))) {
					if(!p.hasPermission("stags.vipplus")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §aVIP§B+§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§a§lVIP§B§L+ §7" + p.getName() + "§f");
					p.setPlayerListName("§a§lVIP§B§L+ §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("vip"))) {
					if(!p.hasPermission("stags.vip")) {
						p.sendMessage("§cVocê não tem permissão para usar esta tag.");
						return true;
					}
					p.sendMessage("§aYay! Tag alterada para §aVIP§a.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§a§lVIP §7" + p.getName() + "§f");
					p.setPlayerListName("§a§LVIP §7" + p.getName());
					}
				if(args[0].equalsIgnoreCase(("normal"))) {
					p.sendMessage("§aYay! Tag alterada para padrão.");
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
					p.setDisplayName("§f" + p.getName() + "§f");
					p.setPlayerListName("§f" + p.getName());
					}
				
			}
		} else {
			Bukkit.getConsoleSender().sendMessage(("§cComando apenas para jogadores in-game."));
		}
		
		return false;
	}
}
