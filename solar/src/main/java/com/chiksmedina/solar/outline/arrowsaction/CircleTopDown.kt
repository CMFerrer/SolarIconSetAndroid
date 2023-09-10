package com.chiksmedina.solar.outline.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.CircleTopDown: ImageVector
    get() {
        if (_circleTopDown != null) {
            return _circleTopDown!!
        }
        _circleTopDown = Builder(
            name = "CircleTopDown", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.25f, 12.0f)
                curveTo(21.25f, 17.1086f, 17.1086f, 21.25f, 12.0f, 21.25f)
                curveTo(6.8914f, 21.25f, 2.75f, 17.1086f, 2.75f, 12.0f)
                curveTo(2.75f, 6.8914f, 6.8914f, 2.75f, 12.0f, 2.75f)
                curveTo(12.4142f, 2.75f, 12.75f, 2.4142f, 12.75f, 2.0f)
                curveTo(12.75f, 1.5858f, 12.4142f, 1.25f, 12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 11.5858f, 22.4142f, 11.25f, 22.0f, 11.25f)
                curveTo(21.5858f, 11.25f, 21.25f, 11.5858f, 21.25f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.5303f, 3.5303f)
                curveTo(21.8232f, 3.2374f, 21.8232f, 2.7626f, 21.5303f, 2.4697f)
                curveTo(21.2374f, 2.1768f, 20.7626f, 2.1768f, 20.4697f, 2.4697f)
                lineTo(12.75f, 10.1893f)
                verticalLineTo(6.6563f)
                curveTo(12.75f, 6.242f, 12.4142f, 5.9063f, 12.0f, 5.9063f)
                curveTo(11.5858f, 5.9063f, 11.25f, 6.242f, 11.25f, 6.6563f)
                verticalLineTo(12.0f)
                curveTo(11.25f, 12.4142f, 11.5858f, 12.75f, 12.0f, 12.75f)
                horizontalLineTo(17.3438f)
                curveTo(17.758f, 12.75f, 18.0938f, 12.4142f, 18.0938f, 12.0f)
                curveTo(18.0938f, 11.5858f, 17.758f, 11.25f, 17.3438f, 11.25f)
                horizontalLineTo(13.8107f)
                lineTo(21.5303f, 3.5303f)
                close()
            }
        }
            .build()
        return _circleTopDown!!
    }

private var _circleTopDown: ImageVector? = null
