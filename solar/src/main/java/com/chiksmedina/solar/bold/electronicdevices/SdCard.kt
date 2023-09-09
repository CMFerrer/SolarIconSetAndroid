package com.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ElectronicDevicesGroup

public val ElectronicDevicesGroup.SdCard: ImageVector
    get() {
        if (_sdCard != null) {
            return _sdCard!!
        }
        _sdCard = Builder(name = "SdCard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(12.3415f, 2.0f, 12.5122f, 2.0f, 12.6858f, 2.0152f)
                curveTo(13.4951f, 2.0858f, 14.2874f, 2.414f, 14.9097f, 2.9363f)
                curveTo(15.0431f, 3.0484f, 15.1668f, 3.1721f, 15.4142f, 3.4194f)
                lineTo(20.5806f, 8.5858f)
                curveTo(20.828f, 8.8332f, 20.9516f, 8.9569f, 21.0637f, 9.0903f)
                curveTo(21.586f, 9.7126f, 21.9142f, 10.5049f, 21.9848f, 11.3142f)
                curveTo(22.0f, 11.4878f, 22.0f, 11.6585f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(13.0f, 5.25f)
                curveTo(13.4142f, 5.25f, 13.75f, 5.5858f, 13.75f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(13.75f, 9.4142f, 13.4142f, 9.75f, 13.0f, 9.75f)
                curveTo(12.5858f, 9.75f, 12.25f, 9.4142f, 12.25f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(12.25f, 5.5858f, 12.5858f, 5.25f, 13.0f, 5.25f)
                close()
                moveTo(10.75f, 6.0f)
                curveTo(10.75f, 5.5858f, 10.4142f, 5.25f, 10.0f, 5.25f)
                curveTo(9.5858f, 5.25f, 9.25f, 5.5858f, 9.25f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(9.25f, 9.4142f, 9.5858f, 9.75f, 10.0f, 9.75f)
                curveTo(10.4142f, 9.75f, 10.75f, 9.4142f, 10.75f, 9.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(7.0f, 5.25f)
                curveTo(7.4142f, 5.25f, 7.75f, 5.5858f, 7.75f, 6.0f)
                verticalLineTo(9.0f)
                curveTo(7.75f, 9.4142f, 7.4142f, 9.75f, 7.0f, 9.75f)
                curveTo(6.5858f, 9.75f, 6.25f, 9.4142f, 6.25f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(6.25f, 5.5858f, 6.5858f, 5.25f, 7.0f, 5.25f)
                close()
            }
        }
        .build()
        return _sdCard!!
    }

private var _sdCard: ImageVector? = null
