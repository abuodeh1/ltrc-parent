package jo.gov.ltrc.helper;


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

            if(value == null && pd.getPropertyType().isAssignableFrom(Long.class)){
                storedProcedureQuery.setParameter(parameter.getName(), 0L );
            } else if(value == null && pd.getPropertyType().isAssignableFrom(Integer.class)){
                storedProcedureQuery.setParameter(parameter.getName(), 0 );
            } else if(value == null && pd.getPropertyType().isAssignableFrom(Boolean.class)){
                storedProcedureQuery.setParameter(parameter.getName(), false );
            } else if(value == null && pd.getPropertyType().isAssignableFrom(Double.class)){
                storedProcedureQuery.setParameter(parameter.getName(), 0.0 );
            } else if (value != null) {
                storedProcedureQuery.setParameter(parameter.getName(), pd.getPropertyType().cast(value));
            }

        }

        return storedProcedureQuery;
    }

}
