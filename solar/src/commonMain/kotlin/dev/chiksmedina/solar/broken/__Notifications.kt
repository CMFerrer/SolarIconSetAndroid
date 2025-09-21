package dev.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BrokenSolar
import dev.chiksmedina.solar.broken.notifications.Bell
import dev.chiksmedina.solar.broken.notifications.BellBing
import dev.chiksmedina.solar.broken.notifications.BellOff
import dev.chiksmedina.solar.broken.notifications.NotificationLinesRemove
import dev.chiksmedina.solar.broken.notifications.NotificationRemove
import dev.chiksmedina.solar.broken.notifications.NotificationUnread
import dev.chiksmedina.solar.broken.notifications.NotificationUnreadLines
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
