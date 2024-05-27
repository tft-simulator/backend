package dual.project.tftsimulator.lol_Data.Item;

import org.springframework.stereotype.Component;

@Component
public class ItemInfo { // 고정방식
    public static final Item GUINSOOS = new ItemImpl("구인수");
    public static final Item muhanui_daegeom  = new ItemImpl("무한의 대검");
    public static final Item LAST_WHISPER = new ItemImpl("최후의 속삭임");
    public static final Item PHANTOM_DANCER = new ItemImpl("피바라기");
    public static final Item GIANTS_BELT = new ItemImpl("거인의 결의");
    public static final Item NIGHTBRINGER = new ItemImpl("밤의 끝자락");
    public static final Item THORNMAIL = new ItemImpl("돌갑옷");
    public static final Item REDEMPTION = new ItemImpl("구원");
    public static final Item WARMONGS_ARMOR = new ItemImpl("워모그");
}