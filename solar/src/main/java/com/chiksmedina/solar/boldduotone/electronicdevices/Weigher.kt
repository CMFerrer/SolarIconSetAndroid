package com.chiksmedina.solar.boldduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.Weigher: ImageVector
    get() {
        if (_weigher != null) {
            return _weigher!!
        }
        _weigher = Builder(
            name = "Weigher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.2288f, 3.0f, 4.3432f, 4.1716f, 3.1716f)
                curveTo(5.3432f, 2.0f, 7.2288f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(13.0f)
                curveTo(16.7712f, 2.0f, 18.6569f, 2.0f, 19.8284f, 3.1716f)
                curveTo(21.0f, 4.3432f, 21.0f, 6.2288f, 21.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 17.7712f, 21.0f, 19.6569f, 19.8284f, 20.8284f)
                curveTo(18.6569f, 22.0f, 16.7712f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 22.0f, 5.3432f, 22.0f, 4.1716f, 20.8284f)
                curveTo(3.0f, 19.6569f, 3.0f, 17.7712f, 3.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.25f, 18.0f)
                curveTo(7.25f, 17.5858f, 7.5858f, 17.25f, 8.0f, 17.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 17.25f, 16.75f, 17.5858f, 16.75f, 18.0f)
                curveTo(16.75f, 18.4142f, 16.4142f, 18.75f, 16.0f, 18.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 18.75f, 7.25f, 18.4142f, 7.25f, 18.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.6447f, 6.3098f)
                curveTo(10.8663f, 5.8967f, 13.1338f, 5.8967f, 15.3553f, 6.3098f)
                lineTo(15.8311f, 6.3983f)
                curveTo(16.7114f, 6.562f, 17.2307f, 7.5916f, 16.8992f, 8.5161f)
                lineTo(16.1548f, 10.5925f)
                curveTo(16.047f, 10.8934f, 15.7564f, 11.0592f, 15.4746f, 10.9806f)
                curveTo(13.9267f, 10.5488f, 12.3304f, 10.41f, 10.7514f, 10.5641f)
                lineTo(9.9989f, 8.2224f)
                curveTo(9.8426f, 7.7358f, 9.3624f, 7.4828f, 8.9263f, 7.6572f)
                curveTo(8.4903f, 7.8317f, 8.2635f, 8.3675f, 8.4198f, 8.854f)
                lineTo(9.0592f, 10.8437f)
                curveTo(8.8807f, 10.8855f, 8.7028f, 10.9311f, 8.5255f, 10.9806f)
                curveTo(8.2437f, 11.0592f, 7.9531f, 10.8934f, 7.8453f, 10.5925f)
                lineTo(7.1009f, 8.5161f)
                curveTo(6.7694f, 7.5916f, 7.2887f, 6.562f, 8.169f, 6.3983f)
                lineTo(8.6447f, 6.3098f)
                close()
            }
        }
            .build()
        return _weigher!!
    }

private var _weigher: ImageVector? = null
