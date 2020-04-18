//Выполнить задания из варианта 2 лабораторной работы 4, реализуя собственные
// обработчики исключений и исключения ввода/вывода.
//interface Mobile <- abstract class Siemens Mobile <- class Model.

public interface Mobile {
    void startCall (String number);
    String searchForCall ();
    void acceptCall (String number);
    void breakCall ();
    public static void main(String[] args) {
        SiemensMobile mob = new Model();
        mob.connectToSiemensOnline();
        try {
            String s = "1000";
            mob.startCall(s);
            if (Integer.parseInt(s) < 1000)
            {
                throw new MyException("телефонный номер должен быть длиннее");
            }
            System.out.println(mob.searchForCall());
            mob.acceptCall("8111111119");
            mob.breakCall();
        }
        catch (MyException e) {
            System.out.println("телефонный номер должен быть длиннее");
        }
    }

    class MyException extends Throwable {
        public MyException(String s) {
        }
    }
}

abstract class SiemensMobile implements Mobile {
    Boolean incomingCall=true;
    Boolean isTalkingNow;
    abstract void connectToSiemensOnline();
}

class Model extends SiemensMobile {

    @Override
    void connectToSiemensOnline() {
        System.out.println("Подсоединились к сервису Сименс Онлайн");
    }

    @Override
    public void startCall(String number) {
        isTalkingNow = true;
    }

    @Override
    public String searchForCall() {
        while (true){
            if (incomingCall){
                if (isTalkingNow){
                    return "Линяя занята";
                } else return "Вызов принят";
            }
        }
    }

    @Override
    public void acceptCall(String number) {
        isTalkingNow = true;
    }

    @Override
    public void breakCall() {
        isTalkingNow = false;
        System.out.println("Вызов завершен");
    }
}
