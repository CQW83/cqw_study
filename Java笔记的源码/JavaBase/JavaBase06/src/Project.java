import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        //彩票系统
        //1.双色球
        //2.福彩3D（1.允许购买多个号码，2.购买号码可以选择（直选（1000）。组选（340）））
        //输入工具
        Scanner scanner = new Scanner(System.in);
        //控制循环
        boolean isLoop = true;
        //记录余额
        int money = 1;
        //随机数工具
        Random random = new Random();
        //最终得到的彩票号码
        int[] num = new int[7];
        int[] suji = new int[7];
        //循环
        while (isLoop) {
            System.out.println("欢迎进入彩票系统！");
            System.out.println("1.查看余额");
            System.out.println("2.充值");
            System.out.println("3.自选选号");
            System.out.println("4.机选");
            System.out.println("5.开奖");
            System.out.println("0.退出");
            System.out.println("请选择：");

            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("您的余额为:" + money + "元");
                    break;
                case 2:
                    System.out.println("充值活动：");
                    System.out.println("充100送20！充500送150！！充1000送400！！！");
                    System.out.println("请输入充值金额：");
                    int input =scanner.nextInt();
                    if (input >= 1000){
                        money += (input + 400);
                    }else if (input >= 500){
                        money += (input + 150);
                    }else if (input >= 100){
                        money += (input + 20);
                    }else if (input > 0){
                        money += input;
                    }else{
                        System.out.println("输入有误！充值失败");
                        break;
                    }
                    System.out.println("充值成功！当前余额为：" + money);
                    break;
                case 3:
                    if(money <= 2){
                        System.out.println("余额不足请充值!");
                        break;
                    }
                    //扣钱
                    money -=2 ;
                    //存储选择的号码
                    int[] number = new int[7];
                    //选择红球
                    for (int i = 0; i < 6; i++) {
                        System.out.println("请输入红球号码");
                        int red = scanner.nextInt();
                        //判断是否在[1,33]
                        if(red < 1 || red > 33){
                            System.out.println("输入人错误！请重输");
                            i--;
                            continue;
                        }
                        //判断输入的号码是否重复
                        boolean isRepeat = false;
                        for (int j = 0; j < i ; j++) {
                            if(red == number[j]){
                                isRepeat = true;
                                break;
                            }
                        }
                        //如果重复
                        if (isRepeat){
                            System.out.println("输入重复！请重输");
                            i--;
                            continue;
                        }
                        number[i] = red;
                    }
                    //选择篮球
                    while(true){
                        System.out.println("请输入篮球");
                        int blueQiu = scanner.nextInt();
                        if(1 > blueQiu ||blueQiu > 16){
                            System.out.println("输入有误！请重新输入");
                        }else{
                            number[6] = blueQiu;
                            break;
                        }
                    }
                    //对红球排序
                    for (int i = 0; i < number.length - 2; i++) {
                        for (int j = 0; j < number.length - 2 - i ; j++) {
                            if(number[j] > number[j + 1]){
                                int temp = number[j + 1];
                                number [j + 1] = number [j];
                                number[j] = temp;
                            }
                        }
                    }
                    //购买成功
                    System.out.println("购买成功");
                   //打印号码
                    System.out.println("购买的号码为");
                    for (int i = 0; i < 7; i++) {
                        num[i] = number[i];
                        System.out.printf("%02d ",number[i]);
                    }
                    System.out.println();
                    break;

                case 4:
                    if(money <= 2){
                    System.out.println("余额不足请充值!");
                    break;
                }
                    money -=2 ;
                    // 生成机码
                    int[] ran = new int[7];
                    //随机红球
                    for (int i = 0; i < 6; i++) {
                        int red = random.nextInt(33) + 1;
                        boolean isRepeat = false;
                        for (int j = 0; j < i ; j++) {
                            //判断是否重复
                            if(red == ran[j]){
                                isRepeat = true;
                                break;
                            }
                        }
                        //如果重复
                        if (isRepeat){
                            i--;
                            continue;
                        }
                        ran[i] = red;
                    }
                    //随机蓝球
                    ran[6] = random.nextInt(16) + 1;

                    //对红球排序
                    for (int i = 0; i < num.length - 2; i++) {
                        for (int j = 0; j < num.length - 2 - i ; j++) {
                            if(num[j] > num[j + 1]){
                                int temp = num[j + 1];
                                num [j + 1] = num [j];
                                num[j] = temp;
                            }
                        }
                    }
                    //打印随机码
                    System.out.println("购买成功");
                    System.out.println("随机码");
                    for (int i = 0; i < 7; i++) {
                        System.out.printf("%02d ",ran[i]);
                        num[i] = ran[i];
                    }
                    System.out.printf("\n");
                    break;

                case 5:
                    // 生成中奖号码
                    int[] prize = new int[7];
                    //随机红球
                    for (int i = 0; i < 6; i++) {
                        int red = random.nextInt(33) + 1;
                        boolean isRepeat = false;
                        for (int j = 0; j < i ; j++) {
                            //判断是否重复
                            if(red == prize[j]){
                                isRepeat = true;
                                break;
                            }
                        }
                        //如果重复
                        if (isRepeat){
                            i--;
                            continue;
                        }
                        prize[i] = red;
                    }
                    //随机蓝球
                    prize[6] = random.nextInt(16) + 1;
                    //打印中奖号码
                    System.out.println("中奖号码");
                    for (int i = 0; i < 7; i++) {
                        System.out.printf("%02d ",prize[i]);
                    }
                    System.out.printf("\n");
                    System.out.println("您的号码");
                    for (int i = 0; i < 7; i++) {
                        System.out.printf("%02d ",num[i]);
                    }
                    System.out.println();
                    //判断是否购买号码
                    if (num[0] == 0){
                        System.out.println("还未购买号码");
                        break;
                    }
                    //判断是否中奖
                    //1.红球中的数量
                    int rednum = 0;
                    for (int i = 0; i < prize.length - 1; i++) {
                        for (int j = 0; j< prize.length - 1; j++)
                            if(num[i] == prize[j]) {
                                rednum++;
                                break;
                            }
                    }
//                    System.out.println("红球中了" + rednum);
                    int bluenum = 0;
                    //2.蓝球中的数量
                    if (num[6] == prize[6]){
                      bluenum =1;
//                        System.out.println("蓝球中了");
                    }else{
//                        System.out.println("蓝球没中");
                        bluenum = 0;
                    }
                    //判断中奖
                    if(rednum == 6 && bluenum ==1){
                        System.out.println("恭喜，获得一等奖 500万");
                    }else if(rednum == 6){
                        System.out.println("恭喜，获得二等奖 10万");
                    }else if(rednum == 5 && bluenum == 1){
                        System.out.println("恭喜，获得三等奖 3000元");
                    }else if(rednum == 5 || (rednum == 4 && bluenum ==1)){
                        System.out.println("恭喜，获得四等奖 200元");
                    }else if(rednum == 4 || (rednum == 3 && bluenum ==1)){
                        System.out.println("恭喜，获得五等奖 10元");
                    }else if(bluenum ==1){
                        System.out.println("恭喜，获得五等奖 5元");
                    }else{
                        System.out.println("抱歉，没中奖，再接再厉");
                    }
                    num = new int[7];
                    break;
                case 0:
                    isLoop = false;
                    System.out.println("欢迎再来啊~~~");
                    break;
                default:
                    System.out.println("输入有误请重输");
                    break;
            }
        }
    }
}
