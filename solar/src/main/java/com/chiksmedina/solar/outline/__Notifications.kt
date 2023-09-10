package com.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.OutlineSolar
import com.chiksmedina.solar.outline.notifications.Bell
import com.chiksmedina.solar.outline.notifications.BellBing
import com.chiksmedina.solar.outline.notifications.BellOff
import com.chiksmedina.solar.outline.notifications.NotificationLinesRemove
import com.chiksmedina.solar.outline.notifications.NotificationRemove
import com.chiksmedina.solar.outline.notifications.NotificationUnread
import com.chiksmedina.solar.outline.notifications.NotificationUnreadLines
import kotlin.collections.List as KtList

object NotificationsGroup

val OutlineSolar.Notifications: NotificationsGroup
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
