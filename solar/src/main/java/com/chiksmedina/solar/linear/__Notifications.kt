package com.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LinearSolar
import com.chiksmedina.solar.linear.notifications.Bell
import com.chiksmedina.solar.linear.notifications.BellBing
import com.chiksmedina.solar.linear.notifications.BellOff
import com.chiksmedina.solar.linear.notifications.NotificationLinesRemove
import com.chiksmedina.solar.linear.notifications.NotificationRemove
import com.chiksmedina.solar.linear.notifications.NotificationUnread
import com.chiksmedina.solar.linear.notifications.NotificationUnreadLines
import kotlin.collections.List as KtList

object NotificationsGroup

val LinearSolar.Notifications: NotificationsGroup
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
