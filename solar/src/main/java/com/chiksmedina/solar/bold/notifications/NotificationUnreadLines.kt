package com.chiksmedina.solar.bold.notifications

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.NotificationsGroup

val NotificationsGroup.NotificationUnreadLines: ImageVector
    get() {
        if (_notificationUnreadLines != null) {
            return _notificationUnreadLines!!
        }
        _notificationUnreadLines = Builder(
            name = "NotificationUnreadLines", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 5.0f)
                curveTo(22.0f, 6.6568f, 20.6569f, 8.0f, 19.0f, 8.0f)
                curveTo(17.3431f, 8.0f, 16.0f, 6.6568f, 16.0f, 5.0f)
                curveTo(16.0f, 3.3431f, 17.3431f, 2.0f, 19.0f, 2.0f)
                curveTo(20.6569f, 2.0f, 22.0f, 3.3431f, 22.0f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.25f, 14.0f)
                curveTo(6.25f, 13.5858f, 6.5858f, 13.25f, 7.0f, 13.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 13.25f, 16.75f, 13.5858f, 16.75f, 14.0f)
                curveTo(16.75f, 14.4142f, 16.4142f, 14.75f, 16.0f, 14.75f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 14.75f, 6.25f, 14.4142f, 6.25f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 10.6012f, 22.0f, 9.41f, 21.9617f, 8.388f)
                curveTo(21.1703f, 9.0804f, 20.1342f, 9.5f, 19.0f, 9.5f)
                curveTo(16.5147f, 9.5f, 14.5f, 7.4853f, 14.5f, 5.0f)
                curveTo(14.5f, 3.8658f, 14.9196f, 2.8297f, 15.612f, 2.0383f)
                curveTo(14.59f, 2.0f, 13.3988f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
                moveTo(6.25f, 17.5f)
                curveTo(6.25f, 17.0858f, 6.5858f, 16.75f, 7.0f, 16.75f)
                horizontalLineTo(13.0f)
                curveTo(13.4142f, 16.75f, 13.75f, 17.0858f, 13.75f, 17.5f)
                curveTo(13.75f, 17.9142f, 13.4142f, 18.25f, 13.0f, 18.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 18.25f, 6.25f, 17.9142f, 6.25f, 17.5f)
                close()
            }
        }
            .build()
        return _notificationUnreadLines!!
    }

private var _notificationUnreadLines: ImageVector? = null
