# Recieving Implicit Intent In Android

Example when you want to open up a link you get this chooser of various types of browsers that can open that particular link. Here in this project we created an application
that recieves data from an implicit intent and displays the uri on our app

# Getting started

- We opened our <b>AndroidManifest.xml</b> then added an intent-filter 
```xml

// Any intent with action.VIEW like we do pass whenever we want to initialize an Implicit Intent
<action android:name="android.intent.action.VIEW" />

<category android:name="android.intent.category.DEFAULT" />

// Detects if its a link so it brings out categories of apps that are browser on your mobile phone
<categroy android:name="android.intent.category.BROWSABLE" />

// any url link that starts with http and https
<data android:scheme="http" />
<data android:scheme="https" />
 ```
 
 - Get our intent in the `Oncreate()` function
 
 ```Java
  
  // Get intent from implicit intent
  Intent intent = getIntent();
  
  // Parse data to a uri
  Uri uri = intent.getData();
  
  //check if uri is not null
  if(uri != null) {
    String uri_message = "URI: " + uri.toString();
    
    // Get textview from view
    TextView labelText = (TextView) findViewById(R.id.text_uri_message);
    
    // Append to the view
    labelText.setText(uri_message);
  }
 
 ```
 
 # Screenshots
 <img src="https://user-images.githubusercontent.com/18614379/54882891-1bfdfa80-4e5f-11e9-9b93-ebb511c13ec4.png" width="300px" />
 <img src="https://user-images.githubusercontent.com/18614379/54882872-cfb2ba80-4e5e-11e9-8fc0-708c5ee188a1.png" width="300px" />
 <img src="https://user-images.githubusercontent.com/18614379/54882871-cfb2ba80-4e5e-11e9-8120-12924f5cbf04.png" width="300px" />
 
 
 
