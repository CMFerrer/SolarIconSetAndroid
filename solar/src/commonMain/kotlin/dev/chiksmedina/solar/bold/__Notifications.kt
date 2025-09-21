package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.notifications.Bell
import dev.chiksmedina.solar.bold.notifications.BellBing
import dev.chiksmedina.solar.bold.notifications.BellOff
import dev.chiksmedina.solar.bold.notifications.NotificationLinesRemove
import dev.chiksmedina.solar.bold.notifications.NotificationRemove
import dev.chiksmedina.solar.bold.notifications.NotificationUnread
import dev.chiksmedina.solar.bold.notifications.NotificationUnreadLines
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
