# autoQuestPrecursor
Solving smaller steps before putting them all together.
  
First problem: Movement path  
Given a map, an initial postion, and a final destination, we need an algorithm that will find the path with the best risk/time ratio. Maps will look like this:  
  
![image](https://user-images.githubusercontent.com/90731552/174145302-6ac4cd19-9c5a-4d9e-babb-255935370d2a.png)  
  
Green represents areas the player can walk in  
Red represents areas the play can walk in but is dangerous to  
Green represents inaccessible environmental areas  
  
The goal is, if given an initial point (represented by the white point) and a destination (represented by black point), the algorithm will find the most efficient path to the destination.  
  
![image](https://user-images.githubusercontent.com/90731552/174146108-20251380-b2b7-49ae-81ed-2a6ad2758179.png)  
  
The goal is not to create the most efficient path as shown below, but rather to find the path that takes safety in mind with a slight bias to saving time.  
  
![image](https://user-images.githubusercontent.com/90731552/174146290-460c70f6-2b42-41e4-b891-ca0b00ac2294.png)  

For example, given a more complicated map with an initial postion and destination:  

![image](https://user-images.githubusercontent.com/90731552/174148280-10ca0d65-d3a1-4c42-a06d-b50a1d8427c7.png)   

A safe pathway would be:  

![image](https://user-images.githubusercontent.com/90731552/174148157-9691adc3-d787-45fe-8a00-6a1ccad8f878.png)  

But for minimal risk, we can greatly decrease the path time by:  

![image](https://user-images.githubusercontent.com/90731552/174148360-b073bbb2-8450-4fc5-9363-dc8d63be0ede.png)  

This is the end goal of the algorithm. Given a map, a start point, and destination, return the path with the best risk/time ratio.  








