# MPColorRatingBar
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.mhtparyani:MPColorRatingBar:1.0'
	}
	
Example
1. xml
```
	<com.linkindia.colorratingbar.ColorRatingBar
        	android:id="@+id/rating_1"
        	android:layout_width="wrap_content"
        	android:layout_height="wrap_content"
        	android:rating="3"
        	app:changeable="false"
        	app:empty_color="#f0f000"
        	app:progress_color="#00f0f0" />
```

2. Code
```
	1) Activity
		ColorRatingBar colorRatingBar = new ColorRatingBar(this);
		colorRatingBar.setRatingProgressColor(R.color.colorPrimary);
		colorRatingBar.setRatingEmptyColor(R.color.colorAccent);
		colorRatingBar.setRating(3.0f);
	2) Fragment
		ColorRatingBar colorRatingBar = new ColorRatingBar(getContext());
		colorRatingBar.setRatingProgressColor(R.color.colorPrimary);
		colorRatingBar.setRatingEmptyColor(R.color.colorAccent);
		colorRatingBar.setRating(3.0f);
```


