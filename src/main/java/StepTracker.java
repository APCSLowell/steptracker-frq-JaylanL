import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, totalSteps;
 private int n, actDays;

 public StepTracker(int goal){
   minSteps=goal;
  actDays=0;
  totalSteps=0;
  n=0;
 }
 public void addDailySteps(int steps){
  totalSteps+=goal;
  n++;
  if(steps>=minSteps)
   actDays++;
 }
 public int activeDays(){
   return actDays;
 }
 public double averageSteps(){
  if(n==0){
   return 0.0;
  }
  else{
   return (double)totalSteps / n;
  }
 }
} 
