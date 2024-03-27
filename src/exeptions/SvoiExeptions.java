package exeptions;

class SvoiExeptions {
    void marafon(int tempAir, int runPace) throws PodvernulNoguException{
        if (runPace >12){
            throw new PodvernulNoguException("Темп был слишком высоким "+ runPace);
        }
        if (tempAir>32){
            throw new SveloMuscleException();
        }
        System.out.println("Вы пробежали марафон");
    }

    public static void main(String[] args) {
        SvoiExeptions svoiExeptions = new SvoiExeptions();
        try {
            svoiExeptions.marafon(31,10);
        } catch (PodvernulNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("В любом случае получите грамоту");
        }
    }
}

class PodvernulNoguException extends Exception {
    PodvernulNoguException(String message) {
        super(message);
    }

    PodvernulNoguException() {//конструктор, если не захотим выводить сообщение.

    }
}
class SveloMuscleException extends RuntimeException{
    SveloMuscleException(String message){
        super(message);
    }
    SveloMuscleException(){
    }
}
