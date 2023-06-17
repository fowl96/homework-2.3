public class ServiceStation {

    public void check(Serviceble serviceble){
        serviceble.service();
    }

    public void checkAll(Serviceble[] servicebles){
        for (Serviceble serviceble : servicebles) {
            serviceble.service();
        }
    }


}
