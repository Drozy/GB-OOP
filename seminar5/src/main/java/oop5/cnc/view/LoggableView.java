package oop5.cnc.view;

public class LoggableView implements View{
    private View view;
    private Loggable logger;
    public LoggableView(View view, Loggable logger){
        this.view = view;
        this.logger = logger;
    }
    @Override
    public String get() {
        String str = view.get();
        logger.saveLog("Input << " + str);
        return str;
    }

    @Override
    public void set(String value) {
        view.set(value);
        logger.saveLog("Output >> " + value);
    }

}
