import java.util.*;
public class Students {
    public static void main(String[] args) {
        int[] student,stu;
        int[][] a;
        int i, j, sum,sum1=0,k=-1;
        float ave;
        a = new int[15][6];
        student = new int[15];
        stu = new int[15];
        Scanner s = new Scanner(System.in);
        for (i = 0; i < 15; i++) {
            for (j = 0; j < 5; j++) {
                a[i][j] = s.nextInt();
            }
        }
        //Totals of each of them
        for (i = 0; i < 15; i++) {
            sum = 0;
            for (j = 0; j < 5; j++) {
                sum += a[i][j];
            }
            a[i][5]=sum;
            student[i] = sum;
        }
        System.out.println("Totals are ");
        for (i = 0; i < 15; i++) {
            System.out.print(" "+student[i]);
            sum1+=student[i];
        }
        //Ranks
        Arrays.sort(student);
        for(i=0;i<15;i++){
            int flg=0;
            for(j=0;j<stu.length;j++) {
                if (student[i]==stu[j]){
                    flg=1;
                    break;
                }
            }
            if(flg!=1) {
                stu[++k] = student[i];
            }
        }
        System.out.println("");
        for(j=0;j<15;j++) {
            for (i = 0; i < stu.length; i++) {
                if (a[j][5] == stu[i]) {
                    System.out.println("Rank of student" + j + ": " + (stu.length - i));
                }
            }
        }
        //average of the class performance overall and for each subject.
        ave=(float)(sum1)/15;
        System.out.println("Average of class performance overall= "+ave);
        float tel=0,hin=0,eng=0,mat=0,sci=0;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(j==0){
                    tel+=a[i][j];
                }
                if(j==1){
                    hin+=a[i][j];
                }
                if(j==2){
                    eng+=a[i][j];
                }
                if(j==3){
                    mat+=a[i][j];
                }
                if(j==4){
                    sci+=a[i][j];
                }
            }
        }
        System.out.println("Average in subject0: "+(float)(tel)/5);
        System.out.println("Average in subject1: "+(float)(hin)/5);
        System.out.println("Average in subject2: "+(float)(eng)/5);
        System.out.println("Average in subject3: "+(float)(mat)/5);
        System.out.println("Average in subject4: "+(float)(sci)/5);
        //the top 3 best performers in each subject
        for(i=0;i<5;i++) {
            for (j = 0; j<5;j++) {
                student[j] = a[j][i];
            }
            Arrays.sort(student);
            System.out.println("Top three best performers in subject"+i+": ");
            for(k= student.length-1;k>student.length-4;k--){
                System.out.print("student"+k+" ");
            }
        }
        System.out.println("");
        //students who are the below average performers
        System.out.println("Students who are the below average performers");
        for(i=0;i<5;i++){
            System.out.print("Subject"+i+": ");
            for(j=0;j<5;j++){
                if(a[j][i]<50){
                    System.out.print("Student"+j+" ");
                }
            }
            System.out.println("");
        }
    }
}
