public class App {
    public static void main(String[] args) {
       
        Weapon longsword = new Weapon();

        longsword.Name = "Common Sword";
        longsword.Damage = 12;
        longsword.Weight = 6;
        longsword.Rarity = "Common";
        longsword.weaponDescription = "A cheap sword which is used mostly by common enemies.";
        longsword.sayMyName();
        longsword.sayMyRarity();
        longsword.sayMyweaponDescription();
    
        Weapon sword = new Weapon();

        sword.Name = "The Alley Flash";
        sword.Damage = 45;
        sword.Weight = 2;
        sword.Rarity = "Rare";
        sword.weaponDescription = "A straight sword as black as the night. It once belonged to a thief who roamed the benighted streets.";
        sword.sayMyName();
        sword.sayMyRarity();
        sword.sayMyweaponDescription();

        Weapon bow = new Weapon();

        bow.Name = "Polar Star";
        bow.Damage = 47;
        bow.Weight = 4;
        bow.Rarity = "Legendary";
        bow.weaponDescription = "A pristine bow that is as sharp as the glaciers of the far north.";
        bow.sayMyName();
        bow.sayMyRarity();
        bow.sayMyweaponDescription();
    }

}
