
/*
 * Problem 01  :Imagine you are working for an airline company that wants to optimize the travel times between cities
The airlines has a set of cities with direct flights between them and each flight has a specific duration.
You are tasked with finding paris of cities where the flight duration is the shortest and you need to display all 
such pairs 

You are given an array of integers representing the flight duration between cities.Each index in the arry represents
a sepcific city and the value at
You are given an array of integers representing the flight duration between cities.Each index in the arry represents
a sepcific city and the value at each index corresponds to the flight time( in minutes ) between the 
current city and another city 

The array may contain duplicate flight durations, A city can have mutliple pairs with other cities that 
share the minimum flight time 

Sample input :

 int[] flight times = {120,90,110,95,120,90}

 solution : https://onlinegdb.com/q8t6FZYirf

*/

public class FlightTravel{
    public static void findMinimumFlight(int[] flightTimings){
        int minimumDistance = flightTimings[0]; // minimum inital value
        
         // minimize the array 
         
         for(int i=1; i<flightTimings.length; i++){
             if(flightTimings[i] <minimumDistance){
                 minimumDistance=flightTimings[i];
             }
         }
        // printing the flight duration
        
        System.out.println("The minimum flight duration is :" + minimumDistance);
        
        System.out.println("The pairs with minimum flight duration are :");
        
        // find the pairs with the minimum duration 
        
        for(int i=0; i<flightTimings.length; i++){
            for(int j=i+1; j<flightTimings.length;j++){
                if(flightTimings[i]==minimumDistance && flightTimings[j] ==minimumDistance){
                    System.out.println("(" + i + "," + j + ") with duration " +minimumDistance);
                }
            }
        }
    }
    
    public static void main(String[] args){
        int[] flightTimings={120,90,110,95,120,90};
        findMinimumFlight(flightTimings);
    }
}
