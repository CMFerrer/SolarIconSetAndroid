package com.chiksmedina.solar.bold.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SecurityGroup

public val SecurityGroup.LockKeyholeMinimalisticUnlocked: ImageVector
    get() {
        if (_lockKeyholeMinimalisticUnlocked != null) {
            return _lockKeyholeMinimalisticUnlocked!!
        }
        _lockKeyholeMinimalisticUnlocked = Builder(name = "LockKeyholeMinimalisticUnlocked",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(9.1005f, 2.75f, 6.75f, 5.1005f, 6.75f, 8.0f)
                verticalLineTo(10.0036f)
                curveTo(7.133f, 10.0f, 7.5485f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 10.0f, 20.2426f, 10.0f, 21.1213f, 10.8787f)
                curveTo(22.0f, 11.7574f, 22.0f, 13.1716f, 22.0f, 16.0f)
                curveTo(22.0f, 18.8284f, 22.0f, 20.2426f, 21.1213f, 21.1213f)
                curveTo(20.2426f, 22.0f, 18.8284f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.1716f, 22.0f, 3.7574f, 22.0f, 2.8787f, 21.1213f)
                curveTo(2.0f, 20.2426f, 2.0f, 18.8284f, 2.0f, 16.0f)
                curveTo(2.0f, 13.1716f, 2.0f, 11.7574f, 2.8787f, 10.8787f)
                curveTo(3.4093f, 10.348f, 4.1353f, 10.1379f, 5.25f, 10.0546f)
                verticalLineTo(8.0f)
                curveTo(5.25f, 4.2721f, 8.2721f, 1.25f, 12.0f, 1.25f)
                curveTo(15.1463f, 1.25f, 17.788f, 3.4019f, 18.5373f, 6.3131f)
                curveTo(18.6405f, 6.7142f, 18.3991f, 7.1231f, 17.9979f, 7.2263f)
                curveTo(17.5968f, 7.3296f, 17.1879f, 7.0881f, 17.0846f, 6.6869f)
                curveTo(16.5018f, 4.4224f, 14.4453f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(12.75f, 14.0f)
                curveTo(12.75f, 13.5858f, 12.4142f, 13.25f, 12.0f, 13.25f)
                curveTo(11.5858f, 13.25f, 11.25f, 13.5858f, 11.25f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 18.4142f, 11.5858f, 18.75f, 12.0f, 18.75f)
                curveTo(12.4142f, 18.75f, 12.75f, 18.4142f, 12.75f, 18.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _lockKeyholeMinimalisticUnlocked!!
    }

private var _lockKeyholeMinimalisticUnlocked: ImageVector? = null
