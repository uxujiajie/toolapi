package person.search.alltool.pojo;

public class Status {
    private StatusEnum statusEnum;
    public enum StatusEnum{
        ORDER(5) {
            @Override
            public boolean isOder() {
                return true;
            }
        };

        public boolean isOder() {
            return false;
        }
        private  int timeType;
        StatusEnum(int timeType) {
            this.timeType = timeType;
        }
    }



}
