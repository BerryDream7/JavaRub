public class Main {
    public static void main(String[] args) {

        int InitialAccount = 620;
        int add = 1480;

        int bonus = 0;
        if (add > 1000) {
            bonus = add / 100;
        }

        int finalAccount = InitialAccount + add + bonus;

        System.out.println("Итоговый счет:" + finalAccount);
        System.out.println("Бонус:" + bonus);


    }
}