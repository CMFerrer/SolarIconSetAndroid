package dev.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SecurityGroup

val SecurityGroup.LockPasswordUnlocked: ImageVector
    get() {
        if (_lockPasswordUnlocked != null) {
            return _lockPasswordUnlocked!!
        }
        _lockPasswordUnlocked = Builder(
            name = "LockPasswordUnlocked", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.75f, 8.0f)
                curveTo(6.75f, 5.1005f, 9.1005f, 2.75f, 12.0f, 2.75f)
                curveTo(14.4453f, 2.75f, 16.5018f, 4.4224f, 17.0846f, 6.6869f)
                curveTo(17.1879f, 7.0881f, 17.5968f, 7.3296f, 17.9979f, 7.2263f)
                curveTo(18.3991f, 7.1231f, 18.6405f, 6.7142f, 18.5373f, 6.3131f)
                curveTo(17.788f, 3.4019f, 15.1463f, 1.25f, 12.0f, 1.25f)
                curveTo(8.2721f, 1.25f, 5.25f, 4.2721f, 5.25f, 8.0f)
                verticalLineTo(10.0546f)
                curveTo(4.1353f, 10.1379f, 3.4093f, 10.348f, 2.8787f, 10.8787f)
                curveTo(2.0f, 11.7574f, 2.0f, 13.1716f, 2.0f, 16.0f)
                curveTo(2.0f, 18.8284f, 2.0f, 20.2426f, 2.8787f, 21.1213f)
                curveTo(3.7574f, 22.0f, 5.1716f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 22.0f, 20.2426f, 22.0f, 21.1213f, 21.1213f)
                curveTo(22.0f, 20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f)
                curveTo(22.0f, 13.1716f, 22.0f, 11.7574f, 21.1213f, 10.8787f)
                curveTo(20.2426f, 10.0f, 18.8284f, 10.0f, 16.0f, 10.0f)
                horizontalLineTo(8.0f)
                curveTo(7.5485f, 10.0f, 7.133f, 10.0f, 6.75f, 10.0036f)
                verticalLineTo(8.0f)
                close()
                moveTo(8.0f, 17.0f)
                curveTo(8.5523f, 17.0f, 9.0f, 16.5523f, 9.0f, 16.0f)
                curveTo(9.0f, 15.4477f, 8.5523f, 15.0f, 8.0f, 15.0f)
                curveTo(7.4477f, 15.0f, 7.0f, 15.4477f, 7.0f, 16.0f)
                curveTo(7.0f, 16.5523f, 7.4477f, 17.0f, 8.0f, 17.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 16.5523f, 13.0f, 16.0f)
                curveTo(13.0f, 15.4477f, 12.5523f, 15.0f, 12.0f, 15.0f)
                curveTo(11.4477f, 15.0f, 11.0f, 15.4477f, 11.0f, 16.0f)
                curveTo(11.0f, 16.5523f, 11.4477f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(17.0f, 16.0f)
                curveTo(17.0f, 16.5523f, 16.5523f, 17.0f, 16.0f, 17.0f)
                curveTo(15.4477f, 17.0f, 15.0f, 16.5523f, 15.0f, 16.0f)
                curveTo(15.0f, 15.4477f, 15.4477f, 15.0f, 16.0f, 15.0f)
                curveTo(16.5523f, 15.0f, 17.0f, 15.4477f, 17.0f, 16.0f)
                close()
            }
        }
            .build()
        return _lockPasswordUnlocked!!
    }

private var _lockPasswordUnlocked: ImageVector? = null
