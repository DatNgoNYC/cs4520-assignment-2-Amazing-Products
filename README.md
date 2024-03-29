https://github.com/DatNgoNYC/cs4520-assignment-2-Amazing-Products

Running the Project:
Open up this project in Android Studio. Click "Clean Project" and then "Rebuild Project". 

______________________________________________________________________________________________________________

We need to create a Single Activity Android Application as follows : 
When the user opens the app every time, they see a LoginFragment.

LoginFragment 
It will have following fields : 
Username : to take input from the user for the username.
Password : to take input from the user for password. 
Login button.
All the views will be in center of screen vertically stacked in order : username, password and login button
Clicking the Login button should navigate to the ProductListFragment, only if the username and password matches "admin" and "admin" respectively. If the username or password differs, display a toast message. Make sure to clear the fields before navigation.

ProductListFragment:
Create a fragment named ProductListFragment (PLF). You need to display a list of below mentioned products. 
Each product/item contains the following info
Name
expiry date [optional field] 
price 
type 
Equipment, 
Food
The data a.ka. Product List is given in the starter code below. Convert the data as needed.  
Use Recycler view to display the list of products and use constraint layout for both PLF and for each item in the list.
Download the two jpg images and add to your drawable folder :
FoodLinks to an external site.
EquipmentLinks to an external site.
While displaying product/item,
 If the expiry date is null, hide the view that displays the date.
When the type is Equipment : 
a. Item's background color will be Light RED : #E06666
b. The image displayed for the item will be equipment jpg.
When the type is Food : 
a. Item's background color will be Light Yellow : #FFD965. 
b. The image displayed for the item will be food jpg.
Text Color for all text inside item is #000000
Points to Remember :

Data will be static in the PLF fragment and no api call will be made.
Use sealed classes for product list. This will be your dataset, in your adapter. 
Use a Navigation graph to navigate between fragments.
Make sure - 
When you hit back on PLF fragment, it takes you back to the Login Fragment 
When you hit back on the Login Fragment, the app should close.
Fork the starter code.Links to an external site. Don't push to TA's repo. Starter code has the "necessary" libraries imported to complete the assignment. However, if the student chooses to do it differently, they might need to import missing libraries if prompted.
Make incremental commits. Do no push all code at once. 
Screenshots are added in starter code to help you visualize the fragments.
Submission Guidelines :

Add a readme file to your project :
Provide a link to your github repo. 
Any other information needed to run project. 
Zip your android application and upload it to Canvas.
