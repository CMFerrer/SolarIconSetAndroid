package com.chiksmedina.solar.lineduotone

import androidx.compose.ui.graphics.vector.ImageVector
import com.chiksmedina.solar.LineduotoneGroup
import com.chiksmedina.solar.lineduotone.notifications.Bell
import com.chiksmedina.solar.lineduotone.notifications.BellBing
import com.chiksmedina.solar.lineduotone.notifications.BellOff
import com.chiksmedina.solar.lineduotone.notifications.NotificationLinesRemove
import com.chiksmedina.solar.lineduotone.notifications.NotificationRemove
import com.chiksmedina.solar.lineduotone.notifications.NotificationUnread
import com.chiksmedina.solar.lineduotone.notifications.NotificationUnreadLines
import kotlin.collections.List as ____KtList

public object NotificationsGroup

public val LineduotoneGroup.Notifications: NotificationsGroup
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
