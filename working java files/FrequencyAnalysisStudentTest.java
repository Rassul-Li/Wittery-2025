public class FrequencyAnalysisStudentTest extends junit.framework.TestCase
{
    public void testFrequencyAnalysis_00()
    {
        //                                           "There is always one more bug to fix"
        FrequencyAnalysis fa = new FrequencyAnalysis("Aolyl pz hsdhfz vul tvyl ibn av mpe");
        assertEquals("fa.getLetterFrequency(\"A\")", 2.0/"Aolylpzhsdhfzvultvylibnavmpe".length(), fa.getLetterFrequency("A"));
        assertEquals("fa.getLetterFrequency(\"v\")", 3.0/"Aolylpzhsdhfzvultvylibnavmpe".length(), fa.getLetterFrequency("v"));

        assertEquals("fa.rotateBack(\"D\", 3)", "A", fa.rotateBack("D", 3));
        assertEquals("fa.rotateBack(\"w\", 9)", "n", fa.rotateBack("w", 9));

        double cd = fa.calculateDeviation("v", 4);
        boolean flag = Math.abs( cd -  0.7895917345) < 0.001;
        assertEquals("fa.calculateDeviation(\"v\", 4)", true, flag);

        cd = fa.calculateDeviation("p", 11);
        flag = Math.abs( cd -  0.4376588614) < 0.001;
        assertEquals("fa.calculateDeviation(\"p\", 11)", true, flag);

        cd = fa.calculateDeviation("r", 7);
        flag = Math.abs( cd -  0.0) < 0.001;
        assertEquals("fa.calculateDeviation(\"r\", 7)", true, flag);

        double td = fa.totalDeviation(23);
        flag = Math.abs( td -  86.07738338432043) < 0.001;
        assertEquals("fa.totalDeviation(23)", true, flag);

        assertEquals("fa.bestBackRotation()", 7, fa.bestBackRotation());

        assertEquals("fa.getMessage()", "There is always one more bug to fix", fa.getMessage());
    }
}