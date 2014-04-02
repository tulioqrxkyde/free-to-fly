package freetofly;

/**
 *
 * @author tulio.xcrtf
 */
public enum TrickDivinationEnums {

    GroupOne
    ( "==========================\n"
    + "1	3	5	7\n"
    + "9	11	13	15\n"
    + "17	19	21	23\n"
    + "25	27	29	31\n"
    + "=========================="  ),
    
    GroupTwo
    ( "==========================\n"
    + "2	3	6	7\n"
    + "10	11	14	15\n"
    + "18	19	22	23\n"
    + "26	27	30	31\n"
    + "=========================="  ),

    GroupThree
    ( "==========================\n"
    + "4	5	6	7\n"
    + "12	13	14	15\n"
    + "20	21	22	23\n"
    + "28	29	30	31\n"
    + "=========================="  ),
    
    GroupFour
    ( "==========================\n"
    + "8	9	10	11\n"
    + "12	13	14	15\n"
    + "24	25	26	27\n"
    + "28	29	30	31\n"
    + "=========================="  ),
    
    GroupFive
    ( "==========================\n"
    + "16	17	18	19\n"
    + "20	21	22	23\n"
    + "24	25	26	27\n"
    + "28	29	30	31\n"
    + "=========================="  );

    private String groupN;
    
    private TrickDivinationEnums(String message) {
        this.groupN = message;
    }
    
    public String returnGroupValue() {
        return this.groupN;
    }
}
