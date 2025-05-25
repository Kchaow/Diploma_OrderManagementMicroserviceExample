package letunov.ordermanagement.adapter.outbound;

import letunov.contract.ContractConsumer;
import letunov.contracts.ReserveItemsContract;
import letunov.contracts.dto.ReserveItemsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@ContractConsumer(serviceName = "warehouse-management")
public class ReserveItems implements ReserveItemsContract {
    @Override
    public ResponseEntity<Void> reserveItems(ReserveItemsDto reserveItemsDto) {
        return null;
    }
}
