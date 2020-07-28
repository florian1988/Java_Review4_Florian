public class StockLimitReachedException extends Exception{

        public StockLimitReachedException(String message){
            //super("Too much Products!! There are space for 15 pices!!!");
            super(message);
        }

        public StockLimitReachedException(){

        }

}
