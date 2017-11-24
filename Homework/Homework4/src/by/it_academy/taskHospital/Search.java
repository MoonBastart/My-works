package by.it_academy.taskHospital;

import java.util.Scanner;

public class Search {
    public static void main(String[] arg) {

        Patients[] patientsArray = new Patients[10];

        Patients patient_1 = new Patients("Троцкий", "Андрей", "Николаевич", Patients.gender_identity.Мужской, 14, "Ожоги первой степени");
        Patients patient_2 = new Patients("Забольская", "Мария", "Никифоровна", Patients.gender_identity.Женский, 22, "Аллергическая реакция");
        Patients patient_3 = new Patients("Максимович", "Иван", "Анатольевич", Patients.gender_identity.Мужской, 35, "Вывих коленного сустава");
        Patients patient_4 = new Patients("Феминова", "Клаудия", "Степановна", Patients.gender_identity.Женский, 22, "Грипп");
        Patients patient_5 = new Patients("Петренко", "Андрей", "Юрьевич", Patients.gender_identity.Женский, 7, "Не выявлено");
        Patients patient_6 = new Patients("Притыцкая", "Екатеррина", "Сергеевна", Patients.gender_identity.Женский, 9, "Не глубокий порез предплечья 7 мм ");
        Patients patient_7 = new Patients("Акрилова", "Дарья", "Леонидовна", Patients.gender_identity.Женский, 17, "Отравление пищевыми продуктами");
        Patients patient_8 = new Patients("Каменецкий", "Валентин", "Артемович", Patients.gender_identity.Мужской, 42, "Ослабление иммунитета");
        Patients patient_9 = new Patients("Забагульский", "Кирилл", "Афанасьевич", Patients.gender_identity.Мужской, 33, "Перелом левого бедра");
        Patients patient_10 = new Patients("Помелова", "Анастасия", "Андреевна", Patients.gender_identity.Женский, 4, "Ветрянка");

        patientsArray [0] = patient_1;
        patientsArray [1] = patient_2;
        patientsArray [2] = patient_3;
        patientsArray [3] = patient_4;
        patientsArray [4] = patient_5;
        patientsArray [5] = patient_6;
        patientsArray [6] = patient_7;
        patientsArray [7] = patient_8;
        patientsArray [8] = patient_9;
        patientsArray [9] = patient_10;

        for (Patients patients: patientsArray) {
            printPatients(patients);
        }

        for (Patients patients: patientsArray) {
            enter(patients);
            break;
        }
    }



    public static void printPatients (Patients patients) {
        System.out.println("Пациент " + patients.getFull_Name() + " - Возраст = " + "\"" + patients.getAge() + "\"");
    }

    public static void consoleAge (Patients patients) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //for (Patients patients: patientsArray) {
            if (number == patients.getAge()) {
                System.out.println("Пациент " + patients.getFull_Name() + " - пол: " + patients.getType() + ", Возраст: " + patients.getAge() +
                        ", Детское отделение: " + patients.isChildrenDepartment() + ", Диагноз: " + "\"" + patients.getDiagnosis() + "\"");
            } else {
                    System.out.println("Совпадений не найдено");
                }

        //}
    }

    public static void consoleName (Patients patients) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        //for (Patients patients: patientsArray) {
        if (name1.equals(patients.getName()) == true) {
            System.out.println("Пациент " + patients.getFull_Name() + " - пол: " + patients.getType() + ", Возраст: " + patients.getAge() +
                    ", Детское отделение: " + patients.isChildrenDepartment() + ", Диагноз: " + "\"" + patients.getDiagnosis() + "\"");
        } else {
            System.out.println("Совпадений не найдено");
        }
    //}
    }

    public static void enter (Patients patients) {

        System.out.println("\n\nВведите \"1\" для поиска по имени\n" +
                "Введите \"2\" для поиска по возрасту\n" +
                "Введите \"3\" для выхода из поиска\n" +
                "Итак, ваш выбор:");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        if (choise == 1) {
            System.out.println("Введите, пожалуйста, имя:");
            consoleName(patients);
        }
        if (choise == 2) {
            System.out.println("Введите, пожалуйста, возраст:");
            consoleAge(patients);
        }
        if (choise == 3) {
            System.out.println("Программа закрывается");
        }

    }


}


