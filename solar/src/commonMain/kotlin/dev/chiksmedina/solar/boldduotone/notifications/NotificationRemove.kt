package dev.chiksmedina.solar.boldduotone.notifications

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
import dev.chiksmedina.solar.boldduotone.NotificationsGroup

val NotificationsGroup.NotificationRemove: ImageVector
    get() {
        if (_notificationRemove != null) {
            return _notificationRemove!!
        }
        _notificationRemove = Builder(
            name = "NotificationRemove", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.5f, 11.0f)
                curveTo(15.3787f, 11.0f, 14.318f, 11.0f, 13.659f, 10.341f)
                curveTo(13.0f, 9.682f, 13.0f, 8.6213f, 13.0f, 6.5f)
                curveTo(13.0f, 4.3787f, 13.0f, 3.318f, 13.659f, 2.659f)
                curveTo(14.318f, 2.0f, 15.3787f, 2.0f, 17.5f, 2.0f)
                curveTo(19.6213f, 2.0f, 20.682f, 2.0f, 21.341f, 2.659f)
                curveTo(22.0f, 3.318f, 22.0f, 4.3787f, 22.0f, 6.5f)
                curveTo(22.0f, 8.6213f, 22.0f, 9.682f, 21.341f, 10.341f)
                curveTo(20.682f, 11.0f, 19.6213f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(14.9697f, 3.9697f)
                curveTo(15.2626f, 3.6768f, 15.7374f, 3.6768f, 16.0303f, 3.9697f)
                lineTo(17.5f, 5.4393f)
                lineTo(18.9697f, 3.9697f)
                curveTo(19.2626f, 3.6768f, 19.7374f, 3.6768f, 20.0303f, 3.9697f)
                curveTo(20.3232f, 4.2626f, 20.3232f, 4.7374f, 20.0303f, 5.0303f)
                lineTo(18.5607f, 6.5f)
                lineTo(20.0303f, 7.9697f)
                curveTo(20.3232f, 8.2626f, 20.3232f, 8.7374f, 20.0303f, 9.0303f)
                curveTo(19.7374f, 9.3232f, 19.2626f, 9.3232f, 18.9697f, 9.0303f)
                lineTo(17.5f, 7.5607f)
                lineTo(16.0303f, 9.0303f)
                curveTo(15.7374f, 9.3232f, 15.2626f, 9.3232f, 14.9697f, 9.0303f)
                curveTo(14.6768f, 8.7374f, 14.6768f, 8.2626f, 14.9697f, 7.9697f)
                lineTo(16.4393f, 6.5f)
                lineTo(14.9697f, 5.0303f)
                curveTo(14.6768f, 4.7374f, 14.6768f, 4.2626f, 14.9697f, 3.9697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 10.642f, 22.0f, 9.4796f, 21.965f, 8.4777f)
                curveTo(21.9069f, 9.362f, 21.7523f, 9.9297f, 21.341f, 10.341f)
                curveTo(20.682f, 11.0f, 19.6213f, 11.0f, 17.5f, 11.0f)
                curveTo(15.3787f, 11.0f, 14.318f, 11.0f, 13.659f, 10.341f)
                curveTo(13.0f, 9.682f, 13.0f, 8.6213f, 13.0f, 6.5f)
                curveTo(13.0f, 4.3787f, 13.0f, 3.318f, 13.659f, 2.659f)
                curveTo(14.0703f, 2.2477f, 14.638f, 2.0931f, 15.5223f, 2.035f)
                curveTo(14.5204f, 2.0f, 13.358f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                close()
            }
        }
            .build()
        return _notificationRemove!!
    }

private var _notificationRemove: ImageVector? = null
