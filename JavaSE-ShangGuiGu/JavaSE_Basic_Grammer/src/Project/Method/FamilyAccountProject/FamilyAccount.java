package Project.Method.FamilyAccountProject;

public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true; //用于停止循环
        double account = 0;
        String details = "收支\t\t账户金额\t\t收支金额\t\t具体描述\n"; //用于记录用户收入与支出的详情
        while (isFlag){
            Utility.menu();
            int Menu = Utility.readMenu(); //用变量Menu来接收readMenu方法的返回值
            switch (Menu){
                case 1:
                    System.out.println("---------------当前收支明细记录---------------");
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("本次收入金额: ");
                    Double money = Utility.readNumber();
                    account += money;
                    System.out.println("本次收入描述: ");
                    String info = Utility.readString();
                    details += ("收入\t\t" + account + "\t\t" + money + "\t\t" + info + "\n");
                    System.out.println("-----------------登记完成--------------------");
                    break;
                case 3:
                    System.out.println("本次支出金额");
                    Double zc = Utility.readNumber();
                    if (zc > account){
                        System.out.println("余额不足");
                        break;
                    }else {
                        account -= zc;
                    }
                    System.out.println("本次收入描述: ");
                    String print= Utility.readString();
                    details += ("支出\t\t" + account + "\t\t" + zc + "\t\t" + print + "\n");
                    System.out.println("-----------------登记完成--------------------");
                    break;
                case 4:
                    char isExit = Utility.readExit();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
            }
        }
    }
}
