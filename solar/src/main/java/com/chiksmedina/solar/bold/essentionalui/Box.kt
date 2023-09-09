package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

public val EssentionalUiGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5777f, 4.4315f)
                lineTo(15.5777f, 3.382f)
                curveTo(13.8221f, 2.4607f, 12.9443f, 2.0f, 12.0f, 2.0f)
                curveTo(11.0557f, 2.0f, 10.1779f, 2.4607f, 8.4223f, 3.382f)
                lineTo(8.1006f, 3.5508f)
                lineTo(17.0236f, 8.6497f)
                lineTo(21.0403f, 6.6413f)
                curveTo(20.3941f, 5.9095f, 19.3515f, 5.3623f, 17.5777f, 4.4315f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7484f, 7.9643f)
                lineTo(17.75f, 9.9635f)
                verticalLineTo(13.0f)
                curveTo(17.75f, 13.4142f, 17.4142f, 13.75f, 17.0f, 13.75f)
                curveTo(16.5858f, 13.75f, 16.25f, 13.4142f, 16.25f, 13.0f)
                verticalLineTo(10.7135f)
                lineTo(12.75f, 12.4635f)
                verticalLineTo(21.904f)
                curveTo(13.4679f, 21.7252f, 14.2848f, 21.2965f, 15.5777f, 20.618f)
                lineTo(17.5777f, 19.5685f)
                curveTo(19.7294f, 18.4393f, 20.8052f, 17.8748f, 21.4026f, 16.8603f)
                curveTo(22.0f, 15.8458f, 22.0f, 14.5833f, 22.0f, 12.0585f)
                verticalLineTo(11.9415f)
                curveTo(22.0f, 10.0489f, 22.0f, 8.8656f, 21.7484f, 7.9643f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 21.904f)
                verticalLineTo(12.4635f)
                lineTo(2.2516f, 7.9643f)
                curveTo(2.0f, 8.8656f, 2.0f, 10.0489f, 2.0f, 11.9415f)
                verticalLineTo(12.0585f)
                curveTo(2.0f, 14.5833f, 2.0f, 15.8458f, 2.5974f, 16.8603f)
                curveTo(3.1948f, 17.8748f, 4.2706f, 18.4393f, 6.4223f, 19.5685f)
                lineTo(8.4223f, 20.618f)
                curveTo(9.7152f, 21.2965f, 10.5321f, 21.7252f, 11.25f, 21.904f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9597f, 6.6413f)
                lineTo(12.0f, 11.1615f)
                lineTo(15.4112f, 9.4559f)
                lineTo(6.5246f, 4.3779f)
                lineTo(6.4223f, 4.4315f)
                curveTo(4.6486f, 5.3623f, 3.6059f, 5.9095f, 2.9597f, 6.6413f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
