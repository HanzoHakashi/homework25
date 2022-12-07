import java.util.Scanner;

public class Game {

    public  String getFigure(int choice){
        if (choice == 1){
            return Figure.ROCK.getValue();
        } else if (choice == 2) {
            return Figure.SCISSORS.getValue();
        } else if (choice == 3) {
            return Figure.PAPER.getValue();
        } else if (choice == 4) {
            return Figure.LIZARD.getValue();
        } else if (choice == 5) {
            return Figure.SPOK.getValue();
        } else {
            System.out.println("Такой фигуры нет");
            return getFigure(choice);
        }

    }

    public void getGame(){
        java.util.Random r = new java.util.Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Сыграем в камень ножницы бумагу");
        String rock = Figure.ROCK.getValue();
        String paper = Figure.PAPER.getValue();
        String scissors = Figure.SCISSORS.getValue();
        String lizard = Figure.LIZARD.getValue();
        String spok = Figure.SPOK.getValue();
        int round = 0;
        int wins = 0;
        int loses = 0;
        int draws = 0;
        while (round < 6) {
            System.out.println("Выберите свою фигуру: Камень (1), Ножницы (2), Бумага (3), Ящерица (4), Спок (5)");
            int choice = sc.nextInt();
            String you = getFigure(choice);
            int compF = r.nextInt(5)+1;
            String comp = getFigure(compF);
            if (you == rock && comp == scissors || you == scissors && comp == paper|| you == paper && comp == rock || you == rock && comp == lizard || you == paper && comp == spok || you == scissors && comp == lizard || you == lizard && comp == spok || you == lizard && comp == paper || you == spok && comp == scissors || you == spok && comp == rock ){
                System.out.printf("Вы поставили %s, Противник выбрал %s%n",you,comp);
                System.out.println("Очко в Вашу пользу");
                wins++;
            } else if (you == scissors && comp == rock || you == paper && comp == scissors || you == rock && comp == paper || comp == rock && you == lizard || comp == paper && you == spok || comp == scissors && you == lizard || comp == lizard && you == spok || comp == lizard && you == paper || comp == spok && you == scissors || comp == spok && you == rock) {
                System.out.printf("Вы поставили %s, Противник выбрал %s%n",you,comp);
                System.out.println("Победа в пользу противника");
                loses++;
            } else if (you == comp) {
                System.out.println("Ничья");
                draws++;
            }
            round++;
        }
        int winrate = Math.abs((wins * 100)/6);
        System.out.println("+--------+-----------+-------+-----------+---------------+");
        System.out.println("| Победа | Поражение | Ничья | Всего игр | Процент побед |");
        System.out.println("|--------+-----------+-------+-----------+---------------|");
        System.out.printf("|%-8s|%-11s|%-7s|%-11s|%-13s %s|%n",wins,loses,draws,round,winrate,"%");
        System.out.println("+--------+-----------+-------+-----------+---------------+");

    }

}
