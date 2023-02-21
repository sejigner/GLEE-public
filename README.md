# 필사 · 필체 연습 앱 글리

![intro](img/glee.png)

한글 필사 애플리케이션 글리는 2021 제7회 한글 창의 산업 아이디어 공모전에 출품작입니다.   ‘디지털 세상에서 꽃피는 한글’이라는 공모전 주제에 따라, 다양한 폰트로 저작권이 만료된 문학 작품을 필사하면서 필체를 개선하고, 글을 더 깊게 이해하도록 돕는 것을 목표로 개발하였습니다.

## Project Structure

```
src
 ┣ 📂adapter
 ┃ ┣ 📜SampleWorkAdapter.kt
 ┃ ┗ 📜SharedWorkAdapter.kt
 ┣ 📂customFont
 ┃ ┣ 📜CustomFontHelper.kt
 ┃ ┣ 📜Font.kt
 ┃ ┗ 📜FontCache.kt
 ┣ 📂fragment
 ┃ ┣ 📜EditDialog.kt
 ┃ ┣ 📜FragmentHome.kt
 ┃ ┣ 📜FragmentMyPage.kt
 ┃ ┣ 📜FragmentShare.kt
 ┃ ┣ 📜GalleryFullscreenFragment.kt
 ┃ ┣ 📜MainViewPagerAdapter.kt
 ┃ ┗ 📜SaveDialog.kt
 ┣ 📂helper
 ┃ ┣ 📜SquareLayout.kt
 ┃ ┗ 📜ZoomOutPageTransformer.kt
 ┣ 📂model
 ┃ ┣ 📜SampleWorkModel.kt
 ┃ ┣ 📜UserWork.kt
 ┃ ┣ 📜WorkModel.kt
 ┃ ┗ 📜WorkModelMyPage.kt
 ┣ 📂paint
 ┃ ┣ 📜CustomView.java
 ┃ ┗ 📜Stroke.java
 ┣ 📜CanvasActivity.kt
 ┣ 📜EditTextActivity.kt
 ┣ 📜LicenseActivity.kt
 ┣ 📜MainActivity.kt
 ┣ 📜SplashActivity.kt
```
