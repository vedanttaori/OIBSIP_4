package OIBSIP2;

import java.util.*;
    class OnlineExamSystem
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> info = new HashMap<String,Integer>();
        public void login()
        {
            info.put("vedant0",151515);
            info.put("vedant1",252525);
            info.put("vedant3",353535);
            info.put("vedant4",454545);
            info.put("vedant5",555555);
            String id;
            int pwd;
            System.out.println("Welcome to Oasis IB Exam Portal");
            System.out.println("---------LOGIN-----------");
            System.out.println("Enter Username:");
            id = sc.next();
            System.out.println("Enter Password:");
            pwd = sc.nextInt();
            if(info.containsKey(id) && info.get(id)==pwd)
            {
                System.out.println("\nLogin successful!");
                menu();
            }
            else
            {
                System.out.println("\nInvalid Username or Password.\nTry again!!!\n");
                login();
            }
        }
        public void menu()
        {
            int ch;
            System.out.println("\nEnter your Choice:");
            System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    info = update();
                    menu();
                    break;
                case 2:
                    startExam();
                    menu();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!!! Choose correct choice");
            }
        }
        public HashMap<String,Integer> update()
        {
            String update_id;
            int update_pwd;
            System.out.println("Enter Username:");
            update_id = sc.next();
            System.out.println("Enter Old Password:");
            update_pwd = sc.nextInt();
            if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
            {
                System.out.println("Enter New Password:");
                update_pwd = sc.nextInt();
                info.replace(update_id,update_pwd);
                System.out.println("Password Changed Successfully!!!");
            }
            else
            {
                System.out.println("User not found.\n");
            }
            return info;
        }
        public void startExam()
        {
            long startTime = System.currentTimeMillis();
            long endTime = startTime + 30;
            int score = 0,ans;

            while(System.currentTimeMillis()<endTime)
            {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Q1.What is the new generation of storage devices used in computers?");
                System.out.println("1.SSD \t2.PCI Card \t3.Joystick \t4.None");
                System.out.print("Enter Option: ");
                ans = sc.nextInt();
                if(ans == 1)
                    score+=5;
                else
                    score--;

                System.out.println("-------------------------------------------------------------");
                System.out.println("Q2.The World Wide Web(www) was invented by ?");
                System.out.println("1.Bill Gates\t2.Tim Berners-Lee\t3.Steve Rogers\t4.Ratan Tata");
                System.out.print("Enter Option: ");
                ans = sc.nextInt();
                if(ans == 2)
                    score+=5;
                else
                    score--;

                System.out.println("-------------------------------------------------------------");
                System.out.println("Q3.What is the barin of computer system?");
                System.out.println("1.RAM\t2.CPU\t3.ROM\t4.Eclipse");
                System.out.print("Enter Option: ");
                ans = sc.nextInt();
                if(ans == 2)
                    score+=5;
                else
                    score--;

                System.out.println("-------------------------------------------------------------");
                System.out.println("Q4.What is full form of RAM?");
                System.out.println("1.Read Access Memory\t2.Rellocate Automatic Memeory\t3.Random Access Memory\t4.Remote Allocated Memory");
                System.out.print("Enter Option: ");
                ans = sc.nextInt();
                if(ans == 3)
                    score+=5;
                else
                    score--;

                System.out.println("-------------------------------------------------------------");
                System.out.println("Q5.Which of the following is not a input device?");
                System.out.println("1.Keyboard\t2.Mouse\t3.Microphone\t4.Speakers");
                System.out.print("Enter Option: ");
                ans = sc.nextInt();
                if(ans == 4)
                    score+=5;
                else
                    score--;
                System.out.println("-------------------------------------------------------------");
                break;
            }
            System.out.println("Exam Finished!!!");
            System.out.println();
            System.out.println("Your Score is "+score);
            if(score>10)
                System.out.println("Congratulations you passed!!!");
            else
                System.out.println("Better Luck Next Time!!!");
        }
        public static void main(String args[])
        {
            OnlineExamSystem obj  = new OnlineExamSystem();
            obj.login();
        }
    }

