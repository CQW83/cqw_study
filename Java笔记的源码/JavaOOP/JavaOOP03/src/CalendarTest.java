import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        //月份从0开始算
        //获取或者设置默认的时间和时区
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        //1.获取年月日时分秒
        System.out.println(calendar.getTime());
        //获取年
        System.out.println(calendar.get(Calendar.YEAR));
        //获取月
        System.out.println(calendar.get(Calendar.MONTH));
        //获取日
        System.out.println(calendar.get(Calendar.DATE));
        //获取小时
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));//24小时
        calendar.get(Calendar.HOUR_OF_DAY);
        //获取分
        System.out.println(calendar.get(Calendar.MINUTE));
        //获取秒
        System.out.println(calendar.get(Calendar.SECOND));

        //2.设置年月日
        // 恢复最初时间
              //calendar.clear();
        //设置时间 月份初始值是0
       //calendar.set(200,0,1,00,00,0);
        //calendar.set(2000,0,1);
        System.out.println(calendar.getTime());
        //3.获得具体天数
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        //4.调整时间
        calendar.add(Calendar.YEAR,1);
        System.out.println(calendar.getTime());
        //calendar.add(Calendar.DATE,12);
        //up为true则加1 为false则减一
        calendar.roll(Calendar.MONTH,false);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH,true);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.YEAR,1);
        System.out.println(calendar.getTime());
        //5.校验时间???
       // System.out.println(calendar.before());
        //返回一个日历哈希码
        System.out.println(calendar.hashCode());



    }
}
