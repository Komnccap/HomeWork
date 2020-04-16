public class Employee {
    public static void main(String[] args) {
         String[] name = new String[]{"Salem","Rios","Devastator", "Olgerd", "Varlaam"};
         int[] age = new int[]{49, 46, 20, 29,34};
         int[] wage = new int[]{30000, 20000, 15000, 18500, 24700};

            System.out.println("Имя " + name[0] + ", Возраст " + age[0] + ", ЗП " + wage[0]);
                if(age[0] > 45) {
                    System.err.println("У сотрудника по имени " + name[0] + " Увеличивается зп и составляет " + (wage[0] + 5000));
                }
            System.out.println("Имя " + name[1] + ", Возраст " + age[1] + ", ЗП " + wage[1]);
                if(age[1] > 45) {
                    System.err.println("У сотрудника по имени " + name[1] + " Увеличивается зп и составляет " + (wage[1] + 5000));
                }
            System.out.println("Имя " + name[2] + ", Возраст " + age[2] + ", ЗП " + wage[2]);
                if(age[2] > 45) {
                    System.err.println("У сотрудника по имени " + name[2] + " Увеличивается зп и составляет " + (wage[2] + 5000));
                }
            System.out.println("Имя " + name[3] + ", Возраст " + age[3] + ", ЗП " + wage[3]);
                if(age[3] > 45) {
                    System.err.println("У сотрудника по имени " + name[3] + " Увеличивается зп и составляет " + (wage[3] + 5000));
                }
            System.out.println("Имя " + name[4] + ", Возраст " + age[4] + ", ЗП " + wage[4]);
                if(age[4] > 45) {
                    System.err.println("У сотрудника по имени " + name[4] + " Увеличивается зп и составляет " + (wage[4] + 5000));
             }
            System.out.println("Средняя зп ровна: " + (wage[0] + wage[1] + wage[2] + wage[3] + wage[4]) / (3));

    }
}
