package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineDuotoneSolar
import com.chiksmedina.solar.lineduotone.notifications.Bell
import com.chiksmedina.solar.lineduotone.notifications.BellBing
import com.chiksmedina.solar.lineduotone.notifications.BellOff
import com.chiksmedina.solar.lineduotone.notifications.NotificationLinesRemove
import com.chiksmedina.solar.lineduotone.notifications.NotificationRemove
import com.chiksmedina.solar.lineduotone.notifications.NotificationUnread
import com.chiksmedina.solar.lineduotone.notifications.NotificationUnreadLines
import kotlin.collections.List as KtList

object NotificationsGroup

val LineDuotoneSolar.Notifications: NotificationsGroup
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
