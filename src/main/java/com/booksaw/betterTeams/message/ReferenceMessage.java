package com.booksaw.betterTeams.message;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * This type of message is used when you are referencing a message stored in
 * messages.yml
 *
 * @author booksaw
 */
public class ReferenceMessage implements Message {

	final String reference;

	/**
	 * @param reference The reference for the message
	 */
	public ReferenceMessage(String reference) {
		this.reference = reference;
	}

	@Override
	public void sendMessage(CommandSender sender) {
		MessageManager.sendMessage(sender, reference);
	}

	@Override
	public void sendTitle(Player player) {
		MessageManager.sendTitle(player, reference);
	}
}
