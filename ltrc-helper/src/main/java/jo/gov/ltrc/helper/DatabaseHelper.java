package jo.gov.ltrc.helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.StoredProcedureQuery;
import java.beans.PropertyDescriptor;
import java.util.Iterator;

public class DatabaseHelper {

    public static StoredProcedureQuery buildStoredProcedureQueryWithRequestParams(EntityManager entityManager, String namedQuery, Object requestObject) throws Exception {

        StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery(namedQuery);
        Iterator<Parameter<?>> iterator = storedProcedureQuery.getParameters().iterator();
        while (iterator.hasNext()) {
            Parameter parameter = iterator.next();

            PropertyDescriptor pd = new PropertyDescriptor(parameter.getName(), requestObject.getClass());
            Object value = pd.getReadMethod().invoke(requestObject);

            if (value != null) {
                storedProcedureQuery.setParameter(parameter.getName(), pd.getPropertyType().cast(pd.getValue(parameter.getName())));
            }

        }

        return storedProcedureQuery;
    }

}
