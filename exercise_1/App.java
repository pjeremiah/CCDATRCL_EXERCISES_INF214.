public class App {
    public static void main(String[] args) {
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        // Enemy Class
        Enemy boss = new Enemy();

        boss.damage = 50;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();


        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();
       
        // Weapon Class
        Weapon longsword = new Weapon();

        longsword.Name = "Common Sword";
        longsword.Damage = 12;
        longsword.Weight = 6;
        longsword.Rarity = "Common";
        longsword.weaponDescription = "A cheap sword which is used mostly by common enemies.";
        longsword.sayName();
        longsword.sayDamage();
        longsword.sayWeight();
        longsword.sayRarity();
        longsword.sayweaponDescription();
    
        Weapon sword = new Weapon();

        sword.Name = "The Alley Flash";
        sword.Damage = 45;
        sword.Weight = 2;
        sword.Rarity = "Rare";
        sword.weaponDescription = "A straight sword as black as the night. It once belonged to a thief who roamed the benighted streets.";
        sword.sayName();
        sword.sayDamage();
        sword.sayWeight();
        sword.sayRarity();
        sword.sayweaponDescription();

        Weapon bow = new Weapon();

        bow.Name = "Polar Star";
        bow.Damage = 47;
        bow.Weight = 4;
        bow.Rarity = "Legendary";
        bow.weaponDescription = "A pristine bow that is as sharp as the glaciers of the far north.";
        bow.sayName();
        bow.sayDamage();
        bow.sayWeight();
        bow.sayRarity();
        bow.sayweaponDescription();
    }

}
