package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenSolar
import com.chiksmedina.solar.broken.notifications.Bell
import com.chiksmedina.solar.broken.notifications.BellBing
import com.chiksmedina.solar.broken.notifications.BellOff
import com.chiksmedina.solar.broken.notifications.NotificationLinesRemove
import com.chiksmedina.solar.broken.notifications.NotificationRemove
import com.chiksmedina.solar.broken.notifications.NotificationUnread
import com.chiksmedina.solar.broken.notifications.NotificationUnreadLines
import kotlin.collections.List as KtList

object NotificationsGroup

val BrokenSolar.Notifications: NotificationsGroup
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
