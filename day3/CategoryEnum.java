public class CategoryEnum {

    public enum Category{
        MEN, WOMEN, KID, GRANDMA, GRANDPA
    }
    public static void main(String[] args) {

        Category chosenCategory = Category.KID;

        switch(chosenCategory){
            case MEN:
                System.out.println("Price for "+chosenCategory+" is: "+ 13.57);
                break;
            case WOMEN:
                System.out.println("Price for "+chosenCategory+" is: "+ 20.45);
                break;
            case KID:
                System.out.println("Price for "+chosenCategory+" is: "+ 45.6);
                break;
            case GRANDMA:
                System.out.println("Price for "+chosenCategory+" is: "+ 56.67);
                break;
            case GRANDPA:
                System.out.println("Price for "+chosenCategory+" is: "+ 3.56);
                break;
        }

    }

}
