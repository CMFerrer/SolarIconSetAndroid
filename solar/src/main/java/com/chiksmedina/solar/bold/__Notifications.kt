package com.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldSolar
import com.chiksmedina.solar.bold.notifications.Bell
import com.chiksmedina.solar.bold.notifications.BellBing
import com.chiksmedina.solar.bold.notifications.BellOff
import com.chiksmedina.solar.bold.notifications.NotificationLinesRemove
import com.chiksmedina.solar.bold.notifications.NotificationRemove
import com.chiksmedina.solar.bold.notifications.NotificationUnread
import com.chiksmedina.solar.bold.notifications.NotificationUnreadLines
import kotlin.collections.List as KtList

object NotificationsGroup

val BoldSolar.Notifications: NotificationsGroup
    get() = NotificationsGroup

private var _AllIcons: KtList<ImageVector>? = null

val NotificationsGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Bell, BellBing, BellOff, NotificationLinesRemove, NotificationRemove,
            NotificationUnread, NotificationUnreadLines
        )
        return _AllIcons!!
    }
