package org.arathok.wurmunlimited.mods.armoursets;

import com.wurmonline.server.creatures.Communicator;
import org.gotti.wurmunlimited.modloader.interfaces.*;
import com.wurmonline.server.creatures.SpellEffects;
import com.wurmonline.server.players.Player;
import com.wurmonline.server.Players;

import com.wurmonline.server.spells.SpellEffect;

import java.util.Properties;

public class armoursets implements WurmServerMod, Initable, PreInitable, Configurable, ItemTemplatesCreatedListener, ServerStartedListener, ServerPollListener, PlayerMessageListener {
    @Override
    public void configure(Properties properties) {

    }

    @Override
    public void onItemTemplatesCreated() {

    }

    @Override
    public void onServerPoll() {
    Player p;
    long wurmId = 0;
        p = Players.getInstance().getPlayerOrNull(wurmId);
    if (p.getArmourType()==null)
    {
    }

    }

    @Override
    public void onServerStarted() {

    }

    @Override
    public MessagePolicy onPlayerMessage(Communicator communicator, String message, String title) {
        return PlayerMessageListener.super.onPlayerMessage(communicator, message, title);
    }

    @Override
    public boolean onPlayerMessage(Communicator communicator, String s) {
        return false;
    }

    @Override
    public void init() {
        WurmServerMod.super.init();
    }

    @Override
    public void preInit() {
        WurmServerMod.super.preInit();
    }
}
