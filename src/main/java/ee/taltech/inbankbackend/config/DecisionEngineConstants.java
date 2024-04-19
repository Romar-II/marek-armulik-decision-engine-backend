package ee.taltech.inbankbackend.config;

/**
 * Holds all necessary constants for the decision engine.
 */
public class DecisionEngineConstants {
    public static final Integer MINIMUM_LOAN_AMOUNT = 2000;
    public static final Integer MAXIMUM_LOAN_AMOUNT = 10000;
    public static final Integer MAXIMUM_LOAN_PERIOD = 60;
    public static final Integer MINIMUM_LOAN_PERIOD = 12;
    public static final Integer SEGMENT_1_CREDIT_MODIFIER = 100;
    public static final Integer SEGMENT_2_CREDIT_MODIFIER = 300;
    public static final Integer SEGMENT_3_CREDIT_MODIFIER = 1000;
    public static final Integer AGE_OF_MAJORITY = 18;
    public static final double LIFE_EXPECTANCY_IN_YEARS_ESTONIA = 76.74;
    public static final double LIFE_EXPECTANCY_IN_YEARS_LATVIA = 73.28;
    public static final double LIFE_EXPECTANCY_IN_YEARS_LITHUANIA = 74.34;

}
