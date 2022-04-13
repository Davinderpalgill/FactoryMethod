import com.factoryPlan.CommercialPlan;
import com.factoryPlan.DomesticPlan;
import com.factoryPlan.InstitutionalPlan;
import com.factoryPlan.Plan;

public class GetPlanFactory {
    public Plan getPlan(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("DomesticPlan")){
            return new DomesticPlan();
        }
        if(type.equalsIgnoreCase("CommercialPlan")){
            return new CommercialPlan();
        }
        if(type.equalsIgnoreCase("InstitutionalPlan")){
            return new InstitutionalPlan();
        }
    return null;
    }
}
