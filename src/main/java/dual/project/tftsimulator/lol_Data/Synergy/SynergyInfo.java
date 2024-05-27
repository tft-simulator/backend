package dual.project.tftsimulator.lol_Data.Synergy;

import org.springframework.stereotype.Component;

@Component
public class SynergyInfo {
    public static final Synergy POTTERY = new SynergyImpl("도자기");
    public static final Synergy SNIPER = new SynergyImpl("저격수");
    public static final Synergy INEVITABLE = new SynergyImpl("필연");
    public static final Synergy VANGUARD = new SynergyImpl("파수꾼");
    public static final Synergy SPIRIT = new SynergyImpl("혼령");
    public static final Synergy MAGE = new SynergyImpl("비전 마법사");
    public static final Synergy SHADE = new SynergyImpl("암영");
    public static final Synergy MYTHIC = new SynergyImpl("신화");
    public static final Synergy ARTIST = new SynergyImpl("예술가");
}