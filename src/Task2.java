    import java.util.Timer;  
    import java.util.TimerTask;  
      
    /** 
     *  
     * �ڵ�һ�ַ�ʽ��ȣ����� 1>��������ȥȡ������ʱ���Կ��� 2>��һ��ִ������ʱ����ָ������Ҫ��delayʱ�� 
     *  
     * ��ʵ��ʱ��Timer����Ե�������TimerTask����ͨ����run()������ʵ�־������� Timerʵ�����Ե��ȶ����������̰߳�ȫ�ġ� 
     * ��Timer�Ĺ�����������ʱ����������һ���̣߳�����߳̿��������������� �����Ǵ��룺 
     *  
     * @author GT 
     *  
     */  
    public class Task2 {  
        public static void main(String[] args) {  
            TimerTask task = new TimerTask() {  
                @Override  
                public void run() {  
                    // task to run goes here  
                    System.out.println("Hello !!!");  
                }  
            };  
            Timer timer = new Timer();  
            long delay = 0;  
            long intevalPeriod = 1 * 1000;  
            // schedules the task to be run in an interval  
            timer.scheduleAtFixedRate(task, delay, intevalPeriod);  
        } // end of main  
    }  