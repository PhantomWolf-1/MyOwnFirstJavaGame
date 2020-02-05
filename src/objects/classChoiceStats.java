package objects;



public class classChoiceStats {

    private int health;
    private int attack;
    private double critchance;
    private double blockChance;


    public classChoiceStats() {
    }


    public void setKnight(Player player){

        this.health = 10;
        this.attack = 5;
        this.blockChance = 0.25;
        this.critchance = 0.10;

        player.setHealth(this.health);
        player.setAttack(this.attack);
        player.setBlockChance(this.blockChance);
        player.setCritChance(this.critchance);
    }

    public void setArcher(Player player){

        this.health = 6;
        this.attack = 5;
        this.blockChance = 0.33;
        this.critchance = 0.20;

        player.setHealth(this.health);
        player.setAttack(this.attack);
        player.setBlockChance(this.blockChance);
        player.setCritChance(this.critchance);
    }
    public void setMage(Player player){

        this.health = 8;
        this.attack = 7;
        this.blockChance = 0.10;
        this.critchance = 0.20;

        player.setHealth(this.health);
        player.setAttack(this.attack);
        player.setBlockChance(this.blockChance);
        player.setCritChance(this.critchance);
    }



    @Override
    public String toString() {
        return "classChoiceStats{" +
                "health=" + health +
                ", attack=" + attack +
                ", critchance=" + critchance +
                ", blockChance=" + blockChance * 100 + "%" +
                '}';
    }
}
