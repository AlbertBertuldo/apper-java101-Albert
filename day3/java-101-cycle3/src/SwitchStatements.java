public class SwitchStatements {
    public static void main(String[] args) {
        // sound of animals :D
        // Dog bark arf
        // Cat meow
        // Goat meee
        // Cow mooo

        //Common if-else statement

        Animal animal = Animal.DOG;
//        if(animal.equals("dog")){
//            System.out.println("arf arf");
//        } else if (animal.equals("cat")){
//            System.out.println("meow meow");
//        } else if (animal.equals("goat")){
//            System.out.println("meeeee");
//        } else if (animal.equals("cow")){
//            System.out.println("moooooo");
//        } else {
//            System.out.println("Yehey!");
//        }

        //with switch -case statenmnts
        // can also used with int, NOTE: it is recommended to always use break statement inorder to get out of the lopp
        switch(animal){
            case DOG:
                System.out.println("arf arf");
                break;
            case CAT:
                System.out.println("meow meow");
                break;
            case GOAT:
                System.out.println("meeeee");
                break;
            case COW:
                System.out.println("moooo");
                break;
            default:
                System.out.println("grrr");
        }

        System.out.println("==================================");

//        String promo = "GCash_Anniv-2022";
//        switch(promo){
//            case "GCash_Anniv-2023":
//                System.out.println("discount 3");
//            case "GCash_Anniv-2022":
//                System.out.println("discount 2");
//            case "GCash_Anniv-2021":
//                System.out.println("discount 1");
//                break;
//        }

       //enum class - class for final or group of constants

    }

    public enum Animal{
        DOG,CAT,GOAT,COW
        // It is possible to also add description on your enums/constant variables. Like examples below

//        DOG("favorite pet"),CAT("second favorite"),GOAT("dont like this animal"),COW("Beef");
//
//        private String description;
//
//        Animal(String description){
//            this.description = description;
//        }
//
//        public String getDescription(){
//            return description;
//        }
    }
}
