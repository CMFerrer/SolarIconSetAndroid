package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.notifications.Bell
import dev.chiksmedina.solar.linear.notifications.BellBing
import dev.chiksmedina.solar.linear.notifications.BellOff
import dev.chiksmedina.solar.linear.notifications.NotificationLinesRemove
import dev.chiksmedina.solar.linear.notifications.NotificationRemove
import dev.chiksmedina.solar.linear.notifications.NotificationUnread
import dev.chiksmedina.solar.linear.notifications.NotificationUnreadLines
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
