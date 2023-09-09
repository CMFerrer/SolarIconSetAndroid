package com.chiksmedina.solar.boldduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BoldduotoneGroup
import com.chiksmedina.solar.boldduotone.notifications.Bell
import com.chiksmedina.solar.boldduotone.notifications.BellBing
import com.chiksmedina.solar.boldduotone.notifications.BellOff
import com.chiksmedina.solar.boldduotone.notifications.NotificationLinesRemove
import com.chiksmedina.solar.boldduotone.notifications.NotificationRemove
import com.chiksmedina.solar.boldduotone.notifications.NotificationUnread
import com.chiksmedina.solar.boldduotone.notifications.NotificationUnreadLines
import kotlin.collections.List as ____KtList

public object NotificationsGroup

public val BoldduotoneGroup.Notifications: NotificationsGroup
  get() = NotificationsGroup

private var __AllIcons: ____KtList<ImageVector>? = null

public val NotificationsGroup.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Bell, BellBing, BellOff, NotificationLinesRemove, NotificationRemove,
        NotificationUnread, NotificationUnreadLines)
    return __AllIcons!!
  }
