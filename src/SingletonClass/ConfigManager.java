package SingletonClass;

public class ConfigManager {

    //made it private so no one can acess it apart from this class
    private ConfigManager(){

    }
    private static ConfigManager instance;
    public static  ConfigManager getInstance(){
        if(instance==null){
            instance=new ConfigManager();

        }
        return instance;
    }





}

