public enum DayEnums {
    
    SUNDAY(1) ,MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    DayEnums(int dayNumber){
        this.dayNumber = dayNumber;

    }

    public int getDayNumber(){
        return this.dayNumber;
    }
}
