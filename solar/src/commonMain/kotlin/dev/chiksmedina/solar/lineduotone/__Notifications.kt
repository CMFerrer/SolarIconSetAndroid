package dev.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LineDuotoneSolar
import dev.chiksmedina.solar.lineduotone.notifications.Bell
import dev.chiksmedina.solar.lineduotone.notifications.BellBing
import dev.chiksmedina.solar.lineduotone.notifications.BellOff
import dev.chiksmedina.solar.lineduotone.notifications.NotificationLinesRemove
import dev.chiksmedina.solar.lineduotone.notifications.NotificationRemove
import dev.chiksmedina.solar.lineduotone.notifications.NotificationUnread
import dev.chiksmedina.solar.lineduotone.notifications.NotificationUnreadLines
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
