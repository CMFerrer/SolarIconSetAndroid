package dev.chiksmedina.solar.outline

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.OutlineSolar
import dev.chiksmedina.solar.outline.notifications.Bell
import dev.chiksmedina.solar.outline.notifications.BellBing
import dev.chiksmedina.solar.outline.notifications.BellOff
import dev.chiksmedina.solar.outline.notifications.NotificationLinesRemove
import dev.chiksmedina.solar.outline.notifications.NotificationRemove
import dev.chiksmedina.solar.outline.notifications.NotificationUnread
import dev.chiksmedina.solar.outline.notifications.NotificationUnreadLines
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
