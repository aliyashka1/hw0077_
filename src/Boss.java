class Boss extends Hero {
public Boss(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
        }
@Override
public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbilityType + ";");
        }
class Medic extends Hero {
    public Medic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbilityType + ";");
    }
class Warrior extends Hero {
    public Warrior(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + superAbilityType + ";");
    }
}}}
