# FancyAlertDialog
Make your native android Dialog look beautiful.


## Dependency

Add dependency in your app module

```
dependencies {
	        implementation 'com.github.immujahidkhan:FancyAlertDialog:1.0.4'
}
```

## Usage

### Java
```
 new FancyAlertDialog.Builder(getActivity())
                .setTitle("Remove Photo")
                .setHeaderBackgroundColor(getResources().getColor(R.color.colorAccent))
                .setMessage("Are you sure you want to delete?")
                .setNegativeBtnText("Cancel")
                .setBtnTextColor(getResources().getColor(R.color.white))
                .setPositiveBtnBackground(getResources().getColor(R.color.colorAccent))
                .setPositiveBtnText("Delete")
                .setNegativeBtnBackground(getResources().getColor(R.color.colorAccent))
                .setAnimation(Animation.POP)
                .isCancellable(true)
                .setIcon(R.drawable.ic_stop, Icon.Visible)
                .OnPositiveClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                       //do code here
                    }
                })
                .OnNegativeClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                    //do code here
                    }
                })
                .build();
```
