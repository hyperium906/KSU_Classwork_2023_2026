public class StockItem {
        private String description;
        private int ID = nextID;
        private static int nextID=0;
        private double Price;
        private int quantity;

        public StockItem(){
            description = " ";
            this.nextID = 0;
            this.Price = 0.00;
            this.quantity = 0;

        }

        public StockItem (String description,double Price, int quantity){
            this.description = description;
            this.nextID+=1;
            this.Price = Price;
            this.quantity = quantity;
        }

        public void setDescription(String description) {

            this.description = description;
        }
        public void setID(int ID){

            this.ID = ID;
        }

        public void setPrice(double Price) {
            if(Price<0){
                System.out.println("Error \n");

            }
            else {
                this.Price = Price;
            }

        }

        public void setQuantity(int quantity) {
            if (quantity<0){
                System.out.println("Error\n");
            }
           else {
               this.quantity += quantity;
           }
        }
        public void setQuantity() {
        this.quantity--;
    }

        public int getQuantity() {
        return quantity;
         }

    public String getDescription() {
            return description;
        }

    public double getPrice() {
        return Price;
    }


    @Override
    public String toString() {
            return "Item Number: "+ ID+" is "+description+" has price "+Price+" we currently have "+quantity+" in " +
                    "stock";
    }
}

