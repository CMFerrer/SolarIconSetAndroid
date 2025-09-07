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

val ArrowsActionGroup.CircleTopUp: ImageVector
    get() {
        if (_circleTopUp != null) {
            return _circleTopUp!!
        }
        _circleTopUp = Builder(
            name = "CircleTopUp", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.4697f, 10.4697f)
                curveTo(12.1768f, 10.7626f, 12.1768f, 11.2374f, 12.4697f, 11.5303f)
                curveTo(12.7626f, 11.8232f, 13.2374f, 11.8232f, 13.5303f, 11.5303f)
                lineTo(21.25f, 3.8107f)
                verticalLineTo(7.3438f)
                curveTo(21.25f, 7.758f, 21.5858f, 8.0938f, 22.0f, 8.0938f)
                curveTo(22.4142f, 8.0938f, 22.75f, 7.758f, 22.75f, 7.3438f)
                verticalLineTo(2.0f)
                curveTo(22.75f, 1.5858f, 22.4142f, 1.25f, 22.0f, 1.25f)
                horizontalLineTo(16.6562f)
                curveTo(16.242f, 1.25f, 15.9062f, 1.5858f, 15.9062f, 2.0f)
                curveTo(15.9062f, 2.4142f, 16.242f, 2.75f, 16.6562f, 2.75f)
                horizontalLineTo(20.1893f)
                lineTo(12.4697f, 10.4697f)
                close()
            }
        }
            .build()
        return _circleTopUp!!
    }

private var _circleTopUp: ImageVector? = null
