package Entities.PLS30.pls_tracking;
        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;
        @Entity
@Table(name = "tracking_orders", schema = "pls_tracking")
public class tracking_orders {
    @Id
    private Integer tracking_order_id;
    private Integer load_id;
    private String mp_order_id;
    private String mp_tracking_request_id;

            public Integer getTracking_order_id() {
                return tracking_order_id;
            }

            public void setTracking_order_id(Integer tracking_order_id) {
                this.tracking_order_id = tracking_order_id;
            }

            public Integer getLoad_id() {
                return load_id;
            }

            public void setLoad_id(Integer load_id) {
                this.load_id = load_id;
            }

            public String getMp_order_id() {
                return mp_order_id;
            }

            public void setMp_order_id(String mp_order_id) {
                this.mp_order_id = mp_order_id;
            }

            public String getMp_tracking_request_id() {
                return mp_tracking_request_id;
            }

            public void setMp_tracking_request_id(String mp_tracking_request_id) {
                this.mp_tracking_request_id = mp_tracking_request_id;
            }
}