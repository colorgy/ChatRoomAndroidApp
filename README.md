# Colorgy模糊聊 Android Native版

## Java部份

分為model, view 以及 controller

model部分請參考quip上的文件，基本上皆是參考文件而來，包括英文命名的部分

## `xml` layout部份

全部都是basic layout，定位元件位置。
無美化過，也沒有設定margin, padding, 顏色等等。

以下請對照Chat.sketch

### activity_user_detail_information
3.5 個人資訊

### fragment_chat_room
ChatRoom Fragment的layout，
有`SwipeRefreshLayout` + `GridLayout`，
請參考3.4模糊牆

### grid_user_image
3.4模糊牆
`GridLayout`之adapter實作時要用的layout

### fragment_friend_list
5.1好朋友列表

### friend_list_item
5.1好朋友列表
為fragment_friend_list到時候實作adapter時要用的layout

### fragment_upload_photo
2.1上傳照片

### fragment_upload_photo_confirm
2.9確認照片

### say_hi_list_item
6.1打招呼列表
adapter要使用的layout
