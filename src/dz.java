//public class dz {
//    1 ДЗ
//    public class Main {
//
//        public static void main(String[] args) {
//            String str = new String();
//            String exit = "exit";
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Напишите слово 'Выход' на английском: ");
//            while (str != exit) {
//                str = scan.nextLine();
//                System.out.print("Введите что-нибудь еще: ");
//                if (str.equalsIgnoreCase(exit)) {
//                    System.out.print("Молодцом, вы угадали слово");
//                    break;
//                }
//            }
//        }
//    }
//
//2 ДЗ
//
//    public class Main {
//
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            System.out.print("Введите любое число и мы посчитаем сумм от 0 до этого числа: ");
//            int x = scan.nextInt();
//            int sum = 0;
//            for (int i = 0; i<=x; i++) {
//                sum += i;
//            } if (x < 0) {
//                for (int i = -1; i >= x; i--)
//                    sum -= i;
//                System.out.printf("Число от 0 до введенного вами числа %d получается %d", x, -sum);
//            } else
//                System.out.printf("Число от 0 до введенного вами числа %d получается %d", x, sum);
//        }
//
//    }
//
//3 ДЗ
//    public class Main {
//
//        public static void main(String[] args) {
//            System.out.print("Введите свой балл:") ;
//            Scanner scan = new Scanner(System.in);
//            int chisel = scan.nextInt();
//            while (true) {
//                if (chisel <= 100 && chisel >=71) {
//                    System.out.println("Ваш уровень A!");
//                    break;
//                } else if (chisel <= 70 && chisel >=61) {
//                    System.out.println("Ваш уровень B!");
//                    break;
//                } else if (chisel <= 60 && chisel >=51) {
//                    System.out.println("Ваш уровень C!");
//                    break;
//                } else if (chisel <= 50 && chisel >=41) {
//                    System.out.println("Ваш уровень D!");
//                    break;
//                } else if (chisel <= 40 && chisel >=0) {
//                    System.out.print("Ваш уровень F!");
//                    break;
//                } else {
//                    System.out.print("Некорректное число, введите его еще раз: ");
//                    chisel = scan.nextInt();
//                }
//            }
//        }
//    }
//
//    ДЗ4
//    public class Main {
//
//        public static void main(String[] args) {
//            String[] canal = new String[]{"Выход", "Первый калал.", "Второй канал.", "Третий канал.", "Четвертый канал."};
//            System.out.print("Поддерживаемые каналы 1, 2, 3, 4. Введите номер канала: ");
//            Scanner scan = new Scanner(System.in);
//            int x = scan.nextInt();
//            while (true) {
//                if (x == 1) {
//                    System.out.print(canal[1]);
//                    System.out.print(" Можете попробовать ввести еще один канал: ");
//                    x = scan.nextInt();
//                } else if (x == 2) {
//                    System.out.print(canal[2]);
//                    System.out.print(" Можете попробовать ввести еще один канал: ");
//                    x = scan.nextInt();
//                } else if (x == 3) {
//                    System.out.print(canal[3]);
//                    System.out.print(" Можете попробовать ввести еще один канал: ");
//                    x = scan.nextInt();
//                } else if (x == 4) {
//                    System.out.print(canal[4]);
//                    System.out.print(" Можете попробовать ввести еще один канал: ");
//                    x = scan.nextInt();
//                } else if (x == 0) {
//                    System.out.print(canal[0]);
//                    break;
//                } else {
//                    System.out.print("Введен неподдерживаемый канал, введите канал еще раз: ");
//                    x = scan.nextInt();
//                }
//            }
//        }
//    }
//
//
//}
