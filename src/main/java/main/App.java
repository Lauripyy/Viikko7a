package main;

import java.util.Scanner;

public class App {
    public static void main( String[] args ){
        
         Scanner sc = new Scanner(System.in);

         boolean exit = false;

         System.out.println("Tervetuloa Gifu-järjestelmään");
         System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
         String university = sc.nextLine();

         Gifu gifu = new Gifu(university);


        while(!exit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");

            if(sc.hasNextLine()) {
                int i = Integer.parseInt(sc.nextLine());
                

                switch(i) {
                    case 1:
                        
                    
                    
                         System.out.println("Anna kurssin nimi:");
                            String name = sc.nextLine();
                            System.out.println("Anna kurssin ID:");
                            String Id = sc.nextLine();
                            System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                            String stringmaxNumberOfStudents = sc.nextLine();
                            int maxNumberOfStudents = Integer.parseInt(stringmaxNumberOfStudents);
                            Course course= new Course(name, Id, maxNumberOfStudents);

                            gifu.addCourse(course);
                            

                        
                        break;
                    case 2:
                        
                        System.out.println("Anna opiskelijan nimi:");
                        String studentName = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        String StudentID = sc.nextLine();
                        Student student =new Student(studentName,StudentID);

                        gifu.addStudent(student);
            
                        break;
                    case 3:
                        gifu.listCourses();
                        
                        
                        break;
                    case 4:
                        gifu.listStudents();
                        
                        break;


                    case 5:
                        
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }

        }
    sc.close();

    }
    
    





}
