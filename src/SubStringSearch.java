
/**
 * String searching algorithm that will search for a string pattern within a larger string or body of text.
 */
class SubStringSearch {
//--------------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Constructor---------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Private Methods-----------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Package Private Methods---------------------------------------------------------------------------------------------//
    /**
     * Search for String pattern
     *
     * @param stringToSearch The String or text that will be looked through
     * @param subStringToFind The String or pattern to find
     */
    static void subSearch(String stringToSearch, String subStringToFind) {

        boolean foundSubString = false;

        int stringToSearchSize = stringToSearch.length();
        int subStringToFindSize = subStringToFind.length();
        int maximumNeededLoopIteration = stringToSearchSize - subStringToFindSize;

        System.out.println("\nStringToSearch Length = " + stringToSearchSize);
        System.out.println("SubStringToFind Length = " +  subStringToFindSize);
        System.out.println("Max = " + maximumNeededLoopIteration);

        int index;

        search:
        for (index = 0; index <= maximumNeededLoopIteration; index++) {

            //Used to restart the while loop if it fails.
            int k = 0;

            //Keeps track of what index we left off, of the stringToSearch.
            int i = index;

            //Used to restart the index of subStringToFind when while loop fails or continue search is called.
            int j = 0;

            while (k++ != subStringToFindSize) {

                if (stringToSearch.charAt(i++) != subStringToFind.charAt(j++)) { continue search; }
            }
            foundSubString = true;
            break;
        }
        System.out.println(foundSubString ? "\nFound Sub String" : "\nDid not find Sub String" );
        System.out.println("Max index reached by Loop was = " + index);
    }
//--------------------------------------------------------------------------------------------------------------------//

//Public Methods------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Setters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Getters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

}//End of Class.
