public class TestSizes {
    public enum Sizes {
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);
        private int euroSize;

        private Sizes(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() { return this.euroSize;}
        public String getDescription() {
            if(this.equals(XXS)){
                return "Child size";
            }
            else{
                return "Adult size";
            }
        }
    }
    public static void main(String[] args){
        for (Sizes a : Sizes.values()){
            System.out.println(a.getEuroSize());
            System.out.println(a.getDescription());
        }
    }
}