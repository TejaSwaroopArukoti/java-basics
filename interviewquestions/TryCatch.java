package interviewquestions;
class InterviewBit {
    public void method1 (int num1,float num2){
         System.out.println("int-float method");
    }
    public void method1(float num1,int num2){
         System.out.println("float-int method");
    }


        public void fooBarMethod(String... variables){
            for(String variable : variables){
                // business logic
                System.out.println(variable);
            }
        }
     public static void main(String[] args){
           InterviewBit interviewBit=new InterviewBit();
           interviewBit.method1(40,20.0f);

           interviewBit.fooBarMethod("foo", "bar");
           interviewBit.fooBarMethod("foo", "bar", "boo");
           interviewBit.fooBarMethod(new String[]{"foo", "var", "boo"});
     }


}