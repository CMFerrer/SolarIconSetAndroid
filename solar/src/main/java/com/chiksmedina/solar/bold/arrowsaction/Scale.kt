package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9062f, 2.0f)
                curveTo(15.9062f, 2.4142f, 16.242f, 2.75f, 16.6562f, 2.75f)
                horizontalLineTo(20.1893f)
                lineTo(12.75f, 10.1893f)
                verticalLineTo(8.0f)
                curveTo(12.75f, 7.5858f, 12.4142f, 7.25f, 12.0f, 7.25f)
                curveTo(11.5858f, 7.25f, 11.25f, 7.5858f, 11.25f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 12.4142f, 11.5858f, 12.75f, 12.0f, 12.75f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 12.75f, 16.75f, 12.4142f, 16.75f, 12.0f)
                curveTo(16.75f, 11.5858f, 16.4142f, 11.25f, 16.0f, 11.25f)
                horizontalLineTo(13.8107f)
                lineTo(21.25f, 3.8107f)
                verticalLineTo(7.3438f)
                curveTo(21.25f, 7.758f, 21.5858f, 8.0938f, 22.0f, 8.0938f)
                curveTo(22.4142f, 8.0938f, 22.75f, 7.758f, 22.75f, 7.3438f)
                verticalLineTo(2.0f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                horizontalLineTo(16.6562f)
                curveTo(16.242f, 1.25f, 15.9062f, 1.5858f, 15.9062f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7516f, 7.4303f)
                curveTo(19.797f, 8.6297f, 20.7812f, 9.5887f, 21.9904f, 9.5937f)
                curveTo(22.0f, 10.3198f, 22.0f, 11.1187f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(12.8813f, 2.0f, 13.6802f, 2.0f, 14.4063f, 2.0096f)
                curveTo(14.4113f, 3.2188f, 15.3703f, 4.203f, 16.5697f, 4.2484f)
                lineTo(13.9468f, 6.8712f)
                curveTo(13.5572f, 6.2008f, 12.8313f, 5.75f, 12.0f, 5.75f)
                curveTo(10.7574f, 5.75f, 9.75f, 6.7574f, 9.75f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(9.75f, 13.2426f, 10.7574f, 14.25f, 12.0f, 14.25f)
                horizontalLineTo(16.0f)
                curveTo(17.2426f, 14.25f, 18.25f, 13.2426f, 18.25f, 12.0f)
                curveTo(18.25f, 11.1687f, 17.7992f, 10.4428f, 17.1288f, 10.0532f)
                lineTo(19.7516f, 7.4303f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
