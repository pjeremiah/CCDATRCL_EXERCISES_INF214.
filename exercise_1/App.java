public class App {
    public static void main(String[] args) {
       
        Weapon longsword = new Weapon();

        longsword.Name = "Common Sword";
        longsword.Damage = 12;
        longsword.Weight = 6;
        longsword.Rarity = "Common";
        longsword.weaponDescription = "A cheap sword which is used mostly by common enemies.";
        longsword.sayName();
        longsword.sayRarity();
        longsword.sayweaponDescription();
    
        Weapon sword = new Weapon();

        sword.Name = "The Alley Flash";
        sword.Damage = 45;
        sword.Weight = 2;
        sword.Rarity = "Rare";
        sword.weaponDescription = "A straight sword as black as the night. It once belonged to a thief who roamed the benighted streets.";
        sword.sayName();
        sword.sayRarity();
        sword.sayweaponDescription();

        Weapon bow = new Weapon();

        bow.Name = "Polar Star";
        bow.Damage = 47;
        bow.Weight = 4;
        bow.Rarity = "Legendary";
        bow.weaponDescription = "A pristine bow that is as sharp as the glaciers of the far north.";
        bow.sayName();
        bow.sayRarity();
        bow.sayweaponDescription();
    }

}
