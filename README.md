Hi Welcome to Cycle Engine Pricing Module.

Following are the steps need to follow to get code and run in your system

Open cmd prompt and clone into folder with following cmd.

git clone https://github.com/sagarsags/CyclePricingEngine.git

Open  eclipse and import cloned project.

Add Junit jar file if required.

if face any issue with imports add the lib folder path in class path.

Then you can able to run the code and check the output.

Following are the features of CyclePricingEngine
Cycle cost calcuclation is done based on 5 main components of the cycle,they are 
    1.Wheel
    2.Frame
    3.Chain Assembl
    4.HandleBar and 
    5.Seating

1.Wheel component cost calculated based on the following wheel related components.

     a) Spokes as two option Single Rider and Double Rider
     b) Tube as two option Tubeless and WithTube
     c) Rim as two option Tubeless and WithTube
     d) Tyre as two option Branded and Non Branded
     
2.Frame component cost calculated based on the following wheel related components.

     a) Frame Size as three option 1. Small 2. Medium 3. Large
     b) Frame Material as three option 1. Steel 2. Aluminimum 3. Titanium

3.Chain Assembly component cost calculated based on the following wheel related components.

     a) Gear as three option 1. 4 Gear 2. 5 Gear 0. No Gear
     b) Chain  Material as three option 1. Steel 2. Aluminimum 3. Titanium

4.HandleBar component cost calculated based on the following wheel related components.

     a) Handle Bar Material as three option 1. Steel 2. Aluminimum 3. Titanium
     b) Handle Bar Type as three option 1. Drop 2. Standard 3. Flat
     c) Handle Bar Cover as three option 1. Tape 2. Grips 3. Bar Ends
     
5.Seating component cost calculated based on the following wheel related components.  

     a) Seating Capacity as two option 1. Single Seating 2. Dual Seating
     b) Seating Cover as two option 1.Non Branded 2.Branded
     
 Requirements can be provided in two format on using commond line user interaction other one is using json format.
 
  Commond Line Interface
 
     1. In commond line user interaction user can calculate cost for each main cycle part and also cost for cycle.
     2. Same specification bulk cycle cost total cost can be calculated ,providing single specification.
     3. Bulk cycle specification can be provided through user interaction.
     4. Date is used a way to increase the cost of each individual parts.
   
  Json Format
 
     1. In json format each individual cycle cost and total cost can be calculated along with main parts cost.
     2. Specification need to provide with Yes or No option ,with meaning Yes means required and No means not required.
     3. Date is used a way to increase the cost of each individual parts.
   
 Feature Enhancement
 
     1. UI part can be added to get the specification from user.
     2. MultiThreading concept can be Applied in order to increase the performance of the cost calculation.
 
 DrawBack
 
     1. Providing Specification for bulk data through commond line interface is not user friendly.
     2. As of now same farechange is there for all the components based on date, it can be improved such a way that 
        each part is charged differently.
