public class AuditService {

    boolean auditObject(Object o){
        if (o instanceof Auditable){
            System.out.println("Object is auditable");
            return true;
        }
        else{
            return false;
        }
    }
}
