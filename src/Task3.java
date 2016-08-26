import java.util.concurrent.Executors;  
import java.util.concurrent.ScheduledExecutorService;  
import java.util.concurrent.TimeUnit;  
  
/** 
 *  
 *  
 * ScheduledExecutorService�Ǵ�Java SE5��java.util.concurrent���Ϊ���������౻�����ģ�����������Ķ�ʱ����ʵ�ַ�ʽ��  
 * ������������������������ºô��� 
 * 1>�����Timer�ĵ��̣߳�����ͨ���̳߳صķ�ʽ��ִ�������  
 * 2>���Ժ�����ȥ�趨��һ��ִ������delayʱ�� 
 * 3>�ṩ�����õ�Լ�����Ա��趨ִ�е�ʱ���� 
 *  
 * ������ʵ�ִ��룬����ͨ��ScheduledExecutorService#scheduleAtFixedRateչʾ������ӣ�ͨ������������Ŀ��ƣ��״�ִ�м���delayʱ�䡣 
 *  
 *  
 * @author GT 
 *  
 */  
public class Task3 {  
    public static void main(String[] args) {  
        Runnable runnable = new Runnable() {  
            public void run() {  
                // task to run goes here  
                System.out.println("Hello !!");  
            }  
        };  
        ScheduledExecutorService service = Executors  
                .newSingleThreadScheduledExecutor();  
        // �ڶ�������Ϊ�״�ִ�е���ʱʱ�䣬����������Ϊ��ʱִ�еļ��ʱ��  
        service.scheduleAtFixedRate(runnable, 10, 1, TimeUnit.SECONDS);  
    }  
} 