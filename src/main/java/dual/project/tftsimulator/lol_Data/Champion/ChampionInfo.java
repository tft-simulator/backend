package dual.project.tftsimulator.lol_Data.Champion;

import java.util.ArrayList;
import java.util.List;

public class ChampionInfo {
    public List<Champion> createChampions() { //변동 방식
        List<Champion> champions = new ArrayList<>();

        champions.add(new ChampionImpl("애쉬", "구인수, 무한의 대검, 최후의 속삭임", "도자기, 저격수"));
        champions.add(new ChampionImpl("아펠리오스", "", "필연, 저격수"));
        champions.add(new ChampionImpl("노틸러스", "", "신화, 파수꾼"));
        champions.add(new ChampionImpl("아무무", "돌갑옷, 구원, 워모그", "도자기, 파수꾼"));
        champions.add(new ChampionImpl("일라오이", "", "혼령, 비전 마법사, 파수꾼"));
        champions.add(new ChampionImpl("신드라", "", "필연, 비전 마법사"));
        champions.add(new ChampionImpl("흐웨이", "", "신화, 예술가"));
        champions.add(new ChampionImpl("세트", "피바라기, 거인의 결의, 밤의 끝자락", "필연, 암영, 파수꾼"));

        return champions;
    }
}