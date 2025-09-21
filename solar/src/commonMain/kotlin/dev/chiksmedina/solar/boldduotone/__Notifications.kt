package dev.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldDuotoneSolar
import dev.chiksmedina.solar.boldduotone.notifications.Bell
import dev.chiksmedina.solar.boldduotone.notifications.BellBing
import dev.chiksmedina.solar.boldduotone.notifications.BellOff
import dev.chiksmedina.solar.boldduotone.notifications.NotificationLinesRemove
import dev.chiksmedina.solar.boldduotone.notifications.NotificationRemove
import dev.chiksmedina.solar.boldduotone.notifications.NotificationUnread
import dev.chiksmedina.solar.boldduotone.notifications.NotificationUnreadLines
import kotlin.collections.List as KtList

object NotificationsGroup

val BoldDuotoneSolar.Notifications: NotificationsGroup
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
