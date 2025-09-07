package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldDuotoneSolar
import com.chiksmedina.solar.boldduotone.notifications.Bell
import com.chiksmedina.solar.boldduotone.notifications.BellBing
import com.chiksmedina.solar.boldduotone.notifications.BellOff
import com.chiksmedina.solar.boldduotone.notifications.NotificationLinesRemove
import com.chiksmedina.solar.boldduotone.notifications.NotificationRemove
import com.chiksmedina.solar.boldduotone.notifications.NotificationUnread
import com.chiksmedina.solar.boldduotone.notifications.NotificationUnreadLines
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
