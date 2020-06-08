package gb.l4;

public class MainClass {
    public static void main (String[] args) {
        Workers[] workArrays = new Workers[5];
        workArrays[0] = new Workers("Иванов Иван Иванович", "Сантехник", "sant@mail.ru", "89130000001", "20000.00", 32);
        workArrays[1] = new Workers("Петров Петр Иванович", "Слесарь", "sl@mail.ru", "89130000002", "20000.00", 22);
        workArrays[2] = new Workers("Сидоров Иван Петрович", "Столяр", "st@mail.ru", "89130000003", "20000.00", 39);
        workArrays[3] = new Workers("Романов Роман Владимирович", "Плотник", "plot@mail.ru", "89130000004", "20000.00", 52);
        workArrays[4] = new Workers("Дмитриев Дмитрий Иванович", "Электрик", "el@mail.ru", "89130000005", "20000.00", 42);
        int i;
        for (i=0; i < workArrays.length;i++)
        {if (workArrays[i].age > 40) workArrays[i].voice();};
    }
}
