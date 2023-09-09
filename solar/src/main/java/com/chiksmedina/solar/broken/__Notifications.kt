package com.chiksmedina.solar.broken

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.BrokenGroup
import com.chiksmedina.solar.broken.notifications.Bell
import com.chiksmedina.solar.broken.notifications.BellBing
import com.chiksmedina.solar.broken.notifications.BellOff
import com.chiksmedina.solar.broken.notifications.NotificationLinesRemove
import com.chiksmedina.solar.broken.notifications.NotificationRemove
import com.chiksmedina.solar.broken.notifications.NotificationUnread
import com.chiksmedina.solar.broken.notifications.NotificationUnreadLines
import kotlin.collections.List as ____KtList

public object NotificationsGroup

public val BrokenGroup.Notifications: NotificationsGroup
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
