Test 1:
1.	What set of commands are executed to push a repo on Github?
	-Go to tools then click on import file, then click on import
	from github.

2.	Where the strings.xml in the project structure?
	-Values folder

3.	What is the difference between SP and DP?
	- Sp: It's scaled by the user's preference. It is recommended you use this unit
	when specifiying font sizes.
	                                    

4.	How can you support multiple languages in your app? Explain step by step process.
	-Changing the process in the resource folder and typing the string in the what ever language you choose
	
5.	What is the difference between match_parent and wrap_content?
	-Match: handles the height of the view.
	-Wrap: handles the width of the view.

6.	How can you setup a method for a button click without binding the view?
	-The method will only hold the the R.id. then it will hold the layout name
	you are calling.

7.	How can you define a button click method with binding the button view?
	-Giving a id in the xml file, then calling that button on the main activity

8.	How can you change the color of the TextView?
	-Going to the properties of the specific TextView and change the text color.
	-Or you insert android textcolor and put the color code on it.

9.	Where are all the colors in the android architecture saved?
	-They are saved in the res directory folder, and within that folder
	is the drawable folder which will hold the color scheme you wish to implement.

10.	How would you add a different layout for a landscape and a language? Name the qualifiers.
	-Orientation

11.	How would you make the keyboard hide for EditText when the activity is created?
12.	What are ViewGroups and Views?
	-Views: Its a type of data that will let the person see that structure of the data on the
	phone.
	ViewGroups: That sees all of the views as one group.

13.	What attribute is necessary in a linear layout if there are more than one child views?
14.	In which case you would use a Linear layout and a Relative layout?
15.	How would you load an image in a ImageView from xml and programmatically?
	-By using the android method that calls for images, and then type in the code where the
	image is located at, and then type in the image name.

16.	List all the states in an activity lifecycle.
	-Pause, create, restart, start, resume, destroy

17.	What is the lifecycle of activity one and activity two when we go to activity one from two?
18.	How to restrict an activity from changing the orientation?
	-You go to the xml file and insert the android orientation code.

19.	Which method is called to persist the data before the activity is destroyed?
	-Activity Lifecyle
	
20.	What is the argument of that method?
	-Instant
21.	How do we save the data in the method?
	-edit.text
	
22.	How to get that data back? What is the name of the method?
	-You call the text from the main activity and the the xml file.
	
23.	What is a bundle? What can a bundle contain?
24.	What is the difference between onPause and onStop?
	-onPause: The activity is not active, while another is in front of it.
	-onStop: The activity is ended.

25.	How to start an activity for getting a result back?
26.	Which callback is used get the result back in the above case?
27.	What are difference types of Intent? What are the difference between them? When do we use each of them?
28.	How to communicate data between activities?
	-In the main activity you call one of the layouts that has that xml code for you main, then
	create line that will call that layout using the R.id.(layout_name).

29.	How to add data to an intent?
30.	What kind of data can be added to an intent?
	-String data, int data
	
31.	How to get the data sent from activity one in activity two?'
	-By calling the name of the activity and rename it calling the main style.
	
32.	What is context?
	-Allows access to application allows access to application specific resources and alows access and resources.
	
33.	Name different kinds of layouts in Android?
	-RelativeLayout
	-LinearLayout
	-FrameLayout

34.	How to send an object through an Intent?
	-By calling the intent.
	
35.	What is Serializable?
	-Is the process of converting an object into a stream of bytes in order to
	store the object or transmit it to memory
	
36.	What is Parcelable?
	-SingleTop

37.	Which is better and why? 
	-parcelable
	
38.	How can an object class be Serializable or Parcelable? Explain in detail the methods to implement if any?
	-You can implement object by calling it.
	
39.	Can we avoid implementing methods using Parcelable?
	-By creating another object of it.
	
40.	What are launch modes? Explain each one of them in detail.
	-Is an instruction for android OS which specifies how the activity should be.
	
41.	What is back stack?
	-Four or five blocks that are stacked on top of eachother, then the last one is moved up on top.

42.	How to we create a .apk file?
	-Create a file, and change the file type to .apk.

43.	How to create and signed .apk file
